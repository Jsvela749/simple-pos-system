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
public class Procesador extends Producto{
    private double ciclosReloj;
    private int generacion;
    private String socket;

    public Procesador(double ciclosReloj, int generacion, String socket, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.ciclosReloj = ciclosReloj;
        this.generacion = generacion;
        this.socket = socket;
    }
    
}
