package underground_arena.weapons;

public class Weapon implements IWeapon {
    String name;

    public Weapon() {
        name = "someone's weapon";
    }

    @Override
    public void setGun(int type) {
        if(type == 1)
            name = "It's a someone's Weapon \"Type A\"";
        else if(type == 2)
            name = "It's a someone's Weapon \"Type B\"";
        }

    @Override
    public String getName() {
        return name;
    }
}
