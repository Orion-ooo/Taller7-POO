
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Coche {
    public String marca;
    public int modelo;
    public static int contadorCoches;

    public Ej1_Coche() {
        contadorCoches++;
    }
    public static void mostrarNumCoches(){
        System.out.println("hay " + contadorCoches + " por el momento");
    }
}
