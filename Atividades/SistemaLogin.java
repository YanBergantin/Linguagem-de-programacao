import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void executar() {
        String s = JOptionPane.showInputDialog(null, "Digite a senha:");
        if (s == null)
            return;

        try {
            int senha = Integer.parseInt(s);
            int senhaCorreta = 1234;

            if (senha == senhaCorreta) {
                JOptionPane.showMessageDialog(null, "Acesso permitido", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Acesso negado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Senha inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}