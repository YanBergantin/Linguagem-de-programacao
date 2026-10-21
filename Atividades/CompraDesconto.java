import javax.swing.JOptionPane;

public class CompraDesconto {
    public static void executar() {
        try {
            String item1 = "Arroz 5 kg";
            String item2 = "Feijão 1 kg";
            String item3 = "Óleo de soja 900 ml";
            String item4 = "Açúcar 1 kg";
            String item5 = "Café 250 g";
            String item6 = "Macarrão 500 g";
            String item7 = "Farinha de mandioca 1 kg";
            String item8 = "Fubá de milho 500 g";
            String item9 = "Molho de tomate 300 g";
            String item10 = "Sal refinado 1 kg";

            int qtd1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item1 + ":"));
            int qtd2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item2 + ":"));
            int qtd3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item3 + ":"));
            int qtd4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item4 + ":"));
            int qtd5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item5 + ":"));
            int qtd6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item6 + ":"));
            int qtd7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item7 + ":"));
            int qtd8 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item8 + ":"));
            int qtd9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item9 + ":"));
            int qtd10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de " + item10 + ":"));

            double parcial1 = qtd1 * 25.00;
            double parcial2 = qtd2 * 8.00;
            double parcial3 = qtd3 * 7.50;
            double parcial4 = qtd4 * 5.00;
            double parcial5 = qtd5 * 12.00;
            double parcial6 = qtd6 * 4.50;
            double parcial7 = qtd7 * 9.00;
            double parcial8 = qtd8 * 4.00;
            double parcial9 = qtd9 * 3.50;
            double parcial10 = qtd10 * 3.00;

            double total = parcial1 + parcial2 + parcial3 + parcial4 + parcial5
                    + parcial6 + parcial7 + parcial8 + parcial9 + parcial10;

            double desconto = (total > 100) ? total * 0.10 : 0;
            double valorFinal = total - desconto;

            String msg = "=== SUPERMERCADO ===\n" +
                    String.format("TOTAL DA COMPRA: R$ %.2f\n", total) +
                    String.format("DESCONTO (10%%): R$ %.2f\n", desconto) +
                    String.format("VALOR FINAL: R$ %.2f", valorFinal);

            JOptionPane.showMessageDialog(null, msg, "Nota Fiscal", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro nos valores informados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}