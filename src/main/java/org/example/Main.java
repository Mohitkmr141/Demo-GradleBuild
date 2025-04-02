package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("Hello");
        OkHttpClient client = new OkHttpClient();

        String url = "https://jsonplaceholder.typicode.com/todos/1/";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if(!response.isSuccessful()) {
                System.out.println("Something went wring !!!!");
            }
            System.out.println(response.body().string());
        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }
}