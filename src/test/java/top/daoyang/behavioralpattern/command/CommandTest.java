package top.daoyang.behavioralpattern.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    public void command() {
        Command.TV tv = new Command.TV();
        Command openTVCommand = new Command.TVOpenCommand(tv);
        Command closeTVCommand = new Command.TVCloseCommand(tv);

        Command.TVRemoteController tvRemoteController = new Command.TVRemoteController(openTVCommand, closeTVCommand);

        tvRemoteController.open();
        tvRemoteController.close();
    }

}