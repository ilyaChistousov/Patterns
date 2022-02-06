package AbstractFactory.Game1;

import AbstractFactory.DamageDealer;

public class DamageDealerInGame1 implements DamageDealer {
    @Override
    public void dealDamage() {
        System.out.println("DD in 'game 1' deal damage");
    }
}
