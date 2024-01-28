package com.example.helloworldv2024;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 public void btn_click(View v)
 {
TextView tv_msg = findViewById(R.id.msg);
tv_msg.setText("welcome to CSIT 551");

Toast.makeText(this, "Hey Hello World !", Toast.LENGTH_LONG).show();



 }
}