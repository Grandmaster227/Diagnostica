public class Calculadora {

    public Calculadora() {
    }

    public double Somar(double a, double b) {
        return a + b;
    }

    public double Subtrair(double a, double b) {
        return a - b;
    }

    public double Multiplicar(double a, double b) {
        return a * b;
    }

    public double Dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Divisão por zero");
            return 0;
        }
        return a / b;
    }
}