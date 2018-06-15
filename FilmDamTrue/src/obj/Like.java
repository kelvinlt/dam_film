/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.util.Date;

/**
 *
 * @author DAM
 */
public class Like {
    private String user;
    private String film;
    private int mark;
    private Date date;

    public Like() {
    }

    public Like(String user, String film, int mark) {
        this.user = user;
        this.film = film;
        this.mark = mark;
    }

    
    public Like(String user, String film, int mark, Date date) {
        this.user = user;
        this.film = film;
        this.mark = mark;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Like{" + "user=" + user + ", film=" + film + ", mark=" + mark + ", date=" + date + '}';
    }
    
}
