package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    String person;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;

    JButton button;
    JButton buttonTypeS;
    JButton buttonTypeD;
    JButton buttonTypeJ;
    JLabel labelSoldier;
    JLabel labelDoc;
    JLabel labelJournalist;
    String name;
    MyFrame(){

        buttonTypeS = new JButton ();
        buttonTypeS.setBounds (100,100,100,50);
        buttonTypeS.setText ("Soldier");
        buttonTypeS.setFocusable (false);
        buttonTypeS.addActionListener (this);
        buttonTypeS.setFont (new Font ("Comic", Font.BOLD,17));
        buttonTypeS.setForeground (Color.blue);
        buttonTypeS.setBackground (Color.lightGray);

        buttonTypeD = new JButton ();
        buttonTypeD.setBounds (100,100,100,50);
        buttonTypeD.setText ("Doctor");
        buttonTypeD.setFocusable (false);
        buttonTypeD.addActionListener (this);
        buttonTypeD.setFont (new Font ("Comic", Font.BOLD,17));
        buttonTypeD.setForeground (Color.blue);
        buttonTypeD.setBackground (Color.lightGray);

        buttonTypeJ = new JButton ();
        buttonTypeJ.setBounds (100,100,100,50);
        buttonTypeJ.setText ("Journalist");
        buttonTypeJ.setFocusable (false);
        buttonTypeJ.addActionListener (this);
        buttonTypeJ.setFont (new Font ("Comic", Font.BOLD,17));
        buttonTypeJ.setForeground (Color.blue);
        buttonTypeJ.setBackground (Color.lightGray);

        JLabel labelType = new JLabel ();
        labelType.setText ("Choose your hero");
        labelType.setForeground (Color.white);

        //создаем 3 panel
        panel1 = new JPanel ();
        panel1.setBackground (Color.black);
        panel1.setBounds (0, 0, 1200,300);
        panel1.add (labelType);
        panel1.add (buttonTypeS);
        panel1.add (buttonTypeD);
        panel1.add (buttonTypeJ);

        button = new JButton ();
        button.setBounds (500,120,800,320);
        button.setText ("Start game");
        button.setFocusable (false);
        button.addActionListener (this);
        button.setFont (new Font ("Comic", Font.BOLD,17));
        button.setForeground (Color.blue);
        button.setBackground (Color.lightGray);

        panel2 = new JPanel ();
        panel2.setBackground (Color.black);
        panel2.setBounds (0, 300, 1200,300);
        panel2.add (button);

        Border borderSoldier = BorderFactory.createLineBorder (Color.green, 5);
        ImageIcon iconSoldier = new ImageIcon ("soldier1.png");

        Border borderDoc = BorderFactory.createLineBorder (Color.white, 5);
        ImageIcon iconDoc = new ImageIcon ("doc.png");

        Border borderJon = BorderFactory.createLineBorder (Color.white, 5);
        ImageIcon iconJon = new ImageIcon ("photographer.png");

        labelSoldier = new JLabel ();
        labelSoldier.setText ("Your hero");
        labelSoldier.setIcon (iconSoldier);
        labelSoldier.setHorizontalTextPosition (JLabel.CENTER);
        labelSoldier.setVerticalTextPosition (JLabel.TOP);
        labelSoldier.setForeground (new Color (255,255,255));
        labelSoldier.setFont (new Font ("MV Boli", Font.BOLD, 15));
        //labelSoldier.setBorder (borderSoldier);
        labelSoldier.setVerticalAlignment (JLabel.CENTER);
        labelSoldier.setHorizontalAlignment (JLabel.CENTER);
        labelSoldier.setVisible (false);
        labelSoldier.setBounds (0,0,250,250);

        labelDoc = new JLabel ();
        labelDoc.setText ("Your hero");
        labelDoc.setIcon (iconDoc);
        labelDoc.setHorizontalTextPosition (JLabel.CENTER);
        labelDoc.setVerticalTextPosition (JLabel.TOP);
        labelDoc.setForeground (new Color (255,255,255));
        labelDoc.setFont (new Font ("MV Boli", Font.BOLD, 15));
        //labelDoc.setBorder (borderDoc);
        labelDoc.setVerticalAlignment (JLabel.CENTER);
        labelDoc.setHorizontalAlignment (JLabel.CENTER);
        labelDoc.setVisible (false);
        labelDoc.setBounds (0,0,250,250);

        labelJournalist = new JLabel ();
        labelJournalist.setText ("Your hero");
        labelJournalist.setIcon (iconJon);
        labelJournalist.setHorizontalTextPosition (JLabel.CENTER);
        labelJournalist.setVerticalTextPosition (JLabel.TOP);
        labelJournalist.setForeground (new Color (255,255,255));
        labelJournalist.setFont (new Font ("MV Boli", Font.BOLD, 15));
        //labelJournalist.setBorder (borderJon);
        labelJournalist.setVerticalAlignment (JLabel.CENTER);
        labelJournalist.setHorizontalAlignment (JLabel.CENTER);
        labelJournalist.setVisible (false);
        labelJournalist.setBounds (0,0,250,250);

        panel3 = new JPanel ();
        panel3.setBackground (Color.black);
        panel3.setBounds (0, 600, 1200,300);
        panel3.add (labelDoc);
        panel3.add (labelSoldier);
        panel3.add (labelJournalist);

        this.setTitle ("Start here");
        this.setSize (1200,900);
        this.setResizable (false);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.setVisible (true);
        this.getContentPane ().setBackground (Color.BLACK);
        this.setLayout (null);
        this.add (panel1);
        this.add (panel2);
        this.add (panel3);

    }

    @Override
    public void actionPerformed (ActionEvent actionEvent) {
        if(actionEvent.getSource () == buttonTypeS) {
            person = "soldier1.png";
            GameArea.setNameS();
            labelSoldier.setVisible(true);
            labelDoc.setVisible(false);
            labelJournalist.setVisible(false);

            if (Variables.factory != null)
                JOptionPane.showMessageDialog(null,
                        "Вы уже выбрали свой путь",
                        "Ошибка", JOptionPane.PLAIN_MESSAGE);
            else {
                Variables.factory = new SoldierStyleFactory();
            }
        }

        if(actionEvent.getSource () == buttonTypeD){
            person = "doc.png";
            GameArea.setNameD();
            labelSoldier.setVisible (false);
            labelJournalist.setVisible (false);
            labelDoc.setVisible (true);

            if (Variables.factory != null)
                JOptionPane.showMessageDialog (null,
                        "Вы уже выбрали свой путь",
                        "Ошибка", JOptionPane.PLAIN_MESSAGE);
            else {
                Variables.factory = new DoctorStyleFactory();
            }
        }

        if(actionEvent.getSource () == buttonTypeJ){
            person = "photographer.png";
            GameArea.setNameJ();
            labelSoldier.setVisible (false);
            labelDoc.setVisible (false);
            labelJournalist.setVisible (true);

            (Variables.factory != null)
            JOptionPane.showMessageDialog (null,
                    "Вы уже выбрали свой путь",
                    "Ошибка", JOptionPane.PLAIN_MESSAGE);
        else {
                Variables.factory = new JournalistStyleFactory();

            }

        if(actionEvent.getSource () == button){
            GameFrame gameFrame = new GameFrame();
            this.setVisible(false);
        }
    }
}
