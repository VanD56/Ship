package model;

public class Player1 {
    Strategy strategy;
    int[][] x = new int[12][12];
    int namShip;



    public Player1() {
        strategy =new ProfiStr();
    }
}
