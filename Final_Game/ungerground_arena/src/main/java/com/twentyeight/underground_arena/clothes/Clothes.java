package com.twentyeight.underground_arena.clothes;

public class Clothes implements IClothes {
    String name;

    public Clothes() {
        name = "someone's clothes";
    }

    @Override
    public void setClothes(int type) {
        switch (type) {
            case (1) -> name = "It's a someone's Clothes \"Type A\"";
            case (2) -> name = "It's a someone's Clothes \"Type B\"";
            case (3) -> name = "It's a someone's Clothes \"Type C\"";
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
