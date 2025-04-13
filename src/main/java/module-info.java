module org.example.registrationform {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.registrationform to javafx.fxml;
    exports org.example.registrationform;
}