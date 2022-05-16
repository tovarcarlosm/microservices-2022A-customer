INSERT INTO city (id, name) VALUES (1, 'Bogotá');
INSERT INTO city (id, name) VALUES (2, 'Cali');
INSERT INTO city (id, name) VALUES (3, 'Medellín');
INSERT INTO city (id, name) VALUES (4, 'Armenia');
INSERT INTO city (id, name) VALUES (5, 'Cartagena');

INSERT INTO customer (id, id_document, name, last_name, email, status, city_id)
VALUES (1, '1234567', 'Carlos', 'Tovar', 'carlos@tovar.com', 'CREATED', 2);

INSERT INTO customer (id, id_document, name, last_name, email, status, city_id)
VALUES (2, '1234200', 'Mauricio', 'Artunduaga', 'mao@ar.com', 'CREATED', 1);

INSERT INTO customer (id, id_document, name, last_name, email, status, city_id)
VALUES (3, '1234100', 'Juan Camilo', 'Torres', 'juan@torres.com', 'CREATED', 4);

INSERT INTO customer (id, id_document, name, last_name, email, status, city_id)
VALUES (4, '1234300', 'Javier', 'Rodríguez', 'javier@ro.com', 'CREATED', 4);

INSERT INTO customer (id, id_document, name, last_name, email, status, city_id)
VALUES (5, '1234400', 'Steven', 'Cardona', 'steven@ca.com', 'CREATED', 4);