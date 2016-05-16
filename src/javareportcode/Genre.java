/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareportcode;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;

/**
 *
 * @author Ben
 */
public class Genre {
    private String genre;

    public Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre{" + "genre=" + genre + '}';
    }

    Collector<Genre, ?, Map<CD, Set<Genre>>> getCD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
