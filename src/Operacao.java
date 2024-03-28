public enum Operacao {
    SOMA(new Soma()),
    SUBTRACAO(new Subtracao()),
    MULTIPLICACAO(new Multiplicacao()),
    DIVISAO(new Divisao());

    private final Calculo calculo;

    Operacao(Calculo calculo) {
        this.calculo = calculo;
    }

    public Calculo getCalculo() {
        return calculo;
    }
}
