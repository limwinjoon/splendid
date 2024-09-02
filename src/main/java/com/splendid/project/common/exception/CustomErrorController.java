package com.splendid.project.common.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController{

	@GetMapping("/error/access-denied")
	public String accessDeniedException() {
		throw new AccessDeniedException("");
	}

    @RequestMapping("/error")
    public String errorPage() {
        return "error/error";
    }

}
