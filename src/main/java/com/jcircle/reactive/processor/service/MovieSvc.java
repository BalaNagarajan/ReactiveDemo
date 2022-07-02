package com.jcircle.reactive.processor.service;

import com.jcircle.reactive.processor.request.MovieRequest;

public interface MovieSvc {

    void processMovieSearchEntities(MovieRequest movieRequest);
}
