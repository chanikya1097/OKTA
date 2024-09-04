package com.okta.springmfa.spring_mfa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class MFARestController {

    @RequestMapping("/")
    String home(java.security.Principal user) {
        return "Hello " + user.getName();
    }
}