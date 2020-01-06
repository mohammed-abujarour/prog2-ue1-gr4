
/**
 * @author Mohammed AbuJarour (mohammed.abujarour@htw-berlin.de)
 *
 */
import javax.swing.*;
import java.awt.*;

class GrundgeruestSwing extends JFrame {

    public GrundgeruestSwing() {
        super(); // Konstruktor von JFrame
        setTitle("Titel Swing-Fenster"); // Titel des Fensters
        getContentPane().setBackground(Color.WHITE); // Hintergrundfarbe
//        getContentPane().add(new JLabel("Prog 2"));
        JPanel hauptPanel = init(); // eigene Methode init()
        this.getContentPane().add(hauptPanel);// Hauptpanel dem Fenster hinzufügen

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Klick auf x
    }

    private JPanel init() {
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Hallo 2020!"); // Label erzeugen
        JButton button1 = new JButton("Klick mich"); // Button erzeugen
        JButton button2 = new JButton("Ende"); // Button erzeugen

        panel.add(label1); // Label ans Panel
        panel.add(button1); // Button ans Panel
        panel.add(button2);
        return panel;
    }

}

public class GUIStarter {
    public static void main(String args[]) {
        GrundgeruestSwing hauptfenster = new GrundgeruestSwing();
        hauptfenster.setSize(400, 300); // wie groß?
        hauptfenster.setLocation(200, 300); // wo ?
        hauptfenster.setVisible(true); // sichtbar
    }
}