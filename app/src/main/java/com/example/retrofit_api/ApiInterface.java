package com.example.retrofit_api;

import com.example.retrofit_api.model.ImageResponseItem;
import com.example.retrofit_api.model.PathPostResponse;
import com.example.retrofit_api.model.PostItemItemResponse;
import com.example.retrofit_api.model.QuariPostResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("/posts")
    Call<List<PostItemItemResponse>> PostItem();

    @GET("/posts/{id}")
    Call<PathPostResponse> PostpathItem(@Path("id") int id);

    @GET("/comments")
    Call<List<QuariPostResponseItem>> PostquaryItem(@Query("postId") int id);

    @GET("/posts/{Id}/comments")
    Call<List<QuariPostResponseItem>> Postquary(@Path("Id") int id);

    @GET("/photos")
    Call<List<ImageResponseItem>> Imageresponse();
}
