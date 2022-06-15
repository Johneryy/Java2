package TicTacToe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeGameBoardTest {
    TicTacToeGameBoard ticTacToeGameBoard;
    @BeforeEach
    void setUp() {
        ticTacToeGameBoard=new TicTacToeGameBoard();
    }

    @AfterEach
    void tearDown() {
        ticTacToeGameBoard=null;
    }
    @Test
    void testIfBoardWasInitialized(){
       int length= ticTacToeGameBoard.getBoardSize();
       assertEquals(3,length);
    }
    @Test
    void testIfBoardWasInitializedToEmpty(){
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[0][0]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[0][1]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[0][2]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[1][0]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[1][1]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[1][2]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[2][0]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[2][1]);
       assertEquals(BoardValue.EMPTY,ticTacToeGameBoard.getBoardValues()[2][2]);
    }
    @Test
    void testIfPlayerCanPlay(){
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,0,0);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[0][0]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,0,1);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[0][1]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,0,2);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[0][2]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,1,0);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[1][0]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,1,1);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[1][1]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,1,2);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[1][2]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,2,0);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[2][0]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,2,1);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[2][1]);
        ticTacToeGameBoard.setPlayerMove(BoardValue.X,2,2);
        assertEquals(BoardValue.X,ticTacToeGameBoard.getBoardValues()[2][2]);
    }
    @Test
    void testIfBoardPlayerCannotPlayOnSomeoneElseSpace(){
        PlayRecorded playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.X,0,0);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.O,0,0);
        assertEquals(PlayRecorded.FAILED,playRecorded);
    }
    @Test
    void testToShowPlayerOneCanWin(){
        PlayRecorded playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.X,0,0);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        GameOutcome gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER1);
        assertEquals(gameOutcome,GameOutcome.DRAW);

        playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.X,1,0);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER1);
        assertEquals(gameOutcome,GameOutcome.DRAW);

        playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.X,2,0);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER1);
        assertEquals(gameOutcome,GameOutcome.PLAYER_1_WINS);


    }
    @Test
    void testToShowPlayerTwoCanWin(){


        PlayRecorded playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.O,0,1);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        GameOutcome gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER2);
        assertEquals(gameOutcome,GameOutcome.DRAW);

        playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.O,1,1);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER2);
        assertEquals(gameOutcome,GameOutcome.DRAW);

        playRecorded=ticTacToeGameBoard.setPlayerMove(BoardValue.O,2,1);
        assertEquals(PlayRecorded.SUCCESS,playRecorded);
        gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER2);
        assertEquals(gameOutcome,GameOutcome.PLAYER_2_WINS);



    }
}