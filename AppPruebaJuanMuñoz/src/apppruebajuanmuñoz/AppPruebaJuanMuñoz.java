
package apppruebajuanmuñoz;

import javax.swing.JOptionPane;

public class AppPruebaJuanMuñoz {
    
public static void main(String[] args) {
        Taller taller = new Taller();

        byte opcion;

        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Menu Principal\n"
                    + "1.Agregar Repuesto\n"
                    + "2.Asignar Reparacion\n"
                    + "3.Registrar Vehiculo\n"
                    + "4.Listar Repuestos\n"
                    + "5.Guardar Inventario\n"
                    + "6.cargar Inventario\n"
                    + "10.Salir"));

            switch (opcion) {
                case 1:
                    taller.agregarRepuesto();
                    break;
                case 2:
                    taller.asignarReparacion();
                    break;
                case 3:
                    taller.registrarVehiculo();
                    break;
                case 4:
                    taller.listarRepuesto();
                    break;
                case 5:
                    taller.guardarInventario();
                    break;
                case 6:
                    taller.cargarInventario();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (opcion != 7);

    }
    
}
