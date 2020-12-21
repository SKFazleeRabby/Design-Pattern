package com.mycompany.radiostation;


public class RadioStation {

    public static void main(String[] args) {
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();
        
        DiskJockey madMike = new DiskJockey(songs70s, songs80s, songs90s);
        madMike.showTheSongs();
    }
    
}
