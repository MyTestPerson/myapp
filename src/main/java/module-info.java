module com.myapp.parse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.myapp.parse to javafx.fxml;
    exports com.myapp.parse;
}