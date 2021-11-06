import java.util.Scanner;

public class TiendasDonPepe {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese el monto a pagar: ");
        int precio = sc.nextInt();

        double descuento = precio *0.15;

        System.out.println("Ingrese el dia de la semana. 1.Lunes - 2.Martes - 3.Miercoles - 4.Jueves - 5.Viernes - 6.Sabado - 7.Domingo");
        int dia = sc.nextInt();

        switch(dia) {
            case 1: System.out.println("\n Ha ingresado el día Lunes\n");
            System.out.println("Compra realizada exitosamente!. Con un monto de: " + precio + " Bs.");
            break;

            case 2: System.out.print("\n Ha ingresado el día Martes\n");
            System.out.println("Realiazando compra de: " + precio + " Bs. \nTiene un descuento del día de 15% (" + descuento + " Bs.) - Total a pagar: " + (precio-descuento) + " Bs.");
            break;
            
            case 3: System.out.print("\n Ha ingresado el día Miercoles\n");
            System.out.println("Compra realizada exitosamente!. Con un monto de: " + precio + " Bs.");
            break;

            case 4: System.out.print("\n Ha ingresado el día Jueves\n");
            System.out.println("Realizando compra de: " + precio + " Bs. \nTiene un descuento del día de 15% (" + descuento + " Bs.) - Total a pagar: " + (precio-descuento) + " Bs.");
            break;

            case 5: System.out.print("\n Ha ingresado el día Viernes\n");
            System.out.println("Compra realizada exitosamente!. Con un monto de: " + precio + " Bs.");
            break;

            case 6: System.out.print("\n Ha ingresado el día Sabado\n");
            System.out.println("Compra realizada exitosamente!. Con un monto de: " + precio + " Bs.");
            break;

            case 7: System.out.print("\n Ha ingresado el día Domingo\n");
            System.out.println("Compra realizada exitosamente!. Con un monto de: " + precio + " Bs.");
            break;
        }
    }    
}
