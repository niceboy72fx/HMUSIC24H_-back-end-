package com.example.hmusic24h.respository;

import com.example.hmusic24h.model.musicModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface musicRespository extends JpaRepository<musicModel,Long> {
}
