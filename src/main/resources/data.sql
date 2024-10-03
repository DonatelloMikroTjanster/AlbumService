-- Insert Genres
INSERT IGNORE INTO genre (id, name)
VALUES
    (1, 'Rock'),
    (2, 'Pop'),
    (3, 'Technology'),
    (4, 'Nature');

-- Insert Artists
INSERT IGNORE INTO artist (id, name, genre_id)
VALUES
    (1, 'The Beatles', 1),
    (2, 'Michael Jackson', 2),
    (3, 'Elon Musk', 3),
    (4, 'David Attenborough', 4);

-- Insert Albums
INSERT IGNORE INTO album (id, name, release_date)
VALUES
    (1, 'Abbey Road', '1969-09-26'),
    (2, 'Thriller', '1982-11-30'),
    (3, 'Tech Talk Series', '2023-01-01'),
    (4, 'Planet Earth II Series', '2016-11-06');

-- Insert Album-Artist relationships
INSERT IGNORE INTO album_artist (album_id, artist_id)
VALUES
    (1, 1),  -- Abbey Road - The Beatles
    (2, 2),  -- Thriller - Michael Jackson
    (3, 3),  -- Tech Talk Series - Elon Musk
    (4, 4);  -- Planet Earth II Series - David Attenborough

-- Insert Tracks
INSERT IGNORE INTO track (id, title, release_date, album_id)
VALUES
    (1, 'Come Together', '1969-09-26', 1),
    (2, 'Billie Jean', '1982-11-30', 2),
    (3, 'Tech Talk Episode 1', '2023-01-01', 3);

-- Insert Media with album associations
INSERT IGNORE INTO media (id, title, media_type, genre_id, release_date, url, duration, album_id)
VALUES
    (1, 'Tech Talk Episode 1', 'Podcast', 3, '2023-01-01', 'http://example.com/tech-talk-1', '30:00', 3),
    (2, 'Planet Earth II Episode 1', 'Documentary', 4, '2016-11-06', 'http://example.com/planet-earth-2-1', '60:00', 4),
    (3, 'Come Together', 'Song', 1, '1969-09-26', 'http://example.com/come-together', '4:20', 1),
    (4, 'Billie Jean', 'Song', 2, '1982-11-30', 'http://example.com/billie-jean', '4:54', 2);


