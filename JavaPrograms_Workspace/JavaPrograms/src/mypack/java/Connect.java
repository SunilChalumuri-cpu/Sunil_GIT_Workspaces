package mypack.java;

import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.PreparedStatement;

public class Connect {
	public static void main(String[] ar) {
		try {
			// ---For Oracle--
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con = DriverManager.getConnection(
					// "jdbc:oracle:thin:@<hostname>:<port>/<service_name>", "username",
					// "password");
					"jdbc:oracle:thin:@192.168.1.40:1521/XE", "SYSTEM",
					"12345678"); */

            // ---For PostgreSQL--
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://ep-billowing-frog-aiaqy03p-pooler.c-4.us-east-1.aws.neon.tech/neondb?user=neondb_owner&password=neonpassword");
			con.setAutoCommit(false);
			System.out.println("connection established");
/* 			PreparedStatement ps = null;
//			ps = con.prepareStatement("SELECT * FROM ACCOUNT WHERE ACC_NO = ?");
//			ps.setString(1, "Peter");
			ps = con.prepareStatement("SELECT * FROM ACCOUNT ");
			ResultSet rs = ps.executeQuery();
			System.out.println("Data Fetched from table ACCOUNT:");
			System.out.println("ACC_NO   |  ACC_NAME    |  ACC_TYPE   |  BAL");
			while (rs.next()) {
				System.out.println("------------------------------------------------");
				System.out.println(rs.getInt("ACC_NO") + "        " + rs.getString("ACC_NAME") + "        "
						+ rs.getString("ACC_TYPE") + "     " + rs.getDouble("BAL"));
			}
			rs.close();*/
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}