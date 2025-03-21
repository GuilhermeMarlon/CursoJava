import java.util.Scanner;

/**
 * A classe CalculadoraSimples demonstra o uso de funções (métodos) em Java
 * para realizar operações matemáticas básicas, como soma, subtração,
 * multiplicação e divisão.
 */
public class CalculadoraSimples {

    /**
     * Método principal que executa o programa.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Simples!");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite sua escolha: ");
        int escolha = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado;

        // Chama a função correspondente com base na escolha do usuário
        switch (escolha) {
            case 1 -> {
                resultado = somar(num1, num2);
                System.out.printf("Resultado da soma: %.2f%n", resultado);
            }
            case 2 -> {
                resultado = subtrair(num1, num2);
                System.out.printf("Resultado da subtração: %.2f%n", resultado);
            }
            case 3 -> {
                resultado = multiplicar(num1, num2);
                System.out.printf("Resultado da multiplicação: %.2f%n", resultado);
            }
            case 4 -> {
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                    System.out.printf("Resultado da divisão: %.2f%n", resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
            }
            default -> System.out.println("Opção inválida!");
        }

        sc.close();
    }

    /**
     * Realiza a soma de dois números.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O resultado da soma de a e b.
     */
    public static double somar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O resultado da subtração de a por b.
     */
    public static double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O resultado da multiplicação de a por b.
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     * 
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return O resultado da divisão de a por b.
     * @throws ArithmeticException Se b for igual a zero.
     */
    public static double dividir(double a, double b) {
        return a / b;
    }
}