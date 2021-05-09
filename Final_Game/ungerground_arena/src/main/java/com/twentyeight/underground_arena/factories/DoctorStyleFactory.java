package com.twentyeight.underground_arena.factories;

import com.twentyeight.underground_arena.clothes.DoctorClothes;
import com.twentyeight.underground_arena.clothes.IClothes;
import com.twentyeight.underground_arena.weapons.DoctorWeapon;
import com.twentyeight.underground_arena.weapons.IWeapon;

public class DoctorStyleFactory implements StyleFactory {
    @Override
    public IWeapon createWeapon() {
        return new DoctorWeapon();
    }

    @Override
    public IClothes createClothes() {
        return new DoctorClothes();
    }
}
