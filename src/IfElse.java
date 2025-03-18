import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hora , X;

        System.out.println("função saudação digite 1, função conta digite 2: ");
        X = sc.nextInt();
        switch (X){ //estrutura condicional switch-case
            case 1:
            System.out.println("Digite a hora entre 0 e 24: ");
        hora = sc.nextInt();
        if (hora < 12) { //estrutura condicional composta
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }  break;
        case 2:
        System.out.println("Digite quantos minutos gastou do seu plano?") ;
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) { //estrutura condicional simples
            conta += (minutos - 100) * 2.0; //operadores de atribuição cumulativo
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        break;
        default:
        System.out.println("Opção inválida!");
        break;
        }

        sc.close();
    }

}
