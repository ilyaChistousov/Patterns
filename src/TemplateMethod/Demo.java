package TemplateMethod;

public class Demo {
    public static void main(String[] args) {
        Work work = new BestWorker();
        Work work1 = new Worker();
        work.work();
        work1.work();
    }
}
