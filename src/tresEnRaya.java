import java.util.Scanner;

public class tresEnRaya {
private static char tablero[] = new char[9];
private static int victorias = 0, derrota = 0;
private static final char charUsuario='x', charMaquina='o';

public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("MENU");
            System.out.println("1. Jugar");
            System.out.println("2. Ver estadisticas");
            System.out.println("0. Salir");
            try {
                System.out.print("Seleccionar opcion (1-2) o 0 para salir");
                opcion=input.nextInt();
            }


        }
    }
}
