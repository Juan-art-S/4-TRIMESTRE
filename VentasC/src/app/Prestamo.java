package app;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Prestamo {

    public Instrumento instrumento;
    private String nombreUsuario;
    private String celular;
    private String dirrecion;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Instrumento instrumento, String nombreUsuario, String celular, String dirrecion) {
        if (instrumento.getCantidad() > 0) {
            this.instrumento = instrumento;
            this.nombreUsuario = nombreUsuario;
            this.celular = celular;
            this.dirrecion = dirrecion;
            this.fechaPrestamo = LocalDate.now();
            this.fechaDevolucion = fechaPrestamo.plusWeeks(1);
        } else {
            JOptionPane.showMessageDialog(null, "NO se pudo crear el prestamo");
            this.nombreUsuario = null;
        }

    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCelular() {
        return celular;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isAtrasado() {
        return LocalDate.now().isAfter(fechaDevolucion);
    }

    @Override
    public String toString() {
        return "\nPrestamo{" + "instrumento=" + instrumento 
                + ", nombreUsuario=" + nombreUsuario + ", celular=" 
                + celular + ", dirrecion=" + dirrecion 
                + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" 
                + fechaDevolucion + ", estado: " + (isAtrasado() ? "Atrasado" : "En Plazo");
    }


    public void mostrarInfo() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Libro: " + instrumento.getNombre());
        System.out.println("Celular: " + celular);
        System.out.println("Dirrecion: " + dirrecion);
        System.out.println("- Fecha prestamo: ");
        System.out.println("- Fecha devolucion: ");
        System.out.println("Estado: " + (isAtrasado() ? "Atrasado" : "En Plazo"));
        System.out.println("");
    }

}
