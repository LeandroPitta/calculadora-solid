import java.util.Scanner;

public class Calculadora {

    public void processamento() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome da operação que deseja: ");
            Operacao operacaoEscolhida = Operacao.valueOf(scanner.next().toUpperCase());

            System.out.print("Digite o primeiro número a ser calculado: ");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("Digite o segundo número a ser calculado: ");
            double segundoNumero = scanner.nextDouble();

            double resultado = operacaoEscolhida.getCalculo().calcular(primeiroNumero, segundoNumero);
            System.out.println("O resultado é " + resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("Operação não suportada.");
        }
    }
}