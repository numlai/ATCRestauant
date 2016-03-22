package com.example.com1test.numlai;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyManage {
    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLitedatabase, readSqLiteDatabase;


    public MyManage(Context context) {


        //Create&Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLitedatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();
    } //Constructor

} //Main Class
