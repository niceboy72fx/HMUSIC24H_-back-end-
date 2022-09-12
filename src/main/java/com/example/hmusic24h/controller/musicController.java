package com.example.hmusic24h.controller;

import com.example.hmusic24h.model.musicModel;
import com.example.hmusic24h.respository.musicRespository;
import jdk.jfr.Enabled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@EnableAutoConfiguration
@RequestMapping("")
@Slf4j
@CrossOrigin("*")
public class musicController {
    musicModel model;

    @Autowired
    private musicRespository musicRespo;


}
