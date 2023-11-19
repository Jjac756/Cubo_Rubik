package rubik;

import java.awt.Color;

public class CuboGUI extends javax.swing.JFrame {

    public static int ladoRojo_Cara1[][] = { {0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19} };
    public static int ladoAmarillo_Cara2[][] = { {0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29} };
    public static int ladoNaranja_Cara3[][] = { {0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39} };
    public static int ladoBlanco_Cara4[][] = { {0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49} };
    public static int ladoVerde_Cara5[][] = { {0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59} };
    public static int ladoAzul_Cara6[][] = { {0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69} };
    public static int contador_clicks = 0;
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
        txt_Lado1_11.setBackground(Color.white);
        txt_Lado1_12.setBackground(Color.white);
        txt_Lado1_13.setBackground(Color.white);
        txt_Lado1_14.setBackground(Color.white);
        txt_Lado1_15.setBackground(Color.white);
        txt_Lado1_16.setBackground(Color.white);
        txt_Lado1_17.setBackground(Color.white);
        txt_Lado1_18.setBackground(Color.white);
        txt_Lado1_19.setBackground(Color.white);
    } // Fin de coloresOFF Cara1 Lado Rojo

    void coloresOFF_Cara2_LadoAmarillo() {
        // Lado 2, Cara Amarilla
        txt_Lado2_21.setBackground(Color.white);
        txt_Lado2_22.setBackground(Color.white);
        txt_Lado2_23.setBackground(Color.white);
        txt_Lado2_24.setBackground(Color.white);
        txt_Lado2_25.setBackground(Color.white);
        txt_Lado2_26.setBackground(Color.white);
        txt_Lado2_27.setBackground(Color.white);
        txt_Lado2_28.setBackground(Color.white);
        txt_Lado2_29.setBackground(Color.white);
    } // Fin de coloresOFF Cara2 Lado Amarillo
    
    void coloresOFF_Cara3_LadoNaranja() {
        // Lado 3, Cara Naranja
        txt_Lado3_31.setBackground(Color.white);
        txt_Lado3_32.setBackground(Color.white);
        txt_Lado3_33.setBackground(Color.white);
        txt_Lado3_34.setBackground(Color.white);
        txt_Lado3_35.setBackground(Color.white);
        txt_Lado3_36.setBackground(Color.white);
        txt_Lado3_37.setBackground(Color.white);
        txt_Lado3_38.setBackground(Color.white);
        txt_Lado3_39.setBackground(Color.white);
    } // Fin de coloresOFF Cara3 Lado Naranja

    void coloresOFF_Cara4_LadoBlanco() {
        // Lado 4, Cara Blanca
        txt_Lado4_41.setBackground(Color.white);
        txt_Lado4_42.setBackground(Color.white);
        txt_Lado4_43.setBackground(Color.white);
        txt_Lado4_44.setBackground(Color.white);
        txt_Lado4_45.setBackground(Color.white);
        txt_Lado4_46.setBackground(Color.white);
        txt_Lado4_47.setBackground(Color.white);
        txt_Lado4_48.setBackground(Color.white);
        txt_Lado4_49.setBackground(Color.white);
    } // Fin de coloresOFF Cara4 Lado Blanco

    void coloresOFF_Cara5_LadoVerde() {
        // Lado 5, Cara Verde
        txt_Lado5_51.setBackground(Color.white);
        txt_Lado5_52.setBackground(Color.white);
        txt_Lado5_53.setBackground(Color.white);
        txt_Lado5_54.setBackground(Color.white);
        txt_Lado5_55.setBackground(Color.white);
        txt_Lado5_56.setBackground(Color.white);
        txt_Lado5_57.setBackground(Color.white);
        txt_Lado5_58.setBackground(Color.white);
        txt_Lado5_59.setBackground(Color.white);
    } // Fin de coloresOFF Cara5 Lado Verde

    void coloresOFF_Cara6_LadoAzul() {
        // Lado 6, Cara Azul
        txt_Lado6_61.setBackground(Color.white);
        txt_Lado6_62.setBackground(Color.white);
        txt_Lado6_63.setBackground(Color.white);
        txt_Lado6_64.setBackground(Color.white);
        txt_Lado6_65.setBackground(Color.white);
        txt_Lado6_66.setBackground(Color.white);
        txt_Lado6_67.setBackground(Color.white);
        txt_Lado6_68.setBackground(Color.white);
        txt_Lado6_69.setBackground(Color.white);
    } // Fin de coloresOFF Cara6 Lado Azul
    
    // Fin de coloresOFF     

    //Inicio de Colores ON
    
    void coloresON_Cara1_LadoRojo() {
        // Lado 1, Cara Roja
        txt_Lado1_11.setBackground(Color.red);
        txt_Lado1_12.setBackground(Color.red);
        txt_Lado1_13.setBackground(Color.red);
        txt_Lado1_14.setBackground(Color.red);
        txt_Lado1_15.setBackground(Color.red);
        txt_Lado1_16.setBackground(Color.red);
        txt_Lado1_17.setBackground(Color.red);
        txt_Lado1_18.setBackground(Color.red);
        txt_Lado1_19.setBackground(Color.red);
    } // Fin de ColoresON Cara1 Lado Rojo

    void coloresON_Cara2_LadoAmarillo() {
        // Lado 2, Cara Amarilla
        txt_Lado2_21.setBackground(Color.yellow);
        txt_Lado2_22.setBackground(Color.yellow);
        txt_Lado2_23.setBackground(Color.yellow);
        txt_Lado2_24.setBackground(Color.yellow);
        txt_Lado2_25.setBackground(Color.yellow);
        txt_Lado2_26.setBackground(Color.yellow);
        txt_Lado2_27.setBackground(Color.yellow);
        txt_Lado2_28.setBackground(Color.yellow);
        txt_Lado2_29.setBackground(Color.yellow);
    } // Fin de ColoresON Cara2 Lado Amarillo
    
    void coloresON_Cara3_LadoNaranja() {
        // Lado 3, Cara Naranja
        txt_Lado3_31.setBackground(Color.orange);
        txt_Lado3_32.setBackground(Color.orange);
        txt_Lado3_33.setBackground(Color.orange);
        txt_Lado3_34.setBackground(Color.orange);
        txt_Lado3_35.setBackground(Color.orange);
        txt_Lado3_36.setBackground(Color.orange);
        txt_Lado3_37.setBackground(Color.orange);
        txt_Lado3_38.setBackground(Color.orange);
        txt_Lado3_39.setBackground(Color.orange);
    } // Fin de ColoresON Cara3 Lado Naranja

    void coloresON_Cara4_LadoBlanco() {
        // Lado 4, Cara Blanca
        txt_Lado4_41.setBackground(Color.white);
        txt_Lado4_42.setBackground(Color.white);
        txt_Lado4_43.setBackground(Color.white);
        txt_Lado4_44.setBackground(Color.white);
        txt_Lado4_45.setBackground(Color.white);
        txt_Lado4_46.setBackground(Color.white);
        txt_Lado4_47.setBackground(Color.white);
        txt_Lado4_48.setBackground(Color.white);
        txt_Lado4_49.setBackground(Color.white);
    } // Fin de ColoresON Cara4 Lado Blanco

    void coloresON_Cara5_LadoVerde() {
        // Lado 5, Cara Verde
        txt_Lado5_51.setBackground(Color.green);
        txt_Lado5_52.setBackground(Color.green);
        txt_Lado5_53.setBackground(Color.green);
        txt_Lado5_54.setBackground(Color.green);
        txt_Lado5_55.setBackground(Color.green);
        txt_Lado5_56.setBackground(Color.green);
        txt_Lado5_57.setBackground(Color.green);
        txt_Lado5_58.setBackground(Color.green);
        txt_Lado5_59.setBackground(Color.green);
    } // Fin de ColoresON Cara5 Lado Verde

    void coloresON_Cara6_LadoAzul() {
        // Lado 6, Cara Azul
        txt_Lado6_61.setBackground(Color.blue);
        txt_Lado6_62.setBackground(Color.blue);
        txt_Lado6_63.setBackground(Color.blue);
        txt_Lado6_64.setBackground(Color.blue);
        txt_Lado6_65.setBackground(Color.blue);
        txt_Lado6_66.setBackground(Color.blue);
        txt_Lado6_67.setBackground(Color.blue);
        txt_Lado6_68.setBackground(Color.blue);
        txt_Lado6_69.setBackground(Color.blue);   
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
        contador_clicks = contador_clicks + 1;
        
        if (contador_clicks > 1) {
            contador_clicks = 0;
        } else if (contador_clicks == 1) {
            etiquetasON();
        } else {
            etiquetasOFF();
        }
    } // Fin del método etiquetas
    
    void colores() {
        contador_clicks_colores = contador_clicks_colores + 1;
        
        if (contador_clicks_colores > 1) {
            contador_clicks_colores = 0;
        } else if (contador_clicks_colores == 1) {
            coloresON();
        } else {
            coloresOFF();
        }
    } // Fin del método colores
    
    // Inicio de movimientos
        public static void movimientoA3() {

        for (int i = 1; i <= 3; i++) {
            int temporal = ladoRojo_Cara1[i][3];

            ladoRojo_Cara1[i][3] = ladoAmarillo_Cara2[i][3];
            ladoAmarillo_Cara2[i][3] = ladoNaranja_Cara3[i][3];
            ladoNaranja_Cara3[i][3] = ladoBlanco_Cara4[i][3];
            ladoBlanco_Cara4[i][3] = temporal;
        } // Fin del for

    } // Fin del método A3
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Lado5_51.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_54.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_57.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_55.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_58.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_53.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_52.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_56.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado5_59.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado2_27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado1_17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_61.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_64.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_67.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_65.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_68.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_63.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_62.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_66.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado6_69.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_38.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_32.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado3_39.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_41.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_44.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_47.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_45.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_48.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_43.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_42.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_46.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        txt_Lado4_49.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btn_Colores.setText("Colores");
        btn_Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ColoresActionPerformed(evt);
            }
        });

        btn_Etiquetas.setText("Etiquetas");
        btn_Etiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EtiquetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado3_34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado3_35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado3_36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado3_37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado3_38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado3_39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado4_41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado4_42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado4_43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado4_44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado4_45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado4_46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado4_47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado4_48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado4_49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado1_14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado1_15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_Lado1_17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado1_18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Lado1_19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado5_51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado5_52, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado5_53, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado5_54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado5_55, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado5_56, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado5_57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado5_58, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado5_59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado2_24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado2_25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado2_26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado2_27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado2_28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado2_29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado6_61, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado6_62, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado6_63, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado6_64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado6_65, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado6_66, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Lado6_67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado6_68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Lado6_69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Etiquetas)
                            .addComponent(btn_Colores))))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lado6_61, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado6_63, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado6_62, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lado6_64, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado6_65, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado6_66, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lado6_67, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado6_68, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado6_69, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lado1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Colores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_Lado1_14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Lado1_15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Lado1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Etiquetas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Lado1_17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado1_18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Lado1_19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Lado2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Lado2_24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado2_25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado2_26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Lado2_27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado2_28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado2_29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Lado5_51, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado5_53, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado5_52, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Lado5_54, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado5_55, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado5_56, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Lado5_57, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado5_58, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lado5_59, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Lado3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Lado3_34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado3_35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado3_36, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Lado3_37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado3_38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado3_39, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Lado4_41, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado4_43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado4_42, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Lado4_44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado4_45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado4_46, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Lado4_47, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado4_48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Lado4_49, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EtiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EtiquetasActionPerformed
        etiquetas();
    }//GEN-LAST:event_btn_EtiquetasActionPerformed

    private void btn_ColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ColoresActionPerformed
        colores();
    }//GEN-LAST:event_btn_ColoresActionPerformed

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