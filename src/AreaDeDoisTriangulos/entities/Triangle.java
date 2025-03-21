package AreaDeDoisTriangulos.entities;

public class Triangle {
    private double a;
    private double b;
    private double c;

    // Getters e Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /**
     * Calcula a área do triângulo usando a fórmula de Heron.
     * 
     * @return A área do triângulo.
     */
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

