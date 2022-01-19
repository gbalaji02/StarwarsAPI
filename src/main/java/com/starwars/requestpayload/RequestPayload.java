package com.starwars.requestpayload;

import com.google.gson.Gson;
import com.starwars.pojo.Films;

public class RequestPayload {
    private Gson gson = new Gson();

    public String getRequestPayloadForCreate() {
        Films film = new Films();
        film.setTitle("Star Wars");
        film.setEpisodeId("4");
        film.setDirectorName("George Lucas");
        return gson.toJson(film);
    }
}
