package com.afs.tdd;

public enum Direction {
    N, E, S, W;

    public Direction left() {
        int increment = Direction.values().length - 1;
        return getDirection(increment);
    }

    public Direction right() {
        int increment = 1;
        return getDirection(increment);
    }

    private Direction getDirection(int increment) {
        int directionCount = Direction.values().length;

        int rightIndex = (this.ordinal() + increment) % directionCount;
        return Direction.values()[rightIndex];
    }
}
