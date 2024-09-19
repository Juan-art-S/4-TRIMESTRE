package apppruebajuanmuñoz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reparacion {
   private int id;
   private String vehiculo;
   private ArrayList<Repuesto> listaRepuestosUtilizados;
   private String estado;

    public Reparacion(int id, String vehiculo, String estado) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Repuesto> getListaRepuestosUtilizados() {
        return listaRepuestosUtilizados;
    }

    public void setListaRepuestosUtilizados(ArrayList<Repuesto> listaRepuestosUtilizados) {
        this.listaRepuestosUtilizados = listaRepuestosUtilizados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
