
package apppruebajuanmuñoz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private ArrayList <Reparacion> listaReparaciones;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Reparacion> getListaReparaciones() {
        return listaReparaciones;
    }

    public void setListaReparaciones(Reparacion listaReparaciones) {
        this.listaReparaciones.add(listaReparaciones);
    }
   
    
}
