package underground_arena.weapons;

public class SoldierWeapon extends Weapon{

    public SoldierWeapon() {
        name = "It's a Soldier Weapon";
    }

    @Override
    public void setGun(int type) {
        switch (type) {
            case (1) -> name = "It's a Soldier Weapon \"Type A\"";
            case (2) -> name = "It's a Soldier Weapon \"Type B\"";
        }
    }
}