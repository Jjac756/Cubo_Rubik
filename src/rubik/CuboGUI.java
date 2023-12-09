package rubik;

import java.awt.Color;

public class CuboGUI extends javax.swing.JFrame {

    // Matriz de etiquetas
    public static int ladoRojo_Cara1[][] = {{0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19}};
    public static int ladoAmarillo_Cara2[][] = {{0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29}};
    public static int ladoNaranja_Cara3[][] = {{0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39}};
    public static int ladoBlanco_Cara4[][] = {{0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49}};
    public static int ladoVerde_Cara5[][] = {{0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59}};
    public static int ladoAzul_Cara6[][] = {{0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69}};

    // Colores
    public static Color ROJO = Color.RED;
    public static Color AMARILLO = Color.YELLOW;
    public static Color NARANJA = Color.ORANGE;
    public static Color BLANCO = Color.WHITE;
    public static Color VERDE = Color.GREEN;
    public static Color AZUL = Color.CYAN;

    // Matriz de colores
    public static Color color_ladoRojo_Cara1[][] = {{ROJO, ROJO, ROJO, ROJO}, {ROJO, ROJO, ROJO, ROJO}, {ROJO, ROJO, ROJO, ROJO}, {ROJO, ROJO, ROJO, ROJO}};
    public static Color color_ladoAmarillo_Cara2[][] = {{AMARILLO, AMARILLO, AMARILLO, AMARILLO}, {AMARILLO, AMARILLO, AMARILLO, AMARILLO}, {AMARILLO, AMARILLO, AMARILLO, AMARILLO}, {AMARILLO, AMARILLO, AMARILLO, AMARILLO}};
    public static Color color_ladoNaranja_Cara3[][] = {{NARANJA, NARANJA, NARANJA, NARANJA}, {NARANJA, NARANJA, NARANJA, NARANJA}, {NARANJA, NARANJA, NARANJA, NARANJA}, {NARANJA, NARANJA, NARANJA, NARANJA}};
    public static Color color_ladoBlanco_Cara4[][] = {{BLANCO, BLANCO, BLANCO, BLANCO}, {BLANCO, BLANCO, BLANCO, BLANCO}, {BLANCO, BLANCO, BLANCO, BLANCO}, {BLANCO, BLANCO, BLANCO, BLANCO}};
    public static Color color_ladoVerde_Cara5[][] = {{VERDE, VERDE, VERDE, VERDE}, {VERDE, VERDE, VERDE, VERDE}, {VERDE, VERDE, VERDE, VERDE}, {VERDE, VERDE, VERDE, VERDE}};
    public static Color color_ladoAzul_Cara6[][] = {{AZUL, AZUL, AZUL, AZUL}, {AZUL, AZUL, AZUL, AZUL}, {AZUL, AZUL, AZUL, AZUL}, {AZUL, AZUL, AZUL, AZUL}};

    // Contadores
    public static int contador_clicks_etiquetas = 0;
    public static int contador_clicks_colores = 0;

    // Inicio de etiquetas OFF
    void etiquetasOFF_Cara1_LadoRojo() {
        // Lado 1, Cara Roja
        txt_Lado1_11.setText(" ");
        txt_Lado1_12.setText(" ");
        txt_Lado1_13.setText(" ");
        txt_Lado1_14.setText(" ");
        txt_Lado1_15.setText(" ");
        txt_Lado1_16.setText(" ");
        txt_Lado1_17.setText(" ");
        txt_Lado1_18.setText(" ");
        txt_Lado1_19.setText(" ");
    } // Fin de etiquetasOFF Cara1 Lado Rojo

    void etiquetasOFF_Cara2_LadoAmarillo() {
        // Lado 2, Cara Amarilla
        txt_Lado2_21.setText(" ");
        txt_Lado2_21.setText(" ");
        txt_Lado2_22.setText(" ");
        txt_Lado2_23.setText(" ");
        txt_Lado2_24.setText(" ");
        txt_Lado2_25.setText(" ");
        txt_Lado2_26.setText(" ");
        txt_Lado2_27.setText(" ");
        txt_Lado2_28.setText(" ");
        txt_Lado2_29.setText(" ");
    } // Fin de etiquetasOFF Cara2 Lado Amarillo

    void etiquetasOFF_Cara3_LadoNaranja() {
        // Lado 3, Cara Naranja
        txt_Lado3_31.setText(" ");
        txt_Lado3_31.setText(" ");
        txt_Lado3_32.setText(" ");
        txt_Lado3_33.setText(" ");
        txt_Lado3_34.setText(" ");
        txt_Lado3_35.setText(" ");
        txt_Lado3_36.setText(" ");
        txt_Lado3_37.setText(" ");
        txt_Lado3_38.setText(" ");
        txt_Lado3_39.setText(" ");
    } // Fin de etiquetasOFF Cara3 Lado Naranja

    void etiquetasOFF_Cara4_LadoBlanco() {
        // Lado 4, Cara Blanca
        txt_Lado4_41.setText(" ");
        txt_Lado4_41.setText(" ");
        txt_Lado4_42.setText(" ");
        txt_Lado4_43.setText(" ");
        txt_Lado4_44.setText(" ");
        txt_Lado4_45.setText(" ");
        txt_Lado4_46.setText(" ");
        txt_Lado4_47.setText(" ");
        txt_Lado4_48.setText(" ");
        txt_Lado4_49.setText(" ");
    } // Fin de etiquetasOFF Cara4 Lado Blanco

    void etiquetasOFF_Cara5_LadoVerde() {
        // Lado 5, Cara Verde
        txt_Lado5_51.setText(" ");
        txt_Lado5_51.setText(" ");
        txt_Lado5_52.setText(" ");
        txt_Lado5_53.setText(" ");
        txt_Lado5_54.setText(" ");
        txt_Lado5_55.setText(" ");
        txt_Lado5_56.setText(" ");
        txt_Lado5_57.setText(" ");
        txt_Lado5_58.setText(" ");
        txt_Lado5_59.setText(" ");
    } // Fin de etiquetasOFF Cara5 Lado Verde

    void etiquetasOFF_Cara6_LadoAzul() {
        // Lado 6, Cara Azul
        txt_Lado6_61.setText(" ");
        txt_Lado6_61.setText(" ");
        txt_Lado6_62.setText(" ");
        txt_Lado6_63.setText(" ");
        txt_Lado6_64.setText(" ");
        txt_Lado6_65.setText(" ");
        txt_Lado6_66.setText(" ");
        txt_Lado6_67.setText(" ");
        txt_Lado6_68.setText(" ");
        txt_Lado6_69.setText(" ");
    } // Fin de etiquetasOFF Cara6 Lado Azul

    // Fin de etiquetas OFF
    //Inicio de etiquetas ON
    void etiquetasON_Cara1_LadoRojo() {
        // Lado 1, Cara Roja
        txt_Lado1_11.setText(String.valueOf(ladoRojo_Cara1[1][1]));
        txt_Lado1_12.setText(String.valueOf(ladoRojo_Cara1[1][2]));
        txt_Lado1_13.setText(String.valueOf(ladoRojo_Cara1[1][3]));
        txt_Lado1_14.setText(String.valueOf(ladoRojo_Cara1[2][1]));
        txt_Lado1_15.setText(String.valueOf(ladoRojo_Cara1[2][2]));
        txt_Lado1_16.setText(String.valueOf(ladoRojo_Cara1[2][3]));
        txt_Lado1_17.setText(String.valueOf(ladoRojo_Cara1[3][1]));
        txt_Lado1_18.setText(String.valueOf(ladoRojo_Cara1[3][2]));
        txt_Lado1_19.setText(String.valueOf(ladoRojo_Cara1[3][3]));
    } // Fin de etiquetasON Cara1 Lado Rojo

    void etiquetasON_Cara2_LadoAmarillo() {
        // Lado 2, Cara Amarilla
        txt_Lado2_21.setText(String.valueOf(ladoAmarillo_Cara2[1][1]));
        txt_Lado2_22.setText(String.valueOf(ladoAmarillo_Cara2[1][2]));
        txt_Lado2_23.setText(String.valueOf(ladoAmarillo_Cara2[1][3]));
        txt_Lado2_24.setText(String.valueOf(ladoAmarillo_Cara2[2][1]));
        txt_Lado2_25.setText(String.valueOf(ladoAmarillo_Cara2[2][2]));
        txt_Lado2_26.setText(String.valueOf(ladoAmarillo_Cara2[2][3]));
        txt_Lado2_27.setText(String.valueOf(ladoAmarillo_Cara2[3][1]));
        txt_Lado2_28.setText(String.valueOf(ladoAmarillo_Cara2[3][2]));
        txt_Lado2_29.setText(String.valueOf(ladoAmarillo_Cara2[3][3]));
    } // Fin de etiquetasON Cara2 Lado Amarillo

    void etiquetasON_Cara3_LadoNaranja() {
        // Lado 3, Cara Naranja
        txt_Lado3_31.setText(String.valueOf(ladoNaranja_Cara3[1][1]));
        txt_Lado3_32.setText(String.valueOf(ladoNaranja_Cara3[1][2]));
        txt_Lado3_33.setText(String.valueOf(ladoNaranja_Cara3[1][3]));
        txt_Lado3_34.setText(String.valueOf(ladoNaranja_Cara3[2][1]));
        txt_Lado3_35.setText(String.valueOf(ladoNaranja_Cara3[2][2]));
        txt_Lado3_36.setText(String.valueOf(ladoNaranja_Cara3[2][3]));
        txt_Lado3_37.setText(String.valueOf(ladoNaranja_Cara3[3][1]));
        txt_Lado3_38.setText(String.valueOf(ladoNaranja_Cara3[3][2]));
        txt_Lado3_39.setText(String.valueOf(ladoNaranja_Cara3[3][3]));
    } // Fin de etiquetasON Cara3 Lado Naranja

