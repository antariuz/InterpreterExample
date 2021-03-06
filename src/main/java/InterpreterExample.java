public class InterpreterExample {
    private final InterpreterContext context;

    public InterpreterExample(InterpreterContext context) {
        this.context = context;
    }

    public String interpret(String str) {
        Expression expression;
        double k = Double.parseDouble(str.substring(0, str.indexOf(" ")));
        if (str.contains("K")) expression = new CelsiusToKelvinExpression(k);
        else if (str.contains("F")) expression = new CelsiusToFahrenheitExpression(k);
        else return str;
        return expression.interpret(context);
    }

    public static void main(String[] args) {
        String str = "0 to K";
        InterpreterExample te = new InterpreterExample(new InterpreterContext());
        System.out.println(str + " is " + te.interpret(str));

    }
}
