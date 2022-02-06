package Builder;

public class CatBuilder extends AnimalBuilder {

    @Override
    public void setHead() {
        animal.setHead("Cat head");
    }

    @Override
    public void setBody() {
        animal.setBody("Cat body");
    }

    @Override
    public void setTail() {
        animal.setTail("Cat tail");
    }
}
