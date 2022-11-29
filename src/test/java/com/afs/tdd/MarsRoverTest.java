package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_y_plus_1_when_execute_given_command_is_M_and_heading_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.N);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 2, Direction.N);
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_y_minus_1_when_execute_given_command_is_M_and_heading_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.S);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, Direction.S);
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_x_plus_1_when_execute_given_command_is_M_and_heading_is_E() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.E);
        RoverStatus expectedRoverStatus = new RoverStatus(2, 1, Direction.E);
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_x_minus_1_when_execute_given_command_is_M_and_heading_is_W() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.W);
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, Direction.W);
        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_W_when_execute_given_command_is_L_and_heading_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.N);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.W);
        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_E_when_execute_given_command_is_R_and_heading_is_N() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.N);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.E);
        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_N_when_execute_given_command_is_L_and_heading_is_E() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.E);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.N);
        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_S_when_execute_given_command_is_R_and_heading_is_E() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.E);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.S);
        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_E_when_execute_given_command_is_L_and_heading_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.S);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.E);
        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_W_when_execute_given_command_is_R_and_heading_is_S() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.S);
        RoverStatus expectedRoverStatus = new RoverStatus(1, 1, Direction.W);
        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(expectedRoverStatus, marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_S_when_execute_given_command_is_L_and_heading_is_W() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.W);

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(new RoverStatus(1, 1, Direction.S), marsRover.getRoverStatus());
    }

    @Test
    public void should_return_heading_N_when_execute_given_command_is_R_and_heading_is_W() {
        //given
        MarsRover marsRover = new MarsRover(1, 1, Direction.W);

        //when
        marsRover.executeCommands("R");

        //then
        assertEquals(new RoverStatus(1, 1, Direction.N), marsRover.getRoverStatus());
    }
}
