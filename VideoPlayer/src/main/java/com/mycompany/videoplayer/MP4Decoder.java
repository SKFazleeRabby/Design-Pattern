package com.mycompany.videoplayer;


public class MP4Decoder implements Decoder {

    @Override
    public void decodeHDVideo(String filename) {
        System.out.println("Now Playing an MP4 Video with Name: " + filename);
    }
    
}
