-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
        INSERT INTO actor (first_name, last_name)
        VALUES ('Lisa', 'Byway')
        SELECT first_name, last_name
        FROM actor
        WHERE first_name = 'Lisa'
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
        BEGIN TRANSACTION;
        ROLLBACK;
        COMMIT;
        INSERT INTO film (title, description, release_year, language_id, length)
        VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198)
        SELECT title, description, release_year
        FROM film
        WHERE title = 'Euclidean PI'
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
        BEGIN TRANSACTION;
        ROLLBACK;
        COMMIT;
        SELECT actor_id, first_name, last_name
        FROM actor
        WHERE first_name = 'Hampton' OR first_name='Lisa'
        SELECT film_id
        FROM film
        WHERE title = 'Euclidean PI'
        INSERT INTO film_actor (actor_id, film_id)
        VALUES (202, 1001)
-- 4. Add Mathmagical to the category table.
        INSERT INTO category (name)
        VALUES ('Mathemagical')
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
        BEGIN TRANSACTION;
        ROLLBACK;
        COMMIT;
        SELECT title, film_id
        FROM film
        WHERE title = 'EGG IGBY'
        UPDATE film_category SET category_id = 17 WHERE film_id = 996
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
        UPDATE film SET rating = 'G' WHERE film_id = 1001;
-- 7. Add a copy of "Euclidean PI" to all the stores.
        INSERT INTO inventory (film_id, store_id)
        VALUES (1001, 2)
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

        --You cannot delete Euclidean PI because it is referenced as a foreign key in other tables such as inventory and category
        
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
        --DELETE FROM category WHERE name = 'Mathemagical'
        --It is referenced on other tables 
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
        ROLLBACK;
        DELETE FROM film_category WHERE category_id = '17'
        --Yes, this is a relational table composed of foreign keys that are not required
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
        DELETE FROM category WHERE name = 'Mathemagical'
        --After removing the link that was preventing the deletion, the row is removable.
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
        /*
       -Removal of Euclidean PI would be allowed once the film_actor was uncoupled from its film ID
       -After removal of film_actor, remove the film from inventory
       -After removal from inventory the film should be deleteable (no references outside from tables that draw on its data)
       */
       
       
       