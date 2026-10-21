import javax.swing.JOptionPane;

public class VerificacaoMultiplo {
    public static void executar() {
        try {
            String s1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
            if (s1 == null)
                return;
            int primeiro = Integer.parseInt(s1);

            String s2 = JOptionPane.showInputDialog(null, "Digite o segundo número:");
            if (s2 == null)
                return;
            int segundo = Integer.parseInt(s2);

            String resultado;
            if (segundo != 0 && primeiro % segundo == 0) {
                resultado = "O primeiro número é múltiplo do segundo.";
            } else {
                resultado = "O primeiro número não é múltiplo do segundo.";
            }

            JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido digitado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}