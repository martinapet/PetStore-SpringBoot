INSERT INTO Pet (owner, name, type, description, dateOfBirth) VALUES ('Martina Petrovska', 'Charlie', 'Dog', 'This pet is a dog!', '06.12.2014');
INSERT INTO Pet (owner, name, type, description, dateOfBirth) VALUES ('Simon Simonovski', 'Bruno', 'Dog', 'This pet is a dog!', '12.08.2020');
INSERT INTO Pet (owner, name, type, description, dateOfBirth) VALUES ('Jana Janevska', 'Bela', 'Cat', 'This pet is a cat!', '06.07.2018');
INSERT INTO Pet (owner, name, type, description, dateOfBirth) VALUES ('Ivan Ivanovski', 'Bak', 'Dog', 'This pet is a dog!', '03.04.2015');
INSERT INTO Pet (owner, name, type, description, dateOfBirth) VALUES ('Dora Jovanovska', 'Una', 'Cat', 'This pet is a cat!', '22.09.2017');

INSERT INTO Dog (price) 
WHERE Pet p, Dog d 
JOIN p.owner == d.owner and p.name == d.name
VALUES (300)

INSERT INTO Cat (price) 
WHERE Pet p, Cat c 
JOIN p.owner == c.owner and p.name == c.name
VALUES (100)

INSERT INTO User (owner, name, type, description, dateOfBirth) VALUES ('Martina', 'Petrovska', 'petrovskamartina98@gmail.com', '500', '[Charlie, Marley]');
