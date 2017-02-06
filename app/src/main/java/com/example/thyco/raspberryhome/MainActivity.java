package com.example.thyco.raspberryhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText key;
    Button login;
    View.OnClickListener listener = new  View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"nombre: " + name.getText().toString() + "  key: " + key.getText().toString(), Toast.LENGTH_LONG).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.name);
        key = (EditText)findViewById(R.id.key);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(listener);
    }
}
