package tareatres;

public class TareaTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Jeferson Ariel");
        estudiante.setApellido("Davila Maradiaga");
        estudiante.setCarrera("Ingenieria en Produccion Industrial");
        estudiante.setNumeroCuenta("202210110077");
        
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getApellido());
        System.out.println(estudiante.getCarrera());
        System.out.println(estudiante.getNumeroCuenta());
    }

}

class Estudiante {

    String nombre;
    String apellido;
    String carrera;
    String numeroCuenta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

}
