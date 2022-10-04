package com.example.hmusic24h.respository;

import com.example.hmusic24h.model.musicModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface musicRespository extends JpaRepository<musicModel,Long> {
    @Query("Select p from musicModel p where p.country LIKE %:country")
    Iterable<musicModel> listCountryMusic(@Param("country") String country);

    @Query ("Select p from musicModel p where p.musicName LIKE %:musicName ")
    List<musicModel> listSearchMusic (@Param("musicName") String musicName);

    @Query("Select e from musicModel e")
    List<musicModel> AllListStudent();

}
