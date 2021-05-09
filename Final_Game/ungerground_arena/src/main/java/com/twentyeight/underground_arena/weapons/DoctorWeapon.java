package underground_arena.weapons;

public class DoctorWeapon extends Weapon{

    public DoctorWeapon() {
        name = "It's a Doctor Weapon";
    }

    @Override
    public void setGun(int type) {
        switch (type) {
            case (1) -> name = "It's a Doctor Weapon \"Type A\"";
            case (2) -> name = "It's a Doctor Weapon \"Type B\"";
        }
    }
}
