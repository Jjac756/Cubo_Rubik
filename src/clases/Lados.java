package clases;

public class Lados {
    private static int ladoRojo_Cara1[][] = { {0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19} };
    private static int ladoAmarillo_Cara2[][] = { {0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29} };
    private static int ladoNaranja_Cara3[][] = { {0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39} };
    private static int ladoBlanco_Cara4[][] = { {0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49} };
    private static int ladoVerde_Cara5[][] = { {0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59} };
    private static int ladoAzul_Cara6[][] = { {0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69} };

    public static void imprimir(int cara[][]) {
        for (int i = 1; i <= 3; i++) {
            System.out.print("         ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(cara[i][j] + " ");
            }
            System.out.println();
        } // Fin del ciclo i
    } // Fin del método imprimir

    public static void imprimirTresCaras(int caraX[][], int caraY[][], int caraZ[][]) {
        for (int i = 1; i <= 3; i++) {
            for (int veces = 1; veces <= 3; veces++) {
                for (int j = 1; j <= 3; j++) {
                    if (veces == 1) {
                        System.out.print(caraX[i][j] + " ");
                    } else if (veces == 2) {
                        System.out.print(caraY[i][j] + " ");
                    } else if (veces == 3) {
                        System.out.print(caraZ[i][j] + " ");
                    }
                } // Fin del ciclo J
            } // Fin del ciclo veces
            System.out.println("");
        }  // Fin del ciclo i
    } // Fin del método imprimirTresCaras

    public static void imprimirCubo() {
        imprimir(ladoRojo_Cara1);
        imprimirTresCaras(ladoVerde_Cara5, ladoAmarillo_Cara2, ladoAzul_Cara6);
        imprimir(ladoNaranja_Cara3);
        imprimir(ladoBlanco_Cara4);
    } // Fin del método imprimirCubo

    public static void rotacionDerechaCara6() {
        int variableTemporal = ladoAzul_Cara6[1][3];
        int variableTemporal2 = ladoAzul_Cara6[2][3];

        // Aristas
        ladoAzul_Cara6[1][3] = ladoAzul_Cara6[1][1];
        ladoAzul_Cara6[1][1] = ladoAzul_Cara6[3][1];
        ladoAzul_Cara6[3][1] = ladoAzul_Cara6[3][3];
        ladoAzul_Cara6[3][3] = variableTemporal;

        // Centros
        ladoAzul_Cara6[2][3] = ladoAzul_Cara6[1][2];
        ladoAzul_Cara6[1][2] = ladoAzul_Cara6[2][1];
        ladoAzul_Cara6[2][1] = ladoAzul_Cara6[3][2];
        ladoAzul_Cara6[3][2] = variableTemporal2;

    } // Fin del método rotacionDerechaCara6 Azul

    public static void rotacioIzquierdaCara5() {
        int variableTemporal = ladoVerde_Cara5[1][3];
        int variableTemporal2 = ladoVerde_Cara5[2][3];

        // Aristas
        ladoVerde_Cara5[1][3] = ladoVerde_Cara5[1][1];
        ladoVerde_Cara5[1][1] = ladoVerde_Cara5[3][1];
        ladoVerde_Cara5[3][1] = ladoVerde_Cara5[3][3];
        ladoVerde_Cara5[3][3] = variableTemporal;

        // Centros
        ladoVerde_Cara5[2][3] = ladoVerde_Cara5[1][2];
        ladoVerde_Cara5[1][2] = ladoVerde_Cara5[2][1];
        ladoVerde_Cara5[2][1] = ladoVerde_Cara5[3][2];
        ladoVerde_Cara5[3][2] = variableTemporal2;

    } // Fin del método rotacionDerechaCara5 Verde

    public static void movimientoA3() {

        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][3];

            ladoRojo_Cara1[i][3] = ladoAmarillo_Cara2[i][3];
            ladoAmarillo_Cara2[i][3] = ladoNaranja_Cara3[i][3];
            ladoNaranja_Cara3[i][3] = ladoBlanco_Cara4[i][3];
            ladoBlanco_Cara4[i][3] = temporal;
        }

        rotacionDerechaCara6();
        rotacioIzquierdaCara5();
    } // Fin del método A3

    public static void opciones(byte respuesta) {

        while (respuesta != 10) {
            switch (respuesta) {
                case 0:
                    imprimirCubo();
                    break;

                case 1:
                    movimientoA3();
                    break;


                case 10:
                    break;
            }
        }

    } // Fin de método opciones
} // Fin de la clase Lados