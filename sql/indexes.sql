-- benötigt MySQL employees test database
-- https://github.com/datacharmer/test_db

-- Tabelle enthält 2,8 Mio. Datensätze
SELECT COUNT(*) FROM salaries;

-- Filter ohne Index
SELECT * FROM salaries WHERE salary < 39000;

-- Index anlegen
CREATE INDEX idx_salaries_salary ON salaries (salary);

-- Filter mit Index -> um Größenordnungen schneller
SELECT * FROM salaries WHERE salary < 39000;

-- Index wieder löschen
DROP INDEX idx_salaries_salary ON salaries;
