package com.afs.tdd;

import java.util.Objects;

public class RoverStatus {
    private final int positionX;
    private final int positionY;
    private final Direction direction;

    public RoverStatus(int positionX, int positionY, Direction direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoverStatus that = (RoverStatus) o;
        return positionX == that.positionX &&
                positionY == that.positionY &&
                direction == that.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY, direction);
    }
}
