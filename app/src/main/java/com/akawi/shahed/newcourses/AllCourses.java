package com.akawi.shahed.newcourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class AllCourses extends AppCompatActivity
{
    private Button btnSave;
    private TextView coursesS;
    private EditText edtName,edtPhone,edtID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_courses);

        btnSave=(Button)findViewById(R.id.btnSave);
        coursesS=(TextView)findViewById(R.id.coursesS);
        edtID=(EditText) findViewById(R.id.edtID);
        edtName=(EditText) findViewById(R.id.edtName);
        edtPhone=(EditText) findViewById(R.id.edtPhone);
    }

public void onClick (View view )
{
    if (view==btnSave)
    {
        String name=edtName.getText().toString();
        String phoneNumber=edtPhone.getText().toString();
        String id=edtID.getText().toString();

       // Course1 course1=new Courses();

        Intent intent=new Intent(AllCourses.this,MainActivity.class) ;
        startActivity(intent);
        finish();
    }
}
}
