import javax.swing.JOptionPane;

public class AluguelCarro {
    public static void executar() {
        try {
            int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de dias de aluguel:"));
            double quilometragem = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite a quilometragem percorrida:"));

            double diaria = 100.00;
            double limiteKm = 200.00;
            double valorKmExcedente = 1.50;

            double valorDiarias = dias * diaria;
            double limiteTotalKm = dias * limiteKm;

            double kmExcedente = 0;
            double valorKm = 0;

            if (quilometragem > limiteTotalKm) {
                kmExcedente = quilometragem - limiteTotalKm;
                valorKm = kmExcedente * valorKmExcedente;
            }

            double valorFinal = valorDiarias + valorKm;

            String msg = String.format("Quantidade de dias: %d\n", dias) +
                    String.format("Valor das diárias: R$ %.2f\n", valorDiarias) +
                    String.format("Km excedente: %.2f km\n", kmExcedente) +
                    String.format("Valor dos Km excedentes: R$ %.2f\n", valorKm) +
                    String.format("VALOR FINAL: R$ %.2f", valorFinal);

            JOptionPane.showMessageDialog(null, msg, "Aluguel de Carro", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}