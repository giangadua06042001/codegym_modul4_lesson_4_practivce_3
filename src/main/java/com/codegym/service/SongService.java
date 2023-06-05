package com.codegym.service;
import com.codegym.model.Song;
import java.util.ArrayList;
import java.util.List;

public class SongService  implements ISongService{
   public static final List<Song>listSong;
    static {
        listSong=new ArrayList<>();

    }
    @Override
    public List<Song> findAllSong() {
       List<Song>list=new ArrayList<>();
        for (Song song:listSong) {
            list.add(song);
        }
        return list;
    }

    @Override
    public void saveSong(Song song) {
        listSong.add(song);

    }

    @Override
    public Song findById(int id) {
         return listSong.get(id);
    }

    @Override
    public void updateSong(int id, Song song) {
        listSong.add(id,song);

    }

    @Override
    public void removeSong(int id) {
        listSong.remove(id);

    }
}
