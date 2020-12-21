package com.mycompany.radiostation;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class DiskJockey {
    SongIterator songs70s;
    SongIterator songs80s;
    SongIterator songs90s;
    
//    public DiskJockey(SongsOfThe70s best70sSongs, SongsOfThe80s best80sSongs, SongsOfThe90s best90sSongs){
//        songs70s = best70sSongs;
//        songs80s = best80sSongs;
//        songs90s = best90sSongs;
//    }
    
    public DiskJockey(SongIterator best70sSongs, SongIterator best80sSongs, SongIterator best90sSongs){
        songs70s = best70sSongs;
        songs80s = best80sSongs;
        songs90s = best90sSongs;
    }
    
//    public void showTheSongs(){
//        ArrayList<SongInfo> all70sSongs = songs70s.getBestSongs();
//        SongInfo[] all80sSongs = songs80s.getBestSongs();
//        Hashtable<Integer, SongInfo> all90sSongs = songs90s.getBestSongs();
//        
//        System.out.println("Songs of the 70s\n");
//        for(int index=0; index < all70sSongs.size(); index++){
//            SongInfo bestSong = (SongInfo)all70sSongs.get(index);
//            System.out.println(bestSong.getBandName() + " - " + bestSong.getSongName() + "(" + bestSong.getYearReleased() + ")");
//        }
//        
//        System.out.println("Songs of the 80s\n");
//        for(int index=0; index < all80sSongs.length; index++){
//            SongInfo bestSong = (SongInfo)all80sSongs[index];
//            System.out.println(bestSong.getBandName() + " - " + bestSong.getSongName() + "(" + bestSong.getYearReleased() + ")");
//        }
//        
//        System.out.println("Songs of the 90s\n");
//        for(Enumeration<Integer> e = all90sSongs.keys(); e.hasMoreElements();){
//            SongInfo bestSong = (SongInfo)all90sSongs.get(e.nextElement());
//            System.out.println(bestSong.getBandName() + " - " + bestSong.getSongName() + "(" + bestSong.getYearReleased() + ")");
//        }
//    }
    
    public void showTheSongs(){
        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s.createIterator());
        System.out.println("");
        System.out.println("Songs of the 80s\n");
        printTheSongs(songs80s.createIterator());
        System.out.println("");
        System.out.println("Songs of the 90s\n");
        printTheSongs(songs90s.createIterator());
    }
    
    public void printTheSongs(Iterator songIterator){
        while(songIterator.hasNext()){
            SongInfo song = (SongInfo) songIterator.next();
            System.out.println(song.getBandName() + " - " + song.getSongName() + "(" + song.getYearReleased() + ")");
        }
    }
}
