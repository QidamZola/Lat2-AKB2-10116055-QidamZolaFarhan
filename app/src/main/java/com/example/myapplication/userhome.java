package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
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
public class userhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhome);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
