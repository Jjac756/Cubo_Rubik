package clases;

import java.util.Scanner;

public class Lados {

    public static int[][] ladoRojo_Cara1 = {{0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19}};
    public static int[][] ladoAmarillo_Cara2 = {{0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29}};
    public static int[][] ladoNaranja_Cara3 = {{0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39}};
    public static int[][] ladoBlanco_Cara4 = {{0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49}};
    public static int[][] ladoVerde_Cara5 = {{0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59}};
    public static int[][] ladoAzul_Cara6 = {{0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69}};

    private byte respuesta = 0;
    Scanner leer = new Scanner(System.in);

    public static void imprimir(int[][] cara) {
        for (int i = 1; i <= 3; i++) {
            System.out.print("         ");
            for (int j = 1; j <= 3; j++) {
                System.out.print(cara[i][j] + " ");
            }
            System.out.println();
        } // Fin del ciclo i
    } // Fin del método imprimir

    public static void imprimirTresCaras(int[][] caraX, int[][] caraY, int[][] caraZ) {
        for (int i = 1; i <= 3; i++) {
            for (int veces = 1; veces <= 3; veces++) {
                for (int j = 1; j <= 3; j++) {
                    if (veces == 1) {
                        System.out.print(caraX[i][j] + " ");
                    } else if (veces == 2) {
                        System.out.print(caraY[i][j] + " ");
                    } else {
                        System.out.print(caraZ[i][j] + " ");
                    }
                } // Fin del ciclo J
            } // Fin del ciclo veces
            System.out.println();
        }  // Fin del ciclo i
    } // Fin del método imprimirTresCaras

    public static void imprimirCubo() {
        imprimir(ladoRojo_Cara1);
        imprimirTresCaras(ladoVerde_Cara5, ladoAmarillo_Cara2, ladoAzul_Cara6);
        imprimir(ladoNaranja_Cara3);
        imprimir(ladoBlanco_Cara4);
    } // Fin del método imprimirCubo

    // Inicio de los movimientos A
    public void rotacionDerechaCara6() {
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

    public void rotacionIzquierdaCara5() {
        int variableTemporal = ladoVerde_Cara5[1][1];
        int variableTemporal2 = ladoVerde_Cara5[2][3];

        // Aristas
        ladoVerde_Cara5[1][1] = ladoVerde_Cara5[1][3];
        ladoVerde_Cara5[1][3] = ladoVerde_Cara5[3][3];
        ladoVerde_Cara5[3][3] = ladoVerde_Cara5[3][1];
        ladoVerde_Cara5[3][1] = variableTemporal;

        // Centros
        ladoVerde_Cara5[2][3] = ladoVerde_Cara5[3][2];
        ladoVerde_Cara5[3][2] = ladoVerde_Cara5[2][1];
        ladoVerde_Cara5[2][1] = ladoVerde_Cara5[1][2];
        ladoVerde_Cara5[1][2] = variableTemporal2;

    } // Fin del método rotacionDerechaCara5 Verde

    public void movimientoA1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][1];

