# Spring Data JPA basics

## MySQL-DB anlegen
```
CREATE DATABASE IF NOT EXISTS `book_shop_jpa`;
GRANT ALL PRIVILEGES ON book_shop_jpa.* TO 'h4rryp0tt3r'@'localhost';
```

## Datasource / Spring JPA konfigurieren
```
# Information on the database to be used
spring.datasource.url=jdbc:mysql://localhost:3306/book_shop_jpa
spring.datasource.username=h4rryp0tt3r
spring.datasource.password=Horcrux4life!
```

## Entity-Klassen annotieren

### Class: @Entity (mandatory)
* @Table (optional)

### Field: @Id (mandatory)
* @GeneratedValue (optional)

### Field: @Column
* name
* nullable
* updatable
* insertable
* unique
* ...

## JPA aktivieren
```
# Allow the display of SQL queries made by Hibernate
spring.jpa.show-sql=true

# Table generation: none (default), create, create-drop, validate, update 
spring.jpa.hibernate.ddl-auto=none

# Selecting a "dialect" allows Hibernate to generate SQL adapted to the version chosen
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect  
```
  
## Daten kopieren
```
INSERT INTO book_shop_jpa.book (authors,available_stock,isbn13,title) (SELECT authors,available_stock,isbn13,title FROM book_shop.book);
```

## Creating query methods: Deriving from method name

https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-creating-database-queries-from-method-names/

https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords

### Beispiele
* findByTitle
* findByTitleContaining
* findByTitleContainingOrderByAvailableStockDesc
* findTop2ByTitleContainingOrderByAvailableStockDesc

### Links
* https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-creating-database-queries-from-method-names/
* https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords


## Creating query methods: Custom queries (JPQL / SQL)

### Beispiele
```
@Query("SELECT b FROM Book b WHERE LENGTH(isbn13) = :length")
List<Book> findByIsbnLength(int length);

@Query(value = "SELECT * FROM book WHERE LENGTH(isbn13) = :length", nativeQuery=true)
List<Book> findByIsbnLengthNative(int l);
```

## One-To-Many
## Many-To-Many
## Fetch types (immediate / lazy)
## Cascade types
