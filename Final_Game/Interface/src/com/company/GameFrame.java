package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {

    GameArea gameArea = new GameArea();

    public GameFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        add(gameArea);
        setVisible(true);
    }

    public void setName(String name) {
        gameArea.setName(name);
    }

}
