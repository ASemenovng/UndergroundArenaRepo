package com.twentyeight.underground_arena;

import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.weapons.IWeapon;

public interface IBuilder {
    void setGender(Gender gender);
    void setWeapon(IWeapon iWeapon);
    void setClothes(IClothes clothes);
}
