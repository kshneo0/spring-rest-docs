package com.rest.docs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * fileName : IndexController
 * author :  KimSangHoon
 * date : 2022/12/08
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String helloWorld(){
        return "Hello world";
    }
}
