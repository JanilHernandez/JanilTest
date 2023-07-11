package Service;
import Entity.Film;
import Entity.Rental;
import java.util.Date;
import java.util.Scanner;

public class RentalService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Rental createRental(Film f){
        Rental r1 = new Rental();
        Date d1 = new Date();
        Date d2 = new Date();
        
        System.out.println(":::RENTAL:::");
        System.out.println(f.getTitle());
        r1.setFilmRental(f);
        System.out.println(">>>Enter start date of rental");
        System.out.println(">>>dd");
        d1.setDate(read.nextInt());
        System.out.println(">>>mm");
        d1.setMonth(read.nextInt());
        System.out.println(">>>yyyy");
        d1.setYear(read.nextInt());
        r1.setStartDate(d1);
        
        System.out.println(">>>Enter ending date of rental");
        System.out.println(">>>dd");
        d2.setDate(read.nextInt());
        System.out.println(">>>mm");
        d2.setMonth(read.nextInt());
        System.out.println(">>>yyyy");
        d2.setYear(read.nextInt());
        r1.setEndingDate(d2);
           
        System.out.println(":::PRICE OF THE RENTAL FILM:::");
        int rentalDays;
        rentalDays = ((int)(r1.getEndingDate().getYear()+1900)-((int)(r1.getStartDate().getYear()+1900)))*365;
        rentalDays += ((int)r1.getEndingDate().getMonth()-(int)r1.getStartDate().getMonth())*30;
        rentalDays += ((int)r1.getEndingDate().getDate()-(int)r1.getStartDate().getDate());
        
        System.out.println(rentalDays);
        if (rentalDays <= 3) {
            System.out.println("entre al if");
            r1.setPrice(10);
        }else{
            System.out.println("entre al else");
            r1.setPrice(10+10*0.1*(rentalDays-3));
        }
       System.out.println("--->The price of the rental is: "+r1.getPrice());
       
        return r1; 
    }
    
    public void showRental(Rental r){
        System.out.println(r.toString());
    }
    
    public boolean searchRentalByDate(Rental[] r,Date d){
        for (Rental r1 : r) {
            if (r1.getEndingDate().equals(d)) {
                return true;
            }
        }
        return false;
    }
    
    public Rental showRentalByDate(Rental[] r, Date d){
        for (Rental r1 : r) {
            if (r1.getEndingDate().equals(d)) {
                return r1;
            }
        }
        return null;
    }
}
