module com.example.sort_proj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sort_proj to javafx.fxml;
    exports com.example.sort_proj;
}