
package DeportesVarios;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class VentanaDeportes extends JFrame{
  private JRadioButton rdbttn;
  private JRadioButton rdbttn1;
  private JRadioButton rdbttn2; 
  private JRadioButton rdbttn3;
  private Panel panel;
  private JLabel etiqueta,imagen;
  public VentanaDeportes(){
      setSize(600,400);
      //setLayout(null);
      setFont(new Font("cooper black",1,18));
      //setLocalitionRelativeto(null);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("DeportesFavoritos");
      
      iniciarPanel();
  }
    private void iniciarPanel(){
        panel = new Panel();
        panel.setLayout(null);
        this.add(panel);
      
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        iniciarRadioButton();
        iniciarEtiqueta();
        //colocarImagenVoleyPlaya();
        
    }
    private void iniciarEtiqueta(){
        etiqueta = new JLabel("Elija un deporte favorito");
        etiqueta.setBounds(10, 10, 200,30);
        etiqueta.setFont(new Font("arial",1,18));
        panel.add(etiqueta);
    }
    private void iniciarRadioButton(){
        rdbttn = new JRadioButton("Futbol");
        rdbttn.setFont(new Font("arial",1,16));
        rdbttn.setBounds(20, 50, 140, 20);
        panel.add(rdbttn);
        
        rdbttn1 = new JRadioButton("Baloncesto");
        rdbttn1.setFont(new Font("arial",1,16));
        rdbttn1.setBounds(20, 110, 140, 20);
        panel.add(rdbttn1);
        
        rdbttn2 = new JRadioButton("Ciclismo");
        rdbttn2.setFont(new Font("arial",1,16));
        rdbttn2.setBounds(20, 170, 140, 20);
        panel.add(rdbttn2);
        
        rdbttn3 = new JRadioButton("Voleibol Playa");
        rdbttn3.setFont(new Font("arial",1,16));
        rdbttn3.setBounds(20, 220, 140, 20);
        panel.add(rdbttn3);
        
        ButtonGroup grupo = new ButtonGroup();
        
        grupo.add(rdbttn);
        grupo.add(rdbttn1);
        grupo.add(rdbttn2);
        grupo.add(rdbttn3);
        
        oyentesAccion();
    }
    
//private void colocarImagenFutbol(){
//    ImageIcon imagen = new ImageIcon("Futbol.jpg");
//    JLabel eq = new JLabel();
//    eq.setBounds(200, 30, 350, 300);
//    eq.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(eq.getWidth(), eq.getHeight(),Image.SCALE_SMOOTH)));
//    panel.add(eq);
//}
//private void colocarImagenBaloncesto(){
//    ImageIcon imagen = new ImageIcon("Baloncesto.jpg");
//    JLabel eq = new JLabel();
//    eq.setBounds(200, 30, 350, 300);
//    eq.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(eq.getWidth(), eq.getHeight(),Image.SCALE_SMOOTH)));
//    panel.add(eq);
//}
//private void colocarImagenCiclismo(){
//    ImageIcon imagen = new ImageIcon("Ciclismo.jpg");
//    JLabel eq = new JLabel();
//    eq.setBounds(200, 30, 350, 300);
//    eq.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(eq.getWidth(), eq.getHeight(),Image.SCALE_SMOOTH)));
//    panel.add(eq);
//}
//private void colocarImagenVoleyPlaya(){
//    ImageIcon imagen = new ImageIcon("VoleyPlaya.jpg");
//    JLabel eq = new JLabel();
//    eq.setBounds(200, 30, 350, 300);
//    eq.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(eq.getWidth(), eq.getHeight(),Image.SCALE_SMOOTH)));
//    panel.add(eq);
//}
private void oyentesAccion(){
    imagen = new JLabel();
    imagen.setBounds(200, 30, 350, 300);
    //imagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(eq.getWidth(), eq.getHeight(),Image.SCALE_SMOOTH)));
    panel.add(imagen);
    
    final ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/Futbol.jpg"));
    final ImageIcon imagenBaloncesto = new ImageIcon(getClass().getResource("/Imagenes/Baloncesto.jpg"));
    final ImageIcon imagenCiclismo = new ImageIcon(getClass().getResource("/Imagenes/Ciclismo.jpg"));
    final ImageIcon imagenVoley = new ImageIcon(getClass().getResource("/Imagenes/VoleyPlaya.jpg"));
    
    ActionListener oyente = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e) {
             imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
        }
    };
    ActionListener oyente1 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e) {
             imagen.setIcon(new ImageIcon(imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
        }
    };
    ActionListener oyente2 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e) {
             imagen.setIcon(new ImageIcon(imagenCiclismo.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
        }
    };
    ActionListener oyente3 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent e) {
             imagen.setIcon(new ImageIcon(imagenVoley.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
        }
    };
    rdbttn.addActionListener(oyente);
    rdbttn1.addActionListener(oyente1);
    rdbttn2.addActionListener(oyente2);
    rdbttn3.addActionListener(oyente3);
}   
    
}
