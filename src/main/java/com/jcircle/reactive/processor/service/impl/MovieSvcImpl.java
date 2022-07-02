package com.jcircle.reactive.processor.service.impl;

import com.jcircle.reactive.processor.request.MovieRequest;
import com.jcircle.reactive.processor.service.IProcessor;
import com.jcircle.reactive.processor.service.MovieSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("movieSvc")
public class MovieSvcImpl implements MovieSvc {

    @Autowired
    IProcessor movieProcessor = null;

    @Override
    public void processMovieSearchEntities(MovieRequest movieRequest) {
        if(movieRequest != null) {
            movieProcessor.processMovieByAscDate(movieRequest);
            movieProcessor.processMovieByDescDate(movieRequest);
          //  movieProcessor.processMovieByTwitter(movieRequest);
        }


    }
}
