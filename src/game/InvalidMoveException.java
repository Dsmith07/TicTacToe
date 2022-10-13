package game;

public class InvalidMoveException extends Exception{
    public InvalidMoveException(int size) {

        System.out.println("==================================");

        System.out.println("| 1. x and y co-ordinates should |");

        System.out.println("|    range from 0 to "+size+" !!        |");

        System.out.println("| 2. x and y co-ordinates are    |");

        System.out.println("|    already marked !!           |");


        System.out.println("==================================");
    }


}