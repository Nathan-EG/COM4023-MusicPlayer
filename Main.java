package com.neg.com4023;

public class Main {
    public static void main(String[] args){
        //create a MusicList
        MusicList musicList=new MusicList();

        //Add Songs
        Song[] songs = new Song[10];
        songs[0]=new Song("G", "In the Beginning",1969);
        songs[1]=new Song("Genesis", "Where the Sour Turns to Sweet",1969);
        songs[2]=new Song("Genesis", "The Silent Sun",1969);
        songs[3]=new Song("Genesis", "Robbery, Assault and Battery",1973);
        songs[4]=new Song("Genesis", "A Trick of the Tail",1973);
        songs[5]=new Song("Genesis", "Ripples",1973);
        songs[6]=new Song("Genesis", "Firth of Fifth",1973);
        songs[7]=new Song("Genesis", "Dancing with the Moonlit Knight",1973);
        songs[8]=new Song("Genesis", "The Carpet Crawlers",1974);
        songs[9]=new Song("Genesis", "In the Cage",1974);

        for (Song song:songs){
            musicList.addSong(song);
        }
        musicList.printMusicList();
        System.out.println(musicList.getMusicListSize());
        musicList.findByArtist("Genesis");
        musicList.getRandomSong();
        musicList.removeSong("Firth of Fifth");
        System.out.println("==================");
        musicList.printMusicList();
    }
}
