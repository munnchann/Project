module com.quyen.vd {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.quyen.vd to javafx.fxml;
    exports com.quyen.vd;
}
