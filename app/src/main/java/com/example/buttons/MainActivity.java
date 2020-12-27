package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text_place;
    Button log_btn;
    EditText name_entry, pass_entry;

    String username = "Ilya";
    String userpass = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log_btn = findViewById(R.id.log_in);
        text_place = findViewById(R.id.answer);
        text_place.setGravity(Gravity.CENTER);
        name_entry = findViewById(R.id.name);
        pass_entry = findViewById(R.id.pass);
        log_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = name_entry.getText().toString();
        String pass = pass_entry.getText().toString();
        if (name.equals(username) && pass.equals(userpass)) {
            text_place.setText(String.valueOf("Верно"));
            text_place.setTextColor(getResources().getColor(R.color.design_default_color_primary));
        }
        else {
            text_place.setText(String.valueOf("Вы ошиблись в логине или пароле"));
            text_place.setTextColor(getResources().getColor(R.color.design_default_color_error));
        }
    }
}