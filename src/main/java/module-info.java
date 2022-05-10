module ru.gb {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.gb to javafx.fxml;

    requires java.compiler;
    requires java.instrument;
    requires jdk.unsupported;
    requires static lombok;


}
