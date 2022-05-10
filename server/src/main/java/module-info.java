module ru.gb.server {
    requires static lombok;
    requires io.netty.transport;
    requires  io.netty.all;
    requires java.sql;
    requires io.netty.codec;
    requires ru.gb.commands;

    opens ru.gb.server;
requires org.slf4j;
    requires org.xerial.sqlitejdbc;
}