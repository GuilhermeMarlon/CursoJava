import java.util.Scanner;

public class FuncaoRepeti {// tem que ser o mesmo nome do arquivo 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números para somar (digite 0 para sair):");
        int soma = 0;
        int numero = -1;

        while (numero != 0) {//ele testa a condição antes de entrar no "enquanto"
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
        
        System.out.print("Digite um número para se repetir: ");
        numero = sc.nextInt();
        soma= 0;

        for (int i = 0; i < numero; i++) { 
           System.out.print("Digite um número para somar :");
           int nume =sc.nextInt(); 
           soma += nume;
        }
        System.out.println("A soma dos números é: " + soma);

        do {//ele entra no "faça" e depois testa a condição
            System.out.println("Digia temperatura em Celsius para converter em Fahrenheit:");
            double celsius = sc.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
        } while (sc.next().charAt(0) != 'n');
        
        



        sc.close();
    }

    
}
