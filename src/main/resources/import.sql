INSERT INTO recipes (name, description) VALUES ('Spaghetti Bolognese', 'A classic Italian pasta dish with a rich meat sauce.');
INSERT INTO recipes (name, description) VALUES ('Tacos', 'A traditional Mexican dish with various fillings in a folded tortilla.');
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Spaghetti', 'g', 1, 100, 1);
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Ground beef', 'g', 1, 200, 1);
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Tomato sauce', 'ml', 1, 250, 1);
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Romaine lettuce', 'g', 1, 200, 2);
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Grilled chicken', 'g', 1, 150, 2);
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Croutons', 'g', 1, 50, 2);
INSERT INTO ingredients (name, unit, user_id, weight, recipe_id) VALUES ('Caesar dressing', 'ml', 1, 50, 2);
INSERT INTO _user (email, firstname, lastname, password, role) VALUES ('johndoe@example.com', 'John', 'Doe', '$2a$10$Pn1y4nwUhC9oa8lwVsaGeOSAHhzBN03k8AcWbBkyfhwvfllG7FROC', 'USER');



