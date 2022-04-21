
package pkg614;

import entidades.Puntos;
import servicios.PuntosServicios;


public class Main {

  
    public static void main(String[] args) {
        PuntosServicios ps = new PuntosServicios();
        Puntos p1 = ps.crearPuntos();
        
        ps.calcularDistancia(p1);
        
    }
    
}
