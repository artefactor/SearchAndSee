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

		System.out.println(mylogin); // ���������� ��������
		System.out.println(mypassword);
		System.out.println(mydburl);
		System.out.println("---------------------------------");

		try {
			Class.forName(mydriver);// ������������ �������
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;// ���������� � ��
		try {
			conn = DriverManager.getConnection(mydburl, mylogin, mypassword);// ���������
			// ����������
			// � ��

			Statement st = conn.createStatement();// ������� ������
			ResultSet rs = st.executeQuery("select * from users");// ���������
																	// ������
																	// � ��,
																	// ���������
																	// �
																	// ����������
																	// rs
			while (rs.next()) {
				System.out.println(rs.getString("Login"));// ��������������� ���
															// ������ ������
															// ������� ��������
															// �� �������
			

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ������� ����������
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
