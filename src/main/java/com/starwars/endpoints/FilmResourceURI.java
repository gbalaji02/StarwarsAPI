package com.starwars.endpoints;

public enum FilmResourceURI {
    FILMS_URI ("/films"),
    FILM_BY_ID_URI ( "/films/:id");

    private FilmResourceURI(String uri) {
        this.uri = uri;
    }

    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
