package com.akawi.shahed.newcourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    private ListView lstCourse;
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstCourse=(ListView) findViewById(R.id.lstCourse);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        initListview();




    }
    public void onClick(View v)
    {
        if(v==btnAdd)
        {
            Intent intent=new Intent(MainActivity.this,AllCourses.class);
            startActivity(intent);
        }



    }
    private  void  initListview(){
        String[] a={"one","two","three"};
    ArrayAdapter<String>adapter=new
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a);
    lstCourse.setAdapter(adapter);

}
}

