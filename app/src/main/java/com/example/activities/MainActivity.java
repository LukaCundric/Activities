package com.example.activities;

import android.os.Bundle;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView txtCounter;
    Button btnCount;
    Button btnActivity2;
    Button btnActivity3;
    int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtCounter = findViewById(R.id.txtCounter);
        btnCount = findViewById(R.id.btnCount);
        btnActivity2 = findViewById(R.id.btnActivity2);
        btnActivity3 = findViewById(R.id.btnActivity3);
        btnCount.setOnClickListener(v -> {
            counter++;
            txtCounter.setText(String.valueOf(counter));
        });
        btnActivity2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HelloActivity.class);
            intent.putExtra("counter", counter);
            startActivity(intent);
        });
        btnActivity3.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    ThirdActivity.class
            );
            intent.putExtra("counter", counter);
            startActivity(intent);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}