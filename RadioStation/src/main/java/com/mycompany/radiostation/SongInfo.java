package com.mycompany.radiostation;


public class SongInfo {
    
    protected String songName;
    protected String bandName;
    protected int yearReleased;
    
    public SongInfo(String newSongName, String newBandName, int newYearReleased){
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;
    }
    
    public String getSongName(){
        return songName;
    }
    
    public String getBandName(){
        return bandName;
    }
    
    public int getYearReleased(){
        return yearReleased;
    }
}
