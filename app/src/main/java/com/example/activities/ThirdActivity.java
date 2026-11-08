package com.example.activities;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {
    TextView txtCounterThird;
    Button btnThirdMain;
    Button btnThirdHello;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        txtCounterThird = findViewById(R.id.txtCounterThird);
        btnThirdMain = findViewById(R.id.btnThirdMain);
        btnThirdHello = findViewById(R.id.btnThirdHello);
        Intent intent = getIntent();
        counter = intent.getIntExtra("counter", 0);
        txtCounterThird.setText(String.valueOf(counter));
        btnThirdMain.setOnClickListener(v -> {
            goToActivity1();
        });

        btnThirdHello.setOnClickListener(v -> {
            goToActivity2();
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rootThird), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void goToActivity1() {

        Intent intent = new Intent(
                ThirdActivity.this,
                MainActivity.class
        );

        intent.addFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_SINGLE_TOP
        );

        startActivity(intent);
    }
    private void goToActivity2() {

        Intent intent = new Intent(
                ThirdActivity.this,
                HelloActivity.class
        );

        intent.putExtra("counter", counter);

        intent.addFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_SINGLE_TOP
        );

        startActivity(intent);
    }
}