


-- Insert Albums
INSERT IGNORE INTO album (id, name, release_date)
VALUES
    (1, 'Abbey Road', '1969-09-26'),
    (2, 'Thriller', '1982-11-30'),
    (3, 'Tech Talk Series', '2023-01-01'),
    (4, 'Planet Earth II Series', '2016-11-06');




-- Insert into album_artist link table
INSERT IGNORE INTO album_artist (album_id, artist_id)
VALUES
    (1, 1),  -- Abbey Road by The Beatles
    (2, 2),  -- Thriller by Michael Jackson
    (3, 3),  -- Tech Talk Series by Elon Musk
    (4, 4);  -- Planet Earth II Series by David Attenborough