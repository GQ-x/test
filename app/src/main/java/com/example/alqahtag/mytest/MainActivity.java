package com.example.alqahtag.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_LIFECYCLE = "TagLifecycle";

    public static final String KEY_NAME = "keyName";
    public static final String KEY_EMAIL = "keyEmail";
    public static final String KEY_PASSWORD = "keyPassword";
    public static final int REQUEST_EDIT = 1234;

    private EditText inputName;
    private EditText inputEmail;
    private EditText inputPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG_LIFECYCLE, "in the onCreate() event");
        //initializing widget members
                inputName = (EditText) findViewById(R.id.inputtName);
        inputEmail = (EditText) findViewById(R.id.inputEmail);
        inputPassword = (EditText) findViewById(R.id.inputPassword);
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG_LIFECYCLE, "in the onStart() event");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(TAG_LIFECYCLE, "in the onRestart() event");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG_LIFECYCLE, "in the onResume() event");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG_LIFECYCLE, "in the onStop() event");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG_LIFECYCLE, "in the onDestroy() event");
    }

//    public void goEdit(View v){
//        Intent intentEdit = new Intent();
//        startActivityForResult(intentEdit, REQUEST_EDIT);
//    }

    public void goDisplay(View v){
        Intent intentDisplay = new Intent();
        intentDisplay.setAction("com.example.ghazwa.myactivities.ThirdActivity");
        intentDisplay.putExtra(KEY_NAME, inputName.getText().toString());
        intentDisplay.putExtra(KEY_EMAIL, inputEmail.getText().toString());
        Bundle bundle = new Bundle();
//        bundle.putString();
    }
//    for login button
    public void onButtonClick(View v){
        setContentView(R.layout.activity_welcome);
    }
//    for sign up button
    public void onButtonClick2(View v){
        setContentView(R.layout.activity_signup);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == REQUEST_EDIT && resultCode == RESULT_OK){

        }
    }
}
