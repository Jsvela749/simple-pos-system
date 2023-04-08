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
public class MemoriaRAM extends Producto{
    private int capacidad;
    private String compatibilidad;
    private boolean laptop;

    public MemoriaRAM(int capacidad, String compatibilidad, boolean laptop, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.capacidad = capacidad;
        this.compatibilidad = compatibilidad;
        this.laptop = laptop;
    }
    
}
