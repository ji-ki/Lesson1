package ru.mirea.feofanovoi.buttonclicker;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private Button myButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        myButton = findViewById(R.id.myButton);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку No 23");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
        View.OnClickListener oclNtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Это не я");
            }
        };
        btnItIsNotMe.setOnClickListener(oclNtnItIsNotMe);
        View.OnClickListener oclMyButtonClick = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Ещё один способ!");
            }
        };
        myButton.setOnClickListener(oclMyButtonClick);
    }
}