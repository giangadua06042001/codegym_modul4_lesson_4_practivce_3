package com.codegym.controller;

import com.codegym.model.Song;
import com.codegym.service.ISongService;
import com.codegym.service.SongService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    private ISongService service=new SongService();
    @GetMapping("")
    public ModelAndView home(){
        List<Song>songList=service.findAllSong();

       ModelAndView modelAndView=new ModelAndView("/home");
       modelAndView.addObject("songs",songList);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView Form(){
        ModelAndView modelAndView=new ModelAndView("/form");
        modelAndView.addObject("formSong",new Song());
        return modelAndView;
    }
    @Value("${file-upload}")
    private String fileUpload;
    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Song formSong){
    MultipartFile multipartFile=formSong.getUrl();
    String nameURL=multipartFile.getOriginalFilename();
    try {
        FileCopyUtils.copy(formSong.getUrl().getBytes(),new File(fileUpload + nameURL));
    } catch (IOException e) {
      e.printStackTrace();
    }
    Song song=new Song(formSong.getIdSong(),formSong.getSongName(),formSong.getAuthor(),formSong.getPlayList(),formSong.getUrl());

    service.saveSong(song);
    ModelAndView modelAndView=new ModelAndView("/form");
    modelAndView.addObject("songs",formSong);
    return modelAndView;
    }


}
