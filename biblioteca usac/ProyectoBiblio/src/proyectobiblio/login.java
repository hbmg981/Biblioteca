/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblio;


import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class login extends JFrame {
    public Image imgfondo;
    public URL fondo;
     JLabel  nombre, pass, bienve, lerror;
    JPanel VentanaLogin, error;
    JButton entrar, cancelar, aceptar;
    JTextField  nom;
    JPasswordField contra;
    
 public login(){
    
        super("Ingreso de Usuario");
        Container contenedor=getContentPane();
        Border border = LineBorder.createGrayLineBorder();
        error = new JPanel();
        VentanaLogin = new JPanel();
        fondo=this.getClass().getResource("/proyectobiblio/biblio.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        bienve = new JLabel("<html><body>Bienvenido<br> Ingrese su usuario y contraseña </body></html>" );
        bienve.setBorder(border);
        bienve.setOpaque(true);
        bienve.setBackground(Color.lightGray);
        bienve.setHorizontalAlignment(JLabel.CENTER);bienve.setBounds(100,10,200,60);
        entrar = new JButton("Entrar");
        entrar.setBackground(Color.pink);entrar.setBounds(150,250,100,60);
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             
                String pas = new String(contra.getPassword());
                
                if (nom.getText().equals("user1")&& pas.equals("1234")) {
                    MiBiblio adm1 = new MiBiblio();
                    adm1.MiBiblioteca.setVisible(true);
                    contra.setText("");
                    nom.setText("");
                } else{
                if 
                    (pas.equals("password")&& nom.getText().equals("admin")) {
                    Administrador administra = new Administrador();
                    administra.Ventanaadmin.setVisible(true);
                    contra.setText("");
                    nom.setText("");
                }else{
                if (nom.getText().equals("user2")&& pas.equals("1234")) {
                    MiBiblio adm = new MiBiblio();
                    adm.MiBiblioteca.setVisible(true);
                    contra.setText("");
                    nom.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(login.this, "<html><body>El usuario no existe. Ponerse en contacto con  <br> el administrador para solicitar un registro.</body></html>");
                    nom.setText("");
                    contra.setText("");
                }}}
                 
            }
        });
        cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.pink);cancelar.setBounds(260,250,100,60);
        cancelar.addActionListener((ActionEvent ae) -> {
           Inicio ini = new Inicio();
            ini.setVisible(true);
            dispose();
        });
         
        ImageIcon usuari= new ImageIcon(getClass().getResource("/proyectobiblio/usuario.jpg"));
        ImageIcon usuario = new ImageIcon(usuari.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));
        ImageIcon contras= new ImageIcon(getClass().getResource("/proyectobiblio/contrase.jpg"));
        ImageIcon contrase = new ImageIcon(contras.getImage().getScaledInstance(100, 60, Image.SCALE_AREA_AVERAGING));
        
       nombre= new JLabel("Usuario:  ");
       nombre.setIcon(usuario);
       nombre.setOpaque(true);
       nombre.setBackground(Color.lightGray); nombre.setBounds(75,80,100,60);
       pass= new JLabel("Contraseña:  "); 
       pass.setIcon(contrase); 
       pass.setOpaque(true);
       pass.setBackground(Color.lightGray); pass.setBounds(75,150,100,60);
       contra = new JPasswordField(); contra.setBounds(200,150,100,60);
       nom = new JTextField();nom.setBounds(200,80,100,60);
       
        this.add(bienve); 
        this.add(nombre); 
        this.add(nom); 
        this.add(pass); 
        this.add(contra); 
        this.add(entrar); 
        this.add(cancelar); 
        
        contenedor.add(panel,BorderLayout.CENTER);
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
}
 public JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
}

//**** EXTRAS
     // String u = "admin";
               // String p = "password";
                //String user1= "user1";
               // String pas1 = "1234";
               // String user2= "user1";
               // String pas2 = "1234";
        
      //MostrarBiblio mo = new MostrarBiblio();
       //mo.setVisible(true);
//       CIndividual in = new CIndividual();
      // in.setVisible(false);
       //admin i = new admin();
      //  i.setVisible(true);
      // CMasiva cm= new CMasiva();
       //cm.setVisible(true);
      // CrearUsuarios cu = new CrearUsuarios();
      // cu.setVisible(true);
     //MiBiblio mb = new MiBiblio();
     //mb.MiBiblioteca.setVisible(true);
      //Administrador ad = new Administrador();
      //ad.Ventanaadmin.setVisible(true);
//contenedor.add(error,BorderLayout.CENTER);
      //  setSize(200,200);
       // setLocationRelativeTo(null);
       // setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       // setVisible(false);