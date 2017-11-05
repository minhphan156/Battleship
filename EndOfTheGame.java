package danil;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * @author Minh Phan minh.phan@sjsu.edu
 * CS 151 HW4 Fall 2017
 */

public class EndOfTheGame implements GameState {
    private BattleShip battleShip;
    private PlayerScreen player1;
    private PlayerScreen player2;

    EndOfTheGame(BattleShip battleShip,PlayerScreen player1,PlayerScreen player2){
        this.battleShip = battleShip;
        this.player1 = player1;
        this.player2 = player2;
    }

    //if player 1 win turn quit the Game
    public void player1Turn (){
        System.exit(0);
    }

    //if player 1 win turn quit the Game
    public void player2turn (){
        System.exit(0);
    }
}