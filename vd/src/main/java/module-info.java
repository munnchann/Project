module com.quyen.vd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;

    opens com.quyen.vd to javafx.fxml;
    exports com.quyen.vd;
}
