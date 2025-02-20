package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET,POST,UPDATE,DELETE

    //GET ile veri çekicez içerisine hangi url'den çekicez onu yazıyoruz
    @GET("atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json")
    //Ne indiricez,hangi metot içinde indiricez onu söyler
    Call<List<CryptoModel>> getData();



}
