package com.dtnghia.exercise2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    ImageView iClick1, iClick2, iClick3, iClick4, iClick5, iClick6;
    String colors = "black";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Button btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(saveClick);

        iClick1 = (ImageView)findViewById(R.id.iv1);
        iClick1.setOnClickListener(iClickOne);

        iClick2 = (ImageView)findViewById(R.id.iv2);
        iClick2.setOnClickListener(iClickTwo);

        iClick3 = (ImageView)findViewById(R.id.iv3);
        iClick3.setOnClickListener(iClickThree);

        iClick4 = (ImageView)findViewById(R.id.iv4);
        iClick4.setOnClickListener(iClickFour);

        iClick5 = (ImageView)findViewById(R.id.iv5);
        iClick5.setOnClickListener(iClickFive);

        iClick6 = (ImageView)findViewById(R.id.iv6);
        iClick6.setOnClickListener(iClickSix);


    }

    private View.OnClickListener iClickOne = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewSample = (View)findViewById(R.id.viewSample);
            viewSample.setBackgroundResource(R.color.pink);
            colors = "pink";
        }};
    private View.OnClickListener iClickTwo = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewSample = (View)findViewById(R.id.viewSample);
            viewSample.setBackgroundResource(R.color.purple);
            colors = "purple";
        }};
    private View.OnClickListener iClickThree = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewSample = (View)findViewById(R.id.viewSample);
            viewSample.setBackgroundResource(R.color.indigo);
            colors = "indigo";
        }};
    private View.OnClickListener iClickFour = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewSample = (View)findViewById(R.id.viewSample);
            viewSample.setBackgroundResource(R.color.blue);
            colors = "blue";
        }};
    private View.OnClickListener iClickFive = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewSample = (View)findViewById(R.id.viewSample);
            viewSample.setBackgroundResource(R.color.teal);
            colors = "teal";
        }};
    private View.OnClickListener iClickSix = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View viewSample = (View)findViewById(R.id.viewSample);
            viewSample.setBackgroundResource(R.color.green);
            colors = "green";
        }};

    private View.OnClickListener saveClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent();

            final EditText edt = (EditText)findViewById(R.id.edt);
            i.putExtra("colors",colors);
            i.putExtra("content",edt.getText().toString());
            setResult(RESULT_OK,i);
            finish();

//            Intent i = new Intent(SecondActivity.this,MainActivity.class);
//            final EditText edt = (EditText)findViewById(R.id.edt);
//            i.putExtra("colors",colors);
//            i.putExtra("content",edt.getText().toString());
//
//            startActivity(i);
        }};
}


