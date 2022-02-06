package AbstractFactory;

public interface PartyFactory {
    DamageDealer findDD();
    Tank findTank();
    Healer findHealer();
}
