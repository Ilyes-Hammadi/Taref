package com.cortexia.taref.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.cortexia.taref.model.Item;

/**
 * Created by ilyes on 29/09/15.
 */
public class ItemDataSource {

    private ItemDBOpenHelper helper;
    private SQLiteDatabase database;

    private String[] allComluns = {
            ItemDBOpenHelper.ItemContract.COLUMN_NAME,
            ItemDBOpenHelper.ItemContract.COLUMN_TEXT
    };

    public ItemDataSource(Context context) {
        helper = new ItemDBOpenHelper(context);
    }


    public void open() {
        database = helper.getReadableDatabase();
    }

    public void close() {
        database.close();
    }

    private ContentValues getContentValueFromModel(Item item) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(ItemDBOpenHelper.ItemContract.COLUMN_NAME, item.getName());
        contentValues.put(ItemDBOpenHelper.ItemContract.COLUMN_TEXT, item.getText());

        return contentValues;
    }

    public Item getItem() {
        Item item = new Item();
        Cursor cursor = database.query(ItemDBOpenHelper.ItemContract.TABLE_NAME, allComluns, null, null, null, null, null);

        if (cursor.getCount() > 0) {

            while (cursor.moveToNext()) {
                item.setName(cursor.getString(cursor.getColumnIndex(ItemDBOpenHelper.ItemContract.COLUMN_NAME)));
                item.setText(cursor.getString(cursor.getColumnIndex(ItemDBOpenHelper.ItemContract.COLUMN_TEXT)));
            }

        }

        return item;
    }

    public long insertItem(Item item) {
        ContentValues values = getContentValueFromModel(item);
        long id = database.insert(ItemDBOpenHelper.ItemContract.TABLE_NAME, null, values);
        item.set_id(id);
        return id;
    }

}
