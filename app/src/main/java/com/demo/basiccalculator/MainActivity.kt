package com.demo.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt1 : EditText = findViewById(R.id.edt_1)
        val edt2 : EditText = findViewById(R.id.edt_2)

        val txtAnswer : TextView = findViewById(R.id.txt_answer);

        val btnSum : Button = findViewById(R.id.btn_sum);
        btnSum.setOnClickListener()
        {
            val a = edt1.text.toString().toDouble();
            val b = edt2.text.toString().toDouble();

            val c = a + b

            txtAnswer.setText( c.toString())

            Toast.makeText(this,"SUM = $c", Toast.LENGTH_SHORT).show()
        }

        var btn_substr : Button = findViewById(R.id.btn_substr);
        btn_substr.setOnClickListener()
        {
            val a = edt1.text.toString().toDouble();
            val b = edt2.text.toString().toDouble();

            val c = a - b;

            txtAnswer.setText(c.toString())

            Toast.makeText(this, "SUBSTRACTION = $c", Toast.LENGTH_SHORT).show();
        }


        var btn_mult : Button = findViewById(R.id.btn_mult);
        btn_mult.setOnClickListener()
        {
            val a = edt1.text.toString().toDouble();
            val b = edt2.text.toString().toDouble();

            val c = a * b;

            txtAnswer.setText(c.toString())

            Toast.makeText(this, "MULTIPLICATION = $c", Toast.LENGTH_SHORT).show();
        }


        var btn_div : Button = findViewById(R.id.btn_div);
        btn_div.setOnClickListener()
        {
            val a = edt1.text.toString().toDouble();
            val b = edt2.text.toString().toDouble();

            val c = a / b;

            txtAnswer.setText(c.toString())

            Toast.makeText(this, "DIVISION = $c", Toast.LENGTH_SHORT).show();
        }


    }
}