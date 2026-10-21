import javax.swing.JOptionPane;

public class CalculadoraViagem {
    public static void executar() {
        try {
            double distancia = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite a distância da viagem em km:"));
            double precoCombustivel = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do combustível por litro (R$):"));

            double consumo = 12;
            double litros = distancia / consumo;
            double custo = litros * precoCombustivel;
            double desconto = (distancia > 500) ? custo * 0.05 : 0;
            double valorFinal = custo - desconto;

            String msg = String.format("Distância: %.2f km\n", distancia) +
                    String.format("Combustível necessário: %.2f L\n", litros) +
                    String.format("Custo da viagem: R$ %.2f\n", custo) +
                    String.format("Desconto: R$ %.2f\n", desconto) +
                    String.format("VALOR FINAL: R$ %.2f", valorFinal);

            JOptionPane.showMessageDialog(null, msg, "Calculadora de Viagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}