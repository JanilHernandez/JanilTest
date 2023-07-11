package Service;
import Entity.Film;
import java.util.Scanner;

public class FilmService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Film createFilm(){
        Film f1 = new Film();
        System.out.println(":::FILM CREATION:::");
        System.out.println(">>>Enter the title of the film");
        f1.setTitle(read.next());
        System.out.println(">>>Enter the genre of the film");
        f1.setGenre(read.next());
        System.out.println(">>>Enter the year of the film");
        f1.setYear(read.nextInt());
        System.out.println(">>>Enter duration of the film");
        f1.setDuration(read.nextInt());
        
        return f1;
    }
    
    public void showFilm(Film f){
        System.out.println(":::FILM DATA:::");
        System.out.println(">>>Title: "+f.getTitle());
        System.out.println(">>>Genre: "+f.getGenre());
        System.out.println(">>>Year: "+f.getYear());    
        System.out.println(">>>Duration: "+f.getDuration());  
    }
    
    public boolean searchFilm(Film[] f, String ts){
        for (Film f1 : f) {
            if (f1.getTitle().equalsIgnoreCase(ts)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean searchGenre(Film[] f, String gs) {
        for (Film f1 : f) {
            if (f1.getGenre().equalsIgnoreCase(gs)) {
                return true;
            }
        }
        return false;
    }
}
