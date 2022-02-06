package Proxy;

public class ProxyComputer implements Computer {

    private PersonalComputer personalComputer;



    @Override
    public void run() {
        if(personalComputer == null) {
            personalComputer = new PersonalComputer();
        }
        personalComputer.run();
    }
    
}
