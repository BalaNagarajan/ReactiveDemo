package com.jcircle.reactive.processor.controller;

import com.jcircle.reactive.processor.request.MovieRequest;
import com.jcircle.reactive.processor.response.BaseResponse;
import com.jcircle.reactive.processor.service.MovieSvc;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieSvc movieSvc;

    @CrossOrigin
    @PostMapping(value = "/v1/movie/process")
    public ResponseEntity<BaseResponse> processMovieSearch(@RequestBody MovieRequest movieRequest) {
        System.out.println("-------Inside POST--------");
        ResponseEntity<BaseResponse> responseEntityObj = null;
        if (movieRequest != null) {
            movieSvc.processMovieSearchEntities(movieRequest);
        }


        return responseEntityObj;

    }


}
