module ru.gb {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.all;
    requires io.netty.codec;
    requires lombok;
    requires FileStorage24.commons;
    opens ru.gb to javafx.fxml;
    exports ru.gb.client;
}
