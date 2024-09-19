 package app;

import java.util.*;
import javax.swing.JOptionPane;

public class AppBandaSinfonica {

    public static ArrayList<String> claveAdmin = new ArrayList<>();

    public static void main(String[] args) {
        
        claveAdmin.add("D16MG");
        claveAdmin.add("L13OP");

        
        String[] opciones = {
            "Miembro",
            "Administrador"};

        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Seleccione su tipo de usuario",
                JOptionPane.QUESTION_MESSAGE, null,
                opciones, opciones[0]);
        claveAdmin.add("D16MG");
        claveAdmin.add("L13OP");

        if (seleccion.equals("Administrador")) {

            String clave = JOptionPane.showInputDialog("Ingrese su clave de usuario");
            
            if (clave == null) {
                JOptionPane.showMessageDialog(null, "Datos invalidos");
                return;
            }
            
            for (String claveConfirmar : claveAdmin) {
                if (clave.equals(claveConfirmar)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido!!");
                    funcionesAdmin();
                    break;
                }
            }
        }

    }
    
    public static void funcionesAdmin(){
        boolean repetir = true;
        
        do {            
            String[] opciones = {"Agregar instrumento", "Eliminar instrumento", "Actualiza instrumento",
            "Generar Reporte",
            "Salir"};
            
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Seleccione la funcion que desea usar",
                JOptionPane.QUESTION_MESSAGE, null,
                opciones, opciones[0]);
            
            if (seleccion == null || seleccion.equals("Salir")) {
                break;
            }
            
            RegistroPrestamo registro = new RegistroPrestamo();
            
            switch (seleccion) {
                case "Agregar instrumento":
                    registro.agregarInstrumento();
                    break;
                case "Eliminar instrumento":
                    registro.mostrarInstrumento();
                    break;
                case "Actualiza instrumento":
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (repetir);
    }
}
