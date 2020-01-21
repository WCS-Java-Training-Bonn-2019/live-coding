package com.wildcodeschool.livecodingspring.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.livecodingspring.entity.Book;
import com.wildcodeschool.livecodingspring.utils.JdbcUtils;

@Repository
public class BookRepository {

	private final static String DB_URL = "jdbc:mysql://localhost:3306/book_shop";
	private final static String DB_USER = "h4rryp0tt3r";
	private final static String DB_PASSWORD = "Horcrux4life!";

//  NOTE:
//	
//  Wenn die JDBC Resourcen als Member-Variablen (und nicht in den Methoden) definiert
//  würden, dann kann es zu Concurrency-Problemen kommen.

//	Connection conn = null;
//	PreparedStatement stmt = null;
//	ResultSet rs = null;

	public List<Book> getAll() {
		List<Book> books = new ArrayList<Book>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.prepareStatement("SELECT id, isbn13, title, authors, available_stock FROM book");
			rs = stmt.executeQuery();
			while (rs.next()) {
				long id = rs.getLong(1);
				String isbn13 = rs.getString(2);
				String title = rs.getString(3);
				String authors = rs.getString(4);
				int availableStock = rs.getInt(5);
				books.add(new Book(id, isbn13, title, authors, availableStock));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(stmt);
			JdbcUtils.closeConnection(conn);
		}
		return books;
	}

	public List<Book> findByTitleContaining(String titleSubString) {
		List<Book> books = new ArrayList<Book>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			stmt = conn.prepareStatement(
					"SELECT id, isbn13, title, authors, available_stock FROM book WHERE title LIKE ?");
			stmt.setString(1, "%" + titleSubString + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				long id = rs.getLong(1);
				String isbn13 = rs.getString(2);
				String title = rs.getString(3);
				String authors = rs.getString(4);
				int availableStock = rs.getInt(5);
				books.add(new Book(id, isbn13, title, authors, availableStock));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(stmt);
			JdbcUtils.closeConnection(conn);
		}
		return books;
	}

}
