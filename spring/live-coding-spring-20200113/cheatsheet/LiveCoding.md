## JDBC: CRUD
* Datenbank anlegen
* Datenbank befüllen (CSV)
* Book
  * getAll
* JdbcUtils: JDBC-Resource-Leaks
* Concurrency
* findByTitle
* Statement vs PreparedStatement
  * SQL injection 

```
CREATE DATABASE IF NOT EXISTS `book_shop`;
USE `book_shop`;
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn13` varchar(20) NOT NULL,  
  `title` varchar(100) NOT NULL,  
  `authors` varchar(200) DEFAULT NULL,
  `available_stock` int(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
);
GRANT ALL PRIVILEGES ON book_shop.* TO 'h4rryp0tt3r'@'localhost';
```

```
INSERT INTO book_shop.book (isbn13, title, authors, available_stock) VALUES ('978-1529035650', 'Permanent Record', 'Edward Snowden', 99);
```