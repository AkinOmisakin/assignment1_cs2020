package CS2020.assignment1.game;


import java.util.Scanner;


public class RunGame {

    public static void main(String[]args){
        Game testGame = new Game(4, 4, 1);
        Scanner start_game = new Scanner(System.in);
        int i =0;
        do {
        System.out.println("Enter the position you would like to attack\n"+"type 'exit' to stop game\n");
        String input_game = start_game.nextLine();
        testGame.playRound(input_game);
        System.out.println(testGame.checkVictory());
        i++;
        } while(testGame.checkVictory() == false);
        
        
    }
}