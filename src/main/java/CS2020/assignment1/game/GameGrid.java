package CS2020.assignment1.game;
import java.util.Arrays;

public class GameGrid extends AbstractGameGrid{

    public GameGrid(int width, int height,int numberOfShips){
        String [][] gameGrid = initializeGrid();


    }
    public void initializeGrid(){
        
        String[][] gameGrid = new String[1][2];
        for(String [] row: gameGrid){
            Arrays.fill(row, ".");
        }
    }
    public void placeShip(AbstractBattleShip ship){
        this.ships = ships;
    }
    public void generateShips (int numberOfShips) {
        
    }
}
