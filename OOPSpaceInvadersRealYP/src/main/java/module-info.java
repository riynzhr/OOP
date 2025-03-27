module com.example.oopspaceinvadersrealyp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopspaceinvadersrealyp to javafx.fxml;
    exports com.example.oopspaceinvadersrealyp;
}