import javax.swing.JOptionPane;

public class TrintaECincoCamelos {
    public static void executar() {
        try {
            int camelos = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de camelos da herança:"));
            int d1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o denominador da primeira parcela:"));
            int d2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o denominador da segunda parcela:"));
            int d3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o denominador da terceira parcela:"));

            int totalCamelos = camelos + 1;
            int q1 = totalCamelos / d1;
            int q2 = totalCamelos / d2;
            int q3 = totalCamelos / d3;
            int sobra = totalCamelos - q1 - q2 - q3;

            String msg = "========== DIVISÃO DOS CAMELOS ==========\n" +
                    "Primeiro irmão: " + q1 + " camelos\n" +
                    "Segundo irmão: " + q2 + " camelos\n" +
                    "Terceiro irmão: " + q3 + " camelos\n" +
                    "-----------------------------------------\n" +
                    "Camelo que sobrou para devolver: " + sobra;

            JOptionPane.showMessageDialog(null, msg, "Resultado Camelos", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}