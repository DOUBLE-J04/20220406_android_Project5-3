package com.example.android_project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button btn;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT
        );
        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        setContentView(linear,params);

        edit = new EditText(this);
        edit.setHint("input text");
        linear.addView(edit);

        btn=new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.rgb(255,255,0));
        linear.addView(btn);

        textview = new TextView(this);
        textview.setTextSize(30);
        textview.setTextColor(Color.RED);
        linear.addView(textview);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String text;
                text = edit.getText().toString();
                textview.setText(text);
            }
        });
    }
}