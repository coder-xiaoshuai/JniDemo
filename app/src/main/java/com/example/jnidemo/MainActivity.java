package com.example.jnidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jnidemo.jnitest.JniTest;

public class MainActivity extends AppCompatActivity {

    private EditText etM;
    private EditText etN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etM = findViewById(R.id.et_m);
        etN = findViewById(R.id.et_n);

        findViewById(R.id.btn_get_string).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, JniTest.getNativeString(), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_get_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etM.getText()) || TextUtils.isEmpty(etN.getText())) {
                    return;
                }
                Toast.makeText(MainActivity.this, "计算结果为：" + JniTest.getAddResult(Integer.parseInt(etM.getText().toString()), Integer.parseInt(etN.getText().toString())), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
