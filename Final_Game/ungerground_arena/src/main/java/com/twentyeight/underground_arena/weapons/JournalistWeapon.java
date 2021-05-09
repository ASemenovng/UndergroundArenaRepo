package underground_arena.weapons;

public class JournalistWeapon extends Weapon{

    public JournalistWeapon() {
        name = "It's a Journalist Weapon";
    }

    @Override
    public void setGun(int type) {
        switch (type) {
            case (1) -> name = "It's a Journalist Weapon \"Type A\"";
            case (2) -> name = "It's a Journalist Weapon \"Type B\"";
        }
    }
}
