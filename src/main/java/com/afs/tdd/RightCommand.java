package com.afs.tdd;

public class RightCommand implements Command {
    @Override
    public RoverStatus execute(RoverStatus roverStatus) {
        return new RoverStatus(roverStatus.getPositionX(), roverStatus.getPositionY(), roverStatus.getDirection().right());
    }
}
