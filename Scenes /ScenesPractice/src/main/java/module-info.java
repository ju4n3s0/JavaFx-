module icesi.scenespractice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens icesi.scenespractice to javafx.fxml;
    exports icesi.scenespractice;
}