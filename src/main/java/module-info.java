module com.graphfx.graphwithfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.graphfx.graphwithfx to javafx.fxml;
    exports com.graphfx.graphwithfx;
}