package ru.gb.commands;

import lombok.Getter;

import static ru.gb.commands.CommandType.CREATE_DIRECTORY;

@Getter
public class CreateDirectory extends AbstractCommand{
    private String name; //Абсолютный путь к директории

    public CreateDirectory(String name) {
        this.name = name;
    }

    @Override
    public CommandType getType() {
        return CREATE_DIRECTORY;
    }
}
