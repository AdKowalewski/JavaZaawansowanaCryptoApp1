package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public void startGui() {
        JFrame mainFrame = new JFrame("Crypto app");
        mainFrame.setMinimumSize(new Dimension(400, 200));
        mainFrame.setLocation(300, 300);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.add(addMainPanel());
        mainFrame.setVisible(true);
    }

    private Component addMainPanel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constr = new GridBagConstraints();
        //TODO get this value from properties
        JLabel titleLabel = new JLabel("Crypto");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setForeground(Color.RED);
        constr.fill = GridBagConstraints.HORIZONTAL;
        constr.gridx = 0;
        constr.gridy = 0;
        layout.addLayoutComponent(titleLabel, constr);
        return panel;
    }
}
