import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import javax.swing.JOptionPane;

public class Map {
    public int spaces = 0;
    private JPanel Panel;
    private JButton SHOWMAPButton;

    //JOptionPane.showMessageDialog("All that you hear are cowbells...", "...");
    //JOptionPane.showMessageDialog(null, "You are " + spaces + "stops from the next checkpoint.", "Map", JOptionPane.INFORMATION_MESSAGE);


    public Map() {
        SHOWMAPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You are " + spaces + " stops from the next checkpoint.", "Map", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("MP2");
        myFrame.setContentPane(new Map().Panel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
        myFrame.setVisible(true);
    }
}