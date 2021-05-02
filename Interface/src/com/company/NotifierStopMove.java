package com.company;

import java.awt.event.KeyEvent;

public class NotifierStopMove extends Notifier{

    private KeyEvent event;

    public NotifierStopMove(KeyEvent event){
        this.event = event;
    }
    @Override
    public boolean check(KeyEvent event) {
        int key = event.getKeyCode();
        if(key == KeyEvent.VK_LEFT )
            GameArea.playerDirection = Direction.NONE;
        if(key == KeyEvent.VK_RIGHT )
            GameArea.playerDirection = Direction.NONE;

        if(key == KeyEvent.VK_UP )
            GameArea.playerDirection = Direction.NONE;

        if(key == KeyEvent.VK_DOWN )
            GameArea.playerDirection =  Direction.NONE;
        return checkNext(event);
    }
}