    void etiquetasON_Cara4_LadoBlanco() {
        // Lado 4, Cara Blanca
        txt_Lado4_41.setText(String.valueOf(ladoBlanco_Cara4[1][1]));
        txt_Lado4_42.setText(String.valueOf(ladoBlanco_Cara4[1][2]));
        txt_Lado4_43.setText(String.valueOf(ladoBlanco_Cara4[1][3]));
        txt_Lado4_44.setText(String.valueOf(ladoBlanco_Cara4[2][1]));
        txt_Lado4_45.setText(String.valueOf(ladoBlanco_Cara4[2][2]));
        txt_Lado4_46.setText(String.valueOf(ladoBlanco_Cara4[2][3]));
        txt_Lado4_47.setText(String.valueOf(ladoBlanco_Cara4[3][1]));
        txt_Lado4_48.setText(String.valueOf(ladoBlanco_Cara4[3][2]));
        txt_Lado4_49.setText(String.valueOf(ladoBlanco_Cara4[3][3]));
    } // Fin de etiquetasON Cara4 Lado Blanco

    void etiquetasON_Cara5_LadoVerde() {
        // Lado 5, Cara Verde
        txt_Lado5_51.setText(String.valueOf(ladoVerde_Cara5[1][1]));
        txt_Lado5_52.setText(String.valueOf(ladoVerde_Cara5[1][2]));
        txt_Lado5_53.setText(String.valueOf(ladoVerde_Cara5[1][3]));
        txt_Lado5_54.setText(String.valueOf(ladoVerde_Cara5[2][1]));
        txt_Lado5_55.setText(String.valueOf(ladoVerde_Cara5[2][2]));
        txt_Lado5_56.setText(String.valueOf(ladoVerde_Cara5[2][3]));
        txt_Lado5_57.setText(String.valueOf(ladoVerde_Cara5[3][1]));
        txt_Lado5_58.setText(String.valueOf(ladoVerde_Cara5[3][2]));
        txt_Lado5_59.setText(String.valueOf(ladoVerde_Cara5[3][3]));
    } // Fin de etiquetasON Cara5 Lado Verde

    void etiquetasON_Cara6_LadoAzul() {
        // Lado 6, Cara Azul
        txt_Lado6_61.setText(String.valueOf(ladoAzul_Cara6[1][1]));
        txt_Lado6_62.setText(String.valueOf(ladoAzul_Cara6[1][2]));
        txt_Lado6_63.setText(String.valueOf(ladoAzul_Cara6[1][3]));
        txt_Lado6_64.setText(String.valueOf(ladoAzul_Cara6[2][1]));
        txt_Lado6_65.setText(String.valueOf(ladoAzul_Cara6[2][2]));
        txt_Lado6_66.setText(String.valueOf(ladoAzul_Cara6[2][3]));
        txt_Lado6_67.setText(String.valueOf(ladoAzul_Cara6[3][1]));
        txt_Lado6_68.setText(String.valueOf(ladoAzul_Cara6[3][2]));
        txt_Lado6_69.setText(String.valueOf(ladoAzul_Cara6[3][3]));
    } // Fin de etiquetasON Cara6 Lado Azul

    // Fin de etiquetas ON
    // Inicio de Colores OFF
    void coloresOFF_Cara1_LadoRojo() {
        // Lado 1, Cara Roja
        txt_Lado1_11.setBackground(BLANCO);
        txt_Lado1_12.setBackground(BLANCO);
        txt_Lado1_13.setBackground(BLANCO);
        txt_Lado1_14.setBackground(BLANCO);
        txt_Lado1_15.setBackground(BLANCO);
        txt_Lado1_16.setBackground(BLANCO);
        txt_Lado1_17.setBackground(BLANCO);
        txt_Lado1_18.setBackground(BLANCO);
        txt_Lado1_19.setBackground(BLANCO);
    } // Fin de coloresOFF Cara1 Lado Rojo

    void coloresOFF_Cara2_LadoAmarillo() {
        // Lado 2, Cara Amarilla
        txt_Lado2_21.setBackground(BLANCO);
        txt_Lado2_22.setBackground(BLANCO);
        txt_Lado2_23.setBackground(BLANCO);
        txt_Lado2_24.setBackground(BLANCO);
        txt_Lado2_25.setBackground(BLANCO);
        txt_Lado2_26.setBackground(BLANCO);
        txt_Lado2_27.setBackground(BLANCO);
        txt_Lado2_28.setBackground(BLANCO);
        txt_Lado2_29.setBackground(BLANCO);
    } // Fin de coloresOFF Cara2 Lado Amarillo

    void coloresOFF_Cara3_LadoNaranja() {
        // Lado 3, Cara Naranja
        txt_Lado3_31.setBackground(BLANCO);
        txt_Lado3_32.setBackground(BLANCO);
        txt_Lado3_33.setBackground(BLANCO);
        txt_Lado3_34.setBackground(BLANCO);
        txt_Lado3_35.setBackground(BLANCO);
        txt_Lado3_36.setBackground(BLANCO);
        txt_Lado3_37.setBackground(BLANCO);
        txt_Lado3_38.setBackground(BLANCO);
        txt_Lado3_39.setBackground(BLANCO);
    } // Fin de coloresOFF Cara3 Lado Naranja

    void coloresOFF_Cara4_LadoBlanco() {
        // Lado 4, Cara Blanca
        txt_Lado4_41.setBackground(BLANCO);
        txt_Lado4_42.setBackground(BLANCO);
        txt_Lado4_43.setBackground(BLANCO);
        txt_Lado4_44.setBackground(BLANCO);
        txt_Lado4_45.setBackground(BLANCO);
        txt_Lado4_46.setBackground(BLANCO);
        txt_Lado4_47.setBackground(BLANCO);
        txt_Lado4_48.setBackground(BLANCO);
        txt_Lado4_49.setBackground(BLANCO);
    } // Fin de coloresOFF Cara4 Lado Blanco

    void coloresOFF_Cara5_LadoVerde() {
        // Lado 5, Cara Verde
        txt_Lado5_51.setBackground(BLANCO);
        txt_Lado5_52.setBackground(BLANCO);
        txt_Lado5_53.setBackground(BLANCO);
        txt_Lado5_54.setBackground(BLANCO);
        txt_Lado5_55.setBackground(BLANCO);
        txt_Lado5_56.setBackground(BLANCO);
        txt_Lado5_57.setBackground(BLANCO);
        txt_Lado5_58.setBackground(BLANCO);
        txt_Lado5_59.setBackground(BLANCO);
    } // Fin de coloresOFF Cara5 Lado Verde

    void coloresOFF_Cara6_LadoAzul() {
        // Lado 6, Cara Azul
        txt_Lado6_61.setBackground(BLANCO);
        txt_Lado6_62.setBackground(BLANCO);
        txt_Lado6_63.setBackground(BLANCO);
        txt_Lado6_64.setBackground(BLANCO);
        txt_Lado6_65.setBackground(BLANCO);
        txt_Lado6_66.setBackground(BLANCO);
        txt_Lado6_67.setBackground(BLANCO);
        txt_Lado6_68.setBackground(BLANCO);
        txt_Lado6_69.setBackground(BLANCO);
    } // Fin de coloresOFF Cara6 Lado Azul

    // Fin de coloresOFF  
    //Inicio de Colores ON
    void coloresON_Cara1_LadoRojo() {
        // Lado 1, Cara Roja
        txt_Lado1_11.setBackground(color_ladoRojo_Cara1[1][1]);
        txt_Lado1_12.setBackground(color_ladoRojo_Cara1[1][2]);
        txt_Lado1_13.setBackground(color_ladoRojo_Cara1[1][3]);
        txt_Lado1_14.setBackground(color_ladoRojo_Cara1[2][1]);
        txt_Lado1_15.setBackground(color_ladoRojo_Cara1[2][2]);
        txt_Lado1_16.setBackground(color_ladoRojo_Cara1[2][3]);
        txt_Lado1_17.setBackground(color_ladoRojo_Cara1[3][1]);
        txt_Lado1_18.setBackground(color_ladoRojo_Cara1[3][2]);
        txt_Lado1_19.setBackground(color_ladoRojo_Cara1[3][3]);
    } // Fin de ColoresON Cara1 Lado Rojo

    void coloresON_Cara2_LadoAmarillo() {
        // Lado 2, Cara Amarilla
        txt_Lado2_21.setBackground(color_ladoAmarillo_Cara2[1][1]);
        txt_Lado2_22.setBackground(color_ladoAmarillo_Cara2[1][2]);
        txt_Lado2_23.setBackground(color_ladoAmarillo_Cara2[1][3]);
        txt_Lado2_24.setBackground(color_ladoAmarillo_Cara2[2][1]);
        txt_Lado2_25.setBackground(color_ladoAmarillo_Cara2[2][2]);
        txt_Lado2_26.setBackground(color_ladoAmarillo_Cara2[2][3]);
        txt_Lado2_27.setBackground(color_ladoAmarillo_Cara2[3][1]);
        txt_Lado2_28.setBackground(color_ladoAmarillo_Cara2[3][2]);
        txt_Lado2_29.setBackground(color_ladoAmarillo_Cara2[3][3]);
    } // Fin de ColoresON Cara2 Lado Amarillo

