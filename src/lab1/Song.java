package lab1;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author schra_000
 */
public class Song implements Comparable<Song>{
    private String title;
    private String songID;
    private String composer;
    private String album;

    public Song(){
        
    }
    
    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", songID=" + songID + ", composer=" + composer + ", album=" + album +'}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.songID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.songID, other.songID)) {
            return false;
        }
        return true;
    }

    

    @Override
    public int compareTo(Song s) {
      return this.songID.compareTo(s.songID);
    }
    public Song(String title, String songID, String composer, String album) {
        this.title = title;
        this.songID = songID;
        this.composer = composer;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

//    @Override
//    public int compareTo(Song t) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
