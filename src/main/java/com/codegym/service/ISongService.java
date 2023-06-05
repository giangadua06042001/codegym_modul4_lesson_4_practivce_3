package com.codegym.service;

import com.codegym.model.Song;

import java.util.List;

public interface ISongService {
    public List<Song> findAllSong();
    void saveSong(Song song);
    Song findById(int id);
    void updateSong(int id,Song song);
    void removeSong(int id);
}
