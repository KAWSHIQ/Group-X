
package it.kawshiq.tic_tac_toeK;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;


public class Board {

    private static int GAME_RESULT_WIN=1;
    private static int GAME_RESULT_FAIL=2;
    private static int GAME_RESULT_DRAW=0;

     int[][] gameBoardArr=new int[3][3];

    private int playCounter=1;

    public boolean gameOver = false;

    public Board copy(){

        Board copy=new Board();

        if (this.gameOver){
            copy.gameOver=true;
        }else {
            copy.gameOver=false;
        }

        copy.playCounter=Integer.valueOf(this.playCounter);

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                copy.gameBoardArr[i][j]=this.gameBoardArr[i][j];
            }
        }

        return copy;
    }

    
    public void placePiece(int position){

        if (!gameOver){
            //Log.d("Board","placePiece vaild");
            int score=0;
            switch (getCurrentPlayer()){
                case 1:score=1;break;
                case 2:score=5;break;
            }

            switch (position){
                case 1: gameBoardArr[0][0]=score; break;
                case 2: gameBoardArr[0][1]=score; break;
                case 3: gameBoardArr[0][2]=score; break;
                case 4: gameBoardArr[1][0]=score; break;
                case 5: gameBoardArr[1][1]=score; break;
                case 6: gameBoardArr[1][2]=score; break;
                case 7: gameBoardArr[2][0]=score; break;
                case 8: gameBoardArr[2][1]=score; break;
                case 9: gameBoardArr[2][2]=score; break;
                default: break;
            }
            playCounter++;
    
}
