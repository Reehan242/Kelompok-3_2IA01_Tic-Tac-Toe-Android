package com.kelompok3.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerNameActivity extends AppCompatActivity {
    Button btnPlay;
    EditText editp1,editp2;
    public String p1;
    public String p2;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playername);
        editp1 = (EditText) findViewById(R.id.editP1name);
        editp2 = (EditText) findViewById(R.id.editP2name);


        btnPlay = (Button) findViewById(R.id.btnplay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1 = editp1.getText().toString();
                p2 = editp2.getText().toString();
                if (!p1.trim().isEmpty() && !p2.trim().isEmpty()){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("p1",editp1.getText().toString());
                    intent.putExtra("p2",editp2.getText().toString());
                    startActivity(intent);
                    editp1.setText("");
                    editp2.setText("");
                    finish();
                }
                else if(p1.trim().isEmpty() && !p2.trim().isEmpty()){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("p1","1");
                    intent.putExtra("p2",editp2.getText().toString());
                    startActivity(intent);
                    finish();
                    editp2.setText("");
                }
                else if(!p1.trim().isEmpty() && p2.trim().isEmpty()){
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("p1",editp1.getText().toString());
                        intent.putExtra("p2","2");
                        startActivity(intent);
                        finish();
                        editp1.setText("");
                }
                else if(p1.trim().isEmpty() && p2.trim().isEmpty()){
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            intent.putExtra("p1","1");
                            intent.putExtra("p2","2");
                            startActivity(intent);
                            finish();
                            editp1.setText("");
                }

            }
        });

    }


}
