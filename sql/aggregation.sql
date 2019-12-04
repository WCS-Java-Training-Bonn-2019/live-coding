-- benötigt MySQL employees test database
-- https://github.com/datacharmer/test_db

-- Aggregatfunktion
SELECT COUNT(*) AS anzahl
FROM employees;

-- GROUP BY
SELECT COUNT(*) AS anzahl,hire_date
FROM employees
GROUP BY hire_date
ORDER BY anzahl DESC;

-- GROUP BY mit HAVING
SELECT COUNT(*) AS anzahl,hire_date
FROM employees
GROUP BY hire_date
HAVING anzahl > 130
ORDER BY anzahl DESC;

-- 2-stufiges GROUP BY
SELECT COUNT(*) AS anzahl,hire_date,gender
FROM employees
WHERE last_name LIKE 'S%'
GROUP BY hire_date,gender
ORDER BY anzahl DESC;
