import java.sql.*;

public class ConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "";
//        String sql = "INSERT INTO student (code, name, age, school) " +
//                "VALUES (34, 'John Doe', 20, 'XYZ School')";

        String sql = "SELECT * FROM student";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Connected to the database");
            }

            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                int code = result.getInt(1);
                String name = result.getString(2);
                int age = result.getInt(3);
                String school = result.getString(4);
                System.out.println("code:" + code + "name:" + name + "Age:" + age + "SChool:" + school );
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
