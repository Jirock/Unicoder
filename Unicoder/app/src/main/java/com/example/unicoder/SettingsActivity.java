package com.example.unicoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.Objects;

public class SettingsActivity extends AppCompatActivity {

    Switch switcher;
    boolean nightMode;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final LinearLayout[] linearLayout = new LinearLayout[1];
        switcher = (Switch) findViewById(R.id.switch_console);

        switcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast toast = Toast.makeText(getApplicationContext(), "ХОЧУ СРАТЬ!", Toast.LENGTH_SHORT);
                    toast.show();
                    linearLayout[0] = (LinearLayout) findViewById(R.id.InvisContent);
                    linearLayout[0].setVisibility(linearLayout[0].VISIBLE);
                }
            }
        });

    }
}