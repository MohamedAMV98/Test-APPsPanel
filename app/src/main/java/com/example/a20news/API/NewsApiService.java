package com.example.a20news.API;

import com.example.a20news.Model.Actu;

import java.util.List;

public class NewsApiService implements NewsManagement{
    private List<Actu> mActuList = NewsGenerator.getActuList();
    @Override
    public List<Actu> getNewsList() {
        return mActuList;
    }

    @Override
    public List<Actu> filterByDate() {
        return null;
    }
}
