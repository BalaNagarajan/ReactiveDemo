package com.jcircle.reactive.processor.controller;

import com.jcircle.reactive.processor.response.InfoResponse;
import com.jcircle.reactive.processor.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController("infoController")
@CrossOrigin
@RequestMapping("/api/v1")
public class InfoController {

    @Value("${app_name}")
    private String appName;
    @Value("${app_version}")
    private String appVersion;
    @Value("${app_release}")
    private String appRelease;
    private String hostName;
    private InfoResponse infoResponse;

    private String getHostName() {
        System.out.println("-----Get Host Name----");
        if (hostName == null) {
            hostName = CommonUtils.getHostNameFromSystem();
        }
        return hostName;

    }

    @CrossOrigin
    @GetMapping("/info")
    @ResponseBody
    private InfoResponse getInfoResponse() {
        System.out.println("---In Get Info Response---");
        this.infoResponse = new InfoResponse();
        this.infoResponse.setAppRelease(appRelease);
        this.infoResponse.setAppName(appName);
        this.infoResponse.setHostName(CommonUtils.getHostNameFromSystem());
        this.infoResponse.setAppVersion(appVersion);
        return this.infoResponse;
}






}
