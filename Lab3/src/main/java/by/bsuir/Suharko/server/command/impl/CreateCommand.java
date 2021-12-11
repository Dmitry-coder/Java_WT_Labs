package by.bsuir.Suharko.server.command.impl;

import by.bsuir.Suharko.server.command.Command;
import by.bsuir.Suharko.server.command.exception.CommandException;
import by.bsuir.Suharko.server.model.AuthType;
import by.bsuir.Suharko.server.service.ServiceFactory;

public class CreateCommand implements Command {
    public String complete(Object caller, String request) throws CommandException {
        String[] arguments = request.split(" ");
        if (arguments.length != 3) throw new CommandException("CREATE invalid syntax");

        if (ServiceFactory.getInstance().getAuthService().getAuthType(caller) != AuthType.MANAGER)
            return "Should be MANAGER";

        ServiceFactory.getInstance().getCaseService().addCase(arguments[1], arguments[2]);
        return "Success";
    }
}
