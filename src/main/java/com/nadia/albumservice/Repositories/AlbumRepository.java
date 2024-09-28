package com.nadia.albumservice.Repositories;

import com.nadia.albumservice.Entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

  //  List<Album> findByArtistName(String artistName);

    List<Album> findByReleaseDateAfter(LocalDate date);
}
