package com.example.srima.dialogg4;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn;
    TextView txt1,txt2,txt3,txt4,txt5,txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.but);

        txt4=(TextView)findViewById(R.id.text4);
        txt5=(TextView) findViewById(R.id.text5);
        txt6=(TextView)findViewById(R.id.text6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangeLangDialog();
            }
        });

    }
    private void showChangeLangDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.layoutdia,null);
        dialogBuilder.setView(dialogView);



        dialogBuilder.setTitle("Details");
        dialogBuilder.setMessage("Enter your details  below");
        final EditText name=(EditText)dialogView.findViewById(R.id.namee);
        final EditText phn=(EditText)dialogView.findViewById(R.id.numberr);
        final EditText db=(EditText)dialogView.findViewById(R.id.dob);

        txt1 = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);
        txt3 = (TextView) findViewById(R.id.text3);
            dialogBuilder.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    //do something with edt.getText().toString();

                  if(txt1.getText().toString().length()==0) {

                       txt1.setText(name.getText().toString());
                       txt2.setText(phn.getText().toString());
                       txt3.setText(db.getText().toString());

                   }
                    else if(txt4.getText().toString().length()==0) {
                     txt4.setText(name.getText().toString());
                     txt5.setText(phn.getText().toString());
                     txt6.setText(db.getText().toString());
                     }
                   // Toast.makeText(MainActivity.this,"fafssdf",Toast.LENGTH_LONG).show();
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    //pass
                }
            });

        AlertDialog b = dialogBuilder.create();
        b.show();
    }
}
