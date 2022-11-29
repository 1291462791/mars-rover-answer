package com.afs.tdd;

public class LeftCommand {
    public RoverStatus execute(RoverStatus roverStatus) {
        return new RoverStatus(roverStatus.getPositionX(), roverStatus.getPositionY(), roverStatus.getDirection().left());
    }
}
