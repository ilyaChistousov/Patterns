package TemplateMethod;

public abstract class Work {
    public void work() {
        System.out.println("Worker came to work");
        doWork();
        System.out.println("Worker ended work");

    }

    public abstract void doWork();

}
