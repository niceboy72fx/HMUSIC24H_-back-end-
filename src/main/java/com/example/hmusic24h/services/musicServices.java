package com.example.hmusic24h.services;

import com.example.hmusic24h.model.musicModel;
import com.example.hmusic24h.respository.musicRespository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
@AllArgsConstructor
public class musicServices  {
    @Autowired
    private musicRespository musicRespo;

//    public musicRespository(musicRespository msR);
//    {
//        this.musicRespo = msR;
//    }

    public Iterable <musicModel> musicCountry(String nameCountry){
       Iterable<musicModel> models = musicRespo.listCountryMusic(Collections.singleton(nameCountry));
       return models;
    }


    public List <musicModel> findMusicByName (List <String> NameMusic){
        System.out.println("test");
        List<musicModel> model = musicRespo.listSearchMusic(NameMusic);

        return model;
    }

    public Iterable<musicModel> getAllMusic () {
        Iterable<musicModel> model =  musicRespo.findAll();
        return  model;
    }
}
