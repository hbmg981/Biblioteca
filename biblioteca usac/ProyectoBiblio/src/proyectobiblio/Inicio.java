package proyectobiblio;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Inicio extends JFrame {
    public Image imgfondo;
    public URL fondo;
    JLabel  titnoti, noti, vacia, label, imgnoti;
    JPanel VentanaInicio;
    JButton acercade, entrar, salir;
    
public Inicio(){
    
        super("Pagina Principal");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        String noticias = "<html><body>La Universidad de San Carlos de Guatemala<br> Llevo a cabo la 120ava. huelga de todos <br>los dolores. Dicha huelga  se llevo a cabo<br> el dia 24 de marzo de 2018. En la 6ta avenida de la zona 1 capitalina. <br></body></html>" ;
        
        fondo=this.getClass().getResource("/proyectobiblio/biblio.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        VentanaInicio = new JPanel();
        vacia = new JLabel("    Bienvenido al Sistema Bibliotecario ");
        vacia.setBorder(border);
        vacia.setOpaque(true);
        vacia.setBackground(Color.black);
        vacia.setForeground(Color.WHITE);
        vacia.setFont(new java.awt.Font("Arabella", Font.BOLD, 22));
        vacia.setHorizontalTextPosition(JLabel.CENTER);
        vacia.setVerticalTextPosition(JLabel.CENTER);
        vacia.setHorizontalAlignment(JLabel.CENTER);vacia.setBounds(50,75,450,60);
        label=new JLabel();
        label.setOpaque(false);
        label.setBounds(50,140,250,250);
        ImageIcon logou=new ImageIcon(getClass().getResource("/proyectobiblio/logo.gif"));
        ImageIcon imlogo= new ImageIcon(logou.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon huelg=new ImageIcon(getClass().getResource("/proyectobiblio/inges.jpg"));
        ImageIcon huelga= new ImageIcon(huelg.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(imlogo); 
        salir = new JButton("Salir"); 
        salir.setBackground(Color.black); 
        salir.setForeground(Color.white); salir.setBounds(450,430,100,50);
        salir.addActionListener((ActionEvent ae) -> {
            System.exit(0);
            dispose();
        });
        acercade= new JButton("About");
        acercade.setBackground(Color.black); acercade.setForeground(Color.white);acercade.setBounds(50,430,100,50);
        imgnoti= new JLabel(); imgnoti.setBounds(350,285,250,105);
        imgnoti.setIcon(huelga);
        ImageIcon usuari= new ImageIcon(getClass().getResource("/proyectobiblio/login.png"));
        ImageIcon usuario = new ImageIcon(usuari.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));
        entrar = new JButton("Login");
        entrar.setBackground(Color.black); entrar.setForeground(Color.white);
        entrar.setIcon(usuario); entrar.setBounds(500,75,100,60);
        entrar.addActionListener((ActionEvent ae) -> {
            login in = new login();
            in.setVisible(true);
            dispose();
        });
       titnoti= new JLabel("Noticias ");
       titnoti.setBorder(border);
       titnoti.setHorizontalAlignment(JLabel.CENTER);
       noti= new JLabel(noticias);
       noti.setBorder(border);
       noti.setHorizontalAlignment(JLabel.CENTER);noti.setOpaque(true);
       noti.setBackground(Color.white);noti.setBounds(350,185,250,100);
       titnoti.setOpaque(true); titnoti.setBackground(Color.black);
       titnoti.setForeground(Color.white);titnoti.setBounds(350,140,250,50);
      
        this.add(label);       
        this.add(vacia); 
        this.add(acercade); 
        this.add(entrar); 
        this.add(titnoti);  
        this.add(noti); 
        this.add(imgnoti);
        this.add(salir); 
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(700,550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
}
public JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
}
//        login in = new login();
//        in.setVisible(true);