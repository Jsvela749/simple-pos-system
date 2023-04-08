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
public class Teclado extends Producto{
    private String idioma;
    private boolean inalambrico;
    private boolean rgb;
    private String color;

    public Teclado(String idioma, boolean inalambrico, boolean rgb, String color, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.idioma = idioma;
        this.inalambrico = inalambrico;
        this.rgb = rgb;
        this.color = color;
    }
    
    
    
}
