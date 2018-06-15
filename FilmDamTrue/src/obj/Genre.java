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
public class Genre {
    private int idgenre;
    private String name;

    public Genre() {
    }

    public Genre(int idgenre, String name) {
        this.idgenre = idgenre;
        this.name = name;
    }

    public int getIdgenre() {
        return idgenre;
    }

    public void setIdgenre(int idgenre) {
        this.idgenre = idgenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" + "idgenre=" + idgenre + ", name=" + name + '}';
    }
    
    
}
