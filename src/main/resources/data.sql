INSERT INTO album (id, title, release_date)
VALUES
    (1, 'Abbey Road', '1969-09-26'),
    (2, 'Thriller', '1982-11-30');

INSERT INTO artist (id, name)
VALUES
    (1, 'The Beatles'),
    (2, 'Michael Jackson');

INSERT INTO track (id, title, release_date, album_id)
VALUES
    (1, 'Come Together', '1969-09-26', 1),
    (2, 'Billie Jean', '1982-11-30', 2);

INSERT INTO media (id, title, media_category)
VALUES
    (1, 'Tech Talk Episode 1', 'Podcast'),
    (2, 'Planet Earth II Episode 1', 'Documentary');

INSERT INTO album_artist (album_id, artist_id)
VALUES
    (1, 1),  -- Abbey Road - The Beatles
    (2, 2);  -- Thriller - Michael Jackson
