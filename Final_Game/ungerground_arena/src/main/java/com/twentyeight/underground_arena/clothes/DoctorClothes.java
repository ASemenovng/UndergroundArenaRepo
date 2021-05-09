package com.twentyeight.underground_arena.clothes;

public class DoctorClothes extends Clothes {

    public DoctorClothes() {
        name = "It's a Doctor Clothes";
    }

    @Override
    public void setClothes(int type) {
        switch (type) {
            case (1) -> name = "It's a Doctor Clothes \"Type A\"";
            case (2) -> name = "It's a Doctor Clothes \"Type B\"";
            case (3) -> name = "It's a Doctor Clothes \"Type C\"";
        }
    }
}
