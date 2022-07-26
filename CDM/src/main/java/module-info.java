module com.example.cdm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cdm to javafx.fxml;
    exports com.example.cdm;
    exports com.example.cdm.controllers;
    opens com.example.cdm.controllers to javafx.fxml;
}