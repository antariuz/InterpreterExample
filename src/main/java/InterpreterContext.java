public class InterpreterContext {

    public String getKelvinFormat(double i) {
        return Double.toString(i + 273.15d);
    }

    public String getFahrenheitFormat(double i) {
        return Double.toString((i * 9 / 5) + 32);
    }
}
