package com.example.practiceset5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Address;
import android.widget.Toast;

/**
 * Created by saad on 29-06-2016.
 */
public class pset17_helperD extends SQLiteOpenHelper {


    public static final String Dname = "mydb.db";
    public static final int version = 1;
    public static final String table_name = "Employee";
    public static final String ID = "_ID";
    public static final String Fname = "FirstName";
    public static final String Lname = "LastName";
    public static final String Salary = "Salary";
    public static final String Addres = "Address" ;
    SQLiteDatabase mydb ;

    public pset17_helperD(Context context)
    {
        super(context,Dname,null,version);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String querryTable = "Create table " + table_name + "(" + ID + " INTEGER PRIMARY KEY, " + Fname +" TEXT, " + Lname +" TEXT " + ")";

        db.execSQL(querryTable);
    }

    public void openDb()
    {
        mydb = getWritableDatabase();
    }

    public void closeDb()
    {
        if(mydb!=null&&mydb.isOpen())
        {
            mydb.close();
        }
    }

    public long insert (int id, String FirstN , String LastN )
    {
        ContentValues values = new ContentValues();
        if(id!=-1)
        {
            values.put(Lname,LastN);
            values.put(ID,id);
            values.put(Fname,FirstN);


        }
        long i= mydb.insert(table_name, null , values);


        return i;
    }


    public void del(int id)
    {
        String querry = "delete from " + table_name + " where " + ID + " = '" + id +"'";
        mydb.execSQL(querry);

    }
    public void update(int id, String FirstN , String LastN){

        ContentValues values = new ContentValues();
        if(id!=-1)
        {
            values.put(Lname,LastN);
            values.put(ID,id);
            values.put(Fname,FirstN);


        }
        mydb.update(table_name, values,"_ID ="+id,null);

    }
    public Cursor getAllRecords(){
        String query="select * from "+ table_name;
        return mydb.rawQuery(query,null);
    }
}
