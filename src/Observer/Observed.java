package Observer;

public interface Observed {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();
}
