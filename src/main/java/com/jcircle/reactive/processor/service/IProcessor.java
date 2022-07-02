package com.jcircle.reactive.processor.service;

import com.jcircle.reactive.processor.request.MovieRequest;

public interface IProcessor {

    void processMovieByAscDate(MovieRequest movieRequest);

    void processMovieByDescDate(MovieRequest movieRequest);

    void processMovieByTwitter(MovieRequest movieRequest);

}
