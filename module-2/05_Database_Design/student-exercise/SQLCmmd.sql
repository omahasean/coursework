SELECT id, name, city_id, description
FROM venue
WHERE id = 6;


SELECT venue.id, category.id, category.name
FROM category
JOIN category_venue ON category.id = category_venue.category_id
JOIN venue ON category_venue.venue_id = venue.id
WHERE venue.id = 6
GROUP BY venue.id, category.id
;

SELECT  city.name, city.id, city.state_abbreviation, venue.name
From city
JOIN venue ON city.id = venue.city_id
WHERE venue.id = 6;

Select id, venue_id, name, is_accessible, open_from, open_to, daily_rate, max_occupancy
FROM Space
WHERE space.venue_id = 6;

Select space.id, venue_id, space.name, is_accessible, open_from, open_to, max_occupancy 
FROM space
JOIN venue ON space.venue_id = venue.id
JOIN reservation ON space.id = reservation.space_id AND reservation.start_date <>= 
WHERE open_from BETWEEN 2 AND 9 OR open_from IS NULL Limit 5;

Select space.id, venue_id, space.name, is_accessible, open_from, open_to, max_occupancy 
FROM space
JOIN venue ON space.venue_id = venue.id
WHERE space.id = 3

SELECT space.id, venue_id, space.name, is_accessible, open_from, open_to, max_occupancy 
FROM space
JOIN venue ON space.venue_id = venue.id
WHERE space.venue_id = 6

SELECT *
FROM reservation
JOIN space ON reservation.space_id = space.id
WHERE space.id=4

SELECT id, venue_id, name, is_accessible, open_from, open_to, daily_rate, max_occupancy
FROM space
WHERE id = 4;

SELECT id, venue_id, name, is_accessible, open_from, open_to, daily_rate, max_occupancy
FROM space
WHERE venue_id = 13 AND ((open_from IS NULL OR open_from <= 5) AND (open_to IS NULL OR open_to >=6)) AND max_occupancy>100

SELECT reservation_id
FROM reservation
WHERE space_id = 20 AND number_of_attendees = 145;

Begin transaction;
INSERT INTO reservation (space_id, number_of_attendees, start_date, end_date, reserved_for)
VALUES (4, 105, '2020-12-1', '2020-12-5', 'Karens Anonymous')


SELECT*
FROM reservation
WHERE space_id = 71;
ROLLBACK;
Begin transaction;
DELETE 
FROM reservation
WHERE reserved_for = 'Sean';
ROLLBACK;


COMMIT;