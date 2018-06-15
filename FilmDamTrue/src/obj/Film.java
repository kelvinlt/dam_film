/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author DAM
 */
public class Film {
    private String title;
    private int year;
    private String director;
    private int genre;

    public Film() {
    }

    public Film(String title, int year, String director, int genre) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" + "title=" + title + ", year=" + year + ", director=" + director + ", genre=" + genre + '}';
    }
    
    
}
