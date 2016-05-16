/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareportcode;

/**
 *
 * @author Ben
 */
public class CD {
    private String name;
    private Genre genre;
    private int number;

    public CD(String name, Genre genre, int number) {
        this.name = name;
        this.genre = genre;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CD{" + "name=" + name + ", genre=" + genre + ", number=" + number + '}';
    }
    
    
}