            // Números
            ladoRojo_Cara1[i][1] = ladoAmarillo_Cara2[i][1];
            ladoAmarillo_Cara2[i][1] = ladoNaranja_Cara3[i][1];
            ladoNaranja_Cara3[i][1] = ladoBlanco_Cara4[i][1];
            ladoBlanco_Cara4[i][1] = temporal;
        } // Fin del for

        rotacionIzquierdaCara5();
    } // Fin del método movimiento A1

    public void movimientoA2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][2];

            // Números
            ladoRojo_Cara1[i][2] = ladoAmarillo_Cara2[i][2];
            ladoAmarillo_Cara2[i][2] = ladoNaranja_Cara3[i][2];
            ladoNaranja_Cara3[i][2] = ladoBlanco_Cara4[i][2];
            ladoBlanco_Cara4[i][2] = temporal;
        } // Fin del for
    } // Fin del método movimiento A2        

    public void movimientoA3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][3];

            // Números
            ladoRojo_Cara1[i][3] = ladoAmarillo_Cara2[i][3];
            ladoAmarillo_Cara2[i][3] = ladoNaranja_Cara3[i][3];
            ladoNaranja_Cara3[i][3] = ladoBlanco_Cara4[i][3];
            ladoBlanco_Cara4[i][3] = temporal;
        } // Fin del for

        rotacionDerechaCara6();
    } // Fin del método A3
    // Fin de movimientos A

    // Inicio de los Movimientos B
    public void rotacionDerechaCara6_MovimientosB() {
        int variableTemporal = ladoAzul_Cara6[1][1];
        int variableTemporal2 = ladoAzul_Cara6[2][3];

        // Aristas
        ladoAzul_Cara6[1][1] = ladoAzul_Cara6[1][3];
        ladoAzul_Cara6[1][3] = ladoAzul_Cara6[3][3];
        ladoAzul_Cara6[3][3] = ladoAzul_Cara6[3][1];
        ladoAzul_Cara6[3][1] = variableTemporal;

        // Centros
        ladoAzul_Cara6[2][3] = ladoAzul_Cara6[3][2];
        ladoAzul_Cara6[3][2] = ladoAzul_Cara6[2][1];
        ladoAzul_Cara6[2][1] = ladoAzul_Cara6[1][2];
        ladoAzul_Cara6[1][2] = variableTemporal2;
    } // Fin del método rotacionDerechaCara6_MovimientosB Azul

    public void rotacionIzquierdaCara5_MovimientosB() {
        int variableTemporal = ladoVerde_Cara5[1][3];
        int variableTemporal2 = ladoVerde_Cara5[2][1];

        // Aristas
        ladoVerde_Cara5[1][3] = ladoVerde_Cara5[1][1];
        ladoVerde_Cara5[1][1] = ladoVerde_Cara5[3][1];
        ladoVerde_Cara5[3][1] = ladoVerde_Cara5[3][3];
        ladoVerde_Cara5[3][3] = variableTemporal;

        // Centros
        ladoVerde_Cara5[2][1] = ladoVerde_Cara5[3][2];
        ladoVerde_Cara5[3][2] = ladoVerde_Cara5[2][3];
        ladoVerde_Cara5[2][3] = ladoVerde_Cara5[1][2];
        ladoVerde_Cara5[1][2] = variableTemporal2;
    } // Fin del método rotacionDerechaCara5_MovimientosB Verde

    public void movimientoB1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][1];

            // Números
            ladoRojo_Cara1[i][1] = ladoBlanco_Cara4[i][1];
            ladoBlanco_Cara4[i][1] = ladoNaranja_Cara3[i][1];
            ladoNaranja_Cara3[i][1] = ladoAmarillo_Cara2[i][1];
            ladoAmarillo_Cara2[i][1] = temporal;
        } // Fin del for

        rotacionIzquierdaCara5_MovimientosB();
    } // Fin del método movimiento B1

    public void movimientoB2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][2];

            // Números
            ladoRojo_Cara1[i][2] = ladoBlanco_Cara4[i][2];
            ladoBlanco_Cara4[i][2] = ladoNaranja_Cara3[i][2];
            ladoNaranja_Cara3[i][2] = ladoAmarillo_Cara2[i][2];
            ladoAmarillo_Cara2[i][2] = temporal;
        } // Fin del for
    } // Fin del método movimiento B2

    public void movimientoB3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][3];

            // Números
            ladoRojo_Cara1[i][3] = ladoBlanco_Cara4[i][3];
            ladoBlanco_Cara4[i][3] = ladoNaranja_Cara3[i][3];
            ladoNaranja_Cara3[i][3] = ladoAmarillo_Cara2[i][3];
            ladoAmarillo_Cara2[i][3] = temporal;
        } // Fin del for

        rotacionDerechaCara6_MovimientosB();
    } // Fin del método movimiento B3
    // Fin de los movimientos B

    //Inicio de los movimientos I
    public void rotacionSuperiorCara1_MovimientosI() {
        int variableTemporal = ladoRojo_Cara1[1][3];
        int variableTemporal2 = ladoRojo_Cara1[2][1];

        // Aristas
        ladoRojo_Cara1[1][3] = ladoRojo_Cara1[1][1];
        ladoRojo_Cara1[1][1] = ladoRojo_Cara1[3][1];
        ladoRojo_Cara1[3][1] = ladoRojo_Cara1[3][3];
        ladoRojo_Cara1[3][3] = variableTemporal;

        // Centros
        ladoRojo_Cara1[2][1] = ladoRojo_Cara1[3][2];
        ladoRojo_Cara1[3][2] = ladoRojo_Cara1[2][3];
        ladoRojo_Cara1[2][3] = ladoRojo_Cara1[1][2];
        ladoRojo_Cara1[1][2] = variableTemporal2;
    } // Fin del método rotacionSuperiorCara1_MovimientosI Blanco

    public void rotacionInferiorCara3_MovimientosI() {
        int variableTemporal = ladoNaranja_Cara3[1][1];
        int variableTemporal2 = ladoNaranja_Cara3[2][3];

        // Aristas
        ladoNaranja_Cara3[1][1] = ladoNaranja_Cara3[1][3];
        ladoNaranja_Cara3[1][3] = ladoNaranja_Cara3[3][3];
        ladoNaranja_Cara3[3][3] = ladoNaranja_Cara3[3][1];
        ladoNaranja_Cara3[3][1] = variableTemporal;

        // Centros
        ladoNaranja_Cara3[2][3] = ladoNaranja_Cara3[3][2];
        ladoNaranja_Cara3[3][2] = ladoNaranja_Cara3[2][1];
        ladoNaranja_Cara3[2][1] = ladoNaranja_Cara3[1][2];
        ladoNaranja_Cara3[1][2] = variableTemporal2;
    } // Fin del método rotacionInferiorCara3_MovimientosI Amarillo

    public void movimientoI1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[1][i];

            // Números
            ladoVerde_Cara5[1][i] = ladoAmarillo_Cara2[1][i];
            ladoAmarillo_Cara2[1][i] = ladoAzul_Cara6[1][i];
            ladoAzul_Cara6[1][i] = ladoBlanco_Cara4[1][i];
            ladoBlanco_Cara4[1][i] = temporal;
        } // Fin del for

        rotacionSuperiorCara1_MovimientosI();
    } // Fin del método MovimientoI1

    public void movimientoI2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[2][i];

            // Números
            ladoVerde_Cara5[2][i] = ladoAmarillo_Cara2[2][i];
            ladoAmarillo_Cara2[2][i] = ladoAzul_Cara6[2][i];
            ladoAzul_Cara6[2][i] = ladoBlanco_Cara4[2][i];
            ladoBlanco_Cara4[2][i] = temporal;
        } // Fin del for
    } // Fin del método MovimientoI2

    public void movimientoI3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[3][i];

            // Números
            ladoVerde_Cara5[3][i] = ladoAmarillo_Cara2[3][i];
            ladoAmarillo_Cara2[3][i] = ladoAzul_Cara6[3][i];
            ladoAzul_Cara6[3][i] = ladoBlanco_Cara4[3][i];
            ladoBlanco_Cara4[3][i] = temporal;
        } // Fin del for

        rotacionInferiorCara3_MovimientosI();
    } // Fin del método MovimientoI3
    // Fin de los movimientos I

    //Inicio de los movimientos D
    public void rotacionSuperiorCara1_MovimientosD() {
        int variableTemporal = ladoRojo_Cara1[1][1];
        int variableTemporal2 = ladoRojo_Cara1[2][3];

        // Aristas
        ladoRojo_Cara1[1][1] = ladoRojo_Cara1[1][3];
        ladoRojo_Cara1[1][3] = ladoRojo_Cara1[3][3];
        ladoRojo_Cara1[3][3] = ladoRojo_Cara1[3][1];
        ladoRojo_Cara1[3][1] = variableTemporal;

        // Centros
        ladoRojo_Cara1[2][3] = ladoRojo_Cara1[3][2];
        ladoRojo_Cara1[3][2] = ladoRojo_Cara1[2][1];
        ladoRojo_Cara1[2][1] = ladoRojo_Cara1[1][2];
        ladoRojo_Cara1[1][2] = variableTemporal2;
    } // Fin del método rotacionSuperiorCara1_MovimientosD Blanco

    public void rotacionInferiorCara3_MovimientosD() {
        int variableTemporal = ladoNaranja_Cara3[1][3];
        int variableTemporal2 = ladoNaranja_Cara3[2][1];

        // Aristas
        ladoNaranja_Cara3[1][3] = ladoNaranja_Cara3[1][1];
        ladoNaranja_Cara3[1][1] = ladoNaranja_Cara3[3][1];
        ladoNaranja_Cara3[3][1] = ladoNaranja_Cara3[3][3];
        ladoNaranja_Cara3[3][3] = variableTemporal;

        // Centros
        ladoNaranja_Cara3[2][1] = ladoNaranja_Cara3[3][2];
        ladoNaranja_Cara3[3][2] = ladoNaranja_Cara3[2][3];
        ladoNaranja_Cara3[2][3] = ladoNaranja_Cara3[1][2];
        ladoNaranja_Cara3[1][2] = variableTemporal2;
    } // Fin del método rotacionInferiorCara3_MovimientosD Amarillo    

    public void movimientoD1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[1][i];

            // Números
            ladoVerde_Cara5[1][i] = ladoBlanco_Cara4[1][i];
            ladoBlanco_Cara4[1][i] = ladoAzul_Cara6[1][i];
            ladoAzul_Cara6[1][i] = ladoAmarillo_Cara2[1][i];
            ladoAmarillo_Cara2[1][i] = temporal;
        } // Fin del for

        rotacionSuperiorCara1_MovimientosD();
    } // Fin del método MovimientoD1

    public void movimientoD2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[2][i];

            // Números
            ladoVerde_Cara5[2][i] = ladoBlanco_Cara4[2][i];
            ladoBlanco_Cara4[2][i] = ladoAzul_Cara6[2][i];
            ladoAzul_Cara6[2][i] = ladoAmarillo_Cara2[2][i];
            ladoAmarillo_Cara2[2][i] = temporal;
        } // Fin del for
    } // Fin del método MovimientoD2

    public void movimientoD3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[3][i];

            // Números
            ladoVerde_Cara5[3][i] = ladoBlanco_Cara4[3][i];
            ladoBlanco_Cara4[3][i] = ladoAzul_Cara6[3][i];
            ladoAzul_Cara6[3][i] = ladoAmarillo_Cara2[3][i];
            ladoAmarillo_Cara2[3][i] = temporal;
        } // Fin del for

        rotacionInferiorCara3_MovimientosD();
    } // Fin del método MovimientoD3
    // Fin de los movimientos D

    // Inicio Movimientos RD
    public void rotacionSuperiorCara1_MovimientosRD() {
        int variableTemporal = ladoAmarillo_Cara2[1][3];
        int variableTemporal2 = ladoAmarillo_Cara2[2][1];

        // Aristas
        ladoAmarillo_Cara2[1][3] = ladoAmarillo_Cara2[1][1];
        ladoAmarillo_Cara2[1][1] = ladoAmarillo_Cara2[3][1];
        ladoAmarillo_Cara2[3][1] = ladoAmarillo_Cara2[3][3];
        ladoAmarillo_Cara2[3][3] = variableTemporal;

        // Centros
        ladoAmarillo_Cara2[2][1] = ladoAmarillo_Cara2[3][2];
        ladoAmarillo_Cara2[3][2] = ladoAmarillo_Cara2[2][3];
        ladoAmarillo_Cara2[2][3] = ladoAmarillo_Cara2[1][2];
        ladoAmarillo_Cara2[1][2] = variableTemporal2;
    } // Fin del método rotacionSuperiorCara1_MovimientosRD Rojo

    public void rotacionInferiorCara3_MovimientosRD() {
        int variableTemporal = ladoBlanco_Cara4[1][1];
        int variableTemporal2 = ladoBlanco_Cara4[2][3];

        // Aristas
        ladoBlanco_Cara4[1][1] = ladoBlanco_Cara4[1][3];
        ladoBlanco_Cara4[1][3] = ladoBlanco_Cara4[3][3];
        ladoBlanco_Cara4[3][3] = ladoBlanco_Cara4[3][1];
        ladoBlanco_Cara4[3][1] = variableTemporal;

        // Centros
        ladoBlanco_Cara4[2][3] = ladoBlanco_Cara4[3][2];
        ladoBlanco_Cara4[3][2] = ladoBlanco_Cara4[2][1];
        ladoBlanco_Cara4[2][1] = ladoBlanco_Cara4[1][2];
        ladoBlanco_Cara4[1][2] = variableTemporal2;
    } // Fin del método rotacionInferiorCara3_MovimientosRD Naranja

    public void movimientoRD1() {
        int temporal1 = ladoRojo_Cara1[3][3];
        int temporal2 = ladoRojo_Cara1[3][2];
        int temporal3 = ladoRojo_Cara1[3][1];

        // Números. Lado Rojo y Verde
        ladoRojo_Cara1[3][3] = ladoVerde_Cara5[1][3];
        ladoRojo_Cara1[3][2] = ladoVerde_Cara5[2][3];
        ladoRojo_Cara1[3][1] = ladoVerde_Cara5[3][3];

        // Números. Lado Verde y Naranja
        ladoVerde_Cara5[3][3] = ladoNaranja_Cara3[1][3];
        ladoVerde_Cara5[2][3] = ladoNaranja_Cara3[1][2];
        ladoVerde_Cara5[1][3] = ladoNaranja_Cara3[1][1];

        // Números. Lado Naranja y Azul
        ladoNaranja_Cara3[1][1] = ladoAzul_Cara6[3][1];
        ladoNaranja_Cara3[1][2] = ladoAzul_Cara6[2][1];
        ladoNaranja_Cara3[1][3] = ladoAzul_Cara6[1][1];

        // Números. Lado Azul y Variable Temporal
        ladoAzul_Cara6[3][1] = temporal1;
        ladoAzul_Cara6[2][1] = temporal2;
        ladoAzul_Cara6[1][1] = temporal3;

        rotacionSuperiorCara1_MovimientosRD();
    } // Fin de los movimientos RD1

    public void movimientoRD2() {
        int temporal1 = ladoRojo_Cara1[2][3];
        int temporal2 = ladoRojo_Cara1[2][2];
        int temporal3 = ladoRojo_Cara1[2][1];

        // Números. Lado Rojo y Verde
        ladoRojo_Cara1[2][3] = ladoVerde_Cara5[1][2];
        ladoRojo_Cara1[2][2] = ladoVerde_Cara5[2][2];
        ladoRojo_Cara1[2][1] = ladoVerde_Cara5[3][2];

        // Números. Lado Verde y Naranja
        ladoVerde_Cara5[3][2] = ladoNaranja_Cara3[2][3];
        ladoVerde_Cara5[2][2] = ladoNaranja_Cara3[2][2];
        ladoVerde_Cara5[1][2] = ladoNaranja_Cara3[2][1];

        // Números. Lado Naranja y Azul
        ladoNaranja_Cara3[2][1] = ladoAzul_Cara6[3][2];
        ladoNaranja_Cara3[2][2] = ladoAzul_Cara6[2][2];
        ladoNaranja_Cara3[2][3] = ladoAzul_Cara6[1][2];

        // Números. Lado Azul y Variable Temporal
        ladoAzul_Cara6[3][2] = temporal1;
        ladoAzul_Cara6[2][2] = temporal2;
        ladoAzul_Cara6[1][2] = temporal3;

    } // Fin del método Movimiento RD2  

    public void movimientoRD3() {
        int temporal1 = ladoRojo_Cara1[1][3];
        int temporal2 = ladoRojo_Cara1[1][2];
        int temporal3 = ladoRojo_Cara1[1][1];

        // Números. Lado Rojo y Verde
        ladoRojo_Cara1[1][3] = ladoVerde_Cara5[1][1];
        ladoRojo_Cara1[1][2] = ladoVerde_Cara5[2][1];
        ladoRojo_Cara1[1][1] = ladoVerde_Cara5[3][1];

        // Números. Lado Verde y Naranja
        ladoVerde_Cara5[3][1] = ladoNaranja_Cara3[3][3];
        ladoVerde_Cara5[2][1] = ladoNaranja_Cara3[3][2];
        ladoVerde_Cara5[1][1] = ladoNaranja_Cara3[3][1];

        // Números. Lado Naranja y Azul
        ladoNaranja_Cara3[3][1] = ladoAzul_Cara6[3][3];
        ladoNaranja_Cara3[3][2] = ladoAzul_Cara6[2][3];
        ladoNaranja_Cara3[3][3] = ladoAzul_Cara6[1][3];

        // Números. Lado Azul y Variable Temporal
        ladoAzul_Cara6[3][3] = temporal1;
        ladoAzul_Cara6[2][3] = temporal2;
        ladoAzul_Cara6[1][3] = temporal3;

        rotacionInferiorCara3_MovimientosRD();
    } // Fin del método Movimiento RD3
    // Fin de los movimientos RD

    // Inicio de los movimientos RI
    public void rotacionSuperiorCara1_MovimientosRI() {
        int variableTemporal = ladoAmarillo_Cara2[1][1];
        int variableTemporal2 = ladoAmarillo_Cara2[2][3];

        // Aristas
        ladoAmarillo_Cara2[1][1] = ladoAmarillo_Cara2[1][3];
        ladoAmarillo_Cara2[1][3] = ladoAmarillo_Cara2[3][3];
        ladoAmarillo_Cara2[3][3] = ladoAmarillo_Cara2[3][1];
        ladoAmarillo_Cara2[3][1] = variableTemporal;

        // Centros
        ladoAmarillo_Cara2[2][3] = ladoAmarillo_Cara2[3][2];
        ladoAmarillo_Cara2[3][2] = ladoAmarillo_Cara2[2][1];
        ladoAmarillo_Cara2[2][1] = ladoAmarillo_Cara2[1][2];
        ladoAmarillo_Cara2[1][2] = variableTemporal2;

    } // Fin del método rotacionSuperiorCara1_MovimientosRI Rojo

    public void rotacionInferiorCara3_MovimientosRI() {
        int variableTemporal = ladoBlanco_Cara4[1][3];
        int variableTemporal2 = ladoBlanco_Cara4[2][1];

        // Aristas
        ladoBlanco_Cara4[1][3] = ladoBlanco_Cara4[1][1];
        ladoBlanco_Cara4[1][1] = ladoBlanco_Cara4[3][1];
        ladoBlanco_Cara4[3][1] = ladoBlanco_Cara4[3][3];
        ladoBlanco_Cara4[3][3] = variableTemporal;

        // Centros
        ladoBlanco_Cara4[2][1] = ladoBlanco_Cara4[3][2];
        ladoBlanco_Cara4[3][2] = ladoBlanco_Cara4[2][3];
        ladoBlanco_Cara4[2][3] = ladoBlanco_Cara4[1][2];
        ladoBlanco_Cara4[1][2] = variableTemporal2;

    } // Fin del método rotacionInferiorCara3_MovimientosRI Naranja    

    public void movimientoRI1() {
        int temporal1 = ladoRojo_Cara1[3][1];
        int temporal2 = ladoRojo_Cara1[3][2];
        int temporal3 = ladoRojo_Cara1[3][3];

        // Números. Lado Rojo y Azul
        ladoRojo_Cara1[3][1] = ladoAzul_Cara6[1][1];
        ladoRojo_Cara1[3][2] = ladoAzul_Cara6[2][1];
        ladoRojo_Cara1[3][3] = ladoAzul_Cara6[3][1];

        // Números. Lado Azul y Naranja
        ladoAzul_Cara6[1][1] = ladoNaranja_Cara3[1][3];
        ladoAzul_Cara6[2][1] = ladoNaranja_Cara3[1][2];
        ladoAzul_Cara6[3][1] = ladoNaranja_Cara3[1][1];

        // Números. Lado Naranja y Verde
        ladoNaranja_Cara3[1][3] = ladoVerde_Cara5[3][3];
        ladoNaranja_Cara3[1][2] = ladoVerde_Cara5[2][3];
        ladoNaranja_Cara3[1][1] = ladoVerde_Cara5[1][3];

        // Números. Lado Verde y Variable Temporal
        ladoVerde_Cara5[3][3] = temporal1;
        ladoVerde_Cara5[2][3] = temporal2;
        ladoVerde_Cara5[1][3] = temporal3;

        rotacionSuperiorCara1_MovimientosRI();
    } // Fin del método MovimientoI1

    public void movimientoRI2() {
        int temporal1 = ladoRojo_Cara1[2][1];
        int temporal2 = ladoRojo_Cara1[2][2];
        int temporal3 = ladoRojo_Cara1[2][3];

        // Números. Lado Rojo y Azul
        ladoRojo_Cara1[2][1] = ladoAzul_Cara6[1][2];
        ladoRojo_Cara1[2][2] = ladoAzul_Cara6[2][2];
        ladoRojo_Cara1[2][3] = ladoAzul_Cara6[3][2];

        // Números. Lado Azul y Naranja
        ladoAzul_Cara6[1][2] = ladoNaranja_Cara3[2][3];
        ladoAzul_Cara6[2][2] = ladoNaranja_Cara3[2][2];
        ladoAzul_Cara6[3][2] = ladoNaranja_Cara3[2][1];

        // Números. Lado Naranja y Verde
        ladoNaranja_Cara3[2][3] = ladoVerde_Cara5[3][2];
        ladoNaranja_Cara3[2][2] = ladoVerde_Cara5[2][2];
        ladoNaranja_Cara3[2][1] = ladoVerde_Cara5[1][2];

        // Números. Lado Verde y Variable Temporal
        ladoVerde_Cara5[3][2] = temporal1;
        ladoVerde_Cara5[2][2] = temporal2;
        ladoVerde_Cara5[1][2] = temporal3;

    } // Fin del método MovimientoRI2

    public void movimientoRI3() {
        int temporal1 = ladoRojo_Cara1[1][1];
        int temporal2 = ladoRojo_Cara1[1][2];
        int temporal3 = ladoRojo_Cara1[1][3];

        // Números. Lado Rojo y Azul
        ladoRojo_Cara1[1][1] = ladoAzul_Cara6[1][3];
        ladoRojo_Cara1[1][2] = ladoAzul_Cara6[2][3];
        ladoRojo_Cara1[1][3] = ladoAzul_Cara6[3][3];

        // Números. Lado Azul y Naranja
        ladoAzul_Cara6[1][3] = ladoNaranja_Cara3[3][3];
        ladoAzul_Cara6[2][3] = ladoNaranja_Cara3[3][2];
        ladoAzul_Cara6[3][3] = ladoNaranja_Cara3[3][1];

        // Números. Lado Naranja y Verde
        ladoNaranja_Cara3[3][3] = ladoVerde_Cara5[3][1];
        ladoNaranja_Cara3[3][2] = ladoVerde_Cara5[2][1];
        ladoNaranja_Cara3[3][1] = ladoVerde_Cara5[1][1];

        // Números. Lado Verde y Variable Temporal
        ladoVerde_Cara5[3][1] = temporal1;
        ladoVerde_Cara5[2][1] = temporal2;
        ladoVerde_Cara5[1][1] = temporal3;

        rotacionInferiorCara3_MovimientosRI();
    } // Fin del método MovimientoRI3
    // Fin de los movimientos RI    

    public static void mensaje() {
        System.out.println("\n<|========== CUBO ACTUAL ==========|>\n");
        imprimirCubo();
    } // Fin del método Mensaje

    public void opciones_MovimientosA() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
            System.out.println("0) Volver \n1) Movimiento A1 \n2) Movimiento A2 \n3) Movimiento A3 \n4) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    break OUTER;

                case 1:
                    movimientoA1();
                    mensaje();
                    break;

                case 2:
                    movimientoA2();
                    mensaje();
                    break;

                case 3:
                    movimientoA3();
                    mensaje();
                    break;

                case 4:
                    imprimirCubo();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            }
        }

    } // Fin del método opciones_MovimientosA

    public void opciones_MovimientosB() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
            System.out.println("0) Volver \n1) Movimiento B1 \n2) Movimiento B2 \n3) Movimiento B3 \n4) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    break OUTER;

                case 1:
                    movimientoB1();
                    mensaje();
                    break;

                case 2:
                    movimientoB2();
                    mensaje();
                    break;

                case 3:
                    movimientoB3();
                    mensaje();
                    break;

                case 4:
                    imprimirCubo();
                    break;

                case 5:
                    opciones_Categoria();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            }
        }

    } // Fin del método opciones_MovimientosB    

    public void opciones_MovimientosD() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
            System.out.println("0) Volver \n1) Movimiento D1 \n2) Movimiento D2 \n3) Movimiento D3 \n4) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    break OUTER;

                case 1:
                    movimientoD1();
                    mensaje();
                    break;

                case 2:
                    movimientoD2();
                    mensaje();
                    break;

                case 3:
                    movimientoD3();
                    mensaje();
                    break;

                case 4:
                    imprimirCubo();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            }
        }

    } // Fin del método opciones_MovimientosD   

    public void opciones_MovimientosI() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
            System.out.println("0) Volver \n1) Movimiento I1 \n2) Movimiento I2 \n3) Movimiento I3 \n4) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    break OUTER;

                case 1:
                    movimientoI1();
                    mensaje();
                    break;

                case 2:
                    movimientoI2();
                    mensaje();
                    break;

                case 3:
                    movimientoI3();
                    mensaje();
                    break;

                case 4:
                    imprimirCubo();
                    break;

                case 5:
                    opciones_Categoria();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            }
        }

    } // Fin del método opciones_MovimientosD   

    public void opciones_MovimientosRD() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
            System.out.println("0) Volver \n1) Movimiento RD1 \n2) Movimiento RD2 \n3) Movimiento RD3 \n4) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    break OUTER;

                case 1:
                    movimientoRD1();
                    mensaje();
                    break;

                case 2:
                    movimientoRD2();
                    mensaje();
                    break;

                case 3:
                    movimientoRD3();
                    mensaje();
                    break;

                case 4:
                    imprimirCubo();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            }
        }

    } // Fin del método opciones_MovimientosRD   

    public void opciones_MovimientosRI() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE MOVIMIENTOS ==========|>\n");
            System.out.println("0) Volver \n1) Movimiento RI1 \n2) Movimiento RI2 \n3) Movimiento RI3 \n4) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    break OUTER;

                case 1:
                    movimientoRI1();
                    mensaje();
                    break;

                case 2:
                    movimientoRI2();
                    mensaje();
                    break;

                case 3:
                    movimientoRI3();
                    mensaje();
                    break;

                case 4:
                    imprimirCubo();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            }
        }

    } // Fin del método opciones_MovimientosRI       

    public void opciones_Categoria() {
        OUTER:
        while (true) {
            System.out.println("\n<|========== ELIGE Categoría ==========|>\n");
            System.out.println("0) Salir \n1) Movimientos A \n2) Movimientos B \n3) Movimientos D \n4) Movimientos I"
                    + "\n5) Movimientos RD \n6) Movimientos RI \n7) Imprimir Cubo \nRespuesta: ");
            respuesta = leer.nextByte();

            switch (respuesta) {
                case 0:
                    System.out.println("Hasta Pronto!");
                    break OUTER;

                case 1:
                    opciones_MovimientosA();
                    break;

                case 2:
                    opciones_MovimientosB();
                    break;

                case 3:
                    opciones_MovimientosD();
                    break;

                case 4:
                    opciones_MovimientosI();
                    break;

                case 5:
                    opciones_MovimientosRD();
                    break;

                case 6:
                    opciones_MovimientosRI();
                    break;

                case 7:
                    imprimirCubo();
                    break;

                default:
                    System.out.println("Error! La opción ingresada no existe!");
                    break;
            } // Fin del switch            
        }
    } // Fin del método opciones_Movimientos

} // Fin de la clase Lados
