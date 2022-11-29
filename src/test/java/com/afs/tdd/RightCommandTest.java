package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightCommandTest {
    @Test
    public void should_return_heading_E_when_execute_given_command_is_R_and_heading_is_N() {
        //given
        RightCommand rightCommand = new RightCommand();
        RoverStatus initRoverStatus = new RoverStatus(1, 1, Direction.N);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.E);

        //when
        RoverStatus actualRoverStatus = rightCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

    @Test
    public void should_return_heading_S_when_execute_given_command_is_R_and_heading_is_E() {
        //given
        RightCommand rightCommand = new RightCommand();
        RoverStatus initRoverStatus = new RoverStatus(1, 1, Direction.E);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.S);

        //when
        RoverStatus actualRoverStatus = rightCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

    @Test
    public void should_return_heading_W_when_execute_given_command_is_R_and_heading_is_S() {
        //given
        RightCommand rightCommand = new RightCommand();
        RoverStatus initRoverStatus = new RoverStatus(1, 1, Direction.S);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.W);

        //when
        RoverStatus actualRoverStatus = rightCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }

    @Test
    public void should_return_heading_N_when_execute_given_command_is_R_and_heading_is_W() {
        //given
        RightCommand rightCommand = new RightCommand();
        RoverStatus initRoverStatus = new RoverStatus(1, 1, Direction.W);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.N);

        //when
        RoverStatus actualRoverStatus = rightCommand.execute(initRoverStatus);

        //then
        assertEquals(expectedRoverStatus, actualRoverStatus);
    }
}

