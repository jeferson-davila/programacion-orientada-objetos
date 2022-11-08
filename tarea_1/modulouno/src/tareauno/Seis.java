package tareauno;

public class Seis {

    public static void main(String[] args) {
        String estudiante = "Jeferson Ariel Davila Maradiaga";
        int notaClase = 59;
        String condicion;

        if (notaClase < 70) {
            condicion = "Reprobado";
        } else {
            condicion = "Aprobado";
        }
        
        System.out.print("Nombre: " + estudiante + " | Nota: " + notaClase + " | Evaluacion: " + condicion);
    }
}
