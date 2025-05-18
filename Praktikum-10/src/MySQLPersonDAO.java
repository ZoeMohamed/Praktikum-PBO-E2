
/* Nama File : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 15/05/2025
 */
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo", "root", "root");
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}