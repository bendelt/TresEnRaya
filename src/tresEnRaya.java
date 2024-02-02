import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class tresEnRaya {
private static char tablero[] = new char[9];
private static int victorias = 0, derrotas = 0;
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
            } catch (InputMismatchException ime) {
                opcion = 100;
            }
            input.nextLine();
            switch (opcion){
                case 1:
                    jugar(input);
                    break;
                case 2:
                    System.out.println("Victorias: "+victorias);
                    System.out.println("Derrotas: "+derrotas);
                    break;
                case 0:
                    System.out.println("Fin de programa \n");
                    break;
                default:
                    System.out.println("Opcion no valida \n");
                    break;
            }
        }while (opcion!=0);
        input.close();
    }


private static void numerarTablero(){
    for (int i=0; i<9; i++) {
        tablero[i]=Integer.toString(i+1).charAt(0);
    }
}

private static void vaciarTablero(){
        for (int i=0; i<9; i++) {
            tablero[i]=' ';
        }
    }
private static void mostrartablero(){
    for (int i=0; i<7; i++){
Switch (i)  {
            case 0,2,4,6:
                System.out.println("-------");
                break;
            case 1:
                System.out.println(" |"+tablero[0]+" | "+tablero[1]+" | "+tablero[2]+" |");
                break;
            case 3:
                System.out.println(" |"+tablero[3]+" | "+tablero[4]+" | "+tablero[5]+" |");
                break;
            case 5:
                System.out.println(" |"+tablero[6]+" | "+tablero[7]+" | "+tablero[8]+" |");
                break;
        }
    }
}

private static void jugar(Scanner input) {
    numerarTablero();
    mostrartablero();
    vaciarTablero();
    System.out.println("La maquina juega con el caracter '"+charMaquina+"'.");
    System.out.println("El usuario juega con el caracter '"+charUsuario +"'.");
switch (partida(input)){
    case charUsuario:
    System.out.println("VICTORIA! \n");
    victorias++;
    break;
    case charMaquina:
        System.out.println("DERROTA! \n");
    derrotas++;
    break;
    default:
        System.out.println("EMPATE! \n");
        break;
    }
}
private static boolean turnoInicial() {
    if ((new Random().nextInt()10))%2==0{
        System.out.println("Comienza usted. ");
        return true;
    }else{
        System.out.println("Comienza la maquina");
        return false;
    }
    }

    private static char partida(Scanner input){
    boolean turno=turnoInicial();
    System.out.println("Pulse ENTER para comenzar la partida...");
    input.nextLine();
    int fichas=0, casilla;
    char ganador=' ';
    do{
        mostrarablero();
        if (fichas<9) {
            if (turno) {
                do {
                    System.out.println("Turno del usuario. Colocar en casilla (1-9)?");
                    casilla=input.nextInt();
                    if (tablero[casilla-1]!=' ' {
                        System.out.println("la casilla "+casilla+" esta ocupada");
                    }
                    casilla=0;}
            } while (casilla<1 || casilla>9);
            input.nextLine();
            tablero[casilla-1]=charUsuario;
        }else {
                System.out.println("Turno de la maquina...");
                ocuparCasilla();
                System.out.println("Hecho!");
            }
        turno=!turno;
    }
    ganador=victoria();
    fichas++;
     while(fichas<10 &&ganador=='');
    mostrartablero();
    return ganador;}

private static void ocuparCasilla() {
    if (tablero[4] == '') {
        tablero[4] = charMaquina;
    } else {
        if (tablero[4] == charMaquina) {
            if (tablero[1] == '') {
                tablero[1] = charMaquina;
            } else {
                if (tablero[5] == '') {
                    tablero[5] = charMaquina;
                } else {
                    if (tablero[7] == '') {
                        tablero[7] = charMaquina;
                    } else {
                        if (tablero[3] == '') {
                            tablero[3] = charMaquina;
                        } else {
                            int i = 0;
                            while (tablero[i] != '') {
                                i++;
                            }
                            tablero[i] = charMaquina;

                        }
                    }
                }
            }
        }
    } else{
        if (tablero[0] == '') {
            tablero[0] = charMaquina;
        } else {
            if (tablero[2] == '') {
                tablero[2] = charMaquina;
            } else {
                if (tablero[6] == '') {
                    tablero[6] = charMaquina;
                } else {
                    if (tablero[8] == '') {
                        tablero[8] = charMaquina;
                    } else {
                        int i = 0;
                        while (tablero[i] != '') {
                            i++;
                        }
                        tablero[i] = charMaquina;
                    }
                }
            }
        }
    }
}
    private static char victoria(){
            int i=0;
    char r='';
    do{
        if (charUsuario==tablero[3+i] && charUsuario==tablero[(3+i)+1] && charUsuario==tablero[(3+i)+2]){
            r=charUsuario;
        }

        if (charUsuario==tablero[i] && charUsuario==tablero[3+i] && charUsuario==tablero[6+i]){
            r=charUsuario;
        }

        if (charUsuario==tablero[0] && charUsuario==tablero[4] && charUsuario==tablero[8]){
            r=charUsuario;
        }

        if (charUsuario==tablero[2] && charUsuario==tablero[4] && charUsuario==tablero[6]){
            r=charUsuario;
        }

        if (charMaquina==tablero[3+i] && charMaquina==tablero[(3+i)+1] && charMaquina==tablero[(3+i)+2]){
            r=charMaquina;
        }

        if (charMaquina==tablero[i] && charMaquina==tablero[3+i] && charMaquina==tablero[6+i]){
            r=char;
        }

        if (charMaquina==tablero[0] && charMaquina==tablero[4] && charMaquina==tablero[8]){
            r=charMaquina;
        }

        if (charMaquina==tablero[2] && charMaquina==tablero[4] && charMaquina==tablero[6]){
            r=charMaquina;
        }
        i++;
    } while (r==' ' && i<3);
    return r;
}

