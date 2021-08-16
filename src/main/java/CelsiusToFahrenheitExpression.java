public class CelsiusToFahrenheitExpression implements Expression {
    private final double f;

    public CelsiusToFahrenheitExpression(double f) {
        this.f = f;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getFahrenheitFormat(this.f);
    }
}
