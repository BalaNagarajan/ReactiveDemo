package com.jcircle.reactive.processor.service.impl;

import com.jcircle.reactive.processor.model.MovieSearchList;
import com.jcircle.reactive.processor.request.MovieRequest;
import com.jcircle.reactive.processor.service.IProcessor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Comparator;

@Component
public class MovieProcessorImpl implements IProcessor {

    /**
     * Sort the incoming search entity in ASC order
     * @param movieRequest
     */
    @Async
    public void processMovieByAscDate(MovieRequest movieRequest) {

        try {
            //Sorting the search date in ASC order
            movieRequest.getMovie().getMovies_search_list().sort((obj1,obj2) -> obj1.getMovie_search_date().compareTo(obj2.getMovie_search_date()));
            MovieSearchList movieSearchList = movieRequest.getMovie().getMovies_search_list().get(0);
            System.out.println("-----ASC----"+movieSearchList.getSearch_engine());
            //Inserts the first element in the list

        }
        catch(Exception ex) {

        }

    }

    @Async
    public void processMovieByDescDate(MovieRequest movieRequest) {
        System.out.println("---------processMovieByDescDate----");
        try {
        //Sorting the search date in DESC order
            movieRequest.getMovie().getMovies_search_list().sort((obj1,obj2) -> obj1.getMovie_search_date().compareTo(obj2.getMovie_search_date()));
            MovieSearchList movieSearchList = movieRequest.getMovie().getMovies_search_list().get(movieRequest.getMovie().getMovies_search_list().size()-1);
            System.out.println("-----DESC----"+movieSearchList.getSearch_engine());
        }
        catch(Exception ex) {

        }

    }

    @Async
    public void processMovieByTwitter(MovieRequest movieRequest) {
        System.out.println("---------processMovieByTwitter---Ends-");

    }

}
