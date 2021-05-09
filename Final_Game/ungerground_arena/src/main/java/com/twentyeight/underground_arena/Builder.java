package com.twentyeight.underground_arena;

import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.weapons.IWeapon;

import java.awt.event.KeyEvent;
import static com.twentyeight.underground_arena.Variables.factory;

public class Builder implements IBuilder {
    @Override
    public void setGender(Gender gender) {
        switch (gender){
            case MALE:
                System.out.println ("You choose male");
            case FEMALE:
                System.out.println ("You choose female");
        }

    }

    @Override
    public void setWeapon(IWeapon iWeapon) {
        IWeapon journalistWeapon = factory.createWeapon();
        KeyEvent keyEvent = null;
        journalistWeapon.setGun (1);
    }

    @Override
    public void setClothes(IClothes iclothes) {
        IClothes journalistClothes = factory.createClothes ();
        KeyEvent keyEvent = null;
        journalistClothes.setClothes (1);    }
}
