
package servicios;

import entidades.Puntos;
import java.util.Scanner;

public class PuntosServicios {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos servicio = new Puntos();

        System.out.print("x1: ");
        servicio.setX1(leer.nextInt());
        System.out.print("y1: ");
        servicio.setY1(leer.nextInt());
        System.out.print("x2: ");
        servicio.setX2(leer.nextInt());
        System.out.print("y2: ");
        servicio.setX2(leer.nextInt());

        return servicio;
    }

    public void calcularDistancia(Puntos servicio) {

        double distX = Math.pow(Math.abs(servicio.getX2()-servicio.getX1()), 2);
        double distY = Math.pow(Math.abs(servicio.getY2()-servicio.getY1()), 2);
        
        double D = Math.sqrt((distX+distY));
        
        System.out.println("la disntacia entre los punto X e Y es: "+D);
    }


}

//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
//en los atributos del objeto. Después, a través de otro método calcular y devolver la
//distancia que existe entre los dos puntos que existen en la clase Puntos.