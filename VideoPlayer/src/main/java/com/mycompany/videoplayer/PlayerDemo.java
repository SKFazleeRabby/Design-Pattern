package com.mycompany.videoplayer;


public class PlayerDemo {

    
    public static void main(String[] args) {
        VideoPlayer myplayer = new VideoPlayer();
        
        myplayer.play("mp4", "Data Structure.mp4");
        myplayer.play("mkv", "Mein ne Pyar Kyu Kiya.mkv");
        myplayer.play("mp3", "Vroom.mp3");
    }
    
}
