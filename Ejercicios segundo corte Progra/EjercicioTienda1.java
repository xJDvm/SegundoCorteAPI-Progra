import java.util.Scanner;

public class EjercicioTienda1 {
    public static void main (String [] args ) {

        
        //Objeto Scannner, declaracion de variable y mensajes de input
        Scanner sc = new Scanner (System.in);
        double variacion = 0;
        System.out.print("Ingrese valor del producto: ");
        int monto = sc.nextInt();

        System.out.println("Como desea pagar? [1] Contado - [2] Tarjeta ");
        int decision = sc.nextInt();


        //Este condicional impone que si la variable decision, tiene el dato 1 hara la operacion de sacar el 5% del monto y desplegar un mensaje donde concatena las varriables y hace la suma del monte y el descuento
        if (decision == 1){
            variacion = (monto * 0.05);
            System.out.println("Su producto tiene un precio de " + monto + " Bs. Y  se le dará un descuento del 5% (" + variacion + " Bs.). Su total a pagar es de: " + (monto-variacion) + " bs." );
        }
        //Se usa un Else if, traducido  al español como "Si no" hacer lo siguiente. Es un If alternativo al anterior, y hace la operacion de sacar el 3% del monto y sumarlo.
        else if (decision == 2) {
            variacion = (monto * 0.03);
            System.out.println("Su producto tiene un precio de " + monto + "Bs. Y se le sumará un recargo del 3% (" + variacion + " Bs.). Su total a pagar es de: " + (monto+variacion) + " bs.");
        }

        //Este else indica que si ninguna de las 2 condiciones anteriores se cumplen, desplegue el mensaje e error
        else {
            System.out.println("Decisión incorrecta. Procese de nuevo.");
        }

    }
}
