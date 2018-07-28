package com.example.asus.dialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.view.View;
import android.widget.DatePicker;
import java.util.Calendar;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    int year,month,day;
    ProgressDialog progressDialog;
    Handler progressHandler;
    static final int Max=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);

        Calendar cal=Calendar.getInstance();
        year=cal.get(Calendar.YEAR);
        month=cal.get(Calendar.MONTH);
        day=cal.get(Calendar.DAY_OF_MONTH);

    }
    public void btn1Click(View view){
        AlertDialog.Builder d=new AlertDialog.Builder(MainActivity.this);
        d.setTitle("對話框");
        d.setMessage("It is Dialog");
        d.show();
    }
    public void btn2Click(View view){
        AlertDialog.Builder d=new AlertDialog.Builder(MainActivity.this);
        d.setTitle("詢問?").setMessage("去唱歌?").setCancelable(false);
        d.setPositiveButton("Yes", new DialogInterface.OnClickListener() {  //確定按鈕
            public void onClick(DialogInterface dialog,int which){
                btn2.setText("Yes");
            }
        });
        d.setNegativeButton("No", new DialogInterface.OnClickListener() {   //否定按鈕
            @Override
            public void onClick(DialogInterface dialog, int which) {
                btn2.setText("No");
            }
        });
        d.setNeutralButton("Maybe", new DialogInterface.OnClickListener() {     //未必按鈕
            @Override
            public void onClick(DialogInterface dialog, int which) {
                btn2.setText("Maybe");
            }
        });
        d.show();
    }
    public void btn3Click(View view){
        OnDateSetListener listener=new OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                MainActivity.this.year=year;
                MainActivity.this.month=monthOfYear;
                MainActivity.this.day=dayOfMonth;
                btn3.setText(year+"/"+(monthOfYear+1)+"/"+dayOfMonth);
            }
        };
        DatePickerDialog d = new DatePickerDialog(this,listener,year,month,day);
        d.show();
    }
    public void btn4Click(View view){
        ProgressDialog d=new ProgressDialog(MainActivity.this);
        d.setTitle("Download");
        d.setMessage("Downloading...");
        d.setCancelable(false);
        d.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                btn4.setText("Cancel");
            }
        });
        d.show();
    }
}
