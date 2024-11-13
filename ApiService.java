package com.example.retrofitapp.network;

import com.example.retrofitapp.model.Data;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("3505")
    Call <List<Data>> getAllUsers();
}
