package com.auth.controller;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.auth.model.ErrorDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

@RestController
public class IndexController implements ErrorController {

    private static final String PATH = "/error";

/*    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }*/

    @Override
    public String getErrorPath() {
        return PATH;
    }

    @RequestMapping(value = PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public ErrorDetails findError(HttpServletResponse response) {

        HttpStatus status = HttpStatus.valueOf(response.getStatus());
        return new ErrorDetails(response.getStatus(), status, status.getReasonPhrase());
    }

}
