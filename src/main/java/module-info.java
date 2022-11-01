module com.example.fibonacci {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fibonacci to javafx.fxml;
    exports com.example.fibonacci;
}