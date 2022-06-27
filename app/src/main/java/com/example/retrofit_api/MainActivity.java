package com.example.retrofit_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.retrofit_api.model.PathPostResponse;
import com.example.retrofit_api.model.PostItemItemResponse;
import com.example.retrofit_api.model.QuariPostResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    List<PostItemItemResponse> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface =RetrofitClient.getClient().create(ApiInterface.class);

       // postitemresponse();
       // pathpostresponse();
        // quarypostresponse();
        // quarypost_response();

    }

    private void quarypost_response() {
        int id = 3;
        apiInterface.Postquary(id).enqueue(new Callback<List<QuariPostResponseItem>>() {
            @Override
            public void onResponse(Call<List<QuariPostResponseItem>> call, Response<List<QuariPostResponseItem>> response) {


                if (response.isSuccessful() && response.code() ==200){
                    List<QuariPostResponseItem> listquary = response.body();

                    for (int i = 0; i < listquary.size(); i++) {
                        Log.e("TAG", "onResponse:"+listquary.get(i).getEmail());
                    }
                }

            }

            @Override
            public void onFailure(Call<List<QuariPostResponseItem>> call, Throwable t) {

            }
        });
    }

    private void quarypostresponse() {
        int id = 2;

        apiInterface.PostquaryItem(id).enqueue(new Callback<List<QuariPostResponseItem>>() {
            @Override
            public void onResponse(Call<List<QuariPostResponseItem>> call, Response<List<QuariPostResponseItem>> response) {


                if (response.isSuccessful() && response.code() ==200){
                    List<QuariPostResponseItem> listquary = response.body();

                    for (int i = 0; i < listquary.size(); i++) {
                        Log.e("TAG", "onResponse:"+listquary.get(i).getEmail());
                    }
                }

            }

            @Override
            public void onFailure(Call<List<QuariPostResponseItem>> call, Throwable t) {

            }
        });
    }

    private void pathpostresponse() {
        int id = 10;
        apiInterface.PostpathItem(id).enqueue(new Callback<PathPostResponse>() {
            @Override
            public void onResponse(Call<PathPostResponse> call, Response<PathPostResponse> response) {
                if (response.isSuccessful() && response.code() ==200){
                    PathPostResponse respose = response.body();
                    Log.e("TAG", "onResponse:"+respose.getTitle());
                }
            }

            @Override
            public void onFailure(Call<PathPostResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void postitemresponse() {
        apiInterface.PostItem().enqueue(new Callback<List<PostItemItemResponse>>() {
            @Override
            public void onResponse(Call<List<PostItemItemResponse>> call, Response<List<PostItemItemResponse>> response) {

                if (response.isSuccessful() && response.code()==200)
                {
                    list = response.body();
                    Log.e("TAG", "onResponse: list size"+list.size() );
                }
            }

            @Override
            public void onFailure(Call<List<PostItemItemResponse>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Something went wrong ", Toast.LENGTH_SHORT).show();
            }
        });
    }


}