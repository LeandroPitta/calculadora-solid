public class Divisao implements Calculo {

    @Override
    public double calcular(double a, double b) {

        if (b != 0) {
            return a / b;
        }
        return 0;
    }
}
