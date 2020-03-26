import java.util.ArrayList;

public class Main {

    //pegs are labeled startingPeg, otherPeg, and goalPeg from left to right and rings are labeled from top to bottom counting up
    private static void moveStack(int stackSize, String goalPeg, String startingPeg, String otherPeg){
        if (stackSize > 1){
            moveStack(stackSize-1, otherPeg, startingPeg, goalPeg);
        }
        System.out.println("move ring "+ stackSize+" to "+ goalPeg);
        if (stackSize > 1){
            moveStack(stackSize-1, goalPeg, otherPeg, startingPeg);
        }
    }

    public static void main(String[] args) {
        moveStack(10, "the furthest peg","the peg the rings were initially stacked on","the middle peg");
    }
}
