package TicTacToe;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TicTacToeGameBoard {
    private BoardValue [][] boardValues=new BoardValue[3][3];
    private GameOutcome gameOutcomeInTheEnd=GameOutcome.DRAW;
    public TicTacToeGameBoard() {
        for(BoardValue[] boardValue:boardValues){
            Arrays.fill(boardValue,BoardValue.EMPTY);
        }
    }

    public int getBoardSize() {
        return boardValues.length;
    }

    public BoardValue[][] getBoardValues() {
        return boardValues;
    }


    public PlayRecorded setPlayerMove(BoardValue value, int index1, int index2) {
        if(boardValues[index1][index2]==BoardValue.EMPTY){
        boardValues[index1][index2]=value;
        return PlayRecorded.SUCCESS;
        }else{
            return PlayRecorded.FAILED;
        }
    }
    public GameOutcome gameOutcome(Players player){
        boolean isWinnerFound=checkIfThereAreAnyWinners();
        if(isWinnerFound){
         if(player==Players.PLAYER1){
             gameOutcomeInTheEnd=GameOutcome.PLAYER_1_WINS;
             return GameOutcome.PLAYER_1_WINS;
         }else {
             gameOutcomeInTheEnd=GameOutcome.PLAYER_2_WINS;
             return GameOutcome.PLAYER_2_WINS;
         }

        }
        return GameOutcome.DRAW;
    }
    private boolean checkIfThereAreAnyWinners(){
        boolean isWinnerFound=false;
        if ((boardValues[0][0])!=BoardValue.EMPTY)
        {
            if(boardValues[0][0]==boardValues[1][0] &&   boardValues[0][0]==boardValues[2][0]){
                isWinnerFound=true;
            }
        }
        if ((boardValues[0][1])!=BoardValue.EMPTY)
        {
            if(boardValues[0][1]==boardValues[1][1] && boardValues[0][1]==boardValues[2][1])
                isWinnerFound=true;
        }
        if ((boardValues[0][2])!=BoardValue.EMPTY)
        {
            if(boardValues[0][2]==boardValues[1][2] && boardValues[0][2]==boardValues[2][2])
                isWinnerFound=true;
        }
        if ((boardValues[0][0])!=BoardValue.EMPTY)
        {
            if(boardValues[0][0]==boardValues[0][1] && boardValues[0][0]==boardValues[0][2])
                isWinnerFound=true;
        }
        if ((boardValues[1][0])!=BoardValue.EMPTY)
        {
            if(boardValues[1][0]==boardValues[1][1] && boardValues[1][0]==boardValues[1][2])
                isWinnerFound=true;
        }
        if ((boardValues[2][0])!=BoardValue.EMPTY)
        {
            if(boardValues[2][0]==boardValues[2][1] && boardValues[2][0]==boardValues[2][2])
                isWinnerFound=true;
        }
        if ((boardValues[0][0])!=BoardValue.EMPTY)
        {
            if(boardValues[0][0]==boardValues[1][1] && boardValues[0][0]==boardValues[2][2])
                isWinnerFound=true;
        }
        if ((boardValues[0][2])!=BoardValue.EMPTY)
        {
            if(boardValues[0][2]==boardValues[1][1] && boardValues[0][2]==boardValues[2][0])
                isWinnerFound=true;
        }

        return isWinnerFound;
}

    public GameOutcome getGameOutcomeInTheEnd() {
        return gameOutcomeInTheEnd;
    }

    public void setGameOutcomeInTheEnd(GameOutcome gameOutcomeInTheEnd) {
        this.gameOutcomeInTheEnd = gameOutcomeInTheEnd;
    }
}
