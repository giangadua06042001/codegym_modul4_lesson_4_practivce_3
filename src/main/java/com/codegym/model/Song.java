package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

public class Song {
    private int idSong;
    private String songName;
    private String author;
    private String playList;
    private MultipartFile url;

    public Song(int idSong, String songName, String author, String playList, MultipartFile url) {
        this.songName = songName;
        this.author = author;
        this.playList = playList;
        this.url = url;
        this.idSong=idSong;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public MultipartFile getUrl() {
        return url;
    }

    public void setUrl(MultipartFile url) {
        this.url = url;
    }

    public Song() {
    }
}
