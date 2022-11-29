package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveCommandTest {
    @Test
    public void should_return_y_plus_1_when_execute_given_command_is_M_and_heading_is_N() {
        //given
        MoveCommand moveCommand = new MoveCommand();
        RoverStatus initRoverStatus = new RoverStatus(0, 0, Direction.N);
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, Direction.N);

        //when
        RoverStatus actualRoverStatus = moveCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

    @Test
    public void should_return_y_minus_1_when_execute_given_command_is_M_and_heading_is_S() {
        //given
        MoveCommand moveCommand = new MoveCommand();
        RoverStatus initRoverStatus = new RoverStatus(0, 0, Direction.S);
        RoverStatus expectedRoverStatus = new RoverStatus(0, -1, Direction.S);

        //when
        RoverStatus actualRoverStatus = moveCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

    @Test
    public void should_return_x_plus_1_when_execute_given_command_is_M_and_heading_is_E() {
        //given
        MoveCommand moveCommand = new MoveCommand();
        RoverStatus initRoverStatus = new RoverStatus(0, 0, Direction.E);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, Direction.E);

        //when
        RoverStatus actualRoverStatus = moveCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

    @Test
    public void should_return_x_minus_1_when_execute_given_command_is_M_and_heading_is_W() {
        //given
        MoveCommand moveCommand = new MoveCommand();
        RoverStatus initRoverStatus = new RoverStatus(0, 0, Direction.W);
        RoverStatus expectedRoverStatus = new RoverStatus(-1, 0, Direction.W);

        //when
        RoverStatus actualRoverStatus = moveCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

}
