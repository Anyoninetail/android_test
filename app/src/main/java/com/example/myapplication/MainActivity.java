package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnPlus.setOnClickListener(v -> {
            count++;
            updateText();
        });

        binding.btnMinus.setOnClickListener(v -> {
            count--;
            updateText();
        });

        binding.btnReset.setOnClickListener(v -> {
            count = 0;
            updateText();
        });
    }

    private void updateText() {
        binding.textView.setText(String.valueOf(count));
    }
}