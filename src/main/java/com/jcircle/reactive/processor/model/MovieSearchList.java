package com.jcircle.reactive.processor.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class MovieSearchList {
    public String search_engine;
    public Date movie_search_date;
}
