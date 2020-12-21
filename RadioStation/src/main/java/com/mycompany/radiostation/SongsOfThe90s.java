package com.mycompany.radiostation;
import java.util.Hashtable;
import java.util.Iterator;


public class SongsOfThe90s implements SongIterator{
    
    Hashtable<Integer, SongInfo> bestSongs;
    int hashKey = 0;
    
    public SongsOfThe90s(){
        bestSongs = new Hashtable<Integer,SongInfo>();
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on The Ocean", "Toad The Wet Sprocket", 1991);
    }
    
    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo newSong = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, newSong);
        hashKey++;
    }
    
    public Hashtable<Integer, SongInfo> getBestSongs(){
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
    
}
