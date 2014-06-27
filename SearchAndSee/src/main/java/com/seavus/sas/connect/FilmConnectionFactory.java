package com.seavus.sas.connect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class FilmConnectionFactory {
	public static void main(String[] args) {
		Properties prop = new Properties();
		try {

			prop.load(new InputStreamReader(new FileInputStream(
					"bdpath.properties"), "UTF-8"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		String mylogin = prop.getProperty("login");
		String mypassword = prop.getProperty("password");
		String mydburl = prop.getProperty("dburl");
		String mydriver = prop.getProperty("driver");

		System.out.println(mylogin); // ВРЕМЕНННАЯ ПРОВЕРКА
		System.out.println(mypassword);
		System.out.println(mydburl);
		System.out.println("---------------------------------");

		try {
			Class.forName(mydriver);// Регистрируем драйвер
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;// Соединение с БД
		try {
			conn = DriverManager.getConnection(mydburl, mylogin, mypassword);// Установка
			// соединения
			// с БД

			Statement st = conn.createStatement();// Готовим запрос
			ResultSet rs = st.executeQuery("select * from users");// Выполняем
																	// запрос
																	// к БД,
																	// результат
																	// в
																	// переменной
																	// rs
			while (rs.next()) {
				System.out.println(rs.getString("Login"));// Последовательно для
															// каждой строки
															// выводим значение
															// из колонки
			

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Закрыть соединение
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
