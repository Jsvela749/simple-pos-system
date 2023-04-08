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
public class TarjetaGrafica extends Producto{
    private String gpu;
    private String compatibilidad;

    public TarjetaGrafica(String gpu, String compatibilidad, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.gpu = gpu;
        this.compatibilidad = compatibilidad;
    }
    
    
}
