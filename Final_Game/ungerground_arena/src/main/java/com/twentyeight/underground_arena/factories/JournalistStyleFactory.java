package com.twentyeight.underground_arena.factories;

import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.clothes.JournalistClothes;
import com.twentyeight.underground_arena.weapons.IWeapon;
import com.twentyeight.underground_arena.weapons.JournalistWeapon;

public class JournalistStyleFactory implements StyleFactory {
    @Override
    public IWeapon createWeapon() {
        return new JournalistWeapon();
    }

    @Override
    public IClothes createClothes() {
        return new JournalistClothes();
    }
}