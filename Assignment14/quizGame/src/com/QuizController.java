package com;
import java.sql.*;
import java.util.*;

public class QuizController {

    public static List<Question> getRandomQuestions() {
        List<Question> list = new ArrayList<>();

        String sql = "SELECT * FROM questions ORDER BY RAND() LIMIT 5";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Question(
                        rs.getString("question"),
                        rs.getString("optionA"),
                        rs.getString("optionB"),
                        rs.getString("optionC"),
                        rs.getString("optionD"),
                        rs.getString("correctOption").charAt(0)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
