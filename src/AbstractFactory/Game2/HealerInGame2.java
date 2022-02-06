package AbstractFactory.Game2;

import AbstractFactory.Healer;

public class HealerInGame2 implements Healer {
    @Override
    public void heal() {
        System.out.println("Healer in 'Game 2' healing");
    }
}
