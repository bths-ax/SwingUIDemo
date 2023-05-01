import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JTextField textField;
    private JButton sendButton;
    private JTextArea textArea;
    private JButton otherButton;

    public MainGUIWindow() {
        createUIComponents();
    }

    public void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        sendButton.addActionListener(this);
        otherButton.addActionListener(this);
        textField.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if (button.getText() == "Send") {
            textArea.append("sendButton pressed!\n");
        } else {
            textArea.append("otherButton pressed!\n");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        textArea.append("key pressed!\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textArea.append("key released!\n");
    }
}
