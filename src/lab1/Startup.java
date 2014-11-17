package lab1;

import java.util.*;
import common.*;

/**
 *
 * @author schra_000
 */
public class Startup {
    
    public static void main(String[] args) {
        
        Song s1 = new Song("The End", "T11", "Jim Morrison", "The Doors");
        Song s2 = new Song("Subterranean Homesick Alien", "T3", "Johnny Greenwood", "OK Computer");
        Song s3 = new Song("Stubborn Love", "T7", "The Lumineers", "The Lumineers");
        Song s4 = new Song("I Would Hurt a Fly", "T2", "Built to Spill", "Perfect from Now On");
        
        Map<String, Song> songList = new HashMap<>();
        songList.put("T11", s1);
        songList.put("T3", s2);
        songList.put("T7", s3);
        songList.put("T2", s4);
        
        Map<String, Song> songMap = new HashMap<>(songList);
        Collection<Song> value = songMap.values();
                for(Song s : value) {
            System.out.println(s);
        }
    }
}
