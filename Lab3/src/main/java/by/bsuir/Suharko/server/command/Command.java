package by.bsuir.Suharko.server.command;

import by.bsuir.Suharko.server.command.exception.CommandException;

public interface Command {
    String complete(Object caller, String request) throws CommandException;
}
