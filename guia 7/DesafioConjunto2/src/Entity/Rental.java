package Entity;
import java.util.Date;

public class Rental {
    private Film filmRental;
    private Date startDate;
    private Date endingDate;
    private double price;

    public Rental() {
    }

    public Rental(Film filmRental, Date startDate, Date endingDate, double price) {
        this.filmRental = filmRental;
        this.startDate = startDate;
        this.endingDate = endingDate;
        this.price = price;
    }

    public Film getFilmRental() {
        return filmRental;
    }

    public void setFilmRental(Film filmRental) {
        this.filmRental = filmRental;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rental{" + "filmRental=" + filmRental + ", startDate=" + startDate + ", endingDate=" + endingDate + ", price=" + price + '}';
    }    
}
