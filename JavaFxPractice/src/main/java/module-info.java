module icesi.javafxpractice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens icesi.javafxpractice to javafx.fxml;
    exports icesi.javafxpractice;
}