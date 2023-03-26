import java.util.Scanner;

public class Jefemaestro{

    public static void main(String[] args) {
        int opcion = 0;
        Scanner e = new Scanner(System.in);

        do{System.out.println("Selecione un juego");
        System.out.println("1- MARIO");
        System.out.println("2- HALO");
        System.out.println("3- MINECRAFT");
        System.out.println("4- SALIR");
        opcion = e.nextInt();

        switch(opcion){
        case 1:
            System.out.println("Usted eligio MARIO");
            break;
        case 2:
            System.out.println("Usted ELIGIO HALO");
            break;
        case 3:
            System.out.println("Usted eligio MINECRAFT");
            break;
        case 4:
            System.out.println("Acabas de salir");
            break;

            default:
            System.out.println("Opcion no disponible");


        }

        }while(opcion !=4);
                System.out.println("Nos vemos");
                e.close();
    }

}