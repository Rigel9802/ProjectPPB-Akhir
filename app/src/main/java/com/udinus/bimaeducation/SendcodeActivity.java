package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendcodeActivity extends AppCompatActivity {

    EditText code;
    Button btnCode;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendcode);

        code = findViewById(R.id.code);
        btnCode = findViewById(R.id.btn_sendcode);

        code.setTranslationX(800);
        btnCode.setTranslationX(800);

        code.setAlpha(v);
        btnCode.setAlpha(v);

        code.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        btnCode.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
    }

    public void sendCode(View view) {
        if (TextUtils.isEmpty(code.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Kode tidak boleh kosong!", Toast.LENGTH_LONG).show();
        } else if (code.getText().length() < 6) {
            Toast.makeText(view.getContext(), "Kode minimal 6!", Toast.LENGTH_LONG).show();
        } else {
            Intent sendCode = new Intent(SendcodeActivity.this, ChangePasswordActivity.class);
            startActivity(sendCode);
        }
    }
}