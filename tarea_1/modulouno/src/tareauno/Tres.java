package tareauno;

public class Tres {

    public static void main(String[] args) {
        int m = 6;
        int t = 1;
        int k = -10;
        boolean evaluacion1;
        boolean evaluacion2;
        boolean evaluacion3;

        evaluacion1 = m > t;
        evaluacion2 = t / k == -5;
        evaluacion3 = (m + t == 7) || (m - t == 5);

        System.out.println("M>T da: " + evaluacion1);
        System.out.println("T/K == -5 da: " + evaluacion2);
        System.out.println("(M+T==7) o (M-T==5) da: " + evaluacion3);
    }
}
