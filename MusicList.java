/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neg.com4023;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author amstephenson
 */
public class MusicList {

    private final ArrayList<Song> musicList;

    /**
     * Constructor
     */
    public MusicList() {
        this.musicList=new ArrayList<>();
    }

    public void addSong(Song song) {
        this.musicList.add(song);
    }

    public int getMusicListSize() {
        return this.musicList.size();
    }

    public void clearMusicList() {
        this.musicList.clear();
    }

    public void removeSong(String songTitle) {
        boolean removedSong = false;
        for (int index = 0; index < musicList.size(); index++) {
            Song currentSong = musicList.get(index);
            if (currentSong.getTitle().equalsIgnoreCase(songTitle)) {
                musicList.remove(index);
                removedSong = true;
            }
        }
        if (removedSong==false){
            System.out.println("Cannot remove as song does not exist!!");
        }
    }

    public void setSongPlays(String songTitle, int songPlays) {

        boolean foundSong = false;
        for (int index = 0; index < musicList.size(); index++) {
            Song currentSong = musicList.get(index);
            if (currentSong.getTitle().equalsIgnoreCase(songTitle)) {
                currentSong.setPlays(songPlays);
                foundSong = true;
            }

        }
        if (foundSong==false){
            System.out.println("Cannot find the SongTitle!!");
        }
    }


    public void printAbovePlays(int songPlays) {
        boolean foundSong = false;
        for (int index = 0; index < musicList.size(); index++) {
            Song currentSong = musicList.get(index);
            if (currentSong.getPlayBack() > songPlays) {
                currentSong.printSong();
                foundSong = true;
            }
        }
        if (foundSong == false) {
            System.out.println("No Songs Found with Plays above " + songPlays);
        }
    }

    public void findByArtist(String songArtist) {
        boolean found = false;
        for (int index = 0; index < musicList.size(); index++) {
            Song currentSong = musicList.get(index);
            if (currentSong.getArtistName().equalsIgnoreCase(songArtist)){
                currentSong.printSong();
                found=true;
            }
        }
        if (found==false){
            System.out.println("Artist not found!!");
        }
    }

    public void getRandomSong() {
        Random rand = new Random();
        int n = rand.nextInt(this.musicList.size());
        Song randomSong = this.musicList.get(n);
        randomSong.printSong();
    }

    public void printMusicList() {
        for (int index = 0; index < musicList.size(); index++) {
            Song currentSong = musicList.get(index);
            currentSong.printSong();
        }
    }
}