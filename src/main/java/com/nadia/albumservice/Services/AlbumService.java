package com.nadia.albumservice.Services;

import com.nadia.albumservice.Entities.Album;
import com.nadia.albumservice.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;


    //skapa nytt album
    public Album createAlbum (Album album) {
        return albumRepository.save(album);
    }

    //hämta album med specifikt id
    public Optional<Album> getAlbumById (Long id) {
        return albumRepository.findById(id);
    }

    //hämta alla album
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    //uppdatera ett album
    public Album updateAlbum (Long id, Album albumDetails) {
        Optional<Album> albumOptional = albumRepository.findById(id);
        if (albumOptional.isPresent()) {
            Album album = albumOptional.get();
            album.setTitle(albumDetails.getTitle());
            album.setReleaseDate(albumDetails.getReleaseDate());
            return albumRepository.save(album);
        } else {
            throw new RuntimeException("Album not found");
        }
    }

    //ta bort album
    public void deleteAlbum (Long id) {
        albumRepository.deleteById(id);
    }

    //hämta album efter artistens namn
  /* public List<Album> getAlbumsByArtistName(String artistName) {
        return albumRepository.findByArtistName(artistName);
    } */

    //hämta album släppta efter ett visst datum
    public List<Album> getAlbumsReleasedAfter(LocalDate date) {
        return albumRepository.findByReleaseDateAfter(date);
    }

}
