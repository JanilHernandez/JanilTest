package Main;

import Service.ClientService;
import Service.RoutineService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ClientService cs = new ClientService();
        RoutineService rs = new RoutineService();

        cs.getClients();

        boolean flag = true;

        System.out.println("OPCIONES");
        System.out.println(" ---------Usuarios------------");
        System.out.println(" 1 - registrar un usuario");
        System.out.println(" 2 - borrar un usuario");
        System.out.println(" 3 - modificar un usuario");
        System.out.println(" 4 - mostrar todos los usuarios");
        System.out.println(" ---------Rutinas------------");
        System.out.println(" 5 - registrar una rutina");
        System.out.println(" 6 - borrar una rutina");
        System.out.println(" 7- modificar una rutina");
        System.out.println(" 8 - mostrar todas las rutina");
        System.out.println(" -----------------------------");
        System.out.println(" 10 - Salir");

        while (flag) {
            System.out.println("----Selecciona una opcion---");

            int option = read.nextInt();

            switch (option) {
                case 1:
                    cs.clientCreation();
                    break;
                case 2:
                    System.out.println("Ingrea el ID del usuario a eliminar");
                    int idUsuario = read.nextInt();
                    cs.removeClient(idUsuario);
                    System.out.println("usuario eliminado");
                    break;
                case 3:
                    System.out.println("-----");
                    System.out.println(">>>Enter ID number");
                    int id = read.nextInt();
                    System.out.println(">>>Enter your name");
                    String name = read.next();
                    System.out.println(">>>Update age");
                    int age = read.nextInt();
                    System.out.println(">>>Update height");
                    double height = read.nextDouble();
                    System.out.println(">>>Update weight");
                    double weight = read.nextDouble();
                    System.out.println(">>>Update target");
                    String target = read.next();
                    cs.updateClient(id, name, age, height, weight, target);
                    System.out.println("Usuario modificado");
                    break;
                case 4:
                    cs.getClients();
                    break;
                case 5:
                    rs.routineCreation();
                    break;
                case 6:
                    System.out.println("Ingrea el ID de la rutina a eliminar");
                    int idrutina = read.nextInt();
                    rs.removeRoutine(idrutina);
                    System.out.println("rutina eliminada");
                    break;
                case 7:
                    System.out.println("-----");
                    System.out.println(">>>Enter ID number");
                    int idr = read.nextInt();
                    System.out.println(">>>Enter your name");
                    String namer = read.next();
                    System.out.println(">>> duration");
                    int duration = read.nextInt();
                    System.out.println(">>> level");
                    int level = read.nextInt();
                    System.out.println(">>>description");
                    String description = read.next();
                    rs.updateRoutine(idr, namer, duration, level, description);
                    System.out.println("rutina modificado");
                    break;
                case 8:
                    rs.getRoutine();
                    break;
                case 10:
                    System.out.println("Seguto queres salir? s/n");
                    read.nextLine();
                    String des = read.nextLine();
                    if (des.equals("s")) {
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("El numero ingresado no esta en el menu");
                    System.out.println("Ingresa otro");
            }

        }

    }
}
