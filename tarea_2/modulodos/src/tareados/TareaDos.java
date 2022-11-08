package tareados;

import java.util.Arrays;

public class TareaDos {

    public static void main(String[] args) {

        Recursos recursos = new Recursos();
        recursos.saludo();
        recursos.mayorOMenorDeEdad(21);
        System.out.println("Multiplicacion: " + recursos.multiplicacion(50.4, 20.8));
        
        System.out.println(Arrays.toString(recursos.listadoNumeros(20)));
        
    }

}

class Recursos {

    public void saludo() {
        System.out.println("Programacion Orientada a Objetos 2021");
    }

    public void mayorOMenorDeEdad(int edad) {
        int edadestudiante = edad;

        if (edadestudiante >= 21) {
            System.out.println("Mayor de Edad");
        } else {
            System.out.println("Menor de Edad");
        }
    }

    public double multiplicacion(double uno, double dos) {
        double numero1 = uno;
        double numero2 = dos;

        double resultado = numero1 * numero2;

        return resultado;
    }
    
    public float[] listadoNumeros(int x) {
        int numeroMaximo = x;
        
        float numeros[] = new float[numeroMaximo];
        
        for (int i = 0; i < numeroMaximo; i++) {
            numeros[i] = i + 1;
        }
        return numeros;
    }
}
