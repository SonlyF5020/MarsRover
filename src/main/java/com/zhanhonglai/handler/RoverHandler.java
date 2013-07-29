package com.zhanhonglai.handler;

import com.zhanhonglai.command.Command;
import com.zhanhonglai.command.CommandFactory;
import com.zhanhonglai.direction.DirectionFactory;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;
import com.zhanhonglai.rover.Rover;

import java.util.Scanner;

public class RoverHandler {
    private Rover rover;

    public RoverPosition createInitialPosition(String positionString) {
        String[] positions = positionString.split(" ");
        return new RoverPosition(Integer.parseInt(positions[0]), Integer.parseInt(positions[1]));
    }

    public RoverDirection createInitialDirection(String directionString) {
        return DirectionFactory.buildDirection(directionString);
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public void handleCommands(String commands) {
        commands = commands.toUpperCase();
        for (int i = 0; i < commands.length(); i++) {
            Command exactCommand = getCommand(commands.charAt(i));
            exactCommand.handleCommand(rover);
        }
    }

    private Command getCommand(char command) {
        return CommandFactory.buildCommand(command);
    }

    public void run() {
        roverInitiate();
        roverRun();
        roverArrive();
    }

    private void roverArrive() {
        System.out.println("Rover arrive: " + rover.getPosition().toString());
        System.out.println("Rover direction: " + rover.getDirection().getDirectionString());
    }

    private void roverRun() {
        System.out.print("Command: ");
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        handleCommands(commands);
    }

    private void roverInitiate() {
        initiatePosition();
        initiateDirection();
    }

    private void initiateDirection() {
        System.out.print("Rover's initial direction: ");
        Scanner scanner = new Scanner(System.in);
        String initialDirection = scanner.nextLine();
        rover.setDirection(createInitialDirection(initialDirection));
    }

    private void initiatePosition() {
        System.out.print("Rover's initial position: ");
        Scanner scanner = new Scanner(System.in);
        String initialPosition = scanner.nextLine();
        rover.setPosition(createInitialPosition(initialPosition));
    }
}
