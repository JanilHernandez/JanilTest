package Service;

import Entity.Client;
import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
import java.util.Scanner;

public class ClientService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Client> clients = new ArrayList<>();

    public void clientCreation() {

        System.out.println(">>>Enter your ID number");
        int id = read.nextInt();
        System.out.println(">>>Enter your name");
        String name = read.next();
        System.out.println(">>>Enter your age");
        int age = read.nextInt();
        System.out.println(">>>Enter your height");
        double height = read.nextDouble();
        System.out.println(">>>Enter your weight");
        double weight = read.nextDouble();
        System.out.println(">>>Enter your target");
        String target = read.next();

        Client c = new Client(id, name, age, height, weight, target);
        clients.add(c);
    }

    public void getClients() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(clients.get(i));
        }
    }

    public void updateClient(int id, String name, int age, double height, double weight, String target) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                Client c = clients.get(i);
                c.setAge(age);
                c.setHeight(height);
                c.setWeight(weight);
                c.setTarget(target);
            }
        }
    }
    
    public void removeClient(int id) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                clients.remove(i);
            }
        }
    }
}
