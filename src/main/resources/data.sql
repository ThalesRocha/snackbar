INSERT INTO ingredient(name, price) values ('Alface',0.4);
INSERT INTO ingredient(name, price) values ('Bacon',2.00);
INSERT INTO ingredient(name, price) values ('Hambúrguer de Carne',3.00);
INSERT INTO ingredient(name, price) values ('Ovo',0.80);
INSERT INTO ingredient(name, price) values ('Queijo',1.50);

INSERT INTO sandwich(name) values ('X-Bacon');
INSERT INTO sandwich(name) values ('X-Burger');
INSERT INTO sandwich(name) values ('X-Egg');
INSERT INTO sandwich(name) values ('X-Egg Bacon');

--X-Bacon
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (1, 2);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (1, 3);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (1, 5);
--X-Brguer
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (2, 3);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (2, 5);
--X-Egg
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (3, 4);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (3, 3);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (3, 5);
--X-Egg bacon
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (4, 4);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (4, 2);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (4, 3);
INSERT INTO sandwich_ingredient(sandwich_id, ingredient_id) values (4, 5);