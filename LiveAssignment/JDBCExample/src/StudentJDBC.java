import java.sql.*;
import java.util.Scanner;

public class StudentJDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to Database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "@Sumi17"
            );

            System.out.println("Connected to Database");

            Scanner input = new Scanner(System.in);

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter marks: ");
            int marks = input.nextInt();

            String sql = "INSERT INTO student(name, marks) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, marks);

            ps.executeUpdate();

            System.out.println("Data inserted\n");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("marks")
                );
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}