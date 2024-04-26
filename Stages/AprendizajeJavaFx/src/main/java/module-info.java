module icesi.aprendizajejavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens icesi.aprendizajejavafx to javafx.fxml;
    exports icesi.aprendizajejavafx;
}