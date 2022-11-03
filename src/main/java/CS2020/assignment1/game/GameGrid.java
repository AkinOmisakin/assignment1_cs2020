package CS2020.assignment1.game;
import java.util.Random;

public class GameGrid extends AbstractGameGrid{

    public GameGrid(int width, int height, int numberOfShips){
        gameGrid = new String[width][height];
        initializeGrid();//2_1

        this.ships = new AbstractBattleShip[numberOfShips];//initialize number of shops
        generateShips(numberOfShips);

        for(int i = 0; i < ships.length; i++){
            placeShip(ships[i]);
        }
        
    }

    public void initializeGrid(){
        for(int i= 0;i<gameGrid.length;i++){
            for(int j = 0;j<gameGrid[i].length;j++){
                gameGrid[i][j] = ".";
            }
        }
    }

    public void placeShip(AbstractBattleShip ship){
        //Updated gameGrid "*"
        int Rand = new Random().nextInt(gameGrid[0].length-2);// vertical
        int Rand2 = new Random().nextInt(gameGrid[0].length);//vertical
        int Rand3 = new Random().nextInt(gameGrid[0].length-2);// horizontal
        int Rand4 = new Random().nextInt(gameGrid[0].length);// horizontal
        int counter = 0;
        int[][] tempArray = new int[4][2];
        while(counter < 3){
            if (ship.shipOrientation == "vertical"){

                int value1 = Rand + counter;

                gameGrid[value1][Rand2] = "*";
                tempArray[counter][0]= value1;
                tempArray[counter][1] = Rand2;
                
                
            }
            else if (ship.shipOrientation == "horizontal"){

                int value2 = Rand3 + counter;
                
                gameGrid[Rand4][value2] = "*";
                tempArray[counter][0] = Rand4;
                tempArray[counter][1] = value2;

            }
            counter++;
        } 
        ship.setShipCoordinates(tempArray);
            
    }

    public void generateShips(int numberOfShips){
        //this.ships = new AbstractBattleShip[numberOfShips];
        // 0,1,2,3
        for(int i=0; i < numberOfShips ;i++){
            //1,2,3,4
            int versionNumber = i + 1;
            // "ship 1", "ship 2", "ship 3", "ship 4"
            String version = "Ship " + versionNumber;
            //{"ship 1", "ship 2", "ship 3", "ship 4"}
            this.ships[i] = new BattleShip(version);
        }
    }
}
