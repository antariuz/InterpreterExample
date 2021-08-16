public class CelsiusToKelvinExpression implements Expression {
    private final double k;

    public CelsiusToKelvinExpression(double k) {
        this.k = k;
    }

    @Override
    public String interpret(InterpreterContext context) {
        return context.getKelvinFormat(this.k);
    }
}
