package com.neg.com4023;

public class Main {
    public static void main(String[] args){
        //create a MusicList
        MusicList musicList=new MusicList();

        //Add Songs
        Song[] songs = new Song[10];
        songs[0]=new Song("O", "Morning Glory?",1995);
        songs[1]=new Song("Oasis", "Hello",1995);
        songs[2]=new Song("Oasis", "Roll With It",1995);
        songs[3]=new Song("Oasis", "Wonderwall",1995);
        songs[4]=new Song("Oasis", "Don't Look Back In Anger",1995);
        songs[5]=new Song("Oasis", "Hey Now!",1995);
        songs[6]=new Song("Oasis", "The Swamp Song",1995);
        songs[7]=new Song("Oasis", "Some Might Say",1995);
        songs[8]=new Song("Oasis", "Cast No Shadow",1995);
        songs[9]=new Song("Oasis", "She's Electric",1995);

        for (Song song:songs){
            musicList.addSong(song);
        }
        musicList.printMusicList();
        System.out.println(musicList.getMusicListSize());
        musicList.findByArtist("Oasis");
        musicList.getRandomSong();
        musicList.removeSong("The Swamp Song");
        System.out.println("----------------");
        musicList.printMusicList();
    }
}
