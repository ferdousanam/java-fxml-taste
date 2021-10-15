module com.anam.accounting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anam to javafx.fxml;
    exports com.anam;
    opens com.components to javafx.fxml;
    exports com.components;
    opens com.app.controllers to javafx.fxml;
    exports com.app.controllers;
}