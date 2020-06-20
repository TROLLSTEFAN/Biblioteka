module proj {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports org.example to javafx.graphics;
    opens org.example to javafx.fxml;


}