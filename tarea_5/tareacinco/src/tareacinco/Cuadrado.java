package tareacinco;

public class Cuadrado extends Formas {

    private double area;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public double CalcularArea(double paramLadoUno, double paramLadoDos) {
        double lado1 = paramLadoUno; 
        double lado2 = paramLadoDos;

        double resultado = lado1 * lado2;

        return resultado;
    }

    @Override
    public String Dibujar() {
        return "Forma Cuadrado";
    }

}
