package com.example.imransk.alertcustom;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickMe(View view) {

        showAlert();

    }

    private void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();

        View view = layoutInflater.inflate(R.layout.custom_alert, null);
        builder.setView(view);

        final AlertDialog alertDialog = builder.create();

        TextView title_TV;
        TextView message_TV;
        Button button_NO;
        Button button_yes;

        title_TV=view.findViewById(R.id.title_ID_TV);
        message_TV=view.findViewById(R.id.massage_ID_TV);
        button_NO=view.findViewById(R.id.button_ID_TV_NO);
        button_yes=view.findViewById(R.id.button_ID_TV_yes);

        title_TV.setText("Custom Title");
        message_TV.setText("Custom Messsage");

        button_NO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
        button_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //method
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }
}
