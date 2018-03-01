package com.example.dayal.recyclerview.Model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListItem {

    private String name;
    private String desciption;

    public ListItem(String name, String desciption) {
        this.name = name;
        this.desciption = desciption;
    }

    public String getName() {
        return name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }


}
