package ventana;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ventana extends JFrame {

    public JPanel panel;
    public JRadioButton rboton;
    public JRadioButton rboton1;
    public JRadioButton rboton2;
    public ButtonGroup grupobtn;
    public JLabel etiqueta1;
    public JLabel etiqueta2;
    public JLabel etiqueta3;

    public ventana() {

        setSize(800, 600);
        setTitle("Etiqueta de selecion");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel();
    }

    private void panel() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        radiobutton();
        EventoImage();
        etiqueta();

        panel.add(rboton);
        panel.add(rboton1);
        panel.add(rboton2);
        panel.add(etiqueta1);

    }

    private void radiobutton() {

        rboton = new JRadioButton("empanada");
        rboton.setBounds(30, 50, 130, 50);
        rboton.setForeground(Color.BLACK);
        // rboton.setBackground(Color.BLUE);

        rboton1 = new JRadioButton("limonada de coco");
        rboton1.setBounds(30, 110, 130, 50);
        rboton1.setForeground(Color.BLACK);
        // rboton1.setBackground(Color.BLUE);

        rboton2 = new JRadioButton("lulada");
        rboton2.setBounds(30, 170, 130, 50);
        rboton2.setForeground(Color.BLACK);
        // rboton2.setBackground(Color.BLUE);

        grupobtn = new ButtonGroup();

        grupobtn.add(rboton);
        grupobtn.add(rboton1);
        grupobtn.add(rboton2);
    }

    private void etiqueta() {

        etiqueta1 = new JLabel();
    }

    private void EventoImage() {

        ActionListener icono = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == rboton) {
                    ImageIcon img = new ImageIcon("empanadas.jpg");
                    etiqueta1.setBounds(170, 30, 290, 325);
                    etiqueta1.setIcon(new ImageIcon(img.getImage().getScaledInstance(290, 325, Image.SCALE_SMOOTH)));

                } else if (e.getSource() == rboton1) {
                    ImageIcon img = new ImageIcon("Limonada-Coco.jpg");
                    etiqueta1.setBounds(170, 30, 290, 325);
                    etiqueta1.setIcon(new ImageIcon(img.getImage().getScaledInstance(290, 325, Image.SCALE_SMOOTH)));

                } else if (e.getSource() == rboton2) {
                    ImageIcon img = new ImageIcon("lulada.jpg");
                    etiqueta1.setBounds(170, 30, 290, 325);
                    etiqueta1.setIcon(new ImageIcon(img.getImage().getScaledInstance(290, 325, Image.SCALE_SMOOTH)));

                }

            }

        };
        rboton.addActionListener(icono);
        rboton1.addActionListener(icono);
        rboton2.addActionListener(icono);

    }
}
