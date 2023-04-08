/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author Jesús Méndez
 */
public class Producto {
    private String nombreProducto;
    private double precio;
    private int codigo;
    private int cantidadDisponible;
    private String marca;
    
    //Metodos Set
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Metodos Get
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getMarca() {
        return marca;
    }
    
    //Constructor
    public Producto(String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidadDisponible = cantidadDisponible;
        this.marca = marca;
    }
    
}
