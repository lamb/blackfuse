package org.mynah.blackfuse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.mynah.blackfuse.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/test")
    public String index(HttpServletRequest request) {
        return "test";
    }

    @RequestMapping("/aspect")
    public String aspect(HttpServletRequest request, @Valid User user, BindingResult result) {
        logger.debug("result.hasErrors()=" + result.hasErrors() + ":result=" + result);
        return "test";
    }

    @RequestMapping("/exception")
    public String exception(HttpServletRequest request) {
        NullPointerException exception = new NullPointerException();
        logger.error(exception.getStackTrace().toString());
        throw exception;
    }

}
