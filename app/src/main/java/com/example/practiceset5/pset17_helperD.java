package com.example.practiceset5;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by syedaamir on 29-06-2016.
 */
public class pset17_helperD extends SQLiteOpenHelper {

    public static final String Dname = "myname.db";
    public static final int version = 1;
    public String _id="_id";
    public String Fname="fname";
    public String Lname="lname";
    public String Address="address";
    public String Salary="salary";
    public String Table_name = "Employee";
    public SQLiteDatabase mydb;
    public  pset17_helperD(Context context){
        super(context,Dname,null,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query_table = "CREATE TABLE " + Table_name + "(" + _id+" INTEGER PRIMARY KEY,"+Fname+" TEXT NOT NULL,"+Lname+" TEXT NOT NULL,"+Address+" TEXT NOT NULL,"+Salary+" INTEGER NOT NULL);";
        db.execSQL(query_table);
    }

    public pset17_helperD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public String getDatabaseName() {
        return super.getDatabaseName();
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        super.setWriteAheadLoggingEnabled(enabled);
    }

    @Override
    public SQLiteDatabase getWritableDatabase() {
        return super.getWritableDatabase();
    }

    @Override
    public SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }

    @Override
    public synchronized void close() {
        super.close();
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    public void openDb(){
        mydb = getWritableDatabase();
    }
    public void closeDb(){
        if(mydb != null && mydb.isOpen()){
            mydb.close();
        }
    }
    public long insert(int id,String Firstn,String Lastn,String add,int Sal){
        ContentValues values = new ContentValues();
        if(id!= -1){
            values.put(_id,id);
            values.put(Address,add);
            values.put(Fname,Firstn);
            values.put(Lname,Lastn);
            values.put(Salary,Sal);
        }
        return mydb.insert(Table_name,null,values);
    }
}

