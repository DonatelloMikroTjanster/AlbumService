package com.nadia.albumservice.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "media_category", nullable = false, length = 150)
    private String mediaCategory;


    //getters & setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMediaCategory() {
        return mediaCategory;
    }

    public void setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
    }
}
