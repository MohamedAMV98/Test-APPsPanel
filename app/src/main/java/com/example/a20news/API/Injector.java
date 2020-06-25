package com.example.a20news.API;

import com.example.a20news.Model.Actu;

import java.util.List;

public class Injector {

    public static NewsApiService mApiService = new NewsApiService();

    public static NewsApiService getApiService(){return mApiService;}
}
