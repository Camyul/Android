package com.caves.vanko.firstapp.superheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.caves.vanko.firstapp.R;

public class SuperheroesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superheroes);

        //Get element by ID
        TextView tv_welcome = this.findViewById(R.id.tv_welcome);

        tv_welcome.setText("Welcome!");

        //Set OnClick Event to element with concrete Id
        Button btn = this.findViewById(R.id.btn_click);
        btn.setOnClickListener(view -> {
            String text = ((EditText)this.findViewById(R.id.et_message))
                    .getText()
                    .toString();

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        });
    }
}
