package model;

public class Player2 {
    Strategy strategy;
    int[][] x;
    String name;
    public Player2() {
        strategy =new RandomStr();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
