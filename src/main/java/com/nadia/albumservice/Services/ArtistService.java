package com.nadia.albumservice.Services;

import com.nadia.albumservice.Entities.Artist;
import com.nadia.albumservice.Repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    //hämta alla artister
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    //hämta artist med specifikt id
    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    //skapa ny artist
    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }
}
