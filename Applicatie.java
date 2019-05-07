/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbs2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author flori
 */
public class Applicatie extends JFrame implements ActionListener{

//  ATTRIBUTES 
    
    // Alles nodig voor panel 1, componentenscherm
    private JPanel jPanel1 = new JPanel();
        private JButton btnHAL9001W = new JButton("HAL9001W");
        private JButton btnHAL9002W = new JButton("HAL9002W");
        private JButton btnHAL9003W = new JButton("HAL9003W");
        private JButton btnHAL9001DB = new JButton("HAL9001DB");
        private JButton btnHAL9002DB = new JButton("HAL9002DB");
        private JButton btnHAL9003DB = new JButton("HAL9003DB");
        private JButton btnPFsense = new JButton("pfSense");
        private JButton btnDBloadbalancer = new JButton("DBloadbalancer");
    // Alles nodig voor panel 2, opslaan scherm    
    private JPanel jPanel2 = new JPanel();
        private JButton btnOpslaan = new JButton("Opslaan");

    // Alles nodig voor panel 3    
    private JPanel jPanel3 = new JPanel();
        private JLabel lbBeschikbaarheid1 = new JLabel("Beschikbaarheidspercentage: ");
        private JTextField tfPercentage1 = new JTextField(5);
        private JButton btnOptimaliseren = new JButton("Optimaliseren");
        private JButton btnMonitoren = new JButton("Monitoren");
    // Alles nodig voor panel 4
    private JPanel jPanel4 = new JPanel();
        private JLabel lbBeschikbaarheid2 = new JLabel("Beschikbaarheidspercentage: ");
        private JLabel lbKosten1 = new JLabel("Kosten: ");
        private JLabel lbBeschikbaarheid3 = new JLabel("%");
        private JLabel lbKosten2 = new JLabel("€");
    // Alles nodig voor panel 5
    private JPanel jPanel5 = new JPanel();
        private JLabel lbPFsense = new JLabel("pfSense");
    // Alles nodig voor panel 6
        private JPanel jPanel6 = new JPanel();
        int componentCount = 1;
        int HAL9001Wcounter = 0;
        int HAL9002Wcounter = 0;
        int HAL9003Wcounter = 0;
        private JLabel lbHAL9001W = new JLabel("HAL9001W");
        private JLabel lbHAL9002W = new JLabel("HAL9002W");
        private JLabel lbHAL9003W = new JLabel("HAL9003W");  
    // Alles nodig voor panel 7
        private JPanel jPanel7 = new JPanel();
        private JLabel lbDBloadbalancer = new JLabel("DBloadbalancer");
    // Alles nodig voor panel 8
        private JPanel jPanel8 = new JPanel();
        int HAL9001DBcounter = 0;
        int HAL9002DBcounter = 0;
        int HAL9003DBcounter = 0;
        private JLabel lbHAL9001DB = new JLabel("HAL9001DB");
        private JLabel lbHAL9002DB = new JLabel("HAL9002DB");
        private JLabel lbHAL9003DB = new JLabel("HAL9003DB");  
    
//  CONSTRUCTORS    
    public Applicatie (){
        // Standaard instellingen applicatiescherm
        setTitle("Applicatie");
        setSize(1200, 700);  // 800 + 400 & 500 + 200
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // PANEL 1 GROUPLAYOUT
        // Layout voor het panel met alle componenten
        add(jPanel1);  
            GroupLayout Panel1Layout = new GroupLayout(jPanel1);
            jPanel1.setBackground(new Color(51, 0 ,0));            
            jPanel1.setSize(200,500);
            jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            jPanel1.setLayout(Panel1Layout);
            //Horizontale group layout panel 1
                Panel1Layout.setHorizontalGroup(
                        Panel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addGroup(Panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                        .addGroup(Panel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)    
                                            .addComponent(btnHAL9001W, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnHAL9002W, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnHAL9003W, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnHAL9001DB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnHAL9002DB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnHAL9003DB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnPFsense, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200)
                                            .addComponent(btnDBloadbalancer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, 200))
                                                .addContainerGap())
                );
            // Verticale group layout panel 1    
                Panel1Layout.setVerticalGroup(
                    Panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(Panel1Layout.createSequentialGroup()
                            // .addGap(14,14,14)
                            .addGap(40)
                            .addComponent(btnHAL9001W)
                                .addGap(30)
                            .addComponent(btnHAL9002W)
                                .addGap(30)
                            .addComponent(btnHAL9003W)
                                .addGap(30)
                            .addComponent(btnHAL9001DB)
                                .addGap(30)
                            .addComponent(btnHAL9002DB)
                                .addGap(30)
                            .addComponent(btnHAL9003DB)
                                .addGap(30)
                            .addComponent(btnPFsense)
                                .addGap(30)
                            .addComponent(btnDBloadbalancer)
                            .addGap(40))       //ContainerGap(71, Short.MAX_VALUE))
                );
        // PANEL 2 GROUPLAYOUT
        // Layout voor het scherm met de knop opslaan        
        add(jPanel2);
            GroupLayout Panel2Layout = new GroupLayout(jPanel2);
            jPanel2.setBackground(Color.DARK_GRAY);
            //jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            jPanel2.setSize(200,500);  // 1200,500
            jPanel2.setLocation(1000,0);
            jPanel2.setLayout(Panel2Layout);
                // Horizontale group layout panel 2
                Panel2Layout.setHorizontalGroup(
                    Panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                            .addGap(50)   // 1050
                            .addComponent(btnOpslaan)
                            .addGap(70)) // 70
                ); 
                // Verticale group layout panel 2
                Panel2Layout.setVerticalGroup(
                    Panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                            .addGap(450)
                            .addComponent(btnOpslaan)
                            .addContainerGap())
                    );
        // Absolute positioning panel 3
        // Layout voor het scherm waar het beschikbaarheidspercentage kan worden ingevoerd en kan worden geklikt op optimaliseren of monitoren
        // Er is hier gekozen voor absolute positioning puur om layout op een andere manier te proberen, puur om ervan te leren!
        // In zowel panel 3 als 4 worden de bounds, fonts etc. dus handmatig ingesteld
        add(jPanel3);
            jPanel3.setLayout(null);
            jPanel3.setSize(600, 200);
            jPanel3.setBackground(Color.DARK_GRAY);
            jPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            Font font = new Font("Plain", Font.PLAIN, 18);
            jPanel3.setLocation(0, 500);
                jPanel3.add(lbBeschikbaarheid1);
                    lbBeschikbaarheid1.setForeground(Color.BLACK);
                    lbBeschikbaarheid1.setFont(font);
                    lbBeschikbaarheid1.setBounds(10, 30, 250, 20);
                jPanel3.add(tfPercentage1);
                    tfPercentage1.setBounds(270,30, 50, 20);
                jPanel3.add(btnOptimaliseren);
                    btnOptimaliseren.setBounds(400, 30, 150, 30);
                jPanel3.add(btnMonitoren);
                    btnMonitoren.setBounds(400, 100, 150, 30);
        // Absolute positioning panel 4
        // Layout voor het scherm waar de output van het beschikbaarheidspercentage komt en de output van de kosten
        add(jPanel4);
            jPanel4.setLayout(null);
            jPanel4.setSize(600,200);
            jPanel4.setBackground(new Color(51,0,0));
            jPanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jPanel4.setLocation(600, 500);
                jPanel4.add(lbBeschikbaarheid2);
                    lbBeschikbaarheid2.setForeground(Color.WHITE);
                    lbBeschikbaarheid2.setFont(font);
                    lbBeschikbaarheid2.setBounds(50,30,250,20);
                jPanel4.add(lbKosten1);
                    lbKosten1.setForeground(Color.WHITE);
                    lbKosten1.setFont(font);
                    lbKosten1.setBounds(50,100,180,20);
                jPanel4.add(lbBeschikbaarheid3);
                    lbBeschikbaarheid3.setForeground(Color.WHITE);
                    lbBeschikbaarheid3.setFont(font);
                    lbBeschikbaarheid3.setBounds(450, 30, 180,20);
                jPanel4.add(lbKosten2);
                    lbKosten2.setForeground(Color.WHITE);
                    lbKosten2.setFont(font);
                    lbKosten2.setBounds(450, 100, 180, 20);
        // Panel 5 - 8, maakt gebruik van BoxLayout, wederom om te leren werken met een andere layout manager   
        // Op deze vier panels kunnen de componenten worden toegevoegd
        add(jPanel5);
            jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.Y_AXIS));
            jPanel5.setSize(200, 500);
            jPanel5.setLocation(200,0);
            jPanel5.setBackground(Color.DARK_GRAY);
        add(jPanel6);
            jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.Y_AXIS));
            jPanel6.setSize(200, 500);
            jPanel6.setLocation(400,0);
            jPanel6.setBackground(Color.BLACK);
        add(jPanel7);
            jPanel7.setLayout(new BoxLayout(jPanel7, BoxLayout.Y_AXIS));
            jPanel7.setSize(200, 500);
            jPanel7.setLocation(600,0);
            jPanel7.setBackground(Color.DARK_GRAY);
        add(jPanel8);
            jPanel8.setLayout(new BoxLayout(jPanel8, BoxLayout.Y_AXIS));
            jPanel8.setSize(200, 500);
            jPanel8.setLocation(800,0);
            jPanel8.setBackground(Color.BLACK);
        
            
            
            

        // ActionListeners
        btnPFsense.addActionListener(this);
        btnHAL9001W.addActionListener(this);
        btnHAL9002W.addActionListener(this);
        btnHAL9003W.addActionListener(this);
        btnHAL9001DB.addActionListener(this);
        btnHAL9002DB.addActionListener(this);
        btnHAL9003DB.addActionListener(this);
        btnDBloadbalancer.addActionListener(this);
        btnOptimaliseren.addActionListener(this);
        btnMonitoren.addActionListener(this);
        btnOpslaan.addActionListener(this);
        
        
        // Applicatie scherm zichtbaar maken
        setVisible(true);
    }

