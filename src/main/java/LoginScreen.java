import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginScreen() {
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel usernamePanel = new JPanel();
        JLabel usernameLabel = new JLabel("Usuário:");
        usernameField = new JTextField(20);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        JPanel passwordPanel = new JPanel();
        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField(20);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        buttonPanel.add(loginButton);

        mainPanel.add(usernamePanel);
        mainPanel.add(passwordPanel);
        mainPanel.add(buttonPanel);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Verificar o usuário e a senha
        if (username.equals("admin") && password.equals("admin")) {
            Pessoal[] listaPessoal = new Pessoal[4];
            listaPessoal[0] = new Administrativo("João", "123456789", 37, 7.5);
            listaPessoal[1] = new Informatico("Maria", "987654321", 40, 6);
            listaPessoal[2] = new Professor("Carlos", "456789123", 37, 8, 2);
            listaPessoal[3] = new Investigador("Ana", "789123456", 35, 7);

            Universidade.imprimirNominas(listaPessoal);

            int orcamentoTotal = Universidade.obterOrcamentoTotal(listaPessoal);
            JOptionPane.showMessageDialog(this, " Orcamento total da universidade: " + orcamentoTotal / 100.0);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario ou senha incorreto:", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Limpar os campos de texto
        usernameField.setText("");
        passwordField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginScreen loginScreen = new LoginScreen();
                loginScreen.setVisible(true);
            }
        });
    }
}


