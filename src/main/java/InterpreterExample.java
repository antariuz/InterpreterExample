public class InterpreterExample {
    public static void main(String[] args) {
        String str = "0 to F";
        TerminalExpression terminalExpression = new TerminalExpression(new InterpreterContext());
        System.out.println(str + " is " + terminalExpression.interpret(str));

    }
}
