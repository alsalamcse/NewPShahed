import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.akawi.shahed.newcourses.AllCourses;

import java.util.ArrayList;

public class MyCoursesTable extends SQLiteOpenHelper {
    private static final int DATABASE_VERSLON = 1;//صفات ورثتها الفئة من SQLiteOpenHelper
    private static final String DATABASE_NAME = "COURSES_DB";
    private static final String TABLE_COURSES = "COURSES_TBL";


    private static final String KEY_ID = "_id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PH_NO = "Pphone_number";


    public MyCoursesTable(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSLON);
    }

    @Override
    public void onCreate(SQLiteDatabase db)//عن طريق الكائن نستطيع الاتصال مع قاعدة البيانات
    {
        String sqlCreate = "CREATE TABLE " + TABLE_COURSES + "("//اوامر ب SQL عن طريقهم يتم بناء الجدول
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_NAME + "TEXT,"
                + KEY_PH_NO + "TEXT" + ")";
        db.execSQL(sqlCreate);//من اجل تشغيل الاوامر نحتاج  بقاعدة البيانات الى execSQL
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        String sqlDrop = "DROP TABLE IF EXISTS " + TABLE_COURSES;
        db.execSQL(sqlDrop);
        onCreate(db);
    }

    public long addCourses(Course1 course) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, course.getName());
        values.put(KEY_PH_NO, course.getNumber());
        int num = db.update(TABLE_COURSES, values, KEY_ID + "=" + course.get_id(), null);
        db.close();
        return num;


    }


    public int deleteCoursesByld(Course1 courses) {


        SQLiteDatabase db = this.getWritableDatabase();
        int num = db.delete(TABLE_COURSES, KEY_ID + "=" + courses.get_id(), null);
        db.close();
        return num;
        ///
        //
//,klkl;k


    }

    public ArrayList<Course1> getAllCourses() {
        ArrayList<Course1> cousesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_COURSES;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
       boolean flag=cursor.moveToFirst();
       while (flag==true)
        {
            Course1 course1=new Course1();
            course1.set_id(cursor.getLong(0));
            course1.setName(cursor.getString(1));
            course1.setNumber(cursor.getInt(2));


            AllCourses.add(course1);
            flag=cursor.moveToFirst();


                cousesList.add(course1);
            } while (cursor.moveToNext());

        }
        return  AllCourses;
    }
}
