module com.example.dealership {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dealership to javafx.fxml;
    exports com.example.dealership;
}