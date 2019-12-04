-- Testtabellen aufsetzen
CREATE TABLE owner (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(80)
);
CREATE TABLE pet (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(80),
    owner_id INT,
    CONSTRAINT FOREIGN KEY (owner_id) REFERENCES owner(id) ON UPDATE CASCADE ON DELETE CASCADE
);
INSERT INTO owner (name) VALUES
   ('John'),
   ('Jake'),
   ('Jane'),
   ('Jeff'),
   ('Jyll')
;
INSERT INTO pet(name,owner_id) VALUES
   ('Garfield',1),
   ('Odie',2),
   ('Nessie',3),
   ('Grumpy',4),
   ('Nyan',null)
;

-- Kreuzprodukt
SELECT *
FROM owner,pet;

-- Kreuzprodukt über WHERE eingeschränkt (= JOIN)
SELECT *
FROM owner,pet
WHERE owner.id=pet.owner_id;

-- INNER (STANDARD)
SELECT * FROM owner JOIN pet ON owner.id=pet.owner_id;

-- NATURAL JOIN
SELECT * FROM owner JOIN pet;

-- LEFT (OUTER)
SELECT * FROM owner LEFT JOIN pet ON owner.id=pet.owner_id;

-- RIGHT (OUTER)
SELECT * FROM owner RIGHT JOIN pet ON owner.id=pet.owner_id;

-- FULL (OUTER) 
-- SELECT * FROM owner FULL OUTER JOIN pet ON owner.id=pet.owner_id;

-- Wird nicht von MySQL unterstützt, kann aber wie folgt realisiert werden:
SELECT * FROM owner
LEFT JOIN pet ON owner.id=pet.owner_id
UNION ALL
SELECT * FROM pet
RIGHT JOIN owner ON owner.id=pet.owner_id
WHERE pet.id IS NULL;
