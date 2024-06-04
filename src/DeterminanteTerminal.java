import java.util.Scanner;

public class DeterminanteTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        System.out.println("==============================");
        System.out.println("1. 2x2");
        System.out.println("2. 3x3");
        System.out.println("3. 4x4");
        System.out.println("==============================");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("==============================");
                System.out.println("1. Calcular a Determinante");
                System.out.println("2. Fazer Adição");
                System.out.println("3. Fazer Subtração");
                System.out.println("4. Fazer Multiplicação");
                System.out.println("5. Sair");
                System.out.println("==============================");
                System.out.printf("Escolha uma função:");
                int opcao2x2 = scanner.nextInt();

                switch (opcao2x2) {
                    case 1 -> {
                        double[][] matriz2x2 = new double[2][2];
                        System.out.println("Digite os elementos da matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x2[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Determinante: " + determinanteMatriz2x2(matriz2x2));
                    }

                    case 2 -> {
                        double[][] matriz2x2 = new double[2][2];
                        System.out.println("Digite os elementos da primeira matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x2[i][j] = scanner.nextDouble();
                            }
                        }

                        double[][] matriz2x22 = new double[2][2];
                        System.out.println("Digite os elementos da segunda matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x22[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Adição: ");
                        adicaoMatriz2x2(matriz2x2, matriz2x22);
                    }

                    case 3 -> {
                        double[][] matriz2x2 = new double[2][2];
                        System.out.println("Digite os elementos da matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x2[i][j] = scanner.nextDouble();
                            }
                        }

                        double[][] matriz2x22 = new double[2][2];
                        System.out.println("Digite os elementos da segunda matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x22[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Subtração: " );
                        subtracaoMatriz2x2(matriz2x2, matriz2x2);
                    }

                    case 4 -> {
                        double[][] matriz2x2 = new double[2][2];
                        System.out.println("Digite os elementos da matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x2[i][j] = scanner.nextDouble();
                            }
                        }
                        double[][] matriz2x22 = new double[2][2];
                        System.out.println("Digite os elementos da segunda matriz 2x2:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.printf("Digite um número: ");
                                matriz2x22[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Multiplicação: ");
                        multiplicacaoMatriz2x2(matriz2x2, matriz2x22);;
                    }

                    case 5 -> {
                        System.out.println("Saindo...");
                    }
                    default -> System.out.println("Opção inválida.");

                }
            }
            case 2 -> {
                System.out.println("==============================");
                System.out.println("1. Calcular a Determinante");
                System.out.println("2. Fazer Adição");
                System.out.println("3. Fazer Subtração");
                System.out.println("4. Fazer Multiplicação");
                System.out.println("5. Sair");
                System.out.println("==============================");
                System.out.printf("Escolha uma função:");
                int opcao3x3 = scanner.nextInt();

                switch (opcao3x3) {
                    case 1 -> {
                        double[][] matriz3x3 = new double[3][3];
                        System.out.println("Digite os elementos da matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x3[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Determinante: " + determinanteMatriz3x3(matriz3x3));
                    }

                    case 2 -> {
                        double[][] matriz3x3 = new double[3][3];
                        System.out.println("Digite os elementos da matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x3[i][j] = scanner.nextDouble();
                            }
                        }

                        double[][] matriz3x32 = new double[3][3];
                        System.out.println("Digite os elementos da segunda matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x32[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Adição: ");
                        adicaoMatriz3x3(matriz3x3, matriz3x32);
                    }
                    case 3 -> {
                        double[][] matriz3x3 = new double[3][3];
                        System.out.println("Digite os elementos da matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x3[i][j] = scanner.nextDouble();
                            }
                        }
                        double[][] matriz3x32 = new double[3][3];
                        System.out.println("Digite os elementos da segunda matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x32[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Subtração: ");
                        subtracaoMatriz3x3(matriz3x3, matriz3x32);
                    }

                    case 4 -> {
                        double[][] matriz3x3 = new double[3][3];
                        System.out.println("Digite os elementos da matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x3[i][j] = scanner.nextDouble();
                            }
                        }
                        double[][] matriz3x32 = new double[3][3];
                        System.out.println("Digite os elementos da segunda matriz 3x3:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.printf("Digite um número: ");
                                matriz3x32[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Multiplicação: ");
                        multiplicacaoMatriz3x3(matriz3x3, matriz3x32);
                    }

                    case 5 -> {
                        System.out.println("Saindo...");
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
            case 3 -> {
                System.out.println("==============================");
                System.out.println("1. Calcular a Determinante");
                System.out.println("2. Fazer Adição");
                System.out.println("3. Fazer Subtração");
                System.out.println("4. Fazer Multiplicação");
                System.out.println("5. Sair");
                System.out.println("==============================");
                System.out.printf("Escolha uma função:");
                int opcao4x4 = scanner.nextInt();

                switch (opcao4x4) {
                    case 1 -> {
                        double[][] matriz4x4 = new double[4][4];
                        System.out.println("Digite os elementos da matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x4[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Determinante: " + determinanteMatriz4x4(matriz4x4));
                    }

                    case 2 -> {
                        double[][] matriz4x4 = new double[4][4];
                        System.out.println("Digite os elementos da matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x4[i][j] = scanner.nextDouble();
                            }
                        }
                        double[][] matriz4x42 = new double[4][4];
                        System.out.println("Digite os elementos da segunda matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x42[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Adição: ");
                        adicaoMatriz4x4(matriz4x4, matriz4x42);
                    }

                    case 3 -> {
                        double[][] matriz4x4 = new double[4][4];
                        System.out.println("Digite os elementos da matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x4[i][j] = scanner.nextDouble();
                            }
                        }
                        double[][] matriz4x42 = new double[4][4];
                        System.out.println("Digite os elementos da segunda matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x42[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Subtração: ");
                        subtracaoMatriz4x4(matriz4x4, matriz4x42);
                    }

                    case 4 -> {
                        double[][] matriz4x4 = new double[4][4];
                        System.out.println("Digite os elementos da matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x4[i][j] = scanner.nextDouble();
                            }
                        }
                        double[][] matriz4x42 = new double[4][4];
                        System.out.println("Digite os elementos da segunda matriz 4x4:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("Digite um número: ");
                                matriz4x42[i][j] = scanner.nextDouble();
                            }
                        }
                        System.out.println("Multiplicação: ");
                        multiplicacaoMatriz4x4(matriz4x4, matriz4x42);
                    }

                    case 5 -> {
                        System.out.println("Saindo...");
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
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

    public static void adicaoMatriz2x2(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        imprimirMatriz(matrizResultado);
    }

    public static void subtracaoMatriz2x2(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        imprimirMatriz(matrizResultado);
    }

    public static void multiplicacaoMatriz2x2(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[2][2];

        matrizResultado[0][0] = matriz1[0][0] * matriz2[0][0] + matriz1[0][1] * matriz2[1][0];
        matrizResultado[0][1] = matriz1[0][0] * matriz2[0][1] + matriz1[0][1] * matriz2[1][1];
        matrizResultado[1][0] = matriz1[1][0] * matriz2[0][0] + matriz1[1][1] * matriz2[1][0];
        matrizResultado[1][1] = matriz1[1][0] * matriz2[0][1] + matriz1[1][1] * matriz2[1][1];

        imprimirMatriz(matrizResultado);
    }

    public static double determinanteMatriz3x3(double[][] matriz3x3) {
        double a = matriz3x3[0][0] * ((matriz3x3[1][1] * matriz3x3[2][2]) - (matriz3x3[1][2] * matriz3x3[2][1]));
        double b = matriz3x3[0][1] * ((matriz3x3[1][0] * matriz3x3[2][2]) - (matriz3x3[1][2] * matriz3x3[2][0]));
        double c = matriz3x3[0][2] * ((matriz3x3[1][0] * matriz3x3[2][1]) - (matriz3x3[1][1] * matriz3x3[2][0]));
        return a - b + c;
    }

    public static void adicaoMatriz3x3(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        imprimirMatriz(matrizResultado);
    }

    public static void subtracaoMatriz3x3(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        imprimirMatriz(matrizResultado);
    }

    public static void multiplicacaoMatriz3x3(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        imprimirMatriz(matrizResultado);
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


    public static void adicaoMatriz4x4(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        imprimirMatriz(matrizResultado);
    }

    public static void subtracaoMatriz4x4(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        imprimirMatriz(matrizResultado);
    }

    public static void multiplicacaoMatriz4x4(double[][] matriz1, double[][] matriz2) {
        double[][] matrizResultado = new double[3][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        imprimirMatriz(matrizResultado);
    }

}




