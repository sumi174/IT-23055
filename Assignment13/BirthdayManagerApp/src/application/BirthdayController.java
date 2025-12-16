package application;

import java.sql.*;
import java.time.LocalDate;

public class BirthdayController {

    public static void addBirthday(String name, LocalDate date) {
        String sql = "INSERT INTO birthdays(name, birth_date) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setDate(2, Date.valueOf(date));
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet getAllBirthdays() {
        String sql = "SELECT * FROM birthdays ORDER BY birth_date";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getTodayBirthday() {
        String sql = "SELECT name FROM birthdays WHERE birth_date = CURDATE()";
        StringBuilder names = new StringBuilder();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                names.append(rs.getString("name")).append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return names.toString();
    }
}
