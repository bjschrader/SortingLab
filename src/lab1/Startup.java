package lab1;

import java.util.*;
import common.*;

/**
 *
 * @author schra_000
 */
public class Startup {
    
    public static void main(String[] args) {
        
        Song s1 = new Song("The End", 11, "Jim Morrison", "The Doors");
        Song s2 = new Song("Subterranean Homesick Alien", 3, "Johnny Greenwood", "OK Computer");
        Song s3 = new Song("Stubborn Love", 7, "The Lumineers", "The Lumineers");
        Song s4 = new Song("I Would Hurt a Fly", 2, "Built to Spill", "Perfect from Now On");
        
        List<Song> songList = new ArrayList<>();
        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);
        
        List<Song> list = new ArrayList<>(songList);
        Collections.sort(list, new Song());
        for(Song s : list) {
            System.out.println(s);
        }
    }
}
