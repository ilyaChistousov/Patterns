package AbstractFactory.Game1;

import AbstractFactory.Healer;

public class HealerInGame1 implements Healer {
    @Override
    public void heal() {
        System.out.println("Healer in 'Game 1' healing");
    }
}
