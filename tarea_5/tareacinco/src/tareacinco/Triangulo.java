package tareacinco;

public class Triangulo extends Formas {

    private double angulo;

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double CalcularArea(double paramBase, double paramAltura) {
        double base = paramBase;
        double alt = paramAltura;

        double resultado = (base * alt) / 2;

        return resultado;

    }

    @Override
    public String Dibujar() {
        return "Forma Triangulo";
    }

}
