package com.example.hmusic24h.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class musicModel {
    @Id
    private long Id;
    private String musicName;
    private String authorPath;
    private String filePath;
    private String imagePath;
    private String year;
    private String musicType;
    private String country;
    private long countListenner;
}
