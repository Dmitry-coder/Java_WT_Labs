package by.bsuir.Suharko.server.command.impl;

import by.bsuir.Suharko.server.command.Command;
import by.bsuir.Suharko.server.command.exception.CommandException;
import by.bsuir.Suharko.server.model.AuthType;
import by.bsuir.Suharko.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
