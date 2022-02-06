package AbstractFactory.Game1;

import AbstractFactory.DamageDealer;
import AbstractFactory.Healer;
import AbstractFactory.PartyFactory;
import AbstractFactory.Tank;

public class PartyFinderInGame1 implements PartyFactory {
    @Override
    public DamageDealer findDD() {
        return new DamageDealerInGame1();
    }

    @Override
    public Tank findTank() {
        return new TankInGame1();
    }

    @Override
    public Healer findHealer() {
        return new HealerInGame1();
    }
}
