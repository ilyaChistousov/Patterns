package AbstractFactory;

import AbstractFactory.Game1.PartyFinderInGame1;
import AbstractFactory.Game2.PartyFinderInGame2;

public class Game {
    public static void main(String[] args) {
        PartyFactory partyFactory = new PartyFinderInGame2();
        DamageDealer damageDealer = partyFactory.findDD();
        Tank tank = partyFactory.findTank();
        Healer healer = partyFactory.findHealer();

        System.out.println("Going in the deep of dungeon...");
        tank.tanking();
        damageDealer.dealDamage();
        healer.heal();
    }
}
