package com.mycompany.videoplayer;


public class VideoPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    
    public VideoPlayer(){
        mediaAdapter = new MediaAdapter();
    }

    @Override
    public void play(String extension, String filename) {
        mediaAdapter.play(extension, filename);
    }
    
}
