package com.mycompany.videoplayer;


public class MKVDecoder implements Decoder{

    @Override
    public void decodeHDVideo(String filename) {
        System.out.println("Now Playing an MKV Video with Name: " + filename);
    }
    
}
