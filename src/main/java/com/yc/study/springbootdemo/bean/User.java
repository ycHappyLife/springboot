package com.yc.study.springbootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private String userName;

    private String password;

    private Integer age;

    private Integer sex;

    private String[] hobbies;

    private List<Email> emailList;

    private Map<String, Object> score;
}
