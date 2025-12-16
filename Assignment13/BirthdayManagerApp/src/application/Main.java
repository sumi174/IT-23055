package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.time.LocalDate;

public class Main extends Application {

    TableView<String> table = new TableView<>();
    ObservableList<String> data = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {

        Label title = new Label("জন্মদিন ব্যবস্থাপনা সিস্টেম");

        TextField nameField = new TextField();
        nameField.setPromptText("নাম লিখুন");

        DatePicker datePicker = new DatePicker();

        Button addBtn = new Button("যোগ করুন");

        TableColumn<String, String> col = new TableColumn<>("জন্মদিন তালিকা");
        col.setCellValueFactory(d -> new javafx.beans.property.SimpleStringProperty(d.getValue()));
        col.setPrefWidth(450);

        table.getColumns().add(col);
        table.setItems(data);

        addBtn.setOnAction(e -> {
            String name = nameField.getText();
            LocalDate date = datePicker.getValue();

            if (!name.isEmpty() && date != null) {
                BirthdayController.addBirthday(name, date);
                loadData();
                nameField.clear();
                datePicker.setValue(null);
            }
        });

        VBox layout = new VBox(10,
                title,
                new Label("Name"), nameField,
                new Label("Birthdate"), datePicker,
                addBtn,
                table
        );

        loadData();
        showTodayBirthday();

        Scene scene = new Scene(layout, 500, 600);
        stage.setScene(scene);
        stage.setTitle("Birthday App");
        stage.show();
    }

    private void loadData() {
        data.clear();
        try {
            ResultSet rs = BirthdayController.getAllBirthdays();
            while (rs.next()) {
                data.add(rs.getString("name") + " - " + rs.getDate("birth_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showTodayBirthday() {
        String today = BirthdayController.getTodayBirthday();
        if (!today.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notification");
            alert.setHeaderText("Today's Birthday");
            alert.setContentText(today);
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
