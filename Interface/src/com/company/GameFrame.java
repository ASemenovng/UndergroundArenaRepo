package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {

    public GameFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        add(new GameArea());
        setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
    }

}
