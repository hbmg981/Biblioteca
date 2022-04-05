
package proyectobiblio;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
public class MiBiblio  {
    /// Biblioteca de Usuario
    public Image imgfondo;
    public URL fondo;
    JFrame MiBiblioteca;
    JButton Buscar, Mibibl, Logout;
    JLabel logo, usuario, bienve, tit, aut;
    JTextField titulo,autor;
    /// Mi Biblioteca
     public Image imgfondo1;
    public URL fondo1;
    JFrame Mbib;
    JButton Buscar1, Mibibl1, Logout1;
    JLabel logo1, usuario1, bienve1, tit1, aut1;
    JTable Biblioteca;
    JTextField titulo1,autor1;
    JComboBox orden ;
    
    public MiBiblio(){
       
        MiBiblioteca = new JFrame();
        MiBiblioteca.setTitle(" Biblioteca -- Usuario Normal");
        MiBiblioteca.setSize(800, 650);
        MiBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MiBiblioteca.setLocationRelativeTo(null);
        MiBiblioteca.getContentPane().add(panel);   
        fondo=this.getClass().getResource("/proyectobiblio/bibl.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        bienve= new JLabel("Bienvenido a la Biblioteca"); bienve.setBounds(230,160,400,50);
        bienve.setFont(new java.awt.Font("Tahoma", 1, 18));
        tit= new JLabel("Titulo"); tit.setBounds(160,200,100,40);
        aut= new JLabel("Autor"); aut.setBounds(440,200,100,40);
        Buscar= new JButton("Buscar"); Buscar.setBounds(40,200,100,40 );
        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String busc = Buscar.getText();
                
            };
            });
        titulo=new JTextField(); titulo.setBounds(250,200,150,40);
        autor=new JTextField(); autor.setBounds(500,200,150,40);
        Mibibl=new JButton("Mi Biblioteca"); Mibibl.setBounds(500,100,150,60);
        Mibibl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Mbib.setVisible(true);
               MiBiblioteca.setVisible(false);
            };
            });
        Logout=new JButton("Salir"); Logout.setBounds(550,40,100,40);
        Logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Inicio inicio = new Inicio ();
               inicio.setVisible(true);
               MiBiblioteca.setVisible(false);
            };
            });
        logo = new JLabel(); logo.setBounds(30,10,150,150);
        ImageIcon log = new ImageIcon(getClass().getResource("/proyectobiblio/logo.gif"));
        ImageIcon log1 = new ImageIcon(log.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(log1);
        usuario = new JLabel(); usuario.setBounds(250,10,250,150);
        ImageIcon usu = new ImageIcon(getClass().getResource("/proyectobiblio/user.png"));
        ImageIcon usu1 = new ImageIcon(usu.getImage().getScaledInstance(usuario.getWidth(), usuario.getHeight(), Image.SCALE_DEFAULT));
        usuario.setIcon(usu1);
        MiBiblioteca.add(bienve);
        MiBiblioteca.add(Logout);
        MiBiblioteca.add(tit);
        MiBiblioteca.add(aut);
        MiBiblioteca.add(Buscar);
        MiBiblioteca.add(titulo);
        MiBiblioteca.add(autor);
        MiBiblioteca.add(Mibibl);
        MiBiblioteca.add(logo);
        MiBiblioteca.add(usuario);
        MiBiblioteca.add(panel);
        MiBiblioteca.setVisible(true);
        
        
        ///// Mi Biblioteca
        //// Pagina
        ////********************************************/
        Mbib=new JFrame();
        Mbib.setTitle("Mi Biblioteca");
        Mbib.setSize(800, 650);
        Mbib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mbib.setLocationRelativeTo(null);
        Mbib.getContentPane().add(panel1);   
        fondo1=this.getClass().getResource("/proyectobiblio/bib.jpg");
        imgfondo1= new ImageIcon(fondo1).getImage();
        bienve1= new JLabel("Bienvenido a Mi Biblioteca"); bienve1.setBounds(30,170,680,40);
        bienve1.setFont(new java.awt.Font("Tahoma", 1, 18)); bienve1.setOpaque(true); bienve1.setHorizontalAlignment(JLabel.CENTER);
        tit1= new JLabel("Palabras Clave"); tit1.setBounds(440,120,105,40); tit1.setOpaque(true); tit1.setHorizontalAlignment(JLabel.CENTER);
        aut1=new JLabel("Ordenar"); aut1.setBounds(30,60,100,40); aut1.setOpaque(true); aut1.setHorizontalAlignment(JLabel.CENTER);
        Buscar1= new JButton("Buscar"); Buscar1.setBounds(500,40,100,40 );
        Buscar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String busc = Buscar1.getText();
                
            };
            });
        titulo1=new JTextField(); titulo1.setBounds(560,120,150,40);
       // autor1=new JTextField(); autor1.setBounds(500,200,150,40);
        //Mibibl=new JButton("Mi Biblioteca"); Mibibl.setBounds(500,100,150,60);
        String[] ordenar = {"Libro"," Revista"," Tesis", "Autor"};
        orden = new JComboBox(ordenar); orden.setBounds(30,120,150,40);
        Logout1=new JButton("Log Out"); Logout1.setBounds(610,40,100,40);
        Logout1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               Inicio inicio = new Inicio ();
               inicio.setVisible(true);
               Mbib.setVisible(false);
            };
            });
        
        usuario1 = new JLabel(); usuario1.setBounds(250,10,150,150);
        ImageIcon usua = new ImageIcon(getClass().getResource("/proyectobiblio/user.png"));
        ImageIcon usu2 = new ImageIcon(usu.getImage().getScaledInstance(usuario1.getWidth(), usuario1.getHeight(), Image.SCALE_DEFAULT));
        usuario1.setIcon(usu2);
        Mbib.add(bienve1);
        Mbib.add(Logout1);
        Mbib.add(tit1);
        Mbib.add(usuario1);
        Mbib.add(Buscar1);
        Mbib.add(titulo1);
        Mbib.add(aut1);
        Mbib.add(orden);
        Mbib.add(panel1);
        
        Mbib.setVisible(false);
        
        
        }
    public JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
    public JPanel panel1 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo1,0,0,getWidth(),getHeight(),this);
    }
};
}
