
package proyectobiblio;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Administrador {
    
    //Administrador
    
    public Image imgfondo;
    public URL fondo;
    JLabel  user, biblio, vacia,u,b;
    JFrame Ventanaadmin, VentanaLogin;
    JButton cuser, muser ,eluser, moduser, logout, cbiblio,mbiblio,elbiblio, modbiblio, informes;
    //Opcion de Carga
    JLabel   bienve;
    JButton Cmasiva, Cindividual, aceptar;
    JPanel VentanaLogi;
    ///Crear Usuarios
    public static String[] id=new String[100];
    public static String[] nombre=new String[100];
    public static String[] apellido=new String[100];
    public static String[] user1=new String[100];
    public static String[] roll=new String[100];
    public static String[] password=new String[100];
    public Image imgfondo1;
    public URL fondo1;
    JScrollPane paneluser;
    JTable tbuser;
    int cont=3;
    JComboBox combo;
    JLabel  cui,nom,apell,usu,rolles,pass, bien;
    JFrame Ventanaadmin1;
    JButton atras1, aceptar1;
    JTextField ide, nom1, ape, usu1;
    JPasswordField contra;
    // Carga Individual
    public static String[] tip=new String[100];
    public static String[] aut=new String[100];
    public static String[] tit=new String[100];
    public static String[] cl=new String[100];
    public static String[] dsc=new String[100];
    public static String[] ed=new String[100];
    public static String[] tm=new String[100];
    public static String[] ds=new String[100];
    public static String[] cp=new String[100];
    public static String[] dsp=new String[100];
    JScrollPane panelibros;
    JTable tblibros;
    int cont1=0;
    JComboBox combo1;
    JLabel  tipo,auto,titul,edicio,clav,descrip,tem,copi,dispo;
    JFrame Ventanaadmin2;
    JButton atras2, aceptar2;
    JTextField autor55, titulo, edicion, clave, desc, tema, copias, dispon;
    /// Carga Masiva 
    public static String texto;
    JLabel  tipo1;
    JFrame Ventana;
    JButton atras3, aceptar3;
    JTextField autor1 ;
    JTextArea info;
    /// Mostrar Biblioteca ***
    //CIndividual carga= new CIndividual ();
    public Image imgfondo3;
    public URL fondo3;
    JLabel  tipo2;
    JFrame Ventanaadmin3;
    JButton cons1, aceptar4;
    JTextField autor2, Consul ;
    JTextArea infor;
    int contlb=3;
    JScrollPane panellibros;
    JTable tblibros1;
    ///***** 5   Mostrar Usuarios ****************
    public Image imgfondo5;
    public URL fondo5;
    JLabel  tipo5;
    JFrame Muser;
    JButton cons5, aceptar5;
    JTextField autor5, Consul5 ;
    JTextArea infor5;
    int cont5=1, cl1=0;
    JScrollPane panelusuarios;
    //JTable tbusers;
    
     /// Modificar Biblioteca ***
    public Image imgfondo7;
    public URL fondo7;
    JLabel  bienve7, fil7, col7, datomod7;
    JFrame Vc7;
    JButton cons7, aceptar7, bm1;
    JTextField fila7, colum7, datom7;
    
     /// Modificar Usuarios ***
    public Image imgfondo8;
    public URL fondo8;
    JLabel  bienve8, fil8, col8, datomod8;
    JFrame Vc8;
    JButton cons8, aceptar8, bm8;
    JTextField fila8, colum8, datom8;
    
    /// Eliminar Usuarios ***
    JLabel  bienve9, datoel9;
    JFrame Vc9;
    JButton cons9, aceptar9, be9;
    JTextField  datoe9;
    
    /// Eliminar Biblioteca ***
    JLabel  bienve10, datoel10;
    JFrame Vc10;
    JButton cons10, aceptar10, be10;
    JTextField  datoe10;
    
    /// Reportees ***
    JLabel  bienveR, datoR;
    JFrame R;
    JButton uR, bR, aceptarR;
   
    
    
    
public Administrador(){
    
        Border border = LineBorder.createGrayLineBorder();
        Border brd = LineBorder.createBlackLineBorder();
        Ventanaadmin = new JFrame();
        Ventanaadmin.setSize(700,500);
        Ventanaadmin.setTitle("Administrador");
        Ventanaadmin.setLocationRelativeTo(null);
        Ventanaadmin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fondo=this.getClass().getResource("/proyectobiblio/bib.jpg");
        imgfondo= new ImageIcon(fondo).getImage();
        vacia = new JLabel("    Bienvenido Administrador   ");
        vacia.setBorder(brd);
        vacia.setFont(new java.awt.Font("Tahoma", 1, 20));
        vacia.setHorizontalAlignment(JLabel.CENTER);
        vacia.setOpaque(true); vacia.setBackground(Color.yellow);vacia.setBounds(50,75,550,60);
        ImageIcon elim = new ImageIcon(getClass().getResource("/proyectobiblio/eliminar.jpg"));
        ImageIcon elimi = new ImageIcon(elim.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));
        ImageIcon cre= new ImageIcon(getClass().getResource("/proyectobiblio/crear.png"));
        ImageIcon crear = new ImageIcon(cre.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));
        ImageIcon mos= new ImageIcon(getClass().getResource("/proyectobiblio/mostrar.jpg"));
        ImageIcon most = new ImageIcon(mos.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));
        informes= new JButton("Informes");
        informes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        informes.setBounds(390,20,100,40);
        informes.addActionListener((ActionEvent ae) -> {
            R.setVisible(true);
            Ventanaadmin.setVisible(false);
        });
        cuser= new JButton("Crear");
        cuser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cuser.setBackground(Color.LIGHT_GRAY); cuser.setIcon(crear); cuser.setBounds(80,210,90,40);
        cuser.addActionListener((ActionEvent ae) -> {
            Ventanaadmin1.setVisible(true);
            Ventanaadmin.setVisible(false);
        });
        moduser= new JButton("Modificar");
        moduser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        moduser.setBackground(Color.LIGHT_GRAY);  moduser.setBounds(180,260,90,40);
        moduser.addActionListener((ActionEvent ae) -> {
            Vc8.setVisible(true);
            Ventanaadmin.setVisible(false);
        });
        eluser = new JButton("Eliminar");
        eluser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        eluser.setIcon(elimi);eluser.setBounds(80,260,90,40);
        eluser.addActionListener((ActionEvent ae) -> {
                   Vc9.setVisible(true);
                   Ventanaadmin.setVisible(false);
        });
        muser = new JButton("Mostrar");
        muser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        muser.setBackground(Color.LIGHT_GRAY); muser.setBounds(180,210,90,40);
        muser.addActionListener((ActionEvent ae) -> {
                   Muser.setVisible(true);
                   Ventanaadmin.setVisible(false);
        });
        cbiblio= new JButton("Crear"); cbiblio.setIcon(crear);
        cbiblio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cbiblio.setBackground(Color.LIGHT_GRAY); cbiblio.setBounds(380,210,90,40);
        cbiblio.addActionListener((ActionEvent ae) -> {
            VentanaLogin.setVisible(true);
            Ventanaadmin.setVisible(false);

        });
        modbiblio= new JButton("Modificar"); modbiblio.setContentAreaFilled(false); modbiblio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        modbiblio.setBounds(480,260,90,40); 
        modbiblio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        modbiblio.setBackground(Color.LIGHT_GRAY);
        modbiblio.addActionListener((ActionEvent ae) -> {
            Vc7.setVisible(true);
            Ventanaadmin.setVisible(false);

        });
        elbiblio = new JButton("Eliminar");
        elbiblio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        elbiblio.setIcon(elimi);elbiblio.setBounds(380,260,90,40);
        elbiblio.addActionListener((ActionEvent ae) -> {
                   Vc10.setVisible(true);
                   Ventanaadmin.setVisible(false);
        });
        mbiblio = new JButton("Mostrar");mbiblio.setBounds(480,210,90,40);
        ImageIcon mb = new ImageIcon(getClass().getResource("/proyectobiblio/modificar.jpg"));
        ImageIcon mbi = new ImageIcon(mb.getImage().getScaledInstance(100, 40, Image.SCALE_AREA_AVERAGING));
        modbiblio.setIcon(mbi); modbiblio.setText("Modificar"); 
        mbiblio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mbiblio.setIcon(most);
        mbiblio.addActionListener((ActionEvent ae) -> {
                   Ventanaadmin3.setVisible(true);
                   Ventanaadmin.setVisible(false);
        });
        logout = new JButton("Salir"); logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  
        logout.setFocusPainted(true);logout.setBounds(500,20,100,40);
        logout.addActionListener((ActionEvent ae) -> {
            Inicio ini = new Inicio();
            ini.setVisible(true);
            Ventanaadmin.setVisible(false);
        });
        muser.setIcon(most);
        moduser.setIcon(mbi);
       
       u = new JLabel("Usuario"); 
       u.setHorizontalAlignment(JLabel.CENTER);
       u.setOpaque(true);u.setBounds(50,150,250,50);
       b = new JLabel("Bibliografia"); 
       b.setHorizontalAlignment(JLabel.CENTER);
       b.setOpaque(true); b.setBounds(350,150,250,50);
       user = new JLabel("");
       user.setBorder(border);user.setBounds(50,150,250,200);
       biblio = new JLabel("");
       biblio.setBorder(border);biblio.setBounds(350,150,250,200);
       
        Ventanaadmin.add(vacia);
        Ventanaadmin.add(logout);
        Ventanaadmin.add(user);
        Ventanaadmin.add(u);
        Ventanaadmin.add(cuser);
        Ventanaadmin.add(eluser);
        Ventanaadmin.add(muser);
        Ventanaadmin.add(moduser);
        Ventanaadmin.add(biblio);
        Ventanaadmin.add(b);
        Ventanaadmin.add(cbiblio);
        Ventanaadmin.add(elbiblio);
        Ventanaadmin.add(mbiblio);  
        Ventanaadmin.add(modbiblio); 
        Ventanaadmin.add(informes); 
        Ventanaadmin.add(panel);
       
        Ventanaadmin.setVisible(true);
        
        
        
        
        
      //******************************************************
      //******************************************************
      //******************************************************
     // **********************Opcion de Carga************************
        VentanaLogin = new JFrame();
        VentanaLogin.setTitle("Opcion de Carga");
        VentanaLogin.setSize(340,200);
        VentanaLogin.setLocationRelativeTo(null);
        VentanaLogin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        bienve = new JLabel("<html><body>Bienvenido<br> Seleccione el tipo de Carga que desee </body></html>" );
        bienve.setBorder(border);
        bienve.setHorizontalAlignment(JLabel.CENTER);
        bienve.setOpaque(true);
        bienve.setBackground(Color.white);bienve.setBounds(20,10,280,60);
        Cmasiva = new JButton("Carga Masiva");Cmasiva.setBounds(30,100,130,40);
        Cmasiva.addActionListener((ActionEvent ae) -> {
            Ventana.setVisible(true);
            VentanaLogin.setVisible(false);});
        Cindividual = new JButton("Carga Individual");Cindividual.setBounds(170,100,130,40);
        Cindividual.addActionListener((ActionEvent ae) -> { 
           Ventanaadmin2.setVisible(true);
           VentanaLogin.setVisible(false); 
        });
        
        VentanaLogin.add(bienve);  
        VentanaLogin.add(Cmasiva);
        VentanaLogin.add(Cindividual);
        VentanaLogin.add(panel1);
        VentanaLogin.setVisible(false);
        
        
        
        
        
      //////******************************************************************
      //**********************************************************************
      //***********************************************************************
      /////***** Ventana Crear Usuarios *****/////////
        Ventanaadmin1 = new JFrame();
        Ventanaadmin1.setSize(700,500);
        Ventanaadmin1.setTitle("Crear Usuarios");
        Ventanaadmin1.setLocationRelativeTo(null);
        Ventanaadmin1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //Ventanaadmin1.getContentPane().add(panel2);
      
        String[] cmbx={"Estudiante","Catedratico"};
        //Ventanaadmin = new JPanel();
        //fondo=this.getClass().getResource("/proyectobiblio/registro.png");
        //imgfondo= new ImageIcon(fondo).getImage();
        bien = new JLabel("Bienvenido al Registro de Usuarios");        
        bien.setFont(new java.awt.Font("Tahoma", 1, 20));
        bien.setHorizontalAlignment(JLabel.CENTER);
        bien.setBorder(brd); bien.setOpaque(true);bien.setBounds(50,20,400,50);
        ide= new JTextField();ide.setBounds(250,75,150,30);       
        nom1= new JTextField();nom1.setBounds(250,115,150,30);  
        ape= new JTextField();ape.setBounds(250,155,150,30); 
        usu1= new JTextField();usu1.setBounds(250,235,150,30);  
        contra= new JPasswordField();contra.setBounds(250,275,150,30); 
        cui = new JLabel("ID"); cui.setBounds(125,75,75,30);       
        nom= new JLabel("Nombre"); nom.setBounds(125,115,75,30); 
        apell= new JLabel("Apellido");apell.setBounds(125,155,75,30);   
        usu= new JLabel("User"); usu.setBounds(125,235,300,30);     
        rolles= new JLabel("Roll ");rolles.setBounds(125,195,75,30);       
        pass= new JLabel("Password");pass.setBounds(125,275,75,30);       
        
        atras1= new JButton("Atras");
        atras1.setBackground(Color.green);atras1.setBounds(200,350,100,40);    
        atras1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
             //cl1++;
            Ventanaadmin.setVisible(true);
            Ventanaadmin1.setVisible(false);
        }});
        aceptar1= new JButton("Aceptar");
        aceptar1.setBackground(Color.green); aceptar1.setBounds(350,350,100,40);
        aceptar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String pas = new String(contra.getPassword());
                String variable=(String)combo.getSelectedItem();
                roll[cont]= variable;
                id[cont]= ide.getText();
                nombre[cont] = nom1.getText();
                apellido[cont] = ape.getText();
                user1[cont] = usu1.getText();               
                password[cont]= pas;
                cont++;
               // cl1++;
                JOptionPane.showMessageDialog(null,"Usuario Registrado con Exito");
                ide.setText("");
                nom1.setText("");
                ape.setText("");
                usu1.setText("");
                contra.setText("");
                
            }
        });
        combo= new JComboBox(cmbx); combo.setBounds(250,195,150,30);       
        
        Ventanaadmin1.add(atras1);
        Ventanaadmin1.add(aceptar1);
        Ventanaadmin1.add(bien);  
        Ventanaadmin1.add(cui);
        Ventanaadmin1.add(nom);
        Ventanaadmin1.add(apell);
        Ventanaadmin1.add(rolles);
        Ventanaadmin1.add(usu);
        Ventanaadmin1.add(pass); 
        Ventanaadmin1.add(ide);
        Ventanaadmin1.add(nom1);
        Ventanaadmin1.add(ape);
        Ventanaadmin1.add(combo);
        Ventanaadmin1.add(usu1);
        Ventanaadmin1.add(contra);
        Ventanaadmin1.add(panel2);
 
        Ventanaadmin1.setVisible(false);
        
        
        
       //////////*****************************************************************
       /////**********************************************************************
       ///************************************************************************
       //********************Ventana de Carga Individual**************************
        Ventanaadmin2 = new JFrame();
        Ventanaadmin2.setSize(700,500);
        Ventanaadmin2.setTitle("Carga Individual admin");
        Ventanaadmin2.setLocationRelativeTo(null);
        Ventanaadmin2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fondo1=this.getClass().getResource("/proyectobiblio/bibl.jpg");
        imgfondo1= new ImageIcon(fondo1).getImage(); 
        String[] cmbx1={"Libro","Revista","Tesis"};
        tipo = new JLabel("Tipo");        
        tipo.setFont(new java.awt.Font("Tahoma", 1, 10));
        autor55= new JTextField(10);autor55.setBounds(150,150,150,35); 
        titulo= new JTextField(10);titulo.setBounds(450,150,150,35);       
        edicion= new JTextField(10); edicion.setBounds(150,200,150,35);   
        clave= new JTextField(10);
        desc= new JTextField(10);
        tema= new JTextField(10);
        copias= new JTextField(10);
        dispon= new JTextField(10);
        clave.setBounds(450,200,150,35);       
        desc.setBounds(150,250,150,35);        
        tema.setBounds(450,250,150,35);       
        copias.setBounds(150,300,150,35);   
        dispon.setBounds(450,300,150,35);
        auto= new JLabel("  Autor"); auto.setOpaque(true); auto.setBounds(50,150,75,35);    
        titul= new JLabel("  Titulo");titul.setOpaque(true);titul.setBounds(350,150,75,35);       
        edicio= new JLabel("  Edicion");edicio.setOpaque(true);edicio.setBounds(50,200,75,35);   
        clav= new JLabel("  Pal. Clave ");clav.setOpaque(true);clav.setBounds(350,200,75,35);       
        descrip= new JLabel("  Descripcion");descrip.setOpaque(true); descrip.setBounds(50,250,75,35);    
        tem= new JLabel("  Temas");tem.setOpaque(true); tem.setBounds(350,250,75,35);       
        copi= new JLabel("  Copias");copi.setOpaque(true);copi.setBounds(50,300,75,35);   
        dispo= new JLabel("  Disponibles");dispo.setOpaque(true);dispo.setBounds(350,300,75,35);
        atras2= new JButton("Atras");
        atras2.setBackground(Color.green); atras2.setBounds(200,350,100,40); 
        atras2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               
                Ventanaadmin.add(panel);
                Ventanaadmin.setVisible(true);
            //admin ini = new admin();
            //ini.setVisible(true);
            Ventanaadmin2.setVisible(false);
        }});
        aceptar2= new JButton("Aceptar");
        aceptar2.setBackground(Color.green); aceptar2.setBounds(350,350,100,40);
        aceptar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String variable=(String)combo1.getSelectedItem();
                tip[contlb]= variable;
                aut[contlb] = autor55.getText();
                tit[contlb] = titulo.getText();
                ed[contlb] = edicion.getText();
                cl[contlb]= clave.getText();
                dsc[contlb]= desc.getText();
                tm[contlb]= tema.getText();
                cp[contlb]= copias.getText();
                dsp[contlb]= dispon.getText();
                contlb++;
                
                JOptionPane.showMessageDialog(null,"Bibliografia guardada con exito");
                
                
                titulo.setText("");
                autor55.setText("");
                edicion.setText("");
                clave.setText("");
                desc.setText("");
                tema.setText("");
                copias.setText("");
                dispon.setText("");
            }});
        combo1= new JComboBox(cmbx1);   combo1.setBounds(50,75,150,40);    
       
        Ventanaadmin2.add(combo1);        
        Ventanaadmin2.add(atras2);
        Ventanaadmin2.add(aceptar2);
        Ventanaadmin2.add(auto);
        Ventanaadmin2.add(titul);
        Ventanaadmin2.add(edicio);
        Ventanaadmin2.add(clav);
        Ventanaadmin2.add(descrip);
        Ventanaadmin2.add(tem);
        Ventanaadmin2.add(copi);
        Ventanaadmin2.add(dispo);
        Ventanaadmin2.add(autor55);
        Ventanaadmin2.add(titulo);
        Ventanaadmin2.add(edicion);
        Ventanaadmin2.add(clave);
        Ventanaadmin2.add(desc);
        Ventanaadmin2.add(tema);
        Ventanaadmin2.add(copias);
        Ventanaadmin2.add(dispon);
        Ventanaadmin2.add(panel3);
        
        Ventanaadmin2.setVisible(false);
        
        
        
        
        
        
        /////*******************************************************************
        //**********************************************************************
        //**********************************************************************
        //****************** Ventana de Carga Masiva****************************
        Ventana = new JFrame();
        Ventana.setSize(700,500);
        Ventana.setTitle("Carga Masiva de Administrador");
        Ventana.setLocationRelativeTo(null);
        Ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        tipo1=new JLabel("<html><body>  Bienvenido a la Carga Masiva de Administrador <br>  Cree la Carga Masiva de la Biblioteca de la siguiente forma: <br>  Tipo; Autor; Titulo; Descripcion; Palabras clave; Edicion; Temas; Frecuencia <br>  Actual; Ejemplares; Area; Copias; Disponibles; y finalice con un punto</body></html>");
        tipo1.setFont(new java.awt.Font("Tahoma", 1, 15));
        tipo1.setBorder(brd); tipo1.setOpaque(true);tipo1.setBounds(50,25,600,100); //tipo1.setBackground(Color.yellow); 
        info= new JTextArea();info.setBounds(50,150,600,230);
        atras3= new JButton("Atras");
        atras3.setBackground(Color.green);atras3.setBounds(200,400,100,40);
        atras3.addActionListener((ActionEvent ae) -> {
            Ventanaadmin.add(panel);
            Ventanaadmin.setVisible(true);
            Ventana.setVisible(false);
        });
        aceptar3= new JButton("Aceptar");
        aceptar3.setBackground(Color.green);aceptar3.setBounds(350,400,100,40);
        aceptar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  
                
                JOptionPane.showMessageDialog(null, "Se han guardado los cambios");
                info.setText("");
            }
        });
        Ventana.add(tipo1);
        Ventana.add(atras3); 
        Ventana.add(aceptar3); 
        Ventana.add(info); 
        Ventana.add(panel4);
     
        Ventana.setVisible(false);
        
        
        
        
        //////////////////**********************************************************************
        ////************************************************************************************
        //**************************************************************************************
        //************** Ventana de Mostrar Biblioteca *****************************************
        librosdef();
        Ventanaadmin3 = new JFrame();
        Ventanaadmin3.setSize(750,530);
        Ventanaadmin3.setTitle("Mostrar Biblioteca");
        Ventanaadmin3.setLocationRelativeTo(null);
        Ventanaadmin3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fondo3=this.getClass().getResource("/proyectobiblio/biblio.jpg");
        imgfondo3= new ImageIcon(fondo3).getImage();
        tipo2=new JLabel("<html><body> Bienvenido a la Biblioteca </body></html>");
        tipo2.setFont(new java.awt.Font("Tahoma", 1, 18));
        tipo2.setBorder(brd); 
        tipo2.setOpaque(true);
        tipo2.setBackground(Color.CYAN);
        tipo2.setHorizontalAlignment(JLabel.CENTER);tipo2.setBounds(50,25,600,80);
        infor= new JTextArea();
        autor2= new JTextField("");       
        cons1= new JButton("Consultar");
        cons1.setBackground(Color.WHITE);cons1.setBounds(200,420,100,40);
        cons1.addActionListener((ActionEvent ae) -> {
           tblibros();
           tblibros.setEnabled(false);
           Ventanaadmin3.add(panellibros); 
            });
        aceptar4= new JButton("Aceptar");
        aceptar4.setBackground(Color.white);aceptar4.setBounds(350,420,100,40);
        aceptar4.addActionListener((ActionEvent ae) -> {
            Ventanaadmin3.setVisible(false);
            Ventanaadmin.setVisible(true);
        });
        
        Ventanaadmin3.add(tipo2); 
        Ventanaadmin3.add(cons1); 
        Ventanaadmin3.add(aceptar4); 
        Ventanaadmin3.add(panel5);
        Ventanaadmin3.setVisible(false);
         
         
        
        
        
        ///////////*******************************************************************************************
        ///***************************************************************************************************
        //****************************************************************************************************
        //******************* Mostrar Usuarios *********************************************
        Datosiniciales();
        Muser = new JFrame();  
        Muser.setSize(750,530);
        Muser.setTitle("Mostrar Usuarios");
        Muser.setLocationRelativeTo(null);
        Muser.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fondo5=this.getClass().getResource("/proyectobiblio/biblio.jpg");
        imgfondo5= new ImageIcon(fondo5).getImage();
        tipo5=new JLabel("<html><body> Bienvenido al Registro de Usuarios </body></html>");
        tipo5.setFont(new java.awt.Font("Tahoma", 1, 18));
        tipo5.setBorder(brd); 
        tipo5.setOpaque(true);
        tipo5.setBackground(Color.WHITE);
        tipo5.setHorizontalAlignment(JLabel.CENTER);tipo5.setBounds(50,25,600,80);
        infor5= new JTextArea();
        autor5= new JTextField("");       
        cons5= new JButton("Mostrar");
        cons5.setBackground(Color.WHITE);cons5.setBounds(200,400,100,40);
         cons5.addActionListener((ActionEvent ae) -> {
            tbusers();
            tbuser.setEnabled(false);
            Muser.add(paneluser); 
           });
        aceptar5= new JButton("Aceptar");
        aceptar5.setBackground(Color.white); aceptar5.setBounds(350,400,100,40);
        aceptar5.addActionListener((ActionEvent ae) -> {
          Ventanaadmin.setVisible(true);
            Muser.setVisible(false);
        });
        Muser.add(tipo5); 
        Muser.add(cons5); 
        Muser.add(aceptar5); 
        Muser.add(panel6);
        
        
         //////////////////**********************************************************************
        ////************************************************************************************
        //**************************************************************************************
        //************** Ventana de Modificar Biblioteca *****************************************
        librosdef();
        Vc7 = new JFrame();
        Vc7.setSize(750,600);
        Vc7.setTitle("Modificar Biblioteca");
        Vc7.setLocationRelativeTo(null);
        Vc7.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fondo7=this.getClass().getResource("/proyectobiblio/biblio.jpg");
        imgfondo7= new ImageIcon(fondo7).getImage();
        bienve7=new JLabel("<html><body> Bienvenido a la Biblioteca </body></html>");
        bienve7.setFont(new java.awt.Font("Tahoma", 1, 18));
        bienve7.setBorder(brd); 
        bienve7.setOpaque(true);
        bienve7.setBackground(Color.CYAN);
        bienve7.setHorizontalAlignment(JLabel.CENTER); bienve7.setBounds(50,25,600,80);
        fil7= new JLabel("Fila a Modificar"); fil7.setBounds(70,350,120,40); fil7.setOpaque(true); fil7.setHorizontalAlignment(JLabel.CENTER);
        col7= new JLabel("Columna a Modificar");col7.setBounds(220,350,120,40);col7.setOpaque(true);col7.setHorizontalAlignment(JLabel.CENTER);
        datomod7= new JLabel("Dato a Modificar"); datomod7.setBounds(370,350,120,40);datomod7.setOpaque(true);datomod7.setHorizontalAlignment(JLabel.CENTER);
        fila7 = new JTextField();fila7.setBounds(70,400,120,40);
        colum7 = new JTextField();colum7.setBounds(220,400,120,40);
        datom7= new JTextField();datom7.setBounds(370,400,120,40);
        bm1= new JButton("Modificar"); bm1.setBounds(520,400,120,40);
        cons7= new JButton("Consultar");
        cons7.setBackground(Color.WHITE);cons7.setBounds(200,500,100,40);
        cons7.addActionListener((ActionEvent ae) -> {
          //  int fila = Integer.parseInt(fila7.getText());
        tblibros();
        tblibros.setEnabled(true);
         Vc7.add(panellibros);   
            });
        aceptar7= new JButton("Aceptar");
        aceptar7.setBackground(Color.white);aceptar7.setBounds(350,500,100,40);
        aceptar7.addActionListener((ActionEvent ae) -> {
            Vc7.setVisible(false);
            Ventanaadmin.setVisible(true);
        });
        
             
        Vc7.add(bienve7); 
        Vc7.add(cons7); 
        Vc7.add(fil7); 
        Vc7.add(col7); 
        Vc7.add(datomod7); 
        Vc7.add(aceptar7); 
        Vc7.add(fila7); 
        Vc7.add(colum7); 
        Vc7.add(datom7); 
        Vc7.add(bm1); 
        Vc7.add(panel7);
        Vc7.setVisible(false);
        
        
        
        
        
          //////////////////**********************************************************************
        ////************************************************************************************
        //**************************************************************************************
        //************** Ventana de Modificar Usuarios *****************************************
        librosdef();
        Vc8 = new JFrame();
        Vc8.setSize(750,600);
        Vc8.setTitle("Modificar Usuarios");
        Vc8.setLocationRelativeTo(null);
        Vc8.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fondo8=this.getClass().getResource("/proyectobiblio/biblio.jpg");
        imgfondo8= new ImageIcon(fondo7).getImage();
        bienve8=new JLabel("<html><body> Bienvenido a Modificar Usuarios</body></html>");
        bienve8.setFont(new java.awt.Font("Tahoma", 1, 18));
        bienve8.setBorder(brd); 
        bienve8.setOpaque(true);
        bienve8.setBackground(Color.pink);
        bienve8.setHorizontalAlignment(JLabel.CENTER); bienve8.setBounds(50,25,600,80);
        fil8= new JLabel("Fila a Modificar"); fil8.setBounds(70,350,120,40); fil8.setOpaque(true); fil8.setHorizontalAlignment(JLabel.CENTER);
        col8= new JLabel("Columna a Modificar");col8.setBounds(220,350,120,40);col8.setOpaque(true);col8.setHorizontalAlignment(JLabel.CENTER);
        datomod8= new JLabel("Dato a Modificar"); datomod8.setBounds(370,350,120,40);datomod8.setOpaque(true);datomod8.setHorizontalAlignment(JLabel.CENTER);
        fila8 = new JTextField();fila8.setBounds(70,400,120,40);
        colum8 = new JTextField();colum8.setBounds(220,400,120,40);
        datom8= new JTextField();datom8.setBounds(370,400,120,40);
        bm8= new JButton("Modificar"); bm8.setBounds(520,400,120,40);
        cons8= new JButton("Consultar");
        cons8.setBackground(Color.WHITE);cons8.setBounds(200,500,100,40);
        cons8.addActionListener((ActionEvent ae) -> {
          //  int fila = Integer.parseInt(fila7.getText());
        tbusers();
        tbuser.setEnabled(true);
         Vc8.add(paneluser);   
            });
        aceptar8= new JButton("Aceptar");
        aceptar8.setBackground(Color.white);aceptar8.setBounds(350,500,100,40);
        aceptar8.addActionListener((ActionEvent ae) -> {
            Vc8.setVisible(false);
            Ventanaadmin.setVisible(true);
        });
        
             
        Vc8.add(bienve8); 
        Vc8.add(cons8); 
        Vc8.add(fil8); 
        Vc8.add(col8); 
        Vc8.add(datomod8); 
        Vc8.add(aceptar8); 
        Vc8.add(fila8); 
        Vc8.add(colum8); 
        Vc8.add(datom8); 
        Vc8.add(bm8); 
        Vc8.add(panel8);
        Vc8.setVisible(false);
        
        
        
        
        
        
         //////////////////**********************************************************************
        ////************************************************************************************
        //**************************************************************************************
        //************** Ventana de Modificar Usuarios *****************************************
        Datosiniciales();
        Vc9 = new JFrame();
        Vc9.setSize(750,600);
        Vc9.setTitle("Eliminar Usuarios");
        Vc9.setLocationRelativeTo(null);
        Vc9.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        bienve9=new JLabel("<html><body> Bienvenido a Eliminar Usuarios</body></html>");
        bienve9.setFont(new java.awt.Font("Tahoma", 1, 18));
        bienve9.setBorder(brd); 
        bienve9.setOpaque(true);
        bienve9.setBackground(Color.green);
        bienve9.setHorizontalAlignment(JLabel.CENTER); bienve9.setBounds(50,25,600,80);
        datoel9= new JLabel("Escribe el numero de fila a eliminar inicia en 0"); datoel9.setBounds(50,350,300,40);datoel9.setOpaque(true);datoel9.setHorizontalAlignment(JLabel.CENTER);
        datoe9= new JTextField();datoe9.setBounds(370,350,120,40);
        be9= new JButton("Eliminar"); be9.setBounds(520,350,120,40);
        cons9= new JButton("Consultar");
        cons9.setBackground(Color.WHITE);cons9.setBounds(200,420,100,40);
        cons9.addActionListener((ActionEvent ae) -> {
        tbusers();
        tbuser.setEnabled(true);
         Vc9.add(paneluser);   
            });
        aceptar9= new JButton("Aceptar");
        aceptar9.setBackground(Color.white);aceptar9.setBounds(350,420,100,40);
        aceptar9.addActionListener((ActionEvent ae) -> {
            Vc9.setVisible(false);
            Ventanaadmin.setVisible(true);
        });
        
             
        Vc9.add(bienve9); 
        Vc9.add(cons9); 
        Vc9.add(datoe9); 
        Vc9.add(aceptar9); 
        Vc9.add(datoel9); 
        Vc9.add(be9); 
        Vc9.add(panel9);
        Vc9.setVisible(false);
        
        
        
        
        
        
         //////////////////**********************************************************************
        ////************************************************************************************
        //**************************************************************************************
        //************** Ventana de Eliminarar Biblioteca *****************************************
        librosdef();
        Vc10 = new JFrame();
        Vc10.setSize(750,600);
        Vc10.setTitle("Eliminar Biblioteca");
        Vc10.setLocationRelativeTo(null);
        Vc10.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        bienve10=new JLabel("<html><body> Bienvenido a Eliminar Biblioteca</body></html>");
        bienve10.setFont(new java.awt.Font("Tahoma", 1, 18));
        bienve10.setBorder(brd); 
        bienve10.setOpaque(true);
        bienve10.setBackground(Color.red);
        bienve10.setHorizontalAlignment(JLabel.CENTER); bienve10.setBounds(50,25,600,80);
        datoel10= new JLabel("Escribe el numero de fila a eliminar inicia en 0"); datoel10.setBounds(50,350,300,40);datoel10.setOpaque(true);datoel10.setHorizontalAlignment(JLabel.CENTER);
        datoe10= new JTextField();datoe10.setBounds(370,350,120,40);
        be10= new JButton("Eliminar"); be10.setBounds(520,350,120,40);
        cons10= new JButton("Consultar");
        cons10.setBackground(Color.WHITE);cons10.setBounds(200,420,100,40);
        cons10.addActionListener((ActionEvent ae) -> {
        tblibros();
        tblibros.setEnabled(true);
         Vc10.add(panellibros);   
            });
        aceptar10= new JButton("Aceptar");
        aceptar10.setBackground(Color.white);aceptar10.setBounds(350,420,100,40);
        aceptar10.addActionListener((ActionEvent ae) -> {
            Vc10.setVisible(false);
            Ventanaadmin.setVisible(true);
        });
        
             
        Vc10.add(bienve10); 
        Vc10.add(cons10); 
        Vc10.add(datoe10); 
        Vc10.add(aceptar10); 
        Vc10.add(datoel10); 
        Vc10.add(be10); 
        Vc10.add(panel10);
        Vc10.setVisible(false);
        
        
         //////////////////**********************************************************************
        ////************************************************************************************
        //**************************************************************************************
        //************** Ventana de Reportes *****************************************
        librosdef();
        Datosiniciales();
        R = new JFrame();
        R.setSize(850,500);
        R.setTitle("Informes");
        R.setLocationRelativeTo(null);
        R.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        bienveR=new JLabel("<html><body> Bienvenido a la creacion de informes</body></html>");
        bienveR.setFont(new java.awt.Font("Tahoma", 1, 18));
        bienveR.setBorder(brd); 
        bienveR.setOpaque(true);
        bienveR.setBackground(Color.red);
        bienveR.setHorizontalAlignment(JLabel.CENTER); bienveR.setBounds(50,25,600,80);
        datoR= new JLabel("Libros Mas Prestados"); datoR.setBounds(50,400,180,40);datoR.setOpaque(true);datoR.setHorizontalAlignment(JLabel.CENTER);
        
        uR= new JButton("Reporte de Usuarios"); uR.setBounds(650,120,180,40);uR.setBackground(Color.WHITE);
        uR.addActionListener((ActionEvent ae) -> {
        tbusers();
        tbuser.setEnabled(true);
        paneluser.setBounds(30,120,590,120);
        R.add(paneluser);   
          });
        bR= new JButton("Reporte de Biblioteca");
        bR.setBackground(Color.WHITE);bR.setBounds(650,170,180,40);
        bR.addActionListener((ActionEvent ae) -> {
        tblibros();
        tblibros.setEnabled(true);
        panellibros.setBounds(30,260,590,120);
         R.add(datoR);
         R.add(panellibros);   
         
            });
        aceptarR= new JButton("Aceptar");
        aceptarR.setBackground(Color.white);aceptarR.setBounds(690,220,100,40);
        aceptarR.addActionListener((ActionEvent ae) -> {
            R.setVisible(false);
            Ventanaadmin.setVisible(true);
        });
        
         //R.add(datoR);     
        R.add(bienveR); 
        R.add(uR); 
        R.add(bR); 
        R.add(aceptarR);  
        R.add(panel11);
        R.setVisible(false);
        
        
        
        
}  
public  void tblibros(){
    Object [][] libro = new Object [contlb][10];
    for (int i=0; i<contlb; i++){
        libro [i][0]= i+1;
        libro [i][1]= tip[i];
        libro [i][2]= aut[i];
        libro [i][3]= ed[i];
        libro [i][4]= dsc[i];
        libro [i][5]= cp[i];
        libro [i][6]= tit[i];
        libro [i][7]= cl[i];
        libro [i][8]= tm[i];
        libro [i][9]= dsp[i];
    }
    
    
    String [] colum={"#","Tipo","Autor","Edicion","Descripcion","Copias","Titulo","Palabras Clave","Temas","Disponibles" };
    tblibros= new JTable(libro,colum);
    for (int j=0; j<10; j++){
        tblibros.getColumnModel().getColumn(j);
    }
    panellibros= new JScrollPane();
    panellibros.setBounds(30,150,680,150);
    panellibros.setViewportView(tblibros);
    //panellibros.setBackground(Color.pink);
    //panellibros.setAutoscrolls(true);
    //panellibros.createVerticalScrollBar();
   // panellibros.createHorizontalScrollBar();
    
   
   
   
   
   
  
        
}
public static void Datosiniciales(){
    id[0]= "252155489";
    nombre[0]= "Juan";
    apellido[0]= "Martinez";
    roll[0]= "Estudiante";
    user1[0]= "user1";
    password[0]= "1234";
    
    id[2]= "252155489";
    nombre[2]= "Heidy";
    apellido[2]= "Miranda";
    roll[2]= "Estudiante";
    user1[2]= "Miranda";
    password[2]= "1234";
    
    id[1]= "35465";
    nombre[1]= "Maria";
    apellido[1]= "Lopez";
    roll[1]= "Catedratico";
    user1[1]= "user2";
    password[1]= "1234";
};
public  static void librosdef(){
    tip[0]= "0";
    aut[0]= "Juan";
    ed[0]= "3";
    dsc[0]= "libertad";
    cp[0]= "5";
    tit[0]= "Bondad";
    cl[0]= "valor";
    tm[0]= "sonrisas";
    dsp[0]= "2";
    
    tip[1]= "1";
    aut[1]= "Pablo";
    tit[1]= "Rinoceronte";
    ed[1]= "5";
    dsc[1]= "moral";
    cp[1]= "4";
    cl[1]= "hacer, crear";
    tm[1]= "iniciativa";
    dsp[1]= "6";
    
    tip[2]= "1";
    aut[2]= "Raul";
    tit[2]= "Paloma";
    ed[2]= "1";
    dsc[2]= "timidez";
    cp[2]= "8";
    cl[2]= "bullyng";
    tm[2]= "valor";
    dsp[2]= "5";
    
    
}
public  void tdlibros(){
    Object [][] libro = new Object [contlb][10];
    for (int i=0; i<contlb; i++){
        libro [i][0]= i;
        libro [i][1]= tip[i];
        libro [i][2]= aut[i];
        libro [i][3]= tit[i];
        libro [i][4]= ed[i];
        libro [i][5]= cl[i];
        libro [i][6]= dsc[i];
        libro [i][7]= tm[i];
        libro [i][7]= cp[i];
        libro [i][7]= dsp[i];
    }
    String [] colum={"#","Tipo","Autor","Edicion","Descripcion","Copias","Titulo","Palabras Clave","Temas","Disponibles" };
    tblibros= new JTable(libro,colum);
    for (int j=0; j<10; j++){
        tblibros.getColumnModel().getColumn(j);
    }
    panelibros=new JScrollPane();
    panelibros.setBounds(80,200,650,150);
       
}
public void tbusers(){
    Object [][] users = new Object [cont][7];
    for (int i=0; i<cont; i++){
        users [i][0]= i;
        users [i][1]= id[i];
        users [i][2]= nombre[i];
        users [i][3]= apellido[i];
        users [i][4]= roll[i];
        users [i][5]= user1[i];
        users [i][6]= password[i];
    }
    String [] colum={"#","ID","Nombre","Apellido","Roll","Usuario","Contraseña" };
    tbuser= new JTable(users,colum);
    for (int j=0; j<7; j++){
        tbuser.getColumnModel().getColumn(j);
    }
    paneluser=new JScrollPane();
    paneluser.setBounds(40,150,640,150);
    paneluser.setViewportView(tbuser);
};      
public JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel1 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel2 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel3 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo1,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel4 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo1,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel5 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo3,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel6 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo5,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel7 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo5,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel8 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel9 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel10 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo5,0,0,getWidth(),getHeight(),this);
    }
};
public JPanel panel11 = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
}
