package com.example.webpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET
    // /hello-world -> (endpoint)
    // @RequestMapping() -> 예전방식임.  @RequestMapping(method=RequestMethod.GET, path="/hello-world")

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    /**
     * 자바 빈 형태로 반환해주는 방식 => json형식으로 알아서 반환해줌!
     */
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello world");
    }



}
