package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnSingle  , btnDouble , btnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSingle = findViewById(R.id.btnSingle);
        btnDouble = findViewById(R.id.btnDouble);
        btnThree = findViewById(R.id.btnThree);
        btnSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Alert Box With One Button  ");
                alertDialog.setMessage("Alert Box Description");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Alert Box Btn", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on the alert box", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.show();
            }
        });

        btnDouble.setOnClickListener(new View.OnClickListener() {





            @Override
            public void onClick(View v) {
                AlertDialog.Builder delBuilder = new AlertDialog.Builder(MainActivity.this);

                delBuilder.setTitle("Dialog Button with Two Button ");
                delBuilder.setIcon(R.drawable.baseline_delete_24);
                delBuilder.setMessage("Are Your Sure You Want To Delete");
                delBuilder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Click on Delete Button ", Toast.LENGTH_SHORT).show();
                    }
                });

                delBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Click on Negative Button ", Toast.LENGTH_SHORT).show();
                    }
                });

            delBuilder.show();
            }
        });


        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder threeDialog = new AlertDialog.Builder(MainActivity.this);


                threeDialog.setTitle("Dialog Box with Three Button ");
                threeDialog.setMessage("Are You want to move to next screen or close");

                threeDialog.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Clicked on the Continue Button ", Toast.LENGTH_SHORT).show();
                    }
                });

                threeDialog.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Clicked on the Cancel Button ", Toast.LENGTH_SHORT).show();
                    }
                });



                threeDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Clicked on Canceled Button ", Toast.LENGTH_SHORT).show();
                    }
                });

                threeDialog.show();
            }
        });


    }
}