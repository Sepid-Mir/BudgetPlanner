package com.example.w5a_maps2019;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CalcIncome extends AppCompatActivity {

    EditText income, expense;
    String tag="AndroidRuntime";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);
        Log.i(tag,"CalcIncome activity started");
    }

    public void calClick(View view) {
        int i, e, saving;
        income =(EditText)findViewById(R.id.inc);
        expense =(EditText)findViewById(R.id.exp);
        i = Integer.parseInt(income.getText().toString());
        e = Integer.parseInt(expense.getText().toString());
        saving=i-e;
        String savingTxt= "My saving is: "+ saving;
        Intent intent = new Intent(CalcIncome.this, AnimationActivity.class);
        Bundle bd = new Bundle();
        bd.putString("savings", savingTxt);
        intent.putExtras(bd);
        startActivity(intent);


    }
}
