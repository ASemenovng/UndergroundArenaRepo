package com.twentyeight.underground_arena.factories;

import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.weapons.IWeapon;

public interface StyleFactory {
    IWeapon createWeapon();
    IClothes createClothes();
}
