package CS2020.assignment1.game;

public class BattleShip extends AbstractBattleShip{

    public BattleShip(String name, String shipOrientation){
        String [] names = {"vertical", "horizontal"};
        int randomNum = (int)(Math.random() * 2);
        if (randomNum < 1) {
            name = names[0];

        } else {
            name = names[1];
        }
    }
}