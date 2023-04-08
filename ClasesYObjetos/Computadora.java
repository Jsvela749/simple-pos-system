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
public class Computadora extends Producto{
    private String procesador;
    private String monitor;
    private int ram;
    private String sistemaOperativo;
    private boolean laptop;

    public Computadora(String procesador, String monitor, int ram, String sistemaOperativo, boolean laptop, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.procesador = procesador;
        this.monitor = monitor;
        this.ram = ram;
        this.sistemaOperativo = sistemaOperativo;
        this.laptop = laptop;
    }
    
    
    
    
}
