package Builder;

public class ChimeraBuilder extends AnimalBuilder {

    @Override
    public void setHead() {
        animal.setHead("Lion head");
    }

    @Override
    public void setBody() {
        animal.setBody("Goat body");
    }

    @Override
    public void setTail() {
        animal.setTail("Snake tail");
    }
}
