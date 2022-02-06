package Memento;

public class CareTaker {
    private Originator.Save save;

    public void setSave(Originator.Save save) {
        this.save = save;
    }

    public Originator.Save getSave() {
        return save;
    }
}
