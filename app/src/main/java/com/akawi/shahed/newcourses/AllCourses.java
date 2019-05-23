package com.akawi.shahed.newcourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AllCourses extends AppCompatActivity
{
    private Button btnAdd,btnSave;
    private ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_courses);

        lst =(ListView )findViewById(R.id.lst);
        btnAdd=(Button)findViewById(R.id.btnAdd);
    }

public void onClick (View view )
{
    if (view==btnSave)
    {
        Intent intent=new Intent(AllCourses.this,MainActivity.class) ;
        startActivity(intent);
        finish();
    }
}
}
