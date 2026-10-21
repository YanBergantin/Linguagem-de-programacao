import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args) {
        int opcao = -1;

        do {
            String menuStr = "========================================\n" +
                    "          MENU DE EXERCÍCIOS            \n" +
                    "========================================\n" +
                    "1 - Verificação de Múltiplo\n" +
                    "2 - Sistema de Login Simplificado\n" +
                    "3 - Compra com desconto\n" +
                    "4 - Temperatura\n" +
                    "5 - Os trinta e cinco camelos\n" +
                    "6 - Calculadora de viagem\n" +
                    "7 - Aluguel de carro\n" +
                    "0 - Sair\n" +
                    "========================================\n" +
                    "Qual você deseja executar?";

            String input = JOptionPane.showInputDialog(null, menuStr, "Menu de Exercícios Java",
                    JOptionPane.QUESTION_MESSAGE);

            // Se o usuário clicar em "Cancelar" ou fechar a janela
            if (input == null) {
                break;
            }

            try {
                opcao = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opcao) {
                case 1:
                    VerificacaoMultiplo.executar();
                    break;
                case 2:
                    SistemaLogin.executar();
                    break;
                case 3:
                    CompraDesconto.executar();
                    break;
                case 4:
                    Temperatura.executar();
                    break;
                case 5:
                    TrintaECincoCamelos.executar();
                    break;
                case 6:
                    CalculadoraViagem.executar();
                    break;
                case 7:
                    AluguelCarro.executar();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o aplicativo. Até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha um número entre 0 e 7.", "Aviso",
                            JOptionPane.WARNING_MESSAGE);
            }

        } while (opcao != 0);
    }
}