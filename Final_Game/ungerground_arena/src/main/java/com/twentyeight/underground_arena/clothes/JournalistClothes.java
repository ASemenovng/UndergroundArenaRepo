package com.twentyeight.underground_arena.clothes;

public class JournalistClothes extends Clothes {

    public JournalistClothes() {
        name = "It's a Journalist Clothes";
    }

    @Override
    public void setClothes(int type) {
        switch (type) {
            case (1) -> name = "It's a Journalist Clothes \"Type A\"";
            case (2) -> name = "It's a Journalist Clothes \"Type B\"";
            case (3) -> name = "It's a Journalist Clothes \"Type C\"";
        }
    }
}
