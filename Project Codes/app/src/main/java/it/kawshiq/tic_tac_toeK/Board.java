
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

}
