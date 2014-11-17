package lab1;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author schra_000
 */
public class Song {
    private String title;
    private int songID;
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
        hash = 67 * hash + this.songID;
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
        if (this.songID != other.songID) {
            return false;
        }
        return true;
    }

    public int compareTo(Object other) {
        
        Song s = (Song)other;

        final int BEFORE = -1;
	final int EQUAL = 0;
	final int AFTER = 1;
        
        if(this.equals(s)) return EQUAL;
        if(this.songID > s.songID) return BEFORE;
        if(this.songID < s.songID) return AFTER;
        
        return EQUAL; // default
    }
    public Song(String title, int songID, String composer, String album) {
        this.title = "unknown";
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

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }
    
}
