package CS2020.assignment1.game;

import java.util.Random;


public class BattleShip extends AbstractBattleShip {
    
    public BattleShip(String name) {
        this.name = name;
        setShipOrientation();
    }
    public String getName(){//done
        return name;
    }
    public String getShipOrientation(){
        return shipOrientation;
    }
    public void setShipOrientation(){

        int Rand = new Random().nextInt(2);//generate random number between 0-1
        if (Rand < 1){
            shipOrientation="vertical";
        } else {
            shipOrientation="horizontal";
        }

    }

    public int getHits() {
        return hits;
    }
    

    public int[][] getShipCoordinates() {
        return shipCoordinates;
    }

    
    public void setHits(int numberOfHits) {
        this.hits = 0;
        this.hits += numberOfHits;
    }

    public void setShipCoordinates(int [][] coordinates) {
        this.shipCoordinates =  coordinates; // coordinates = {{1,2}}

    }

    public boolean checkAttack(int row,int column){
        boolean alive = false;
        int i,j;
        for (i=0;i<shipCoordinates.length;i++){
            for(j=0;j<shipCoordinates[i].length;j++){
                if (shipCoordinates[0][0]==row && shipCoordinates[0][1]==column){
                    if (this.hits < 3){
                        alive = true;
                        this.hits++;
                        return alive;
                    } else {

                        alive = false;
                        
                    }
                } else {
                    
                    return alive;
                }
            }
            
        }
        return alive;
    }
        
}

