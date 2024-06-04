public class Determinante {
    public static void main(String[] args) {
    }

    public static double[][] imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        return matriz;
    }

    public static double determinanteMatriz2x2(double[][] matriz2x2) {
        return (matriz2x2[0][0] * matriz2x2[1][1]) - (matriz2x2[0][1] * matriz2x2[1][0]);
    }

    public static double[][] adicaoMatriz2x2(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    public static double[][] subtracaoMatriz2x2(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    public static double[][] multiplicacaoMatriz2x2(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[2][2];
        matrizResultado[0][0] = matriz1[0][0] * matriz2[0][0] + matriz1[0][1] * matriz2[1][0];
        matrizResultado[0][1] = matriz1[0][0] * matriz2[0][1] + matriz1[0][1] * matriz2[1][1];
        matrizResultado[1][0] = matriz1[1][0] * matriz2[0][0] + matriz1[1][1] * matriz2[1][0];
        matrizResultado[1][1] = matriz1[1][0] * matriz2[0][1] + matriz1[1][1] * matriz2[1][1];
        return matrizResultado;
    }

    public static double determinanteMatriz3x3(double[][] matriz3x3) {
        double a = matriz3x3[0][0] * ((matriz3x3[1][1] * matriz3x3[2][2]) - (matriz3x3[1][2] * matriz3x3[2][1]));
        double b = matriz3x3[0][1] * ((matriz3x3[1][0] * matriz3x3[2][2]) - (matriz3x3[1][2] * matriz3x3[2][0]));
        double c = matriz3x3[0][2] * ((matriz3x3[1][0] * matriz3x3[2][1]) - (matriz3x3[1][1] * matriz3x3[2][0]));
        return a - b + c;
    }

    public static double[][] adicaoMatriz3x3(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    public static double[][] subtracaoMatriz3x3(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    public static double[][] multiplicacaoMatriz3x3(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return matrizResultado;
    }

    public static double determinanteMatriz4x4(double[][] matriz) {
        double determinante = 0;
        for (int j = 0; j < 4; j++) {
            determinante += matriz[0][j] * cofator(matriz, 0, j);
        }
        return determinante;
    }

    public static double cofator(double[][] matriz, int linha, int coluna) {
        double[][] menor = new double[3][3];
        int m = 0, n;
        for (int i = 0; i < 4; i++) {
            if (i != linha) {
                n = 0;
                for (int j = 0; j < 4; j++) {
                    if (j != coluna) {
                        menor[m][n] = matriz[i][j];
                        n++;
                    }
                }
                m++;
            }
        }
        return ((linha + coluna) % 2 == 0 ? 1 : -1) * determinanteMatriz3x32(menor);
    }

    public static double determinanteMatriz3x32(double[][] matriz) {
        double determinante = 0;
        for (int j = 0; j < 3; j++) {
            determinante += matriz[0][j] * cofator3x3(matriz, 0, j);
        }
        return determinante;
    }

    public static double cofator3x3(double[][] matriz, int linha, int coluna) {
        double[][] menor = new double[2][2];
        int m = 0, n;
        for (int i = 0; i < 3; i++) {
            if (i != linha) {
                n = 0;
                for (int j = 0; j < 3; j++) {
                    if (j != coluna) {
                        menor[m][n] = matriz[i][j];
                        n++;
                    }
                }
                m++;
            }
        }
        return ((linha + coluna) % 2 == 0 ? 1 : -1) * (menor[0][0] * menor[1][1] - menor[0][1] * menor[1][0]);
    }

    public static double[][] adicaoMatriz4x4(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    public static double[][] subtracaoMatriz4x4(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    public static double[][] multiplicacaoMatriz4x4(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return matrizResultado;
    }
}
