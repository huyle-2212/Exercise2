package com.dtnghia.exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int REQUEST_ACT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Button btnChange = (Button) findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(i);

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(i,REQUEST_ACT);
            }
        });
//        TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
//        Bundle data = getIntent().getExtras();
//        if(data != null) {
//            String content = data.getString("content");
//            String colors = data.getString("colors");
//
//
//            txtTitle.setText(content);
//            if(colors.equalsIgnoreCase("pink")) txtTitle.setTextColor(getResources().getColor(R.color.pink));
//            if(colors.equalsIgnoreCase("purple")) txtTitle.setTextColor(getResources().getColor(R.color.purple));
//            if(colors.equalsIgnoreCase("indigo")) txtTitle.setTextColor(getResources().getColor(R.color.indigo));
//            if(colors.equalsIgnoreCase("blue")) txtTitle.setTextColor(getResources().getColor(R.color.blue));
//            if(colors.equalsIgnoreCase("teal")) txtTitle.setTextColor(getResources().getColor(R.color.teal));
//            if(colors.equalsIgnoreCase("green")) txtTitle.setTextColor(getResources().getColor(R.color.green));
//        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_ACT) {
            if(resultCode == RESULT_OK) {
                String content = data.getStringExtra("content");
                String colors = data.getStringExtra("colors");

                TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
                txtTitle.setText(content);
                if(colors.equalsIgnoreCase("pink")) txtTitle.setTextColor(getResources().getColor(R.color.pink));
                if(colors.equalsIgnoreCase("purple")) txtTitle.setTextColor(getResources().getColor(R.color.purple));
                if(colors.equalsIgnoreCase("indigo")) txtTitle.setTextColor(getResources().getColor(R.color.indigo));
                if(colors.equalsIgnoreCase("blue")) txtTitle.setTextColor(getResources().getColor(R.color.blue));
                if(colors.equalsIgnoreCase("teal")) txtTitle.setTextColor(getResources().getColor(R.color.teal));
                if(colors.equalsIgnoreCase("green")) txtTitle.setTextColor(getResources().getColor(R.color.green));
            }
        }
    }
}
