module com.example.io {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.io to javafx.fxml;

    exports com.example.io.IOCharacter;
    opens com.example.io.IOCharacter to javafx.fxml;
}