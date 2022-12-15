package com.example.unicoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TableLayout btn1, btn2, btn3, btn4;
    TextView mainTextView;
    String[] PageTitles = {"ГЛАВНОЕ", "ПУЗЫРЬ", "НАСТРОЙКИ", "MFAQ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTextView = findViewById(R.id.MainTitle);
        mainTextView.setText(PageTitles[0]);

        btn1 = (TableLayout)findViewById(R.id.btnBubble);
        btn2 = (TableLayout)findViewById(R.id.btnHome);
        btn3 = (TableLayout)findViewById(R.id.btnSettings);
        btn4 = (TableLayout)findViewById(R.id.btnMFAQ);

        LayoutInflater inflater = getLayoutInflater();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ContentArea);
        View view1 = inflater.inflate(R.layout.activity_page_main, null, false);
        frameLayout.addView(view1);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ContentArea);
                View view1;
                Switch switcher;
                boolean nightMode;
                final LinearLayout[] linearLayout = new LinearLayout[1];

                switch (view.getId()){
                    case R.id.btnBubble:
                        view1 = inflater.inflate(R.layout.activity_page_bubble, null, false);
                        frameLayout.addView(view1);
                        mainTextView = findViewById(R.id.MainTitle);
                        mainTextView.setText(PageTitles[1]);
                        break;

                    case R.id.btnHome:
                        view1 = inflater.inflate(R.layout.activity_page_main, null, false);
                        frameLayout.addView(view1);
                        mainTextView = findViewById(R.id.MainTitle);
                        mainTextView.setText(PageTitles[0]);
                        break;

                    case R.id.btnSettings:
                        view1 = inflater.inflate(R.layout.activity_page_settings, null, false);
                        frameLayout.addView(view1);
                        mainTextView = findViewById(R.id.MainTitle);
                        mainTextView.setText(PageTitles[2]);

                        break;

                    case R.id.btnMFAQ:
                        view1 = inflater.inflate(R.layout.activity_page_info, null, false);
                        frameLayout.addView(view1);
                        mainTextView = findViewById(R.id.MainTitle);
                        mainTextView.setText(PageTitles[3]);
                        break;
                }
            }
        };

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);

    }

    public void ClickStudy(View v){
        Intent intent = new Intent(this, StudyActivity.class);
        startActivity(intent);
    }
}