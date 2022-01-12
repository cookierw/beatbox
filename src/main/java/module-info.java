module beatbox {
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;

    opens beatbox to javafx.fxml;
    exports beatbox;
}
