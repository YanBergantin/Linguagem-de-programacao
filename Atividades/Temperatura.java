import javax.swing.JOptionPane;

public class Temperatura {
    public static void executar() {
        try {
            int frio = 0;
            int agradavel = 0;

            for (int mes = 1; mes <= 12; mes++) {
                String s = JOptionPane.showInputDialog(null, "Digite a temperatura média do mês " + mes + ":");
                if (s == null)
                    return;
                double temperatura = Double.parseDouble(s);

                if (temperatura < 18) {
                    frio++;
                } else {
                    agradavel++;
                }
            }

            String msg = "Quantidade de meses frios: " + frio + "\n" +
                    "Quantidade de meses agradáveis: " + agradavel + "\n\n";

            if (agradavel > frio) {
                msg += "Em geral, a temperatura é agradável.";
            } else if (frio > agradavel) {
                msg += "Em geral, faz frio.";
            } else {
                msg += "Em geral, as temperaturas são equilibradas.";
            }

            JOptionPane.showMessageDialog(null, msg, "Resultado Clima", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}