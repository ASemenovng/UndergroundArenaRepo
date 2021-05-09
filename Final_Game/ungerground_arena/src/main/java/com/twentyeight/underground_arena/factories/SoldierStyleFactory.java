package com.twentyeight.underground_arena.factories;

import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.clothes.SoldierClothes;
import com.twentyeight.underground_arena.weapons.IWeapon;
import com.twentyeight.underground_arena.weapons.SoldierWeapon;

public class SoldierStyleFactory implements StyleFactory {
    @Override
    public IWeapon createWeapon() {
        return new SoldierWeapon();
    }

    @Override
    public IClothes createClothes() {
        return new SoldierClothes();
    }
}