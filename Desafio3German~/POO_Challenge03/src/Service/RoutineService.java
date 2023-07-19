package Service;

import Entity.Routine;
import java.util.ArrayList;
import java.util.Scanner;

public class RoutineService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Routine> routines = new ArrayList<>();

    public void routineCreation() {

        System.out.println(">>>Enter your ID number");
        int id = read.nextInt();
        System.out.println(">>>Enter your name");
        String name = read.next();
        System.out.println(">>>Enter your duration");
        int duration = read.nextInt();
        System.out.println(">>>Enter level of routine");
        int level = read.nextInt();
        System.out.println(">>>Enter description");
        String description = read.next();

        Routine c = new Routine(id, name, duration, level, description);
        routines.add(c);
    }

    public void getRoutine() {
        for (int i = 0; i < routines.size(); i++) {
            System.out.println(routines.get(i));
        }
    }

    public void updateRoutine(int id, String name, int duration, int level, String description) {
        for (int i = 0; i < routines.size(); i++) {
            if (routines.get(i).getId() == id) {
                Routine c = routines.get(i);
                c.setName(name);
                c.setDescription(description);
                c.setDuration(duration);
                c.setLevelDifficulty(level);
            }
        }
    }

    public void removeRoutine(int id) {
        for (int i = 0; i < routines.size(); i++) {
            if (routines.get(i).getId() == id) {
                routines.remove(i);
            }
        }
    }
}
