package tareacinco;

public class Circulo extends Formas {

    private double diametro;
    private double radio;

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double CalcularRadio(double paramDiametro) {
        double diam = paramDiametro;

        double resultado = diam / 2;

        return resultado;

    }

    @Override
    public String Dibujar() {
        return "Forma Circulo";
    }

}
