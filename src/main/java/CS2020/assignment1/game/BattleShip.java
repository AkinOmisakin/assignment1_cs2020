package CS2020.assignment1.game;
import java.util.Random;

public class BattleShip extends AbstractBattleShip {

    public BattleShip(String name, String shipOrientation){

        this.name = name;
        this.shipOrientation = shipOrientation;

    }


    public static void main(String[]args){
        
    }
    public String getName(){
        return name;
    }
    
    public String getShipOrientation(){
        return shipOrientation;
    }
    public int getHits() {
        return hits;
    }
    

    public int[][] getShipCoordinates() {
        return shipCoordinates;
    }

    //public void setHits(int numberOfHits) {}
    //public void setShipCoordinates(int [][] coordinates) {}
    //public boolean checkAttack(){}

}