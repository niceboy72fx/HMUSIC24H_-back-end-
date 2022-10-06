package com.example.hmusic24h.controller;

import com.example.hmusic24h.model.musicModel;
import com.example.hmusic24h.model.musicRespond;
import com.example.hmusic24h.respository.musicRespository;
import com.example.hmusic24h.services.musicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("")
@CrossOrigin("*")
public class musicController {
    musicModel model;

    @Autowired
    private musicRespository musicRespo;

    private musicServices services;
    private musicModel models;

    public musicController(musicServices services) {
        this.services = services;
    }

    //------------------------------------------------------------------------------------------------------------
    //lay toan bo du llieu ve nhac
    @GetMapping("/allmusic")
    public ResponseEntity<musicRespond> listAllMusic () {
        return ResponseEntity.status(HttpStatus.OK).body(
           new musicRespond("200 ok","Query music ok",services.getAllMusic()));
    }



//--------------------------------------------------------------------------------------------------------------
   // tim kiem nhac
    @GetMapping("/search")
    public ResponseEntity<musicRespond> searchMusic (@RequestParam("musicName") String nameMusic) {
        List<musicModel> MusicData = services.findMusicByName(nameMusic);
        if (MusicData.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new musicRespond("404", "Something is error !!", MusicData)
            );
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new musicRespond("200 OK", "Music is found ", MusicData)
            );
        }

    }
//------------------------------------------------------------------------------------------------
    //quốc gia
    @GetMapping("/us")
    public ResponseEntity<musicRespond> musicUS_UK () {
        Iterable <musicModel> musicData = services.musicCountry("Âu Mỹ");
        return ResponseEntity.status(HttpStatus.OK).body(
                new musicRespond("200 ok","US-UK music",musicData)
        );
    }

    @GetMapping("/korea")
    public ResponseEntity<musicRespond> musicKorea () {
        Iterable <musicModel> musicData = services.musicCountry("Hàn quốc");
        return ResponseEntity.status(HttpStatus.OK).body(
                new musicRespond("200 ok","Hàn Quốc music",musicData)
        );
    }

    @GetMapping("/vietnam")
    public ResponseEntity<musicRespond> musicVietNam () {
        Iterable <musicModel> musicData = services.musicCountry("Việt Nam");
        return ResponseEntity.status(HttpStatus.OK).body(
                new musicRespond("200 ok","Việt nam music",musicData)
        );
    }
//-------------------------------------------------------------------------------------------------
    // dem so ng nghe
//    @PutMapping("/counting")
//    public ResponseEntity<musicRespond> counting (@RequestParam("count") long counts){
//
//    }
    // tim 50 bai hat nghe nhieu nhat
     //@GetMapping
 }
