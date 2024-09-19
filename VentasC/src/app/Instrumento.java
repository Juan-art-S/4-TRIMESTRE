package app;

import javax.swing.JOptionPane;

public class Instrumento {

    private String nombre;
    private String grupo;
    private String estado;
    private int cantidad;

    private String[] grupos = {"Cuerdas", "Cuerdas Frotadas",
        "Vientos o Maderas",
        "Metales", "Percusion"};

    private String[] estados = {"Nuevo", "Usuado", "En reparacion"};

    public Instrumento() {
        if (asingnarGrupo()) {
            this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del instrumento");
            this.cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
            
            asignarEstado();
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar el Instruento");
            this.nombre = null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    

    @Override
    public String toString() {
        return "\nInstrumento{" + "nombre=" + nombre
                +", grupo=" + grupo + ", estado=" + estado 
                + ", cantidad=" + cantidad + "}\n";
    }
    
    
    // metodos de asignacion
    public boolean asingnarGrupo() {
        StringBuilder infoGrupo = new StringBuilder("Ingrese la categoria de su instrumento: \n");
        for (int i = 0; i < grupos.length; i++) {
            infoGrupo.append(i + 1).append(". ").append(grupos[i]).append("\n");
        }

        boolean repetir = true;

        do {
            var opcion = Integer.parseInt(JOptionPane.showInputDialog(infoGrupo));

            switch (opcion) {
                case 1:
                    this.grupo = grupos[0];
                    repetir = false;
                    break;
                case 2:
                    this.grupo = grupos[1];
                    repetir = false;
                    break;
                case 3:
                    this.grupo = grupos[2];
                    repetir = false;
                    break;
                case 4:
                    this.grupo = grupos[3];
                    repetir = false;
                    break;
                case 5:
                    this.grupo = grupos[4];
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escoga alguna de las opciones mostradas");
            }

        } while (repetir);
        return true;
    }

    public void asignarEstado() {
        StringBuilder infoGrupo = new StringBuilder("Ingrese el estado de su instrumento: \n");
        for (int i = 0; i < estados.length; i++) {
            infoGrupo.append(i + 1).append(". ").append(estados[i]).append("\n");
        }

        boolean repetir = true;

        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(infoGrupo));

            switch (opcion) {
                case 1:
                    this.estado = grupos[0];
                    repetir = false;
                    break;
                case 2:
                    this.estado = grupos[1];
                    repetir = false;
                    break;
                case 3:
                    this.estado = grupos[2];
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escoga alguna de las opciones mostradas");
            }

        } while (repetir);

    }

}
