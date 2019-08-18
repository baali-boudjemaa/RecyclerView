package info.androidhive.recyclerview;

/**
 * Created by Lincoln on 15/01/16.
 */
public class Movie {
    private String title, genre, year;
    private int imgid ;

    public Movie() {
    }

    public Movie(String title, String genre, String year,int imid) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.imgid=imid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
