package com.example.jubaed.reversetextdiffactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.jubaed.reversetextdiffactivity.MESSAGE";

    TextView outputText;
    EditText editTextField;
    Button reverseMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputText = (TextView) findViewById(R.id.outputText);
        editTextField = (EditText) findViewById(R.id.editTextField);
        reverseMeButton = (Button) findViewById(R.id.reverseMeButton);
    }

    public void reverseWord(View view){
        Intent intent = new Intent(this, activity2.class);
        String output = reverse(editTextField.getText().toString());
        intent.putExtra(EXTRA_MESSAGE, output);
        startActivity(intent);
        editTextField.setText("");

    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

}
