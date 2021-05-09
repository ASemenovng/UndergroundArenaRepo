package com.twentyeight.underground_arena.clothes;

public class SoldierClothes extends Clothes {

    public SoldierClothes() {
        name = "It's a Soldier Clothes";
    }

    @Override
    public void setClothes(int type) {
        switch (type) {
            case (1) -> name = "It's a Soldier Clothes \"Type A\"";
            case (2) -> name = "It's a Soldier Clothes \"Type B\"";
            case (3) -> name = "It's a Soldier Clothes \"Type C\"";
        }
    }
}
