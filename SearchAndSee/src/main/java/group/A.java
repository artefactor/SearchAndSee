package group;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class A {

	static {
		System.out.println("static initialization block A");
	}

	{
		System.out.println("initialization block");
	}

	public static void main(String[] args) {
		System.out.println("main");
		new A();
		new C();
		try {
			Class.forName("B");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public A() {
		System.out.println("constructor");
	}

	{
		System.out.println("initialization block 2");
	}
}
class B{
	static {
		System.out.println("static initialization block B");
	}

}
class C implements Driver{
	static {
		System.out.println("static initialization block C");
		// register in DriverManager
		try {
			DriverManager.registerDriver(new C());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
/**/