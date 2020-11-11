package com.example.drawable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void downScore(View view)
    {
        TextView txt=null;
        switch (view.getId()){
            case R.id.btnDown:
                txt =(TextView)findViewById(R.id.txtScore);
                break;
            case R.id.btnDown2:
                txt =(TextView)findViewById(R.id.txtScore2);
                break;
        }
        int curPoint = Integer.parseInt(txt.getText().toString());
        if(curPoint<1)
            txt.setText(Integer.toString(curPoint));
        else
            txt.setText(Integer.toString(curPoint-1));
    }

    public void UpScore(View view)
    {
        TextView txt=null;
        switch (view.getId()){
            case R.id.btnUp:
                txt =(TextView)findViewById(R.id.txtScore);
                break;
            case R.id.btnUp2:
                txt =(TextView)findViewById(R.id.txtScore2);
                break;
        }
        int curPoint = Integer.parseInt(txt.getText().toString())+1;
        txt.setText(Integer.toString(curPoint));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.dark_mode){
            ImageButton btnUp=(ImageButton)findViewById(R.id.btnUp);
            btnUp.setBackgroundResource(R.drawable.btn_bg);
            ImageButton btnDown=(ImageButton)findViewById(R.id.btnDown);
            btnDown.setBackgroundResource(R.drawable.btn_bg);

            ImageButton btnUp2=(ImageButton)findViewById(R.id.btnUp2);
            btnUp2.setBackgroundResource(R.drawable.btn_bg2);
            ImageButton btnDown2=(ImageButton)findViewById(R.id.btnDown2);
            btnDown2.setBackgroundResource(R.drawable.btn_bg2);
        }
        else {
            ImageButton btnUp=(ImageButton)findViewById(R.id.btnUp);
            btnUp.setBackgroundResource(R.drawable.btn_bg2);
            ImageButton btnDown=(ImageButton)findViewById(R.id.btnDown);
            btnDown.setBackgroundResource(R.drawable.btn_bg2);

            ImageButton btnUp2=(ImageButton)findViewById(R.id.btnUp2);
            btnUp2.setBackgroundResource(R.drawable.btn_bg);
            ImageButton btnDown2=(ImageButton)findViewById(R.id.btnDown2);
            btnDown2.setBackgroundResource(R.drawable.btn_bg);
        }
        return true;
    }
}