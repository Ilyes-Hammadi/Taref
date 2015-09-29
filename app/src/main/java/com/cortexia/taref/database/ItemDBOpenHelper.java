package com.cortexia.taref.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by ilyes on 29/09/15.
 */
public class ItemDBOpenHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "items.db";
    public static final int DATABASE_VERSION = 1;

    public ItemDBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statment set the table name and columns
        final String SQL_CREATE_TABLE = "CREATE TABLE " + ItemContract.TABLE_NAME + "( " +
                ItemContract.COLUMN_NAME + " TEXT NOT NULL," +
                ItemContract.COLUMN_TEXT + " TEXT NOT NULL);";
        db.execSQL(SQL_CREATE_TABLE);
        String json = "";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ItemContract.TABLE_NAME);
        onCreate(db);
    }

    public class ItemContract implements BaseColumns {
        // set here the table and columns name
        public static final String TABLE_NAME = "item";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_TEXT = "text";
    }
}
