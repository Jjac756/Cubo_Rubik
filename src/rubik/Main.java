package rubik;

import clases.Lados;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        Lados cubo1 = new Lados();

        byte respuesta;

        System.out.println("\n<|========== CUBO ORDENADO ==========|>\n");
        Lados.imprimirCubo();

        System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
        System.out.println("0) Mostrar Cubo \n1) Movimiento A3 \nRespuesta: ");
        respuesta = Leer.nextByte();

        Lados.opciones(respuesta);

        System.out.println("\n<|========== CUBO ACTUAL ==========|>\n");
        Lados.imprimirCubo();
    } // Fin del main
} // Fin del paquete