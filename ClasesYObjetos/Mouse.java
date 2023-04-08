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
public class Mouse extends Producto{
    private int dpi;
    private boolean inalambrico;
    private boolean rgb;
    private String color;

    public Mouse(int dpi, boolean inalambrico, boolean rgb, String color, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.dpi = dpi;
        this.inalambrico = inalambrico;
        this.rgb = rgb;
        this.color = color;
    }

    
    
}
