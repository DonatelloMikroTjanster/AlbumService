package com.nadia.albumservice.Controllers;

import com.nadia.albumservice.Entities.Album;
import com.nadia.albumservice.Services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/addalbum")
    public ResponseEntity<Album> createAlbum(@RequestBody Album album) {
        Album createdAlbum = albumService.createAlbum(album);
        return ResponseEntity.ok(createdAlbum);
    }

    @GetMapping("/albumbyid/{id}")
    public ResponseEntity<Album> getAlbumById(@PathVariable long id) {
        Optional<Album> albumOptional = albumService.getAlbumById(id);
        if (albumOptional.isPresent()) {
            return ResponseEntity.ok(albumOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/allalbums")
    public ResponseEntity<List<Album>> getAllAlbums() {
        List<Album> albums = albumService.getAllAlbums();
        return ResponseEntity.ok(albums);
    }

    @PutMapping("/updatealbum/{id}")
    public ResponseEntity<Album> updateAlbum(@PathVariable long id, @RequestBody Album albumDetails) {
        try {
            Album updatedAlbum = albumService.updateAlbum(id, albumDetails);
            return ResponseEntity.ok(updatedAlbum);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("deletealbum/{id}")
    public ResponseEntity<Album> deleteAlbum(@PathVariable long id) {
        albumService.deleteAlbum(id);
        return ResponseEntity.ok().build();
    }
 //hämta album släppta efter ett visst datum
    @GetMapping("released-after/{date}")
    public ResponseEntity<List<Album>> getReleasedAlbumAfter(@PathVariable String date) {
        LocalDate parsedDate = LocalDate.parse(date);
        List<Album> albums = albumService.getAlbumsReleasedAfter(parsedDate);
        return ResponseEntity.ok(albums);
    }

  /*  @GetMapping("/artist/{artistName}")
    public ResponseEntity<List<Album>> getAlbumsByArtistName(@PathVariable String artistName) {
        List<Album> albums = albumService.getByArtistName(artistName);
        return ResponseEntity.ok(albums);
    }
    */


}
