package com.twentyeight.underground_arena;

import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.weapons.IWeapon;

import java.awt.event.KeyEvent;

public class Player {
    private int X = 0;
    private int Y = 0;
    private int Speed = 2;
    private int MapX = 0;
    private int MapY = 0;
    private IWeapon weapon;
    private IClothes clothes;
    Direction playerDirection = Direction.NONE;

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {return weapon;}

    public void setClothes(IClothes clothes) {
        this.clothes = clothes;
    }

    public IClothes getClothes() {return clothes;}

    public int getSpeed() {
        return Speed;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getMapX() {
        return MapX;
    }

    public int getMapY() {
        return MapY;
    }

    public void move(){
        switch(playerDirection) {
            case UP:
                MapY+=Speed;
                break;
            case DOWN:
                MapY-=Speed;
                break;
            case LEFT:
                MapX+=Speed;
                break;
            case RIGHT:
                MapX-=Speed;
                break;
            default:
                break;
        }

    }

    public void keyPressed(KeyEvent keyEvent) {
        int key = keyEvent.getKeyCode ();
        if(key == KeyEvent.VK_W) {
            playerDirection = Direction.UP;
        }
        if(key == KeyEvent.VK_S) {
            playerDirection = Direction.DOWN;
        }
        if(key == KeyEvent.VK_A) {
            playerDirection = Direction.LEFT;
        }
        if(key == KeyEvent.VK_D) {
            playerDirection = Direction.RIGHT;
        }
    }

    public void keyReleased(KeyEvent keyEvent){

    }
}
