module com.example.repo7_rgbcodes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo7_rgbcodes to javafx.fxml;
    exports com.example.repo7_rgbcodes;
}