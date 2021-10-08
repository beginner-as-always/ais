module main {
    requires javafx.controls;
    requires javafx.fxml;

    opens ais.lab1 to javafx.fxml, javafx.controls;
    exports ais.lab1;
}