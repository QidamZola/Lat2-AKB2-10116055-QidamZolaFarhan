package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
/*
 *   AKB2-10116055-Qidam Zola Farhan
 *
 *  Change Log Selasa 16 April 2019 10:30
 *  - membuat login / main activity
 *
 *  Change Log Selasa 16 April 2019 11:30
 *  - membuat register
 *
 *  Change Log Selasa 16 April 2019 13:00
 *  - membuat almost there
 *
 *  Change Log Selasa 16 April 2019 14:00
 *  - membuat verify
 *
 *  Change Log Kamis 18 April 2019 16:00
 *  - membuat user home
 *
 *  Change Log Selasa 15 April 2019 18:00
 *  - edit login
 *  - edit register
 *  - edit almost there
 *  - edit verify
 * */
public class register extends AppCompatActivity {
 private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlmostThere();
            }
        });
    }
    public void openAlmostThere(){
        Intent intent = new Intent(this, almostthere.class);
        startActivity(intent);
    }
}
