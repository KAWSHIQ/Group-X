package it.kawshiq.tic_tac_toeK;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int FP = ViewGroup.LayoutParams.WRAP_CONTENT;

    private  Button button;
    private  Button useAIButton;
    private TableLayout mTableLayout;
    private TextView textView;
    private Board gameBoard;

    public static int counter= 1;

    private boolean CPUCtrl = false;



}

