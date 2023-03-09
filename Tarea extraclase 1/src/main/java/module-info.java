module com.example.tarea_extraclase_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.tarea_extraclase_1 to javafx.fxml;
    exports com.example.tarea_extraclase_1;
}