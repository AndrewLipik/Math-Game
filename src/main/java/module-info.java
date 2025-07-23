module com.example.mathgame1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.mathgame1 to javafx.fxml;
    exports com.example.mathgame1;
}