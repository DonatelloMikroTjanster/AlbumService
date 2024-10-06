








-- Insert Albums
INSERT IGNORE INTO album (id, name, release_date)
VALUES
    (1, 'Abbey Road', '1969-09-26'),
    (2, 'Thriller', '1982-11-30'),
    (3, 'Tech Talk Series', '2023-01-01'),
    (4, 'Planet Earth II Series', '2016-11-06');


-- Insert tracks with album association
INSERT IGNORE INTO track (title, release_date, album_id)
VALUES
    ('Come Together', '1969-09-26', 1),
    ('Billie Jean', '1982-11-30', 2),
    ('Tech Talk Episode 1', '2023-01-01', 3),
    ('The Future of Tech II', '2023-03-01', 3),
    ('Planet Earth II Episode 1', '2016-11-06', 4),
    ('Nature Wonders', '2018-01-05', 4),
    ('Jazz Beats', '2022-02-01', 3),
    ('Technology Insights', '2023-04-05', 3),

-- Insert tracks with no album association
    ('So What', '1959-08-17', NULL),
    ('Beethoven Symphony No. 9', '1824-05-07', NULL),
    ('Jazz Vibes Episode 2', '2022-06-08', NULL),
    ('Rock Legends Vol 2', '1997-08-22', NULL),
    ('Pop Classics', '2021-09-30', NULL),
    ('Classical Masterpieces', '2023-04-01', NULL),
    ('Rock Legends Vol 3', '1999-10-10', NULL),
    ('Pop Forever', '2022-11-18', NULL),
    ('Classical Elegance', '1810-12-20', NULL),
    ('Tech Innovators', '2023-05-15', NULL),
    ('Exploring Nature', '2021-05-20', NULL);





-- Insert into album_artist link table
INSERT IGNORE INTO album_artist (album_id, artist_id)
VALUES
    (1, 1),  -- Abbey Road by The Beatles
    (2, 2),  -- Thriller by Michael Jackson
    (3, 3),  -- Tech Talk Series by Elon Musk
    (4, 4);  -- Planet Earth II Series by David Attenborough