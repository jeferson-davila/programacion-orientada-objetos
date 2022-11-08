package tareauno;

public class Cinco {

    public static void main(String[] args) {
        String[][] companieros = {{"Marlon", "Carias", "Ing Industrial", "La Mundial"}, {"Mark", "Garcia", "Ing Industrial", "Corso"}, {"Fernando", "Zamora", "Electronica", "Trabajo y Estudio"}, {"Ayniver", "Chavarria", "Ing Produccion Industrial", "Emprendimiento Personal"}, {"Kevin", "Rivas", "Ing Electronica", "OHMSA"}};

        for (int i = 0; i < companieros.length; i++) {
            for (int j = 0; j < companieros[i].length; j++) {
                System.out.print(" " + companieros[i][j]);
            }
            System.out.println();
        }   
    }

}
