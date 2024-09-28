package com.nadia.albumservice.Controllers;

import com.nadia.albumservice.Entities.Track;
import com.nadia.albumservice.Services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tracks")
public class TrackController {

    @Autowired
    private TrackService trackService;


    @PostMapping("/addtrack")
    public ResponseEntity<Track> createTrack(@RequestBody Track track) {
        Track newTrack = trackService.createTrack(track);
        return ResponseEntity.ok(newTrack);
    }

    @GetMapping("/trackbyid/{id}")
    public ResponseEntity<Track> getTrackById(@PathVariable Long id) {
        Optional<Track> trackOptional = trackService.getTrackById(id);
        if (trackOptional.isPresent()) {
            return ResponseEntity.ok(trackOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }


    @GetMapping("/alltracks")
    public ResponseEntity<List<Track>> getAllTracks() {
        List<Track> trackList = trackService.getAllTracks();
        return ResponseEntity.ok(trackList);
    }

    @PutMapping("/updatetrack/{id}")
    public ResponseEntity<Track> updateTrack(@PathVariable Long id, @RequestBody Track trackDetails) {
        try {
            Track updatedTrack = trackService.updateTrack(id, trackDetails);
            return ResponseEntity.ok(updatedTrack);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deletetrack{id}")
    public ResponseEntity<Void> deleteTrack(@PathVariable Long id) {
        trackService.deleteTrack(id);
        return ResponseEntity.noContent().build();
    }

    //hämta track via titel
    @GetMapping("/title/{title}")
    public ResponseEntity<List<Track>> getTrackByTitle(@PathVariable String title) {
        List<Track> trackList = trackService.getTracksByTitle(title);
        return ResponseEntity.ok(trackList);
    }
}
