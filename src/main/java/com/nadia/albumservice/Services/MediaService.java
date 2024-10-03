package com.nadia.albumservice.Services;

import com.nadia.albumservice.Entities.Media;
import com.nadia.albumservice.Repositories.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    //hämta all media
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    //skapa ny media
    public Media createMedia(Media media) {
        return mediaRepository.save(media);
    }

    //hämta media med specifikt id
    public Optional<Media> getMediaById(Long id) {
        return mediaRepository.findById(id);
    }

    //uppdatera media
    public Media updateMedia(Long id, Media mediaDetails) {
        Optional<Media> mediaOptional = mediaRepository.findById(id);
        if (mediaOptional.isPresent()) {
            Media media = mediaOptional.get();
            media.setTitle(mediaDetails.getTitle());
            media.setMediaType(mediaDetails.getMediaType());
            return mediaRepository.save(media);
        } else {
            throw new RuntimeException("Media not found");
        }
    }

    //ta bort media
    public void deleteMedia(Long id) {
        mediaRepository.deleteById(id);
    }
}
