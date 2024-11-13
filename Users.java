package com.example.retrofitapp.model;

import com.bumptech.glide.load.data.DataRewinder;
import com.google.gson.annotations.SerializedName;
import java.util.List;
public class Users {
    @SerializedName("data")
    private List<Data> data;
    public List<Data> getData(){
        return data;
    }
}
