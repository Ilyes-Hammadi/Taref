package com.cortexia.taref.model;

/**
 * Created by ilyes on 21/09/15.
 */
public class Item {

    private long _id;
    private String name;
    private String text;
    private int image;


    public Item() {

    }

    public Item(String name, String text, int image) {
        this.name = name;
        this.text = text;
        this.image = image;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
