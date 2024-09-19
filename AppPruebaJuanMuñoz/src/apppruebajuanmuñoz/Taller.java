package apppruebajuanmuñoz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Taller {

    private ArrayList<Repuesto> listaRepuestos = new ArrayList<>();
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private ArrayList<Reparacion> listaReparaciones = new ArrayList<>();

    public String entrada(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    public void agregarRepuesto() {
        int Id = Integer.parseInt(entrada("ID de repuesto"));

        for (Repuesto repuesto : listaRepuestos) {
            if (repuesto.getId() == (Id)) {
                JOptionPane.showMessageDialog(null, "Repuesto ya registrado");
                return;
            }
        }
        String nombre = entrada("Nombre de repuesto");
        int cantidadDiponible = Integer.parseInt(entrada("Cantidad"));
        double precio = Double.parseDouble(entrada("precio"));
        Repuesto repuesto = new Repuesto(Id, nombre, cantidadDiponible, precio);
        listaRepuestos.add(repuesto);
        JOptionPane.showMessageDialog(null, "Repuesto agregado Exitosamente");
    }

    public void registrarVehiculo() {
        String Placa = entrada("Placa de vahiculo");

        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(Placa)) {
                JOptionPane.showMessageDialog(null, "El Vehiculo ya se encuentra registrado");
                return;
            }
        }
        String marca = entrada("Marca de vehiculo");
        String modelo = entrada("Modelo de vehiculo");
        String listaReparaciones = entrada("Marca de vehiculo");
        Vehiculo vehiculo = new Vehiculo(Placa, marca, modelo);
        listaVehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null, "Vehiculo agregado Exitosamente");
    }

    public void asignarReparacion() {
        String placa = entrada("Ingrese la placa del vehiculo: ");
        boolean encontrado = false;
        StringBuilder string = new StringBuilder();

        for (Vehiculo vehiculo : listaVehiculos) {
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Vehiculo encontrado\n" + string);
                String Repuesto = entrada("El repuesto del vehiculo: ");
                boolean encontradoR = false;
                StringBuilder stringR = new StringBuilder();
                for (Repuesto repuesto : listaRepuestos) {
                    if (encontradoR) {
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vehiculo No encontrado");
            }
        }
    }
                   

    public void listarRepuesto() {

    }

    public void cargarInventario() {
        String nombreArchivo = JOptionPane.showInputDialog("Digite el nombre del archivo que desea escribir");
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
            return;
        }
        try {
            StringBuilder contenido = new StringBuilder();
            try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = lector.readLine()) != null) {
                    contenido.append(linea).append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, "Contenido del Archivo:\n" + contenido.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo:" + e.getMessage());

        }
    }

    public void guardarInventario() {
        String nombreArchivo = JOptionPane.showInputDialog("Digite el nombre del archivo .txt:");
        File archivo = new File(nombreArchivo);

        try {
            if (archivo.exists()) {
                JOptionPane.showMessageDialog(null, "El archivo existe");
                File Inventario = new File(nombreArchivo);

                String id = JOptionPane.showInputDialog("Ingrese el id del repuesto" + "\n");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Repuesto" + "\n");
                String cantidadDisponible = JOptionPane.showInputDialog("Ingrese la cantidad" + "\n");
                String precio = JOptionPane.showInputDialog("Ingrese el precio" + "\n");

                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Sobrescribir el archivo", "Escritura de Archivo", JOptionPane.YES_NO_OPTION);

                try (FileWriter escritor = new FileWriter(archivo, opcion != JOptionPane.YES_OPTION)) {
                    escritor.write("\n");
                    escritor.write("Id: " + id + "\n");
                    escritor.write("Nombre producto: " + nombre + "\n");
                    escritor.write("Cantidad: " + cantidadDisponible + "\n");
                    escritor.write("Precio: " + precio + "\n");
                    JOptionPane.showMessageDialog(null, "Escritura en el archivo completada");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al escribir el archivo:" + e.getMessage());
                }
            } else {
                if (archivo.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Se creo Archivo");

                } else {
                    JOptionPane.showMessageDialog(null, "El archivo archivo no se creo");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.getMessage());
        }
    }
}
