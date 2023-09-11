package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);

        mostarAlertDialog();

    }

    public void mostarAlertDialog(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                b.setCancelable(true);
                b.setTitle("Ok");
                b.setMessage("Esto es un AlertDialog!!!");
                b.setIcon(R.drawable.visto);
                b.show();
            }
        });

    }

}