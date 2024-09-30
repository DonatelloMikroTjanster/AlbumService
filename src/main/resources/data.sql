-- Insert Albums
INSERT INTO album (id, name, release_date)
VALUES
    (1, 'Abbey Road', '1969-09-26'),
    (2, 'Thriller', '1982-11-30');

-- Insert Artists
INSERT INTO artist (id, name, genre)
VALUES
    (1, 'The Beatles', 'Rock'),
    (2, 'Michael Jackson', 'Pop');

-- Insert Tracks
INSERT INTO track (id, title, release_date, album_id)
VALUES
    (1, 'Come Together', '1969-09-26', 1),
    (2, 'Billie Jean', '1982-11-30', 2);

-- Insert Media
INSERT INTO media (id, title, media_type, genre, release_date, url, duration)
VALUES
    (1, 'Tech Talk Episode 1', 'Podcast', 'Technology', '2023-01-01', 'http://example.com/tech-talk-1', '30:00'),
    (2, 'Planet Earth II Episode 1', 'Documentary', 'Nature', '2016-11-06', 'http://example.com/planet-earth-2-1', '60:00');

-- Insert Album-Artist relationships
INSERT INTO album_artist (album_id, artist_id)
VALUES
    (1, 1),  -- Abbey Road - The Beatles
    (2, 2);  -- Thriller - Michael Jackson