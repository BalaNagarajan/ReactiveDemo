package com.jcircle.reactive.processor.model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Movie {
    public String movie_id;
    public String movie_name;
    public String movie_release_date;
    public List<MovieSearchList> movies_search_list;
}
