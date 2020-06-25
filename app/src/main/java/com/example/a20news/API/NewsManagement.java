package com.example.a20news.API;

import com.example.a20news.Model.Actu;

import java.util.List;

public interface NewsManagement {

    List<Actu> getNewsList();
    List<Actu> filterByDate();
}
