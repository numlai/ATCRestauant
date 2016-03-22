package com.example.com1test.numlai;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;

/**
 * Created by com1test on 21/3/2559.
 */
public class MyAlerDialog {

    public void myDialog(Context context,
                        String strTitle,
                        String strMassage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.icon_question);
        builder.setTitle(strTitle);
        builder.setMessage(strMassage);
        builder.setCancelable(false);
        builder.setPositiveButton("ค่ะ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        }) ;
        builder.show();
    }

} //Main Class