//  METHODS

    public void actionPerformed(ActionEvent e) {
        
        // Code voor toevoegen pfSense 
        if(e.getSource() == btnPFsense){
            jPanel5.add(lbPFsense);
            lbPFsense.setMaximumSize(new Dimension(100, 450)); //Maximum size moet in boxlayout gebruikt worden om te centeren
            lbPFsense.setFont(new Font("Plain", Font.PLAIN, 20));
            lbPFsense.setForeground(Color.WHITE);
            lbPFsense.setAlignmentX(CENTER_ALIGNMENT);   
        }
        // Code voor toevoegen netwerk servers
        // componentCount houdt bij hoeveel componenten er zijn toegevoegd
        // <servernaam>counter houdt bij hoeveel van die component er zijn toegevoegd
        if(e.getSource() == btnHAL9001W && componentCount < 11){
            
            jPanel6.add(lbHAL9001W);
            lbHAL9001W.setMaximumSize(new Dimension(150, 150)); 
            lbHAL9001W.setFont(new Font("Plain", Font.PLAIN, 20));
            lbHAL9001W.setForeground(Color.WHITE);
            lbHAL9001W.setAlignmentX(CENTER_ALIGNMENT);
            componentCount ++;
            HAL9001Wcounter ++;
            lbHAL9001W.setText("HAL9001W x " + HAL9001Wcounter );
            
        }
        if(e.getSource() == btnHAL9002W && componentCount < 11){
            
            jPanel6.add(lbHAL9002W);
            lbHAL9002W.setMaximumSize(new Dimension(150, 150)); 
            lbHAL9002W.setFont(new Font("Plain", Font.PLAIN, 20));
            lbHAL9002W.setForeground(Color.WHITE);
            lbHAL9002W.setAlignmentX(CENTER_ALIGNMENT);
            componentCount ++;
            HAL9002Wcounter ++;
            lbHAL9002W.setText("HAL9002W x " + HAL9002Wcounter );
            
        }
        if(e.getSource() == btnHAL9003W && componentCount < 11){
            
            jPanel6.add(lbHAL9003W);
            lbHAL9003W.setMaximumSize(new Dimension(150, 150)); 
            lbHAL9003W.setFont(new Font("Plain", Font.PLAIN, 20));
            lbHAL9003W.setForeground(Color.WHITE);
            lbHAL9003W.setAlignmentX(CENTER_ALIGNMENT);
            componentCount ++;
            HAL9003Wcounter ++;
            lbHAL9003W.setText("HAL9003W x " + HAL9003Wcounter );       
        }
        // Code voor toevoegen DBloadbalancer
        if(e.getSource() == btnDBloadbalancer){
            jPanel7.add(lbDBloadbalancer);
            lbDBloadbalancer.setMaximumSize(new Dimension(150, 450)); 
            lbDBloadbalancer.setFont(new Font("Plain", Font.PLAIN, 20));
            lbDBloadbalancer.setForeground(Color.WHITE);
            lbDBloadbalancer.setAlignmentX(CENTER_ALIGNMENT); 
        }
        // Code voor toevoegen database servers
        // Gebruikt zelfde methode van toevoegen als webservers
        if(e.getSource() == btnHAL9001DB && componentCount < 11){
            
            jPanel8.add(lbHAL9001DB);
            lbHAL9001DB.setMaximumSize(new Dimension(150, 150)); 
            lbHAL9001DB.setFont(new Font("Plain", Font.PLAIN, 20));
            lbHAL9001DB.setForeground(Color.WHITE);
            lbHAL9001DB.setAlignmentX(CENTER_ALIGNMENT);
            componentCount ++;
            HAL9001DBcounter ++;
            lbHAL9001DB.setText("HAL9001DB x " + HAL9001DBcounter );
            
        }
        if(e.getSource() == btnHAL9002DB && componentCount < 11){
            
            jPanel8.add(lbHAL9002DB);
            lbHAL9002DB.setMaximumSize(new Dimension(150, 150)); 
            lbHAL9002DB.setFont(new Font("Plain", Font.PLAIN, 20));
            lbHAL9002DB.setForeground(Color.WHITE);
            lbHAL9002DB.setAlignmentX(CENTER_ALIGNMENT);
            componentCount ++;
            HAL9002DBcounter ++;
            lbHAL9002DB.setText("HAL9002DB x " + HAL9002DBcounter );
            
        }
        if(e.getSource() == btnHAL9003DB && componentCount < 11){
            
            jPanel8.add(lbHAL9003DB);
            lbHAL9003DB.setMaximumSize(new Dimension(150, 150)); 
            lbHAL9003DB.setFont(new Font("Plain", Font.PLAIN, 20));
            lbHAL9003DB.setForeground(Color.WHITE);
            lbHAL9003DB.setAlignmentX(CENTER_ALIGNMENT);
            componentCount ++;
            HAL9003DBcounter ++;
            lbHAL9003DB.setText("HAL9003DB x " + HAL9003DBcounter ); 
        }
    
    } 
}
