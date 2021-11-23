package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.samsung.itschool.mdev.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private Button btn, btn1, btn2;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imageView2.setImageResource(R.drawable.ic_baseline_cookie_24);
            }
        });

      

        //setContentView(R.layout.activity_main);
        /*btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // логика
            }
        });
        btn1 = findViewById(R.id.button2);
        btn2 = findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

         */
    }




}