module com.graphfx.graphwithfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires gs.core;


    opens com.graphfx.graphwithfx to javafx.fxml;
    exports com.graphfx.graphwithfx;
}