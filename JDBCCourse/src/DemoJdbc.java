import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "0000";

//        String query = "select * from student";
//        String query = "update student set sname = 'Max' where sid = 7";
//        String query = "delete from student where sid = 7";
        String query = "insert into student values(?,?,?)";

        int sid = 11;
        String sname = "Jack";
        int marks = 65;

        Class.forName("org.postgresql.Driver");
        System.out.println("Connection Established");

        Connection conn = DriverManager.getConnection(url, username, password);
//        Statement stmt = conn.createStatement();
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, sid);
        stmt.setString(2, sname);
        stmt.setInt(3, marks);

//        ResultSet rs = stmt.executeQuery(query);
//        while (rs.next()) {
//            int sid = rs.getInt("sid");
//            String sname = rs.getString("sname");
//            int marks = rs.getInt("marks");
//            System.out.println("sid: " + sid + ", sname: " + sname + ", marks: " + marks);
//        }

        stmt.execute();

        conn.close();
        System.out.println("Connection Closed");
    }
}
