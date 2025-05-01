module com.thoai.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thoai.firstapp to javafx.fxml;
    exports com.thoai.firstapp;
}