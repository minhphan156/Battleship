package danil;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * @author Minh Phan minh.phan@sjsu.edu
 * CS 151 HW4 Fall 2017
 */

public class MiddleOfTheGame implements GameState{
    private BattleShip battleShip;
    private PlayerScreen player1;
    private PlayerScreen player2;

    MiddleOfTheGame(BattleShip battleShip,PlayerScreen player1,PlayerScreen player2){
        this.battleShip = battleShip;
        this.player1 = player1;
        this.player2 = player2;
    }

    //method to turn OFF SelfGrid and ON AttackGrid player 1
    public void player1Turn (){
        player1.getSelfGrid().setSelfGridListener(false);
        player1.getAttackGrid().setAttackGridListener(true);
    }

    //method to turn OFF SelfGrid and ON AttackGrid player 2
    public void player2turn (){
        player2.getSelfGrid().setSelfGridListener(false);
        player2.getAttackGrid().setAttackGridListener(true);
    }
}