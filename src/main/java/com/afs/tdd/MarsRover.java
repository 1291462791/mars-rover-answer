package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(int positionX, int positionY, Direction heading) {
        this.roverStatus = new RoverStatus(positionX, positionY, heading);
    }

    public void executeCommands(String commands) {
        List<String> commandList = Arrays.asList(commands.split(""));
        commandList.forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if (!command.isEmpty()) {
            if (command.equalsIgnoreCase("M")) {
                MoveCommand moveCommand = new MoveCommand();
                moveCommand.execute(roverStatus);
            }
            if (command.equalsIgnoreCase("L")) {
                LeftCommand leftCommand = new LeftCommand();
                leftCommand.execute(roverStatus);
            }
            if (command.equals("R")) {
                RightCommand rightCommand = new RightCommand();
                rightCommand.execute(roverStatus);
            }
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
