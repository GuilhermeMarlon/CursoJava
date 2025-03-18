import java.util.Locale;//Importa a classe Locale para mudar a formatação de casas decimais.

public class SaindaDados {
    public static void main(String[] args) throws Exception {
        double a = 10.357951;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        
        System.out.println("Hello, World!");
        System.out.printf("%.2f%n" , a);//formatação com duas casas decimais.
        Locale.setDefault(Locale.US);//Muda a virula por ponto nas casas decimais, que estão abaixo desse comando.
        System.out.printf("%.2f%n" , a);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda); 
        /*%s é usado para strings.
          %d é usado para inteiros.
          %.2f é usado para números de ponto flutuante com duas casas decimais.
          %n é usado para uma nova linha. */
        idade =(int) a ;  //casting de double para int.
        System.out.println(idade);
        
    }
}
