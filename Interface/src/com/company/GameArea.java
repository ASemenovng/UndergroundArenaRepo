package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameArea extends JPanel implements ActionListener {
    private int speed = 10;
    private Image hero;
    private Image mob;
    private int heroX;
    private int heroY;
    private int mobX;
    private  int mobY;
    private int mobStep = Integer.MAX_VALUE;
    public static Direction playerDirection = Direction.NONE;
    Timer timer;


    public GameArea(){
        setBackground(Color.black);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
        timer = new Timer(150, this);
        timer.start();
    }

    public void initGame(){
        createDot();
        createMob();
        checkWin();
    }

    private void checkWin() {
        if(heroX >= 1800 && heroY >= 800) {
            System.out.println("You win");
        }
    }

    public void createDot(){
        heroX = 0;
        heroX = 0;
    }

    public void createMob(){
        mobX = new Random().nextInt(1800);
        mobY = new Random().nextInt(800);
    }

    public void loadImages(){
        ImageIcon imageIcon = new ImageIcon("doc.png");
        ImageIcon imageIconMob = new ImageIcon("mob.png");
        hero = imageIcon.getImage();
        mob = imageIconMob.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(hero, heroX, heroY, this);
        g.drawImage(mob, mobX, mobY, this);
    }

    public void move(){
        switch(playerDirection) {
            case UP:
                heroY -= speed;
                break;
            case DOWN:
                heroY+= speed;
                break;
            case LEFT:
                heroX-= speed;
                break;
            case RIGHT:
                heroX+= speed;
                break;
            default:
                break;
        }

        while (Math.pow((heroX - mobX) * (heroX - mobX) + (heroY - mobY) * (heroY - mobY), 1./2) > 100){
            --mobStep;
            if(heroX - mobX > 0){
                mobX++;
            }
            else if(heroX - mobX < 0){
                mobX--;
            }
            if(heroY - mobY > 0){
                mobY++;
            }
            else if(heroY - mobY < 0){
                mobY--;
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }


    class FieldKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent event) {
            super.keyPressed(event);
            NotifierMove notifierMove = new NotifierMove(event);
            notifierMove.check(event);

        }

        @Override
        public void keyReleased(KeyEvent event){
            super.keyReleased(event);
            NotifierStopMove notifierStopMove = new NotifierStopMove(event);
            notifierStopMove.check(event);

        }



    }

}
