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
public class PCGamer extends Computadora{
    private String tarjetaGrafica;
    private boolean tecladoRetroiluminado;

    public PCGamer(String tarjetaGrafica, boolean tecladoRetroiluminado, String procesador, String monitor, int ram, String sistemaOperativo, boolean laptop, String nombreProducto, double precio, int codigo, int cantidadDisponible, String marca) {
        super(procesador, monitor, ram, sistemaOperativo, laptop, nombreProducto, precio, codigo, cantidadDisponible, marca);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
    }
    
}
