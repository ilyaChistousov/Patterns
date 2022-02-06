package AbstractFactory.Game2;

import AbstractFactory.DamageDealer;

public class DamageDealerInGame2 implements DamageDealer {
    @Override
    public void dealDamage() {
        System.out.println("DD in 'game 2' deal damage");
    }
}
