package com.psy888.test.restservice;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Greeting {
    private long id;
    private String content;
}
