
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Matematicas {
    public static double suma(double a, double b) {
        return a + b;
    }
    
    public static double resta(double a, double b) {
        return a - b;
    }
    
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    
    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("el denominador debe ser mayor a cero");
            return 0;
        }
    }
}
