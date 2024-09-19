package app;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroPrestamo {

    private ArrayList<Instrumento> ListaInstrumentos = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    public String entrada(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    // Instrumentos
    public void agregarInstrumento() {

        Instrumento newInstrumento = new Instrumento();

        for (Instrumento instrumento : ListaInstrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(newInstrumento.getNombre())) {
                JOptionPane.showMessageDialog(null, "CUIDADO!!! Instrumento ya existente.");

                String[] opciones = {"SI", "NO"};
                String seleccion = (String) JOptionPane.showInputDialog(null, "Desea eliminar al Instrumento? \nEl nuevo instrumento podria generar problemas", "Sistema de creacion de instrumentos",
                        JOptionPane.QUESTION_MESSAGE, null,
                        opciones, opciones[0]);

                switch (seleccion) {
                    case "SI" -> {
                        eliminarInstrumento();
                    }
                    case "NO" -> {
                        return;
                    }
                    default ->
                        throw new AssertionError();
                }

            }
        }
        
        ListaInstrumentos.add(newInstrumento);
        JOptionPane.showMessageDialog(null, "Instrumento agregado Exitosamente" + newInstrumento.toString());

    }

    public void eliminarInstrumento() {
        String instrumentoEliminar = entrada("Ingrese el nombre del instrumento a eliminar");
        for (int i = 0; i < ListaInstrumentos.size(); i++) {
            if (ListaInstrumentos.get(i).getNombre().equals(instrumentoEliminar)) {
                listaPrestamos.remove(i);
                JOptionPane.showMessageDialog(null, "Instrumneto de la lista Eliminado");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "NO se pudo eliminar al instrumento");
            }
        }
    }

    public void actualizarInstrumento() {
        String instrumentoActualizar = entrada("Ingrese el nombre de instrumento a actualizar");
        for (Instrumento instrumento : ListaInstrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(instrumentoActualizar)) {

            }
        }
    }

    public Instrumento buscarInstrumento(String nombreInstrumento) {
        for (Instrumento instrumento : ListaInstrumentos) {
            if (instrumento.getNombre().equals(nombreInstrumento)) {
                return instrumento;
            }
        }
        return null;
    }
    
    public void mostrarInstrumento(){
        StringBuilder info = new StringBuilder("Lista de instrumentos: ");
        for (Instrumento instrumento : ListaInstrumentos) {
             info.append(instrumento.toString());
        }
        JOptionPane.showMessageDialog(null, info.toString());
    }

    // Prestamos
    public void agregarPrestamo() {
        String instrumentoNombre = entrada("Ingrese el nombre de instrumento, para el prestamo");
        Instrumento instrumentoEscogido = buscarInstrumento(instrumentoNombre);
        if (instrumentoEscogido == null) {
            JOptionPane.showMessageDialog(null, "NO se encontro al instrumento");
            return;
        }
        
        if (instrumentoEscogido.getCantidad() < 1) {
            JOptionPane.showMessageDialog(null, "NO hay ejemplares del instrumento disponibles");
            return;
        }

        String nombreUsuario = entrada("Ingrese el nombre de Usuario");
        String celular = entrada("Ingrese el celular del Usuario");
        String dirrecion = entrada("Ingrese la direccion del Usuario");
        
        instrumentoEscogido.setCantidad(instrumentoEscogido.getCantidad() - 1);
        
        Prestamo newPresatmo = new Prestamo(instrumentoEscogido, nombreUsuario, celular, dirrecion);
        listaPrestamos.add(newPresatmo);

        for (Instrumento instrumento : ListaInstrumentos) {
            if (instrumento.getNombre().equals(instrumentoEscogido.getNombre())) {
                instrumento.setCantidad(instrumento.getCantidad() - 1);
                JOptionPane.showMessageDialog(null, "Prestamo agregado correctamente");
                break;
            }
        }

    }
    
    public void devolverInstrumento(){
        
        String celular = entrada("Ingrese su celular");
        
        StringBuilder infoPrestamos = new StringBuilder();
        infoPrestamos.append("Lista de prestamo: \n");
        boolean NOcontinuar = true;
        
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCelular().equals(celular)) {
                infoPrestamos.append(prestamo.toString());
                NOcontinuar = false;
            }
        }
        
        if (NOcontinuar) { JOptionPane.showMessageDialog(null, "NO se econtro prestamos a su nombre"); return; }
        
        
        
    }

}
