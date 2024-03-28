package form.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class UserRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField campoName;
    private JTextField campoEmail;
    private JTextField campoCpf;
    private JTextField campoDateOfBirth;
    private JTextField campoAddress;
    private JTextField campoPhone;
    private JButton salvarButton;

    public UserRegistration() {
        super("Cadastro de Usuário");

        // Configurações da janela
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação do painel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        // Adicionando componentes ao painel
        panel.add(new JLabel("Nome:"));
        campoName = new JTextField(20);
        panel.add(campoName);

        panel.add(new JLabel("E-mail:"));
        campoEmail = new JTextField(20);
        panel.add(campoEmail);

        panel.add(new JLabel("CPF:"));
        campoCpf = new JTextField(20);
        panel.add(campoCpf);

        panel.add(new JLabel("Data de Nascimento:"));
        campoDateOfBirth = new JTextField(20);
        panel.add(campoDateOfBirth);

        panel.add(new JLabel("Endereço:"));
        campoAddress = new JTextField(20);
        panel.add(campoAddress);

        panel.add(new JLabel("Telefone:"));
        campoPhone = new JTextField(20);
        panel.add(campoPhone);

        salvarButton = new JButton("Cadastrar Usuário");
        panel.add(new JLabel()); // Espaço em branco
        panel.add(salvarButton);

        // Adicionando o painel à janela
        add(panel);

        // Define a janela como visível
        setVisible(true);
    }

    // Métodos para acessar os valores dos campos
    public String getName() {
        return campoName.getText();
    }

    public String getEmail() {
        return campoEmail.getText();
    }

    public String getCpf() {
        return campoCpf.getText();
    }

    // Corrigir o tipo de retorno para LocalDate
    public LocalDate getDateOfBirth() {
        // Converter a String para LocalDate, se necessário
        // Exemplo: return LocalDate.parse(campoDateOfBirth.getText());
        return null; // Retornar um valor válido
    }

    public String getAddress() {
        return campoAddress.getText();
    }

    public String getPhone() {
        return campoPhone.getText();
    }

    // Método para adicionar um ouvinte ao botão salvar
    public void addSaveButtonListener(ActionListener listener) {
        salvarButton.addActionListener(listener);
    }

    // Método para exibir mensagens de erro
    public void displayErrorMessage(String errorMessage) {
        // Exibir a mensagem de erro, por exemplo, em uma caixa de diálogo
        // JOptionPane.showMessageDialog(this, errorMessage);
        System.err.println(errorMessage); // Apenas imprime a mensagem no console por enquanto
        
        
    }
}


