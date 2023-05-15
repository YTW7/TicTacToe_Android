package com.yahya_codes.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    boolean gameActive =true;
    int c=0;
    int activePlayer=0;
    //player rep by 0=X, 1=o
    int[] gameState ={2,2,2,2,2,2,2,2,2};
    //state meanings
    //0-X
    //1-o
    //2-Null
    int[][] winPositions ={{0,1,2,},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public void playerTap(View view)
    {   TextView status=findViewById(R.id.status);
        ImageView img = (ImageView) view;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if(!gameActive)
        {
            gameReset(view);
        }

        if(gameState[tappedImage]==2 && gameActive)
        {gameState[tappedImage]=activePlayer;
            img.setTranslationY(-1000f);
            if(activePlayer==0)
            {
                img.setImageResource(R.drawable.x);
                activePlayer=1;

                status.setText("2nd Player's Turn");
                c++;
            }
            else
            {
                img.setImageResource(R.drawable.o);
                activePlayer=0;

                status.setText("1st Player's Turn");
                c++;
            }
            img.animate().translationYBy(1000f).setDuration(300);
            if(c==8 || c==9)
            {
                status.setText("It's a Draw!-Restart to Play Again");
            }
        }


        for(int[] winPosition :winPositions)
        {
            if (gameState[winPosition[0]] == gameState[winPosition[1]] && gameState[winPosition[1]] == gameState[winPosition[2]] && gameState[winPosition[0]]!=2)
            { String winnerStr="";
             gameActive=false;

             if(gameState[winPosition[0]]==0)
             {
                 if(winPosition[0]==0 && winPosition[1]==1) {
                     ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==3 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==6 && winPosition[1]==7) {
                     ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==0 && winPosition[1]==3) {
                     ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==1 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==2 && winPosition[1]==5) {
                     ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==0 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.x_green);
                 }
                 else if(winPosition[0]==2 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.x_green);
                     ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.x_green);
                 }
                 winnerStr="Player 1 is the WINNER!";
             }
             else if(gameState[winPosition[0]]==1)
             {
                 if(winPosition[0]==0 && winPosition[1]==1) {
                     ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==3 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==6 && winPosition[1]==7) {
                     ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==0 && winPosition[1]==3) {
                     ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView3)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==1 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView1)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView7)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==2 && winPosition[1]==5) {
                     ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==0 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView0)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView8)).setImageResource(R.drawable.o_green);
                 }
                 else if(winPosition[0]==2 && winPosition[1]==4) {
                     ((ImageView) findViewById(R.id.imageView2)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.o_green);
                     ((ImageView) findViewById(R.id.imageView6)).setImageResource(R.drawable.o_green);
                 }
                 winnerStr="Player 2 is the WINNER!";
             }

             status.setText(winnerStr);

            }
        }

    }
    public void gameReset(View view)
    {
        gameActive=true;
        activePlayer=0;
        Arrays.fill(gameState, 2);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView0)).setImageResource(0);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}