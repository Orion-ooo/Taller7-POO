
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_Auto {
    public static String marca = "Audi";
    
    public static void cambiarMostrar(){
        // marca = "Porsh"; error por intentar modificar un atributo no estatico desde un metodo estatico
        //System.out.println("marca del automovil: " + marca); error por intentar acceder a un atributo no estatico desde un metodo estatico
         
        //para ello hay que declarar esa variable como estatica o declarar el metodo cambiarMostrar como no estatico
        marca = "Porsh";
        System.out.println("marca del automovil: " + marca);
    }
}
