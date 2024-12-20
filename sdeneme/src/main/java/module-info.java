module com.example.sdeneme {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.sdeneme to javafx.fxml;
    exports com.example.sdeneme;
}