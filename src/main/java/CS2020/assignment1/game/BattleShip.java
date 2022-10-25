package CS2020.assignment1.game;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BattleShip extends AbstractBattleShip {
    int row;
    int column;


    public BattleShip(String name) {
        this.name = name;

        this.shipOrientation = shipOrientation;


        int Rand = new Random().nextInt(2);//generate random number between 0-1
        if (Rand < 1){
            shipOrientation="vertical";
        } else {
            shipOrientation="horizontal";
        }

    }
    public String getName(){//done
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

    
    public void setHits(int numberOfHits) {
       this.hits = numberOfHits;
    }

    public void setShipCoordinates(int [][] coordinates) {
        this.shipCoordinates =  coordinates; // coordinates = {{1,2}}

    }

    public boolean checkAttack(int row,int column){
        this.row = row;
        this.column = column;
        boolean isAlive = true;
        int i,j;
        for(i=0;i<shipCoordinates.length;i++){
            for(j=0;j<shipCoordinates[i].length;j++){
                if(shipCoordinates[i][j] != row || shipCoordinates[i][j] != column){
                    isAlive = false;
                } 
                else if (this.hits < 3) {
                    isAlive =true;
                    this.hits++;
                } else {
                    
                    isAlive = false;
                }
                
            }
        }
        return isAlive;
    }
        
}

   /* */


