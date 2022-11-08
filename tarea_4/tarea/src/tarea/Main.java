package tarea;

public class Main {

    public static void main(String[] args) {
        
        Futbolista fl = new Futbolista();
        fl.setEdad(32);
        fl.setEquipoActual("Olimpia");
        fl.setNombre("Brayan Escalante");
        
        System.out.println(fl.getNombre());
        System.out.println(fl.getEdad());
        System.out.println(fl.getEquipoActual());
        
        
        Marathon mt = new Marathon();
        Olimpia om = new Olimpia();
        Motagua mg = new Motagua();
        
        System.out.println(mt.getEquipo());
        System.out.println(mt.getCapitan());
        
        System.out.println(om.getEquipo());
        System.out.println(om.getCapitan());
        
        System.out.println(mg.getEquipo()); 
        System.out.println(mg.getCapitan());
               
    }

}
