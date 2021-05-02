package com.company;

import java.awt.event.KeyEvent;

public class NotifierMove extends Notifier{

    private KeyEvent event;

    public NotifierMove(KeyEvent event){
        this.event = event;
    }

    @Override
    public boolean check(KeyEvent event) {
        int key = event.getKeyCode();
        if(key == KeyEvent.VK_LEFT ) {
            GameArea.playerDirection = Direction.LEFT;
        }
        if(key == KeyEvent.VK_RIGHT ) {
            GameArea.playerDirection = Direction.RIGHT;
        }

        if(key == KeyEvent.VK_UP ) {
            GameArea.playerDirection = Direction.UP;
        }

        if(key == KeyEvent.VK_DOWN ) {
            GameArea.playerDirection = Direction.DOWN;
        }
        return checkNext(event);
    }
}
