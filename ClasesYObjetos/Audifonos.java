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
public class Audifonos extends Producto{
    private String tipo;
    private int    impedancia;

    public Audifonos(String tipo, int impedancia, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.tipo = tipo;
        this.impedancia = impedancia;
    }
    
    
    
}
