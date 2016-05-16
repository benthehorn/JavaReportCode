/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareportcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author Ben
 */
public class JavaReportCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Genre g1 = new Genre("Film");
        Genre g2 = new Genre("Classical");
        Genre g3 = new Genre("Jazz");
       CD cd1 = new CD("The Martian", g1, 1);
       CD cd2 = new CD("Gotterdamerung",g2 , 2);
       CD cd3 = new CD("Mission Implossible", g1, 3);
       CD cd4 = new CD("My Kinda Blue", g3, 4);
       
       ArrayList<Genre> genres = new ArrayList<>();
       genres.add(g1);
       genres.add(g2);
       genres.add(g3);
       
      ArrayList<CD> cds = new ArrayList<>();
       cds.add(cd1);
       cds.add(cd2);
       cds.add(cd3);
       cds.add(cd4);
       
       List<CD> cdsByName = cds.stream()
               .sorted(Comparator.comparing(a -> a.getName()))
               .collect(Collectors.toList());
       
        System.out.println("CD's" + cdsByName);
        
        Map<Integer, CD> cdsByNumber = cds
                .stream()
                .collect(Collectors.toMap(a -> a.getNumber(), a -> a ));
        
        System.out.println("CD's by number :" + cdsByNumber.keySet());
        
        
       String joined = cds.stream().map(a -> a.getName()).collect(joining(","));
       
        System.out.println("Joined :" + joined);
    
    }
    
}
