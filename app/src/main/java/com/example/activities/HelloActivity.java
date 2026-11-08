package com.example.activities;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HelloActivity extends AppCompatActivity {
    TextView txtCounterHello;
    Button btnBackMain;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hello);
        txtCounterHello = findViewById(R.id.txtCounterHello);
        btnBackMain = findViewById(R.id.btnBackMain);
        Intent intent = getIntent();
        counter = intent.getIntExtra("counter", 0);
        txtCounterHello.setText(String.valueOf(counter));
        btnBackMain.setOnClickListener(v -> {
            finish();
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rootHello), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}