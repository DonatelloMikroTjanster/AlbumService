package com.nadia.albumservice.Services;

import com.nadia.albumservice.Entities.Track;
import com.nadia.albumservice.Repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;


    public Track createTrack(Track track) {
        return trackRepository.save(track);
    }

    public Optional<Track> getTrackById(Long id) {
        return trackRepository.findById(id);
    }

    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    public Track updateTrack(Long id, Track trackDetails) {
        Optional<Track> trackOptional = trackRepository.findById(id);
        if (trackOptional.isPresent()) {
            Track track = trackOptional.get();
            track.setTitle(trackDetails.getTitle());
            track.setReleaseDate(trackDetails.getReleaseDate());
            return trackRepository.save(track);
        } else {
            throw new RuntimeException("Track not found");
        }
    }

    public void deleteTrack(Long id) {
        trackRepository.deleteById(id);
    }

    public List<Track> getTracksByTitle(String name) {
        return trackRepository.findByTitle(name);
    }
}
