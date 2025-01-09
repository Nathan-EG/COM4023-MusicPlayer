/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neg.com4023;

/**
 *
 * @author amstephenson
 * @version 2.0
 * @Purpose: class to manage a song
 */
public class Song {
    private String artistName;
    private String songTitle;
    private int playBack;
    
    /**
     * Constructor: Builds a blank Song
     */
    public Song(){}
    
    /**
     * Constructor: Builds a Song with 
     * required data - artistName, songTitle, playBack
     */
    public Song(String artistName, String songTitle, int playBack){
        this.artistName = artistName;
        this.songTitle =songTitle;
        this.playBack = playBack;    
    }
    
    public String getTitle(){
        return this.songTitle;
    }
    
    public int getPlayBack(){
        return this.playBack;
    }
    
    public String getArtistName(){
      return this.artistName;  
    }
    
    public void setArtistName(String artistName){
        this.artistName=artistName;
    }
    
    public void setTitle(String newTitle){
        this.songTitle=newTitle;
    }
    
    public void setPlays(int newPlays){
        this.playBack=newPlays;
    }
    
    public void printSong(){
        System.out.println(this.songTitle + "," + this.artistName + "," + this.playBack);
    }    
    
}    
    
