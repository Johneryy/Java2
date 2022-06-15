package TicTacToe;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {

        boolean restartGame=true;

        Scanner input=new Scanner(System.in);

        while (restartGame) {
            TicTacToeGameBoard ticTacToeGameBoard = new TicTacToeGameBoard();
            int numberOfTimesPlayed = 0;

            System.out.println("<---------WELCOME TO TIC TAC TOE GAME----------->");
            System.out.println("Player One is X and Player Two is O");

            while (numberOfTimesPlayed < 9) {
                PlayRecorded playRecorded;
                int currentPlayer;

                if(numberOfTimesPlayed==0||numberOfTimesPlayed==2||
                        numberOfTimesPlayed==4||numberOfTimesPlayed==6||numberOfTimesPlayed==8){
                   currentPlayer = 1;
                }else {
                    currentPlayer=2;
                }

                System.out.println("Player "+currentPlayer+" Enter Your Position");
                System.out.println("Player "+currentPlayer+" first index");
                int firstIndex= input.nextInt();

                System.out.println("Player"+currentPlayer+" second index");
                int secondIndex= input.nextInt();
                GameOutcome gameOutcome=GameOutcome.DRAW;

                //update play
                if(currentPlayer==1){
                   playRecorded= ticTacToeGameBoard.setPlayerMove(BoardValue.X,firstIndex,secondIndex);
                    gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER1);
                }else {
                   playRecorded= ticTacToeGameBoard.setPlayerMove(BoardValue.O,firstIndex,secondIndex);
                    gameOutcome= ticTacToeGameBoard.gameOutcome(Players.PLAYER2);
                }

                if(playRecorded==PlayRecorded.FAILED){
                    System.out.println("Player "+currentPlayer+" That Position is not empty,try somewhere else");
                    numberOfTimesPlayed--;
                }else {
                   if(gameOutcome==GameOutcome.PLAYER_1_WINS){
                       System.out.println("Player One has won this round");
                       numberOfTimesPlayed=9;
                   }

                   if(gameOutcome==GameOutcome.PLAYER_2_WINS){
                       System.out.println("Player two has won this round");
                       numberOfTimesPlayed=9;
                   }

                }
                numberOfTimesPlayed++;
            }
            if (ticTacToeGameBoard.getGameOutcomeInTheEnd() == GameOutcome.DRAW) {
                boolean ask=true;
                while(ask){
                System.out.println("There was no winner for this round, press yes to continue,no to end?");
                String answer = input.next();
                if (answer.equalsIgnoreCase("no")) {
                    restartGame = false;
                    ask=false;
                }

                if (answer.equalsIgnoreCase("yes")) {
                    restartGame = true;
                    ask=false;
                }

                }

            }
            if (ticTacToeGameBoard.getGameOutcomeInTheEnd() == GameOutcome.PLAYER_1_WINS||
                    ticTacToeGameBoard.getGameOutcomeInTheEnd() == GameOutcome.PLAYER_2_WINS) {
                boolean ask=true;
                while(ask){
                    System.out.println(ticTacToeGameBoard.getGameOutcomeInTheEnd()+" this round, press yes to continue,no to end?");
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("no")) {
                        restartGame = false;
                        ask=false;
                    }
                    if (answer.equalsIgnoreCase("yes")) {
                        restartGame = true;
                        ask=false;
                    }


                }

            }


        }
        System.out.println("<---------CLOSING TIC TAC TOE GAME----------->");
    }
}
