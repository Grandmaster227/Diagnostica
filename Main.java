import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação: ");
        System.out.println("+ - Soma");
        System.out.println(". - Multiplicação");
        System.out.println("- - Subtração");
        System.out.println("/ - Divisão");
        String operacao = scanner.next();

        System.out.println("Coloque um número: ");
        double numero = scanner.nextDouble();
        System.out.println("Coloque outro número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = calculadora.Somar(numero, numero2); // Corrigido
                break;
            case "-":
                resultado = calculadora.Subtrair(numero, numero2);
                break;
            case ".":
                resultado = calculadora.Multiplicar(numero, numero2);
                break;
            case "/":
                resultado = calculadora.Dividir(numero, numero2);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}