import javax.swing.*;
import java.awt.*;

public class DeterminanteGUI {
    private JFrame frame;
    private JComboBox<String> matrixSizeComboBox;
    private JComboBox<String> operationComboBox;
    private JPanel inputPanel;
    private JTextField[][] matrixFields;
    private JTextField[][] matrixFields2;
    private JButton calculateButton;
    private JTextArea resultArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DeterminanteGUI().createAndShowGUI());
    }

    private void createAndShowGUI() {
        frame = new JFrame("Calculadora de Matrizes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        matrixSizeComboBox = new JComboBox<>(new String[]{"2x2", "3x3", "4x4"});
        matrixSizeComboBox.addActionListener(e -> updateMatrixInputFields());

        operationComboBox = new JComboBox<>(new String[]{"Determinante", "Adição", "Subtração", "Multiplicação"});
        operationComboBox.addActionListener(e -> updateMatrixInputFields());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Tamanho da Matriz:"));
        topPanel.add(matrixSizeComboBox);
        topPanel.add(new JLabel("Operação:"));
        topPanel.add(operationComboBox);

        inputPanel = new JPanel();
        updateMatrixInputFields();

        calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(e -> performOperation());

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(calculateButton, BorderLayout.SOUTH);
        frame.add(new JScrollPane(resultArea), BorderLayout.EAST);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void updateMatrixInputFields() {
        inputPanel.removeAll();
        String size = (String) matrixSizeComboBox.getSelectedItem();
        int n = switch (size) {
            case "2x2" -> 2;
            case "3x3" -> 3;
            case "4x4" -> 4;
            default -> throw new IllegalArgumentException("Tamanho inválido");
        };
        inputPanel.setLayout(new GridLayout(n, n));
        matrixFields = new JTextField[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixFields[i][j] = new JTextField(5);
                inputPanel.add(matrixFields[i][j]);
            }
        }

        if (operationComboBox.getSelectedItem().equals("Adição") || operationComboBox.getSelectedItem().equals("Subtração") || operationComboBox.getSelectedItem().equals("Multiplicação")) {
            inputPanel.setLayout(new GridLayout(n * 2, n));
            matrixFields2 = new JTextField[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrixFields2[i][j] = new JTextField(5);
                    inputPanel.add(matrixFields2[i][j]);
                }
            }
        } else {
            matrixFields2 = null;
        }

        frame.pack();
    }

    private void performOperation() {
        String size = (String) matrixSizeComboBox.getSelectedItem();
        int n = switch (size) {
            case "2x2" -> 2;
            case "3x3" -> 3;
            case "4x4" -> 4;
            default -> throw new IllegalArgumentException("Tamanho inválido");
        };

        double[][] matrix1 = new double[n][n];
        double[][] matrix2 = new double[n][n];

        try {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = Double.parseDouble(matrixFields[i][j].getText());
                    if (matrixFields2 != null) {
                        matrix2[i][j] = Double.parseDouble(matrixFields2[i][j].getText());
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String operation = (String) operationComboBox.getSelectedItem();
        switch (operation) {
            case "Determinante" -> {
                double result = switch (n) {
                    case 2 -> DeterminanteTerminal.determinanteMatriz2x2(matrix1);
                    case 3 -> DeterminanteTerminal.determinanteMatriz3x3(matrix1);
                    case 4 -> DeterminanteTerminal.determinanteMatriz4x4(matrix1);
                    default -> throw new IllegalArgumentException("Tamanho inválido");
                };
                resultArea.setText("Determinante: " + result);
            }
            case "Adição" -> {
                double[][] result = switch (n) {
                    case 2 -> Determinante.adicaoMatriz2x2(matrix1, matrix2);
                    case 3 -> Determinante.adicaoMatriz3x3(matrix1, matrix2);
                    case 4 -> Determinante.adicaoMatriz4x4(matrix1, matrix2);
                    default -> throw new IllegalArgumentException("Tamanho inválido");
                };
                resultArea.setText("Adição:\n" + matrizToString(result));
            }
            case "Subtração" -> {
                double[][] result = switch (n) {
                    case 2 -> Determinante.subtracaoMatriz2x2(matrix1, matrix2);
                    case 3 -> Determinante.subtracaoMatriz3x3(matrix1, matrix2);
                    case 4 -> Determinante.subtracaoMatriz4x4(matrix1, matrix2);
                    default -> throw new IllegalArgumentException("Tamanho inválido");
                };
                resultArea.setText("Subtração:\n" + matrizToString(result));
            }
            case "Multiplicação" -> {
                double[][] result = switch (n) {
                    case 2 -> Determinante.multiplicacaoMatriz2x2(matrix1, matrix2);
                    case 3 -> Determinante.multiplicacaoMatriz3x3(matrix1, matrix2);
                    case 4 -> Determinante.multiplicacaoMatriz4x4(matrix1, matrix2);
                    default -> throw new IllegalArgumentException("Tamanho inválido");
                };
                resultArea.setText("Multiplicação:\n" + matrizToString(result));
            }
        }
    }

    private String matrizToString(double[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matriz) {
            for (double val : row) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
