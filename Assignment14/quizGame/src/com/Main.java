package com;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.util.List;

public class Main extends Application {

    // ===== Global Variables =====
    int index = 0;
    int score = 0;
    int time = 15;

    List<Question> questions;
    Timeline timer;
    Label timerLabel = new Label();

    @Override
    public void start(Stage stage) {

        // ===== UI Components =====
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        Label questionLabel = new Label();

        RadioButton a = new RadioButton();
        RadioButton b = new RadioButton();
        RadioButton c = new RadioButton();
        RadioButton d = new RadioButton();

        ToggleGroup tg = new ToggleGroup();
        a.setToggleGroup(tg);
        b.setToggleGroup(tg);
        c.setToggleGroup(tg);
        d.setToggleGroup(tg);

        Button next = new Button("Next");
        Button restart = new Button("Restart");
        Button exit = new Button("Exit");

        timerLabel.setText("Time: " + time);

        // ===== Layout =====
        VBox root = new VBox(10, nameField, timerLabel, questionLabel, a, b, c, d, next, restart, exit);
        Scene scene = new Scene(root, 400, 450);
        stage.setTitle("Quiz Game");
        stage.setScene(scene);
        stage.show();

        // ===== Load Questions =====
        questions = QuizController.getRandomQuestions();
        loadQuestion(questionLabel, a, b, c, d);

        // ===== Timer Setup =====
        timer = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> {
                    time--;
                    timerLabel.setText("Time: " + time);
                    if (time == 0) {
                        next.fire(); // auto next
                    }
                })
        );
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();

        // ===== Next Button Logic =====
        next.setOnAction(e -> {
            RadioButton selected = (RadioButton) tg.getSelectedToggle();
            if (selected != null) {
                char answer = selected.getText().charAt(0);
                if (answer == questions.get(index).correctOption) {
                    score++;
                }
            }
            index++;
            tg.selectToggle(null);

            if (index < questions.size()) {
                loadQuestion(questionLabel, a, b, c, d);
            } else {
                timer.stop();
                saveResult(nameField.getText(), score);
                questionLabel.setText("Quiz Finished! Your Score: " + score);
            }
        });

        // ===== Restart Button Logic =====
        restart.setOnAction(e -> {
            index = 0;
            score = 0;
            questions = QuizController.getRandomQuestions();
            loadQuestion(questionLabel, a, b, c, d);

            time = 15;
            timerLabel.setText("Time: " + time);
            timer.playFromStart();
        });

        // ===== Exit Button =====
        exit.setOnAction(e -> stage.close());
    }

    // ===== Load Question Method =====
    void loadQuestion(Label q, RadioButton a, RadioButton b, RadioButton c, RadioButton d) {
        Question qu = questions.get(index);
        q.setText(qu.question);
        a.setText("A " + qu.optionA);
        b.setText("B " + qu.optionB);
        c.setText("C " + qu.optionC);
        d.setText("D " + qu.optionD);

        time = 15;
        timerLabel.setText("Time: " + time);
    }

    // ===== Save Result to Database =====
    void saveResult(String name, int score) {
        String sql = "INSERT INTO results(player_name, score) VALUES (?, ?)";
        try (var con = DBConnection.getConnection(); var ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, score);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
