package com.example.a20news.API;

import com.example.a20news.Model.Actu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class NewsGenerator {
    public static List<Actu> NEWS_LIST = Arrays.asList(
            new Actu(1, "BOURSE", "25/06/20", "Chute"),
            new Actu(2, "FAITS DIVERS", "24/06/20", "VOL À MAIN ARMÉE"),
            new Actu(3, "POLITIQUE", "23/06/20", "RÉUNION SEMESTRIELLE DU GOUVERNEMENT")
    );

    static List<Actu> getActuList(){return new ArrayList<>(NEWS_LIST);}
}
