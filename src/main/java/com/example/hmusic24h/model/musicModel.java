package com.example.hmusic24h.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="music_data")
public class musicModel {
    @Id
    @Column(name="Id")
    private long Id;
    @Column(name = "MusicName")
    private String musicName;
    @Column(name = "AuthorPath")
    private String authorPath;
    @Column(name = "FilePath")
    private String filePath;
    @Column(name = "ImagePath")
    private String imagePath;
    @Column(name = "Years")
    private String year;
    @Column(name = "MusicType")
    private String musicType;
    @Column(name = "Country")
    private String country;
    @Column(name = "CountListenner")
    private long countListenner;
}
