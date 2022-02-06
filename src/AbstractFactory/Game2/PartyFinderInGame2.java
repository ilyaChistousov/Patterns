package AbstractFactory.Game2;

import AbstractFactory.DamageDealer;
import AbstractFactory.Game1.DamageDealerInGame1;
import AbstractFactory.Game1.HealerInGame1;
import AbstractFactory.Game1.TankInGame1;
import AbstractFactory.Healer;
import AbstractFactory.PartyFactory;
import AbstractFactory.Tank;

public class PartyFinderInGame2 implements PartyFactory {
    @Override
    public DamageDealer findDD() {
        return new DamageDealerInGame2();
    }

    @Override
    public Tank findTank() {
        return new TankInGame2();
    }

    @Override
    public Healer findHealer() {
        return new HealerInGame2();
    }
}
