package com.example.unicoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    TextView SetChapterText;
    TextView SetChapterTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        btn1 = (Button) findViewById(R.id.btnChapter1);
        btn2 = (Button) findViewById(R.id.btnChapter2);
        btn3 = (Button) findViewById(R.id.btnChapter3);

        LayoutInflater inflater = getLayoutInflater();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ChapterArea);
        View view1 = inflater.inflate(R.layout.page_chapters, null, false);
        frameLayout.addView(view1);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String setText, setTitle;
                switch (view.getId()){
                    case R.id.btnChapter1:
                        SetChapterText = findViewById(R.id.ChapterText);
                        SetChapterTitle = findViewById(R.id.ChapterTitle);
                        SetChapterText.setText(getResources().getString(R.string.str_java_chapter1_text));
                        SetChapterTitle.setText(getResources().getString(R.string.str_java_chapter1_title));
                        break;

                    case R.id.btnChapter2:
                        SetChapterText = findViewById(R.id.ChapterText);
                        SetChapterTitle = findViewById(R.id.ChapterTitle);
                        SetChapterText.setText(getResources().getString(R.string.str_java_chapter2_text));
                        SetChapterTitle.setText(getResources().getString(R.string.str_java_chapter2_title));
                        break;

                    case R.id.btnChapter3:
                        SetChapterText = findViewById(R.id.ChapterText);
                        SetChapterTitle = findViewById(R.id.ChapterTitle);
                        SetChapterText.setText(getResources().getString(R.string.str_java_chapter3_text));
                        SetChapterTitle.setText(getResources().getString(R.string.str_java_chapter3_title));
                        break;
                }
            }
        };

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
    }
}