module ru.gb.client {
    requires static lombok;
    requires javafx.controls;
    requires javafx.fxml;
    requires io.netty.all;
    requires io.netty.codec;
    requires ru.gb.commands;
    opens ru.gb.client to javafx.fxml;
    exports ru.gb.client;
}
