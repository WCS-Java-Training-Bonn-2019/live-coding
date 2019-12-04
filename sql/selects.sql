-- Simples SELECT
SELECT *
FROM employees;

-- LIMIT (Offset, Anzahl)
SELECT *
FROM employees
LIMIT 5,5;

-- WHERE
SELECT *
FROM employees
WHERE last_name='Zielinski' AND first_name='Mahmut';

SELECT *
FROM employees
WHERE last_name='Zielinski' AND (first_name LIKE 'M%' OR first_name LIKE 'S%');

-- ORDER BY
SELECT *
FROM employees
WHERE last_name='Zielinski'
ORDER BY first_name;

SELECT *
FROM employees
WHERE last_name='Zielinski'
ORDER BY hire_date, first_name;

SELECT *
FROM employees
WHERE last_name='Zielinski'
ORDER BY hire_date ASC, first_name DESC;

-- INNER SELECT
SELECT *
FROM employees
WHERE emp_no=(
	SELECT emp_no
	FROM salaries
	ORDER BY salary DESC
    LIMIT 1
);

-- UNION
(SELECT dept_name AS name
FROM departments
LIMIT 5)
UNION
(SELECT last_name AS name
FROM employees
LIMIT 5);

-- DISTINCT
SELECT DISTINCT last_name
FROM employees
WHERE last_name='Zielinski';