    void coloresON_Cara3_LadoNaranja() {
        // Lado 3, Cara Naranja
        txt_Lado3_31.setBackground(color_ladoNaranja_Cara3[1][1]);
        txt_Lado3_32.setBackground(color_ladoNaranja_Cara3[1][2]);
        txt_Lado3_33.setBackground(color_ladoNaranja_Cara3[1][3]);
        txt_Lado3_34.setBackground(color_ladoNaranja_Cara3[2][1]);
        txt_Lado3_35.setBackground(color_ladoNaranja_Cara3[2][2]);
        txt_Lado3_36.setBackground(color_ladoNaranja_Cara3[2][3]);
        txt_Lado3_37.setBackground(color_ladoNaranja_Cara3[3][1]);
        txt_Lado3_38.setBackground(color_ladoNaranja_Cara3[3][2]);
        txt_Lado3_39.setBackground(color_ladoNaranja_Cara3[3][3]);
    } // Fin de ColoresON Cara3 Lado Naranja

    void coloresON_Cara4_LadoBlanco() {
        // Lado 4, Cara Blanca
        txt_Lado4_41.setBackground(color_ladoBlanco_Cara4[1][1]);
        txt_Lado4_42.setBackground(color_ladoBlanco_Cara4[1][2]);
        txt_Lado4_43.setBackground(color_ladoBlanco_Cara4[1][3]);
        txt_Lado4_44.setBackground(color_ladoBlanco_Cara4[2][1]);
        txt_Lado4_45.setBackground(color_ladoBlanco_Cara4[2][2]);
        txt_Lado4_46.setBackground(color_ladoBlanco_Cara4[2][3]);
        txt_Lado4_47.setBackground(color_ladoBlanco_Cara4[3][1]);
        txt_Lado4_48.setBackground(color_ladoBlanco_Cara4[3][2]);
        txt_Lado4_49.setBackground(color_ladoBlanco_Cara4[3][3]);
    } // Fin de ColoresON Cara4 Lado Blanco

    void coloresON_Cara5_LadoVerde() {
        // Lado 5, Cara Verde
        txt_Lado5_51.setBackground(color_ladoVerde_Cara5[1][1]);
        txt_Lado5_52.setBackground(color_ladoVerde_Cara5[1][2]);
        txt_Lado5_53.setBackground(color_ladoVerde_Cara5[1][3]);
        txt_Lado5_54.setBackground(color_ladoVerde_Cara5[2][1]);
        txt_Lado5_55.setBackground(color_ladoVerde_Cara5[2][2]);
        txt_Lado5_56.setBackground(color_ladoVerde_Cara5[2][3]);
        txt_Lado5_57.setBackground(color_ladoVerde_Cara5[3][1]);
        txt_Lado5_58.setBackground(color_ladoVerde_Cara5[3][2]);
        txt_Lado5_59.setBackground(color_ladoVerde_Cara5[3][3]);
    } // Fin de ColoresON Cara5 Lado Verde

    void coloresON_Cara6_LadoAzul() {
        // Lado 6, Cara Azul
        txt_Lado6_61.setBackground(color_ladoAzul_Cara6[1][1]);
        txt_Lado6_62.setBackground(color_ladoAzul_Cara6[1][2]);
        txt_Lado6_63.setBackground(color_ladoAzul_Cara6[1][3]);
        txt_Lado6_64.setBackground(color_ladoAzul_Cara6[2][1]);
        txt_Lado6_65.setBackground(color_ladoAzul_Cara6[2][2]);
        txt_Lado6_66.setBackground(color_ladoAzul_Cara6[2][3]);
        txt_Lado6_67.setBackground(color_ladoAzul_Cara6[3][1]);
        txt_Lado6_68.setBackground(color_ladoAzul_Cara6[3][2]);
        txt_Lado6_69.setBackground(color_ladoAzul_Cara6[3][3]);
    } // Fin de ColoresON Cara6 Lado Azul

    // Fin de Colores ON
    void etiquetasOFF() {
        etiquetasOFF_Cara1_LadoRojo();
        etiquetasOFF_Cara2_LadoAmarillo();
        etiquetasOFF_Cara3_LadoNaranja();
        etiquetasOFF_Cara4_LadoBlanco();
        etiquetasOFF_Cara5_LadoVerde();
        etiquetasOFF_Cara6_LadoAzul();
    } // Fin del método etiquetas OFF

    void etiquetasON() {
        etiquetasON_Cara1_LadoRojo();
        etiquetasON_Cara2_LadoAmarillo();
        etiquetasON_Cara3_LadoNaranja();
        etiquetasON_Cara4_LadoBlanco();
        etiquetasON_Cara5_LadoVerde();
        etiquetasON_Cara6_LadoAzul();
    } // Fin del método etiquetas ON

    void coloresON() {
        coloresON_Cara1_LadoRojo();
        coloresON_Cara2_LadoAmarillo();
        coloresON_Cara3_LadoNaranja();
        coloresON_Cara4_LadoBlanco();
        coloresON_Cara5_LadoVerde();
        coloresON_Cara6_LadoAzul();
    } // Fin del método colores ON

    void coloresOFF() {
        coloresOFF_Cara1_LadoRojo();
        coloresOFF_Cara2_LadoAmarillo();
        coloresOFF_Cara3_LadoNaranja();
        coloresOFF_Cara4_LadoBlanco();
        coloresOFF_Cara5_LadoVerde();
        coloresOFF_Cara6_LadoAzul();
    } // Fin del método colores OFF

    void etiquetas() {
        contador_clicks_etiquetas = contador_clicks_etiquetas + 1;

        if (contador_clicks_etiquetas > 1) {
            contador_clicks_etiquetas = 0;
        }

        if (contador_clicks_etiquetas == 1) {
            etiquetasON();
        } else {
            etiquetasOFF();
        }
    } // Fin del método etiquetas

    void colores() {
        contador_clicks_colores = contador_clicks_colores + 1;

        if (contador_clicks_colores > 1) {
            contador_clicks_colores = 0;
        }

        if (contador_clicks_colores == 1) {
            coloresON();
        } else {
            coloresOFF();
        }
    } // Fin del método colores

    void activarContadores() {
        if (contador_clicks_etiquetas == 1) {
            etiquetasON();
        }

        if (contador_clicks_colores == 1) {
            coloresON();
        }
    } // Fin del método activarContadores

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

        // Color
        Color color_variableTemporal = color_ladoAzul_Cara6[1][3];
        Color color_variableTemporal2 = color_ladoAzul_Cara6[2][3];

        // Aristas
        color_ladoAzul_Cara6[1][3] = color_ladoAzul_Cara6[1][1];
        color_ladoAzul_Cara6[1][1] = color_ladoAzul_Cara6[3][1];
        color_ladoAzul_Cara6[3][1] = color_ladoAzul_Cara6[3][3];
        color_ladoAzul_Cara6[3][3] = color_variableTemporal;

        // Centros
        color_ladoAzul_Cara6[2][3] = color_ladoAzul_Cara6[1][2];
        color_ladoAzul_Cara6[1][2] = color_ladoAzul_Cara6[2][1];
        color_ladoAzul_Cara6[2][1] = color_ladoAzul_Cara6[3][2];
        color_ladoAzul_Cara6[3][2] = color_variableTemporal2;

        activarContadores();
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

        Color color_variableTemporal = color_ladoVerde_Cara5[1][1];
        Color color_variableTemporal2 = color_ladoVerde_Cara5[2][3];

        // Aristas
        color_ladoVerde_Cara5[1][1] = color_ladoVerde_Cara5[1][3];
        color_ladoVerde_Cara5[1][3] = color_ladoVerde_Cara5[3][3];
        color_ladoVerde_Cara5[3][3] = color_ladoVerde_Cara5[3][1];
        color_ladoVerde_Cara5[3][1] = color_variableTemporal;

        // Centros
        color_ladoVerde_Cara5[2][3] = color_ladoVerde_Cara5[3][2];
        color_ladoVerde_Cara5[3][2] = color_ladoVerde_Cara5[2][1];
        color_ladoVerde_Cara5[2][1] = color_ladoVerde_Cara5[1][2];
        color_ladoVerde_Cara5[1][2] = color_variableTemporal2;

