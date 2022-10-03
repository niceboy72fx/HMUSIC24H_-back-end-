package com.example.hmusic24h.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="music_data")
@Getter
@Setter
public class musicModel {
    @Id
    @Column(name="id", columnDefinition = "BIGINT")
    private long Id;
    @Column(name = "music_name", columnDefinition = "VARCHAR(255)")
    private String musicName;
    @Column(name = "author_name", columnDefinition = "VARCHAR(255)")
    private String authorPath;
    @Column(name = "file_path", columnDefinition = "VARCHAR(255)")
    private String filePath;
    @Column(name = "image_path", columnDefinition = "VARCHAR(255)")
    private String imagePath;
    @Column(name = "years", columnDefinition = "VARCHAR(255)")
    private String year;
    @Column(name = "music_type", columnDefinition = "VARCHAR(255)")
    private String musicType;
    @Column(name = "country", columnDefinition = "VARCHAR(255)")
    private String country;
    @Column(name = "count_listenner", columnDefinition = "BIGINT")
    private long countListenner;
}
