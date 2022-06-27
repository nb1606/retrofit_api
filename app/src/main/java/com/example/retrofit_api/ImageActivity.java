package com.example.retrofit_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.retrofit_api.model.ImageResponseItem;
import com.example.retrofit_api.model.QuariPostResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ImageActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    RecyclerView img_rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        img_rcv = findViewById(R.id.img_rcv);

        apiInterface =  RetrofitClient.getClient().create(ApiInterface.class);

        imagepostresponse();

    }

    private void imagepostresponse() {

        apiInterface.Imageresponse().enqueue(new Callback<List<ImageResponseItem>>() {
            @Override
            public void onResponse(Call<List<ImageResponseItem>> call, Response<List<ImageResponseItem>> response) {

                Log.e("TAG", "onResponse: "+response.body());

                if (response.isSuccessful() && response.code() ==200)
                {
                    List<ImageResponseItem> list = response.body();

                    ImageResponseAdapter adapter = new ImageResponseAdapter(list);
                    LinearLayoutManager manager = new LinearLayoutManager(ImageActivity.this,RecyclerView.VERTICAL,false);
                    img_rcv.setLayoutManager(manager);
                    img_rcv.setAdapter(adapter);

                    Log.e("TAG", "onResponse: "+list.size() );
                }
            }

            @Override
            public void onFailure(Call<List<ImageResponseItem>> call, Throwable t) {

            }
        });
    }
}