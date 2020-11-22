package com.mycompany.videoplayer;


public class MediaAdapter implements MediaPlayer{
    Decoder decoder;

    @Override
    public void play(String extension, String filename) {
        if(extension.equals("mp4")){
            decoder = new MP4Decoder();
        }
        else if(extension.equals("mkv")){
            decoder = new MKVDecoder();
        }
        else{
            System.out.println("This Format is Not Supported");
            decoder = null;
        }
        
        if(decoder != null){
            decoder.decodeHDVideo(filename);
        }
    }
    
}
