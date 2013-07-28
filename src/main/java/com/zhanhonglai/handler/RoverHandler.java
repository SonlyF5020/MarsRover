package com.zhanhonglai.handler;

import com.zhanhonglai.command.*;
import com.zhanhonglai.direction.*;
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
        if (directionString.equalsIgnoreCase("w")) {
            return new WestDirection();
        }
        if (directionString.equalsIgnoreCase("e")) {
            return new EastDirection();
        }
        if (directionString.equalsIgnoreCase("s")) {
            return new SouthDirection();
        }
        if (directionString.equalsIgnoreCase("n")) {
            return new NorthDirection();
        } else return null;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public void handleCommand(String commands) {
        commands=commands.toUpperCase();
        for (int i = 0; i < commands.length(); i++) {
            Command exactCommand = getCommand(commands.charAt(i));
            exactCommand.handleCommand(rover);
        }
    }

    private Command getCommand(char command) {
        switch (command) {
            case 'M':
                return new MoveCommand();
            case 'L':
                return new LeftCommand();
            case 'R':
                return new RightCommand();
            default:
                return new UnknowCommand();
        }
    }

    public void run(){
        roverInitiate();
        roverRun();
        roverArrive();
    }

    private void roverArrive() {
        System.out.println("Rover arrive: "+rover.getPosition().toString());
        System.out.println("Rover direction: "+rover.getDirection().getDirectionString());
    }

    private void roverRun() {
        System.out.print("Command: ");
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        handleCommand(commands);
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
