package Entity;

public class Film {
    private String title;
    private String genre;
    private int year;
    private int duration;
    
    @Override
    public String toString() {
        return "Film{" + "title=" + title + ", genre=" + genre + ", year=" + year + ", duration=" + duration + '}';
    }
    
    public Film() {
    }

    public Film(String title, String genre, int year, int duration) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}

