package com.example.webpractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@RequiredArgsConstructor //final이 되어있는 필드값만 파라미터로 받는 생성자를 생성해줌
@AllArgsConstructor // 모든 인자를 파라미터로받는 생성자를 만들어줌
@NoArgsConstructor // default생성자를 만들어줌
public class HelloWorldBean {

    private String message;
    //private final String message;
}
