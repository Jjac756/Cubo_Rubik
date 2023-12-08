package rubik;

import clases.Lados;

public class Main {
    
    public static void main(String[] args) {
        Lados cubo1 = new Lados();

        System.out.println("\n<|========== CUBO ORDENADO ==========|>\n");
        Lados.imprimirCubo();

        cubo1.opciones_Categoria();
    } // Fin del main
} // Fin del paquete