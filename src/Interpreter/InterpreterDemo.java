package Interpreter;


public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isHuman = orExpression();
        Expression isProfessional = andExpression();
        System.out.println(isHuman.interpret("Clever Human"));
        System.out.println(isProfessional.interpret("Professional Clever Human"));
    }

    private static Expression orExpression() {
        Expression human = new TerminalExpression("Human");
        Expression animal = new TerminalExpression("Clever animal");

        return new OrExpression(human, animal);
    }

    private static Expression andExpression() {
        Expression human = new TerminalExpression("Clever Human");
        Expression professional = new TerminalExpression("Professional");

        return new AndExpression(human, professional);
    }
}