        activarContadores();
    } // Fin del método rotacionDerechaCara5 Verde

    public void movimientoA1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][1];
            Color color_temporal = color_ladoRojo_Cara1[i][1];

            // Números
            ladoRojo_Cara1[i][1] = ladoAmarillo_Cara2[i][1];
            ladoAmarillo_Cara2[i][1] = ladoNaranja_Cara3[i][1];
            ladoNaranja_Cara3[i][1] = ladoBlanco_Cara4[i][1];
            ladoBlanco_Cara4[i][1] = temporal;

            // Color
            color_ladoRojo_Cara1[i][1] = color_ladoAmarillo_Cara2[i][1];
            color_ladoAmarillo_Cara2[i][1] = color_ladoNaranja_Cara3[i][1];
            color_ladoNaranja_Cara3[i][1] = color_ladoBlanco_Cara4[i][1];
            color_ladoBlanco_Cara4[i][1] = color_temporal;
        } // Fin del for

        rotacionIzquierdaCara5();
        activarContadores();
    } // Fin del método movimiento A1

    public void movimientoA2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][2];
            Color color_temporal = color_ladoRojo_Cara1[i][2];

            // Números
            ladoRojo_Cara1[i][2] = ladoAmarillo_Cara2[i][2];
            ladoAmarillo_Cara2[i][2] = ladoNaranja_Cara3[i][2];
            ladoNaranja_Cara3[i][2] = ladoBlanco_Cara4[i][2];
            ladoBlanco_Cara4[i][2] = temporal;

            // Color
            color_ladoRojo_Cara1[i][2] = color_ladoAmarillo_Cara2[i][2];
            color_ladoAmarillo_Cara2[i][2] = color_ladoNaranja_Cara3[i][2];
            color_ladoNaranja_Cara3[i][2] = color_ladoBlanco_Cara4[i][2];
            color_ladoBlanco_Cara4[i][2] = color_temporal;
        } // Fin del for

        activarContadores();
    } // Fin del método movimiento A2        

    public void movimientoA3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][3];
            Color color_temporal = color_ladoRojo_Cara1[i][3];

            // Números
            ladoRojo_Cara1[i][3] = ladoAmarillo_Cara2[i][3];
            ladoAmarillo_Cara2[i][3] = ladoNaranja_Cara3[i][3];
            ladoNaranja_Cara3[i][3] = ladoBlanco_Cara4[i][3];
            ladoBlanco_Cara4[i][3] = temporal;

            // Colores
            color_ladoRojo_Cara1[i][3] = color_ladoAmarillo_Cara2[i][3];
            color_ladoAmarillo_Cara2[i][3] = color_ladoNaranja_Cara3[i][3];
            color_ladoNaranja_Cara3[i][3] = color_ladoBlanco_Cara4[i][3];
            color_ladoBlanco_Cara4[i][3] = color_temporal;
        } // Fin del for

        rotacionDerechaCara6();
        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoAzul_Cara6[1][1];
        Color color_variableTemporal2 = color_ladoAzul_Cara6[2][3];

        // Aristas
        color_ladoAzul_Cara6[1][1] = color_ladoAzul_Cara6[1][3];
        color_ladoAzul_Cara6[1][3] = color_ladoAzul_Cara6[3][3];
        color_ladoAzul_Cara6[3][3] = color_ladoAzul_Cara6[3][1];
        color_ladoAzul_Cara6[3][1] = color_variableTemporal;

        // Centros
        color_ladoAzul_Cara6[2][3] = color_ladoAzul_Cara6[3][2];
        color_ladoAzul_Cara6[3][2] = color_ladoAzul_Cara6[2][1];
        color_ladoAzul_Cara6[2][1] = color_ladoAzul_Cara6[1][2];
        color_ladoAzul_Cara6[1][2] = color_variableTemporal2;

        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoVerde_Cara5[1][3];
        Color color_variableTemporal2 = color_ladoVerde_Cara5[2][1];

        // Aristas
        color_ladoVerde_Cara5[1][3] = color_ladoVerde_Cara5[1][1];
        color_ladoVerde_Cara5[1][1] = color_ladoVerde_Cara5[3][1];
        color_ladoVerde_Cara5[3][1] = color_ladoVerde_Cara5[3][3];
        color_ladoVerde_Cara5[3][3] = color_variableTemporal;

        // Centros
        color_ladoVerde_Cara5[2][1] = color_ladoVerde_Cara5[3][2];
        color_ladoVerde_Cara5[3][2] = color_ladoVerde_Cara5[2][3];
        color_ladoVerde_Cara5[2][3] = color_ladoVerde_Cara5[1][2];
        color_ladoVerde_Cara5[1][2] = color_variableTemporal2;

        activarContadores();
    } // Fin del método rotacionDerechaCara5_MovimientosB Verde

    public void movimientoB1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][1];
            Color color_temporal = color_ladoRojo_Cara1[i][1];

            // Números
            ladoRojo_Cara1[i][1] = ladoBlanco_Cara4[i][1];
            ladoBlanco_Cara4[i][1] = ladoNaranja_Cara3[i][1];
            ladoNaranja_Cara3[i][1] = ladoAmarillo_Cara2[i][1];
            ladoAmarillo_Cara2[i][1] = temporal;

            // Colores
            color_ladoRojo_Cara1[i][1] = color_ladoBlanco_Cara4[i][1];
            color_ladoBlanco_Cara4[i][1] = color_ladoNaranja_Cara3[i][1];
            color_ladoNaranja_Cara3[i][1] = color_ladoAmarillo_Cara2[i][1];
            color_ladoAmarillo_Cara2[i][1] = color_temporal;
        } // Fin del for

        rotacionIzquierdaCara5_MovimientosB();
        activarContadores();
    } // Fin del método movimiento B1

    public void movimientoB2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][2];
            Color color_temporal = color_ladoRojo_Cara1[i][2];

            // Números
            ladoRojo_Cara1[i][2] = ladoBlanco_Cara4[i][2];
            ladoBlanco_Cara4[i][2] = ladoNaranja_Cara3[i][2];
            ladoNaranja_Cara3[i][2] = ladoAmarillo_Cara2[i][2];
            ladoAmarillo_Cara2[i][2] = temporal;

            // Colores
            color_ladoRojo_Cara1[i][2] = color_ladoBlanco_Cara4[i][2];
            color_ladoBlanco_Cara4[i][2] = color_ladoNaranja_Cara3[i][2];
            color_ladoNaranja_Cara3[i][2] = color_ladoAmarillo_Cara2[i][2];
            color_ladoAmarillo_Cara2[i][2] = color_temporal;
        } // Fin del for

        activarContadores();
    } // Fin del método movimiento B2

    public void movimientoB3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][3];
            Color color_temporal = color_ladoRojo_Cara1[i][3];

            // Números
            ladoRojo_Cara1[i][3] = ladoBlanco_Cara4[i][3];
            ladoBlanco_Cara4[i][3] = ladoNaranja_Cara3[i][3];
            ladoNaranja_Cara3[i][3] = ladoAmarillo_Cara2[i][3];
            ladoAmarillo_Cara2[i][3] = temporal;

            // Colores
            color_ladoRojo_Cara1[i][3] = color_ladoBlanco_Cara4[i][3];
            color_ladoBlanco_Cara4[i][3] = color_ladoNaranja_Cara3[i][3];
            color_ladoNaranja_Cara3[i][3] = color_ladoAmarillo_Cara2[i][3];
            color_ladoAmarillo_Cara2[i][3] = color_temporal;
        } // Fin del for

        rotacionDerechaCara6_MovimientosB();
        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoRojo_Cara1[1][3];
        Color color_variableTemporal2 = color_ladoRojo_Cara1[2][1];

        // Aristas
        color_ladoRojo_Cara1[1][3] = color_ladoRojo_Cara1[1][1];
        color_ladoRojo_Cara1[1][1] = color_ladoRojo_Cara1[3][1];
        color_ladoRojo_Cara1[3][1] = color_ladoRojo_Cara1[3][3];
        color_ladoRojo_Cara1[3][3] = color_variableTemporal;

        // Centros
        color_ladoRojo_Cara1[2][1] = color_ladoRojo_Cara1[3][2];
        color_ladoRojo_Cara1[3][2] = color_ladoRojo_Cara1[2][3];
        color_ladoRojo_Cara1[2][3] = color_ladoRojo_Cara1[1][2];
        color_ladoRojo_Cara1[1][2] = color_variableTemporal2;

        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoNaranja_Cara3[1][1];
        Color color_variableTemporal2 = color_ladoNaranja_Cara3[2][3];

        // Aristas
        color_ladoNaranja_Cara3[1][1] = color_ladoNaranja_Cara3[1][3];
        color_ladoNaranja_Cara3[1][3] = color_ladoNaranja_Cara3[3][3];
        color_ladoNaranja_Cara3[3][3] = color_ladoNaranja_Cara3[3][1];
        color_ladoNaranja_Cara3[3][1] = color_variableTemporal;

        // Centros
        color_ladoNaranja_Cara3[2][3] = color_ladoNaranja_Cara3[3][2];
        color_ladoNaranja_Cara3[3][2] = color_ladoNaranja_Cara3[2][1];
        color_ladoNaranja_Cara3[2][1] = color_ladoNaranja_Cara3[1][2];
        color_ladoNaranja_Cara3[1][2] = color_variableTemporal2;

        activarContadores();
    } // Fin del método rotacionInferiorCara3_MovimientosI Amarillo

    public void movimientoI1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[1][i];
            Color color_temporal = color_ladoVerde_Cara5[1][i];

            // Números
            ladoVerde_Cara5[1][i] = ladoAmarillo_Cara2[1][i];
            ladoAmarillo_Cara2[1][i] = ladoAzul_Cara6[1][i];
            ladoAzul_Cara6[1][i] = ladoBlanco_Cara4[1][i];
            ladoBlanco_Cara4[1][i] = temporal;

            // Color
            color_ladoVerde_Cara5[1][i] = color_ladoAmarillo_Cara2[1][i];
            color_ladoAmarillo_Cara2[1][i] = color_ladoAzul_Cara6[1][i];
            color_ladoAzul_Cara6[1][i] = color_ladoBlanco_Cara4[1][i];
            color_ladoBlanco_Cara4[1][i] = color_temporal;
        } // Fin del for

        rotacionSuperiorCara1_MovimientosI();
        activarContadores();
    } // Fin del método MovimientoI1

    public void movimientoI2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[2][i];
            Color color_temporal = color_ladoVerde_Cara5[2][i];

            // Números
            ladoVerde_Cara5[2][i] = ladoAmarillo_Cara2[2][i];
            ladoAmarillo_Cara2[2][i] = ladoAzul_Cara6[2][i];
            ladoAzul_Cara6[2][i] = ladoBlanco_Cara4[2][i];
            ladoBlanco_Cara4[2][i] = temporal;

            // Color
            color_ladoVerde_Cara5[2][i] = color_ladoAmarillo_Cara2[2][i];
            color_ladoAmarillo_Cara2[2][i] = color_ladoAzul_Cara6[2][i];
            color_ladoAzul_Cara6[2][i] = color_ladoBlanco_Cara4[2][i];
            color_ladoBlanco_Cara4[2][i] = color_temporal;
        } // Fin del for

        activarContadores();
    } // Fin del método MovimientoI2

    public void movimientoI3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[3][i];
            Color color_temporal = color_ladoVerde_Cara5[3][i];

            // Números
            ladoVerde_Cara5[3][i] = ladoAmarillo_Cara2[3][i];
            ladoAmarillo_Cara2[3][i] = ladoAzul_Cara6[3][i];
            ladoAzul_Cara6[3][i] = ladoBlanco_Cara4[3][i];
            ladoBlanco_Cara4[3][i] = temporal;

            // Color
            color_ladoVerde_Cara5[3][i] = color_ladoAmarillo_Cara2[3][i];
            color_ladoAmarillo_Cara2[3][i] = color_ladoAzul_Cara6[3][i];
            color_ladoAzul_Cara6[3][i] = color_ladoBlanco_Cara4[3][i];
            color_ladoBlanco_Cara4[3][i] = color_temporal;
        } // Fin del for

        rotacionInferiorCara3_MovimientosI();
        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoRojo_Cara1[1][1];
        Color color_variableTemporal2 = color_ladoRojo_Cara1[2][3];

        // Aristas
        color_ladoRojo_Cara1[1][1] = color_ladoRojo_Cara1[1][3];
        color_ladoRojo_Cara1[1][3] = color_ladoRojo_Cara1[3][3];
        color_ladoRojo_Cara1[3][3] = color_ladoRojo_Cara1[3][1];
        color_ladoRojo_Cara1[3][1] = color_variableTemporal;

        // Centros
        color_ladoRojo_Cara1[2][3] = color_ladoRojo_Cara1[3][2];
        color_ladoRojo_Cara1[3][2] = color_ladoRojo_Cara1[2][1];
        color_ladoRojo_Cara1[2][1] = color_ladoRojo_Cara1[1][2];
        color_ladoRojo_Cara1[1][2] = color_variableTemporal2;

        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoNaranja_Cara3[1][3];
        Color color_variableTemporal2 = color_ladoNaranja_Cara3[2][1];

        // Aristas
        color_ladoNaranja_Cara3[1][3] = color_ladoNaranja_Cara3[1][1];
        color_ladoNaranja_Cara3[1][1] = color_ladoNaranja_Cara3[3][1];
        color_ladoNaranja_Cara3[3][1] = color_ladoNaranja_Cara3[3][3];
        color_ladoNaranja_Cara3[3][3] = color_variableTemporal;

        // Centros
        color_ladoNaranja_Cara3[2][1] = color_ladoNaranja_Cara3[3][2];
        color_ladoNaranja_Cara3[3][2] = color_ladoNaranja_Cara3[2][3];
        color_ladoNaranja_Cara3[2][3] = color_ladoNaranja_Cara3[1][2];
        color_ladoNaranja_Cara3[1][2] = color_variableTemporal2;

        activarContadores();
    } // Fin del método rotacionInferiorCara3_MovimientosD Amarillo    

    public void movimientoD1() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[1][i];
            Color color_temporal = color_ladoVerde_Cara5[1][i];

            // Números
            ladoVerde_Cara5[1][i] = ladoBlanco_Cara4[1][i];
            ladoBlanco_Cara4[1][i] = ladoAzul_Cara6[1][i];
            ladoAzul_Cara6[1][i] = ladoAmarillo_Cara2[1][i];
            ladoAmarillo_Cara2[1][i] = temporal;

            // Color
            color_ladoVerde_Cara5[1][i] = color_ladoBlanco_Cara4[1][i];
            color_ladoBlanco_Cara4[1][i] = color_ladoAzul_Cara6[1][i];
            color_ladoAzul_Cara6[1][i] = color_ladoAmarillo_Cara2[1][i];
            color_ladoAmarillo_Cara2[1][i] = color_temporal;
        } // Fin del for

        rotacionSuperiorCara1_MovimientosD();
        activarContadores();
    } // Fin del método MovimientoD1

    public void movimientoD2() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[2][i];
            Color color_temporal = color_ladoVerde_Cara5[2][i];

            // Números
            ladoVerde_Cara5[2][i] = ladoBlanco_Cara4[2][i];
            ladoBlanco_Cara4[2][i] = ladoAzul_Cara6[2][i];
            ladoAzul_Cara6[2][i] = ladoAmarillo_Cara2[2][i];
            ladoAmarillo_Cara2[2][i] = temporal;

            // Color
            color_ladoVerde_Cara5[2][i] = color_ladoBlanco_Cara4[2][i];
            color_ladoBlanco_Cara4[2][i] = color_ladoAzul_Cara6[2][i];
            color_ladoAzul_Cara6[2][i] = color_ladoAmarillo_Cara2[2][i];
            color_ladoAmarillo_Cara2[2][i] = color_temporal;
        } // Fin del for

        activarContadores();
    } // Fin del método MovimientoD2

    public void movimientoD3() {
        for (int i = 1; i <= 3; i++) {
            int temporal = ladoVerde_Cara5[3][i];
            Color color_temporal = color_ladoVerde_Cara5[3][i];

            // Números
            ladoVerde_Cara5[3][i] = ladoBlanco_Cara4[3][i];
            ladoBlanco_Cara4[3][i] = ladoAzul_Cara6[3][i];
            ladoAzul_Cara6[3][i] = ladoAmarillo_Cara2[3][i];
            ladoAmarillo_Cara2[3][i] = temporal;

            // Color
            color_ladoVerde_Cara5[3][i] = color_ladoBlanco_Cara4[3][i];
            color_ladoBlanco_Cara4[3][i] = color_ladoAzul_Cara6[3][i];
            color_ladoAzul_Cara6[3][i] = color_ladoAmarillo_Cara2[3][i];
            color_ladoAmarillo_Cara2[3][i] = color_temporal;
        } // Fin del for

        rotacionInferiorCara3_MovimientosD();
        activarContadores();
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

        Color color_variableTemporal = color_ladoAmarillo_Cara2[1][3];
        Color color_variableTemporal2 = color_ladoAmarillo_Cara2[2][1];

        // Aristas
        color_ladoAmarillo_Cara2[1][3] = color_ladoAmarillo_Cara2[1][1];
        color_ladoAmarillo_Cara2[1][1] = color_ladoAmarillo_Cara2[3][1];
        color_ladoAmarillo_Cara2[3][1] = color_ladoAmarillo_Cara2[3][3];
        color_ladoAmarillo_Cara2[3][3] = color_variableTemporal;

        // Centros
        color_ladoAmarillo_Cara2[2][1] = color_ladoAmarillo_Cara2[3][2];
        color_ladoAmarillo_Cara2[3][2] = color_ladoAmarillo_Cara2[2][3];
        color_ladoAmarillo_Cara2[2][3] = color_ladoAmarillo_Cara2[1][2];
        color_ladoAmarillo_Cara2[1][2] = color_variableTemporal2;
        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoBlanco_Cara4[1][1];
        Color color_variableTemporal2 = color_ladoBlanco_Cara4[2][3];

        // Aristas
        color_ladoBlanco_Cara4[1][1] = color_ladoBlanco_Cara4[1][3];
        color_ladoBlanco_Cara4[1][3] = color_ladoBlanco_Cara4[3][3];
        color_ladoBlanco_Cara4[3][3] = color_ladoBlanco_Cara4[3][1];
        color_ladoBlanco_Cara4[3][1] = color_variableTemporal;

        // Centros
        color_ladoBlanco_Cara4[2][3] = color_ladoBlanco_Cara4[3][2];
        color_ladoBlanco_Cara4[3][2] = color_ladoBlanco_Cara4[2][1];
        color_ladoBlanco_Cara4[2][1] = color_ladoBlanco_Cara4[1][2];
        color_ladoBlanco_Cara4[1][2] = color_variableTemporal2;

        activarContadores();
    } // Fin del método rotacionInferiorCara3_MovimientosRD Naranja

    public void movimientoRD1() {
        int temporal1 = ladoRojo_Cara1[3][3];
        int temporal2 = ladoRojo_Cara1[3][2];
        int temporal3 = ladoRojo_Cara1[3][1];

        Color color_temporal1 = color_ladoRojo_Cara1[3][3];
        Color color_temporal2 = color_ladoRojo_Cara1[3][2];
        Color color_temporal3 = color_ladoRojo_Cara1[3][1];

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

        // Colores. Lado Rojo y Verde
        color_ladoRojo_Cara1[3][3] = color_ladoVerde_Cara5[1][3];
        color_ladoRojo_Cara1[3][2] = color_ladoVerde_Cara5[2][3];
        color_ladoRojo_Cara1[3][1] = color_ladoVerde_Cara5[3][3];

        // Colores. Lado Verde y Naranja
        color_ladoVerde_Cara5[3][3] = color_ladoNaranja_Cara3[1][3];
        color_ladoVerde_Cara5[2][3] = color_ladoNaranja_Cara3[1][2];
        color_ladoVerde_Cara5[1][3] = color_ladoNaranja_Cara3[1][1];

        // Colores. Lado Naranja y Azul
        color_ladoNaranja_Cara3[1][1] = color_ladoAzul_Cara6[3][1];
        color_ladoNaranja_Cara3[1][2] = color_ladoAzul_Cara6[2][1];
        color_ladoNaranja_Cara3[1][3] = color_ladoAzul_Cara6[1][1];

        // Colores. Lado Azul y Variable Temporal
        color_ladoAzul_Cara6[3][1] = color_temporal1;
        color_ladoAzul_Cara6[2][1] = color_temporal2;
        color_ladoAzul_Cara6[1][1] = color_temporal3;

        rotacionSuperiorCara1_MovimientosRD();
        activarContadores();
    } // Fin de los movimientos RD1

    public void movimientoRD2() {
        int temporal1 = ladoRojo_Cara1[2][3];
        int temporal2 = ladoRojo_Cara1[2][2];
        int temporal3 = ladoRojo_Cara1[2][1];

        Color color_temporal1 = color_ladoRojo_Cara1[2][3];
        Color color_temporal2 = color_ladoRojo_Cara1[2][2];
        Color color_temporal3 = color_ladoRojo_Cara1[2][1];

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

        // Colores. Lado Rojo y Verde
        color_ladoRojo_Cara1[2][3] = color_ladoVerde_Cara5[1][2];
        color_ladoRojo_Cara1[2][2] = color_ladoVerde_Cara5[2][2];
        color_ladoRojo_Cara1[2][1] = color_ladoVerde_Cara5[3][2];

        // Colores. Lado Verde y Naranja
        color_ladoVerde_Cara5[3][2] = color_ladoNaranja_Cara3[2][3];
        color_ladoVerde_Cara5[2][2] = color_ladoNaranja_Cara3[2][2];
        color_ladoVerde_Cara5[1][2] = color_ladoNaranja_Cara3[2][1];

        // Colores. Lado Naranja y Azul
        color_ladoNaranja_Cara3[2][1] = color_ladoAzul_Cara6[3][2];
        color_ladoNaranja_Cara3[2][2] = color_ladoAzul_Cara6[2][2];
        color_ladoNaranja_Cara3[2][3] = color_ladoAzul_Cara6[1][2];

        // Colores. Lado Azul y Variable Temporal
        color_ladoAzul_Cara6[3][2] = color_temporal1;
        color_ladoAzul_Cara6[2][2] = color_temporal2;
        color_ladoAzul_Cara6[1][2] = color_temporal3;

        activarContadores();
    } // Fin del método Movimiento RD2  

    public void movimientoRD3() {
        int temporal1 = ladoRojo_Cara1[1][3];
        int temporal2 = ladoRojo_Cara1[1][2];
        int temporal3 = ladoRojo_Cara1[1][1];

        Color color_temporal1 = color_ladoRojo_Cara1[1][3];
        Color color_temporal2 = color_ladoRojo_Cara1[1][2];
        Color color_temporal3 = color_ladoRojo_Cara1[1][1];

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

        // Colores. Lado Rojo y Verde
        color_ladoRojo_Cara1[1][3] = color_ladoVerde_Cara5[1][1];
        color_ladoRojo_Cara1[1][2] = color_ladoVerde_Cara5[2][1];
        color_ladoRojo_Cara1[1][1] = color_ladoVerde_Cara5[3][1];

        // Colores. Lado Verde y Naranja
        color_ladoVerde_Cara5[3][1] = color_ladoNaranja_Cara3[3][3];
        color_ladoVerde_Cara5[2][1] = color_ladoNaranja_Cara3[3][2];
        color_ladoVerde_Cara5[1][1] = color_ladoNaranja_Cara3[3][1];

        // Colores. Lado Naranja y Azul
        color_ladoNaranja_Cara3[3][1] = color_ladoAzul_Cara6[3][3];
        color_ladoNaranja_Cara3[3][2] = color_ladoAzul_Cara6[2][3];
        color_ladoNaranja_Cara3[3][3] = color_ladoAzul_Cara6[1][3];

        // Colores. Lado Azul y Variable Temporal
        color_ladoAzul_Cara6[3][3] = color_temporal1;
        color_ladoAzul_Cara6[2][3] = color_temporal2;
        color_ladoAzul_Cara6[1][3] = color_temporal3;

        rotacionInferiorCara3_MovimientosRD();
        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoAmarillo_Cara2[1][1];
        Color color_variableTemporal2 = color_ladoAmarillo_Cara2[2][3];

        // Aristas
        color_ladoAmarillo_Cara2[1][1] = color_ladoAmarillo_Cara2[1][3];
        color_ladoAmarillo_Cara2[1][3] = color_ladoAmarillo_Cara2[3][3];
        color_ladoAmarillo_Cara2[3][3] = color_ladoAmarillo_Cara2[3][1];
        color_ladoAmarillo_Cara2[3][1] = color_variableTemporal;

        // Centros
        color_ladoAmarillo_Cara2[2][3] = color_ladoAmarillo_Cara2[3][2];
        color_ladoAmarillo_Cara2[3][2] = color_ladoAmarillo_Cara2[2][1];
        color_ladoAmarillo_Cara2[2][1] = color_ladoAmarillo_Cara2[1][2];
        color_ladoAmarillo_Cara2[1][2] = color_variableTemporal2;

        activarContadores();
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

        // Colores
        Color color_variableTemporal = color_ladoBlanco_Cara4[1][3];
        Color color_variableTemporal2 = color_ladoBlanco_Cara4[2][1];

        // Aristas
        color_ladoBlanco_Cara4[1][3] = color_ladoBlanco_Cara4[1][1];
        color_ladoBlanco_Cara4[1][1] = color_ladoBlanco_Cara4[3][1];
        color_ladoBlanco_Cara4[3][1] = color_ladoBlanco_Cara4[3][3];
        color_ladoBlanco_Cara4[3][3] = color_variableTemporal;

        // Centros
        color_ladoBlanco_Cara4[2][1] = color_ladoBlanco_Cara4[3][2];
        color_ladoBlanco_Cara4[3][2] = color_ladoBlanco_Cara4[2][3];
        color_ladoBlanco_Cara4[2][3] = color_ladoBlanco_Cara4[1][2];
        color_ladoBlanco_Cara4[1][2] = color_variableTemporal2;

        activarContadores();
    } // Fin del método rotacionInferiorCara3_MovimientosRI Naranja    

    public void movimientoRI1() {
        int temporal1 = ladoRojo_Cara1[3][1];
        int temporal2 = ladoRojo_Cara1[3][2];
        int temporal3 = ladoRojo_Cara1[3][3];

        Color color_temporal1 = color_ladoRojo_Cara1[3][1];
        Color color_temporal2 = color_ladoRojo_Cara1[3][2];
        Color color_temporal3 = color_ladoRojo_Cara1[3][3];

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

        // Colores. Lado Rojo y Azul
        color_ladoRojo_Cara1[3][1] = color_ladoAzul_Cara6[1][1];
        color_ladoRojo_Cara1[3][2] = color_ladoAzul_Cara6[2][1];
        color_ladoRojo_Cara1[3][3] = color_ladoAzul_Cara6[3][1];

        // Colores. Lado Azul y Naranja
        color_ladoAzul_Cara6[1][1] = color_ladoNaranja_Cara3[1][3];
        color_ladoAzul_Cara6[2][1] = color_ladoNaranja_Cara3[1][2];
        color_ladoAzul_Cara6[3][1] = color_ladoNaranja_Cara3[1][1];

        // Colores. Lado Naranja y Verde
        color_ladoNaranja_Cara3[1][3] = color_ladoVerde_Cara5[3][3];
        color_ladoNaranja_Cara3[1][2] = color_ladoVerde_Cara5[2][3];
        color_ladoNaranja_Cara3[1][1] = color_ladoVerde_Cara5[1][3];

        // Colores. Lado Verde y Variable Temporal
        color_ladoVerde_Cara5[3][3] = color_temporal1;
        color_ladoVerde_Cara5[2][3] = color_temporal2;
        color_ladoVerde_Cara5[1][3] = color_temporal3;

        rotacionSuperiorCara1_MovimientosRI();
        activarContadores();
    } // Fin del método MovimientoI1

    public void movimientoRI2() {
        int temporal1 = ladoRojo_Cara1[2][1];
        int temporal2 = ladoRojo_Cara1[2][2];
        int temporal3 = ladoRojo_Cara1[2][3];

        Color color_temporal1 = color_ladoRojo_Cara1[2][1];
        Color color_temporal2 = color_ladoRojo_Cara1[2][2];
        Color color_temporal3 = color_ladoRojo_Cara1[2][3];

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

        // Colores. Lado Rojo y Azul
        color_ladoRojo_Cara1[2][1] = color_ladoAzul_Cara6[1][2];
        color_ladoRojo_Cara1[2][2] = color_ladoAzul_Cara6[2][2];
        color_ladoRojo_Cara1[2][3] = color_ladoAzul_Cara6[3][2];

        // Colores. Lado Azul y Naranja
        color_ladoAzul_Cara6[1][2] = color_ladoNaranja_Cara3[2][3];
        color_ladoAzul_Cara6[2][2] = color_ladoNaranja_Cara3[2][2];
        color_ladoAzul_Cara6[3][2] = color_ladoNaranja_Cara3[2][1];

        // Colores. Lado Naranja y Verde
        color_ladoNaranja_Cara3[2][3] = color_ladoVerde_Cara5[3][2];
        color_ladoNaranja_Cara3[2][2] = color_ladoVerde_Cara5[2][2];
        color_ladoNaranja_Cara3[2][1] = color_ladoVerde_Cara5[1][2];

        // Colores. Lado Verde y Variable Temporal
        color_ladoVerde_Cara5[3][2] = color_temporal1;
        color_ladoVerde_Cara5[2][2] = color_temporal2;
        color_ladoVerde_Cara5[1][2] = color_temporal3;

        activarContadores();
    } // Fin del método MovimientoRI2

    public void movimientoRI3() {
        int temporal1 = ladoRojo_Cara1[1][1];
        int temporal2 = ladoRojo_Cara1[1][2];
        int temporal3 = ladoRojo_Cara1[1][3];

        Color color_temporal1 = color_ladoRojo_Cara1[1][1];
        Color color_temporal2 = color_ladoRojo_Cara1[1][2];
        Color color_temporal3 = color_ladoRojo_Cara1[1][3];

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

        // Colores. Lado Rojo y Azul
        color_ladoRojo_Cara1[1][1] = color_ladoAzul_Cara6[1][3];
        color_ladoRojo_Cara1[1][2] = color_ladoAzul_Cara6[2][3];
        color_ladoRojo_Cara1[1][3] = color_ladoAzul_Cara6[3][3];

        // Colores. Lado Azul y Naranja
        color_ladoAzul_Cara6[1][3] = color_ladoNaranja_Cara3[3][3];
        color_ladoAzul_Cara6[2][3] = color_ladoNaranja_Cara3[3][2];
        color_ladoAzul_Cara6[3][3] = color_ladoNaranja_Cara3[3][1];

        // Colores. Lado Naranja y Verde
        color_ladoNaranja_Cara3[3][3] = color_ladoVerde_Cara5[3][1];
        color_ladoNaranja_Cara3[3][2] = color_ladoVerde_Cara5[2][1];
        color_ladoNaranja_Cara3[3][1] = color_ladoVerde_Cara5[1][1];

        // Colores. Lado Verde y Variable Temporal
        color_ladoVerde_Cara5[3][1] = color_temporal1;
        color_ladoVerde_Cara5[2][1] = color_temporal2;
        color_ladoVerde_Cara5[1][1] = color_temporal3;

        rotacionInferiorCara3_MovimientosRI();
        activarContadores();
    } // Fin del método MovimientoRI3
    // Fin de los movimientos RI        

    public CuboGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Lado5_51 = new javax.swing.JTextField();
        txt_Lado5_54 = new javax.swing.JTextField();
        txt_Lado5_57 = new javax.swing.JTextField();
        txt_Lado5_55 = new javax.swing.JTextField();
        txt_Lado5_58 = new javax.swing.JTextField();
        txt_Lado5_53 = new javax.swing.JTextField();
        txt_Lado5_52 = new javax.swing.JTextField();
        txt_Lado5_56 = new javax.swing.JTextField();
        txt_Lado5_59 = new javax.swing.JTextField();
        txt_Lado2_25 = new javax.swing.JTextField();
        txt_Lado2_28 = new javax.swing.JTextField();
        txt_Lado2_23 = new javax.swing.JTextField();
        txt_Lado2_22 = new javax.swing.JTextField();
        txt_Lado2_26 = new javax.swing.JTextField();
        txt_Lado2_29 = new javax.swing.JTextField();
        txt_Lado2_21 = new javax.swing.JTextField();
        txt_Lado2_24 = new javax.swing.JTextField();
        txt_Lado2_27 = new javax.swing.JTextField();
        txt_Lado1_15 = new javax.swing.JTextField();
        txt_Lado1_18 = new javax.swing.JTextField();
        txt_Lado1_13 = new javax.swing.JTextField();
        txt_Lado1_12 = new javax.swing.JTextField();
        txt_Lado1_16 = new javax.swing.JTextField();
        txt_Lado1_19 = new javax.swing.JTextField();
        txt_Lado1_11 = new javax.swing.JTextField();
        txt_Lado1_14 = new javax.swing.JTextField();
        txt_Lado1_17 = new javax.swing.JTextField();
        txt_Lado6_61 = new javax.swing.JTextField();
        txt_Lado6_64 = new javax.swing.JTextField();
        txt_Lado6_67 = new javax.swing.JTextField();
        txt_Lado6_65 = new javax.swing.JTextField();
        txt_Lado6_68 = new javax.swing.JTextField();
        txt_Lado6_63 = new javax.swing.JTextField();
        txt_Lado6_62 = new javax.swing.JTextField();
        txt_Lado6_66 = new javax.swing.JTextField();
        txt_Lado6_69 = new javax.swing.JTextField();
        txt_Lado3_31 = new javax.swing.JTextField();
        txt_Lado3_34 = new javax.swing.JTextField();
        txt_Lado3_37 = new javax.swing.JTextField();
        txt_Lado3_35 = new javax.swing.JTextField();
        txt_Lado3_38 = new javax.swing.JTextField();
        txt_Lado3_33 = new javax.swing.JTextField();
        txt_Lado3_32 = new javax.swing.JTextField();
        txt_Lado3_36 = new javax.swing.JTextField();
        txt_Lado3_39 = new javax.swing.JTextField();
        txt_Lado4_41 = new javax.swing.JTextField();
        txt_Lado4_44 = new javax.swing.JTextField();
        txt_Lado4_47 = new javax.swing.JTextField();
        txt_Lado4_45 = new javax.swing.JTextField();
        txt_Lado4_48 = new javax.swing.JTextField();
        txt_Lado4_43 = new javax.swing.JTextField();
        txt_Lado4_42 = new javax.swing.JTextField();
        txt_Lado4_46 = new javax.swing.JTextField();
        txt_Lado4_49 = new javax.swing.JTextField();
        btn_Colores = new javax.swing.JButton();
        btn_Etiquetas = new javax.swing.JButton();
        btn_MovimientoA2 = new javax.swing.JButton();
        btn_MovimientoA3 = new javax.swing.JButton();
        btn_MovimientoA1 = new javax.swing.JButton();
        btn_MovimientoD1 = new javax.swing.JButton();
        btn_MovimientoD2 = new javax.swing.JButton();
        btn_MovimientoD3 = new javax.swing.JButton();
        btn_MovimientoI1 = new javax.swing.JButton();
        btn_MovimientoI2 = new javax.swing.JButton();
        btn_MovimientoI3 = new javax.swing.JButton();
        btn_MovimientoB1 = new javax.swing.JButton();
        btn_MovimientoB3 = new javax.swing.JButton();
        btn_MovimientoB2 = new javax.swing.JButton();
        btn_MovimientoRD3 = new javax.swing.JButton();
        btn_MovimientoRI3 = new javax.swing.JButton();
        btn_MovimientoRI2 = new javax.swing.JButton();
        btn_MovimientoRI1 = new javax.swing.JButton();
        btn_MovimientoRD1 = new javax.swing.JButton();
        btn_MovimientoRD2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Lado5_51.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_51, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 252, 48, 43));

        txt_Lado5_54.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_54, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 301, 48, 43));

        txt_Lado5_57.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_57, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 350, 48, 43));

        txt_Lado5_55.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_55, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 301, 48, 43));

        txt_Lado5_58.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_58, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 350, 48, 43));

        txt_Lado5_53.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_53, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 252, 48, 43));

        txt_Lado5_52.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_52, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 252, 48, 43));

        txt_Lado5_56.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_56, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 301, 48, 43));

        txt_Lado5_59.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado5_59, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 350, 48, 43));

        txt_Lado2_25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_25, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 301, 48, 43));

        txt_Lado2_28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_28, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 350, 48, 43));

        txt_Lado2_23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 252, 48, 43));

        txt_Lado2_22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 252, 48, 43));

        txt_Lado2_26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_26, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 301, 48, 43));

        txt_Lado2_29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_29, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 350, 48, 43));

        txt_Lado2_21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 252, 48, 43));

        txt_Lado2_24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_24, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 301, 48, 43));

        txt_Lado2_27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado2_27, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 350, 48, 43));

        txt_Lado1_15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 154, 48, 43));

        txt_Lado1_18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_18, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 203, 48, 43));

        txt_Lado1_13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 105, 48, 43));

        txt_Lado1_12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 105, 48, 43));

        txt_Lado1_16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_16, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 154, 48, 43));

        txt_Lado1_19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_19, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 203, 48, 43));

        txt_Lado1_11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 105, 48, 43));

        txt_Lado1_14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 154, 48, 43));

        txt_Lado1_17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado1_17, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 203, 48, 43));

        txt_Lado6_61.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_61, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 252, 48, 43));

        txt_Lado6_64.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_64, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 301, 48, 43));

        txt_Lado6_67.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_67, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 350, 48, 43));

        txt_Lado6_65.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_65, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 301, 48, 43));

        txt_Lado6_68.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_68, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 350, 48, 43));

        txt_Lado6_63.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_63, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 252, 48, 43));

        txt_Lado6_62.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_62, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 252, 48, 43));

        txt_Lado6_66.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_66, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 301, 48, 43));

        txt_Lado6_69.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado6_69, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 350, 48, 43));

        txt_Lado3_31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 399, 48, 43));

        txt_Lado3_34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_34, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 448, 48, 43));

        txt_Lado3_37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_37, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 497, 48, 43));

        txt_Lado3_35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_35, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 448, 48, 43));

        txt_Lado3_38.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_38, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 497, 48, 43));

        txt_Lado3_33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 399, 48, 43));

        txt_Lado3_32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 399, 48, 43));

        txt_Lado3_36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_36, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 448, 48, 43));

        txt_Lado3_39.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado3_39, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 497, 48, 43));

        txt_Lado4_41.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_41, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 546, 48, 43));

        txt_Lado4_44.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_44, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 595, 48, 43));

        txt_Lado4_47.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_47, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 644, 48, 43));

        txt_Lado4_45.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_45, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 595, 48, 43));

        txt_Lado4_48.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_48, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 644, 48, 43));

        txt_Lado4_43.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_43, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 546, 48, 43));

        txt_Lado4_42.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_42, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 546, 48, 43));

        txt_Lado4_46.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_46, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 595, 48, 43));

        txt_Lado4_49.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txt_Lado4_49, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 644, 48, 43));

        btn_Colores.setText("Colores");
        btn_Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ColoresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Colores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 82, -1));

        btn_Etiquetas.setText("Etiquetas");
        btn_Etiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EtiquetasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Etiquetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        btn_MovimientoA2.setText("A2");
        btn_MovimientoA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoA2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 50, 38));

        btn_MovimientoA3.setText("A3");
        btn_MovimientoA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoA3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 50, 38));

        btn_MovimientoA1.setText("A1");
        btn_MovimientoA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoA1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 50, 38));

        btn_MovimientoD1.setText("D1");
        btn_MovimientoD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoD1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 50, 40));

        btn_MovimientoD2.setText("D2");
        btn_MovimientoD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoD2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 50, 40));

        btn_MovimientoD3.setText("D3");
        btn_MovimientoD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoD3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 50, 40));

        btn_MovimientoI1.setText("I1");
        btn_MovimientoI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoI1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 50, 40));

        btn_MovimientoI2.setText("I2");
        btn_MovimientoI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoI2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 50, 40));

        btn_MovimientoI3.setText("I3");
        btn_MovimientoI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoI3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 50, 40));

        btn_MovimientoB1.setText("B1");
        btn_MovimientoB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoB1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 50, 40));

        btn_MovimientoB3.setText("B3");
        btn_MovimientoB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoB3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 700, 50, 40));

        btn_MovimientoB2.setText("B2");
        btn_MovimientoB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoB2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 50, 40));

        btn_MovimientoRD3.setText("RD3");
        btn_MovimientoRD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoRD3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoRD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 60, 40));

        btn_MovimientoRI3.setText("RI3");
        btn_MovimientoRI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoRI3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoRI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 60, 40));

        btn_MovimientoRI2.setText("RI2");
        btn_MovimientoRI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoRI2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoRI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 60, 40));

        btn_MovimientoRI1.setText("RI1");
        btn_MovimientoRI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoRI1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoRI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 60, 40));

        btn_MovimientoRD1.setText("RD1");
        btn_MovimientoRD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoRD1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoRD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 60, 40));

        btn_MovimientoRD2.setText("RD2");
        btn_MovimientoRD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MovimientoRD2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MovimientoRD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EtiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EtiquetasActionPerformed
        etiquetas();
    }//GEN-LAST:event_btn_EtiquetasActionPerformed

    private void btn_ColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ColoresActionPerformed
        colores();
    }//GEN-LAST:event_btn_ColoresActionPerformed

    private void btn_MovimientoA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoA2ActionPerformed
        movimientoA2();
    }//GEN-LAST:event_btn_MovimientoA2ActionPerformed

    private void btn_MovimientoA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoA3ActionPerformed
        movimientoA3();
    }//GEN-LAST:event_btn_MovimientoA3ActionPerformed

    private void btn_MovimientoA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoA1ActionPerformed
        movimientoA1();
    }//GEN-LAST:event_btn_MovimientoA1ActionPerformed

    private void btn_MovimientoB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoB3ActionPerformed
        movimientoB3();
    }//GEN-LAST:event_btn_MovimientoB3ActionPerformed

    private void btn_MovimientoD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoD1ActionPerformed
        movimientoD1();
    }//GEN-LAST:event_btn_MovimientoD1ActionPerformed

    private void btn_MovimientoD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoD2ActionPerformed
        movimientoD2();
    }//GEN-LAST:event_btn_MovimientoD2ActionPerformed

    private void btn_MovimientoD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoD3ActionPerformed
        movimientoD3();
    }//GEN-LAST:event_btn_MovimientoD3ActionPerformed

    private void btn_MovimientoB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoB2ActionPerformed
        movimientoB2();
    }//GEN-LAST:event_btn_MovimientoB2ActionPerformed

    private void btn_MovimientoB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoB1ActionPerformed
        movimientoB1();
    }//GEN-LAST:event_btn_MovimientoB1ActionPerformed

    private void btn_MovimientoI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoI3ActionPerformed
        movimientoI3();
    }//GEN-LAST:event_btn_MovimientoI3ActionPerformed

    private void btn_MovimientoI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoI2ActionPerformed
        movimientoI2();
    }//GEN-LAST:event_btn_MovimientoI2ActionPerformed

    private void btn_MovimientoI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoI1ActionPerformed
        movimientoI1();
    }//GEN-LAST:event_btn_MovimientoI1ActionPerformed

    private void btn_MovimientoRI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoRI3ActionPerformed
        movimientoRI3();
    }//GEN-LAST:event_btn_MovimientoRI3ActionPerformed

    private void btn_MovimientoRI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoRI2ActionPerformed
        movimientoRI2();
    }//GEN-LAST:event_btn_MovimientoRI2ActionPerformed

    private void btn_MovimientoRI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoRI1ActionPerformed
        movimientoRI1();
    }//GEN-LAST:event_btn_MovimientoRI1ActionPerformed

    private void btn_MovimientoRD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoRD1ActionPerformed
        movimientoRD1();
    }//GEN-LAST:event_btn_MovimientoRD1ActionPerformed

    private void btn_MovimientoRD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoRD2ActionPerformed
        movimientoRD2();
    }//GEN-LAST:event_btn_MovimientoRD2ActionPerformed

    private void btn_MovimientoRD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MovimientoRD3ActionPerformed
        movimientoRD3();
    }//GEN-LAST:event_btn_MovimientoRD3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuboGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Colores;
    private javax.swing.JButton btn_Etiquetas;
    private javax.swing.JButton btn_MovimientoA1;
    private javax.swing.JButton btn_MovimientoA2;
    private javax.swing.JButton btn_MovimientoA3;
    private javax.swing.JButton btn_MovimientoB1;
    private javax.swing.JButton btn_MovimientoB2;
    private javax.swing.JButton btn_MovimientoB3;
    private javax.swing.JButton btn_MovimientoD1;
    private javax.swing.JButton btn_MovimientoD2;
    private javax.swing.JButton btn_MovimientoD3;
    private javax.swing.JButton btn_MovimientoI1;
    private javax.swing.JButton btn_MovimientoI2;
    private javax.swing.JButton btn_MovimientoI3;
    private javax.swing.JButton btn_MovimientoRD1;
    private javax.swing.JButton btn_MovimientoRD2;
    private javax.swing.JButton btn_MovimientoRD3;
    private javax.swing.JButton btn_MovimientoRI1;
    private javax.swing.JButton btn_MovimientoRI2;
    private javax.swing.JButton btn_MovimientoRI3;
    private javax.swing.JTextField txt_Lado1_11;
    private javax.swing.JTextField txt_Lado1_12;
    private javax.swing.JTextField txt_Lado1_13;
    private javax.swing.JTextField txt_Lado1_14;
    private javax.swing.JTextField txt_Lado1_15;
    private javax.swing.JTextField txt_Lado1_16;
    private javax.swing.JTextField txt_Lado1_17;
    private javax.swing.JTextField txt_Lado1_18;
    private javax.swing.JTextField txt_Lado1_19;
    private javax.swing.JTextField txt_Lado2_21;
    private javax.swing.JTextField txt_Lado2_22;
    private javax.swing.JTextField txt_Lado2_23;
    private javax.swing.JTextField txt_Lado2_24;
    private javax.swing.JTextField txt_Lado2_25;
    private javax.swing.JTextField txt_Lado2_26;
    private javax.swing.JTextField txt_Lado2_27;
    private javax.swing.JTextField txt_Lado2_28;
    private javax.swing.JTextField txt_Lado2_29;
    private javax.swing.JTextField txt_Lado3_31;
    private javax.swing.JTextField txt_Lado3_32;
    private javax.swing.JTextField txt_Lado3_33;
    private javax.swing.JTextField txt_Lado3_34;
    private javax.swing.JTextField txt_Lado3_35;
    private javax.swing.JTextField txt_Lado3_36;
    private javax.swing.JTextField txt_Lado3_37;
    private javax.swing.JTextField txt_Lado3_38;
    private javax.swing.JTextField txt_Lado3_39;
    private javax.swing.JTextField txt_Lado4_41;
    private javax.swing.JTextField txt_Lado4_42;
    private javax.swing.JTextField txt_Lado4_43;
    private javax.swing.JTextField txt_Lado4_44;
    private javax.swing.JTextField txt_Lado4_45;
    private javax.swing.JTextField txt_Lado4_46;
    private javax.swing.JTextField txt_Lado4_47;
    private javax.swing.JTextField txt_Lado4_48;
    private javax.swing.JTextField txt_Lado4_49;
    private javax.swing.JTextField txt_Lado5_51;
    private javax.swing.JTextField txt_Lado5_52;
    private javax.swing.JTextField txt_Lado5_53;
    private javax.swing.JTextField txt_Lado5_54;
    private javax.swing.JTextField txt_Lado5_55;
    private javax.swing.JTextField txt_Lado5_56;
    private javax.swing.JTextField txt_Lado5_57;
    private javax.swing.JTextField txt_Lado5_58;
    private javax.swing.JTextField txt_Lado5_59;
    private javax.swing.JTextField txt_Lado6_61;
    private javax.swing.JTextField txt_Lado6_62;
    private javax.swing.JTextField txt_Lado6_63;
    private javax.swing.JTextField txt_Lado6_64;
    private javax.swing.JTextField txt_Lado6_65;
    private javax.swing.JTextField txt_Lado6_66;
    private javax.swing.JTextField txt_Lado6_67;
    private javax.swing.JTextField txt_Lado6_68;
    private javax.swing.JTextField txt_Lado6_69;
    // End of variables declaration//GEN-END:variables
}
