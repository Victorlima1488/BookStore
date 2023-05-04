package Books;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        super("Login Form");

        // Crie os componentes
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        // Defina o layout do formulário
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(usernameLabel, constraints);
        constraints.gridx = 1;
        panel.add(usernameField, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        panel.add(passwordLabel, constraints);
        constraints.gridx = 1;
        panel.add(passwordField, constraints);
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, constraints);

        // Adicione um ouvinte de eventos para o botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Invalid username or password.");
                }
            }
        });

        // Adicione o painel ao formulário
        setContentPane(panel);

        // Configure o formulário
        pack();
        setLocationRelativeTo(null);
    }
}
