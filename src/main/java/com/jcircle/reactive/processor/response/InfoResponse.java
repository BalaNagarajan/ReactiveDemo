package com.jcircle.reactive.processor.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class InfoResponse extends BaseResponse {

    private String appName;
    private String appVersion;
    private String appRelease;
    private String hostName;


}
