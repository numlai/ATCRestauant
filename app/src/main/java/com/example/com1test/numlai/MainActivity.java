package com.example.com1test.numlai;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.com1test.numlai.R.id.button;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private String userString, passwordString;
    private MyManage myManage;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Request Database
        myManage = new MyManage(this);

        //Button controller
        buttonController();

    } //Main Method

    private void buttonController() {
       loginButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //Receive Value From Edit Text
               userString = userEditText.getText().toString().trim();
               passwordString = passwordEditText.getText().toString().trim();

               if(userString.equals("")  ||passwordString.equals("")) {

                   MyAlerDialog myAlerDialog = new MyAlerDialog();
                   myAlerDialog.myDialog(MainActivity.this, "มีช่องว่าง", "กรุณากรอก");
               }else {


               }


           }//onclick
       });
    }  //buttonConterler

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);
    }




    
}  //Main Class นี่คือคลาสหลัก
