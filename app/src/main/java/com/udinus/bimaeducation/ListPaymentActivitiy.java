package com.udinus.bimaeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListPaymentActivitiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_payment);
    }

    public void btn_gopay(View view){
        Intent move = new Intent(ListPaymentActivitiy.this, ListStructActivity.class);
        startActivity(move);
    }
}