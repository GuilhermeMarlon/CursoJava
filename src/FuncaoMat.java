public class FuncaoMat {
    public static void main(String[] args) throws Exception {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);//raiz quadrada
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        double D = Math.pow(x, y); //potenciação (x elevado a y)
        double E = Math.pow(x, 2.0);
        double F = Math.pow(5.0, 2.0);
        double G = Math.abs(y);//valor absoluto
        double H = Math.abs(z);

        System.out.println("A raiz quadrada de " + x + " é " + A);
        System.out.println("A raiz quadrada de " + y + " é " + B);
        System.out.println("A raiz quadrada de 25 é " + C);
        System.out.println(x + " elevado a " + y + " é " + D);
        System.out.println(x + " elevado ao quadrado é " + E);
        System.out.println("5 elevado ao quadrado é " + F);
        System.out.println("O valor absoluto de " + y + " é " + G);
        System.out.println("O valor absoluto de " + z + " é " + H);
    }
}
