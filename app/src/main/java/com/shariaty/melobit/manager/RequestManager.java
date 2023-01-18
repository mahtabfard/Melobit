package com.shariaty.melobit.manager;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.shariaty.melobit.Models.MelobitResponse;
import com.shariaty.melobit.Request;
import com.shariaty.melobit.ResponseListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class RequestManager {
    Context context;
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api-beta.melobit.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    Callmelobit callmelobit = retrofit.create(Callmelobit.class);
    public RequestManager(Context context) {
        this.context = context;
    }
    public void getFixture(ResponseListener listener) {
        Call<MelobitResponse> call = callmelobit.callmelobit();
        try {
            call.enqueue(new Callback<MelobitResponse>() {
                @Override
                public void onResponse(Call<MelobitResponse> call, Response<MelobitResponse> response) {
                    if (!response.isSuccessful()){
                        listener.didError(response.message());
                        return;
                    }
                    listener.didFetch(response.body().getResults(), response.message());
                }

                @Override
                public void onFailure(@NonNull Call<MelobitResponse> call, @NonNull Throwable t) {
                    listener.didError(t.getMessage());
                }
            });
        }catch (Exception e) {
            Toast.makeText(context,""+e,Toast.LENGTH_SHORT).show();
        }

    }

    Callmelobit_terndattist callmelobit_trendartist = retrofit.create(Callmelobit_terndattist.class);
    public void getFixture_trendartist(Request listener) {
        Call<MelobitResponse> call = callmelobit_trendartist.callmelobit_trendartist();
        try {
            call.enqueue(new Callback<MelobitResponse>() {
                @Override
                public void onResponse(Call<MelobitResponse> call, Response<MelobitResponse> response) {
                    if (!response.isSuccessful()){
                        listener.didError(response.message());
                        return;
                    }
                    listener.didFetch(response.body().getResults(), response.message());
                }

                @Override
                public void onFailure(@NonNull Call<MelobitResponse> call, @NonNull Throwable t) {
                    listener.didError(t.getMessage());
                }
            });
        }catch (Exception e) {
            Toast.makeText(context,""+e,Toast.LENGTH_SHORT).show();
        }

    }


    Callmelobit_topday callmelobit_topday = retrofit.create(Callmelobit_topday.class);
    public void getFixture_topday(Request listener) {
        Call<MelobitResponse> call = callmelobit_topday.callmelobit_topday();
        try {
            call.enqueue(new Callback<MelobitResponse>() {
                @Override
                public void onResponse(Call<MelobitResponse> call, Response<MelobitResponse> response) {
                    if (!response.isSuccessful()){
                        listener.didError(response.message());
                        return;
                    }
                    listener.didFetch(response.body().getResults(), response.message());
                }

                @Override
                public void onFailure(@NonNull Call<MelobitResponse> call, @NonNull Throwable t) {
                    listener.didError(t.getMessage());
                }
            });
        }catch (Exception e) {
            Toast.makeText(context,""+e,Toast.LENGTH_SHORT).show();
        }

    }

    Callmelobit_thisweek callmelobit_thisweek = retrofit.create(Callmelobit_thisweek.class);
    public void getFixture_thisweek(Request listener) {
        Call<MelobitResponse> call = callmelobit_thisweek.callmelobit_thisweek();
        try {
            call.enqueue(new Callback<MelobitResponse>() {
                @Override
                public void onResponse(Call<MelobitResponse> call, Response<MelobitResponse> response) {
                    if (!response.isSuccessful()){
                        listener.didError(response.message());
                        return;
                    }
                    listener.didFetch(response.body().getResults(), response.message());
                }

                @Override
                public void onFailure(@NonNull Call<MelobitResponse> call, @NonNull Throwable t) {
                    listener.didError(t.getMessage());
                }
            });
        }catch (Exception e) {
            Toast.makeText(context,""+e,Toast.LENGTH_SHORT).show();
        }

    }




    private interface Callmelobit{
        @GET("song/new/0/11")
        Call<MelobitResponse> callmelobit();
    }

    private interface Callmelobit_terndattist{
        @GET("artist/trending/0/4")
        Call<MelobitResponse> callmelobit_trendartist();
    }

    private interface Callmelobit_topday{
        @GET("song/top/day/0/100")
        Call<MelobitResponse> callmelobit_topday();
    }
    private interface Callmelobit_thisweek{
        @GET("song/top/week/0/100")
        Call<MelobitResponse> callmelobit_thisweek();
    }
}
