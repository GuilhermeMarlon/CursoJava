import java.util.Scanner;
//Para oder fazer entrada pelo terminal em java precissa importar o pacote Scanner.
//Para poder usar o Scanner é preciso instanciar um objeto Scanner. "Scanner sc = new Scanner(System.in);".
//Para instanciar um objeto Scanner é preciso passar o System.in como argumento.
//Para ler uma string é preciso usar o método nextLine().
//Para ler um número inteiro é preciso usar o método nextInt().
//Para ler um número de ponto flutuante é preciso usar o método nextDouble().
//Para ler um caractere é preciso usar o método next().charAt(0).
//Para ler um número de ponto flutuante com vírgula é preciso usar o método next().replace(',', '.').
//Para ler um número de ponto flutuante com vírgula é preciso usar o método next().replace(',', '.').toDouble().
public class EntradaDados {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char w;

        x = sc.next();// next() lê a primeira palavra digitada, nextLine() lê a linha inteira digitada.
        // caso o proximo comando para receber um dado seja um nextLine() ele vai pagar um espaço vazio e não vai esperar a entrada do dado.
        // para resolver isso é preciso colocar um sc.nextLine(); antes do comando nextLine() para limpar o buffer.
        y = sc.nextInt();
        z = sc.nextDouble();
        w = sc.next().charAt(0);// obs caso digite mais de um caractere ele pega o primeiro caractere.

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);




        sc.close();
    }
}
