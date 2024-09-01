package com.br_jeff.spring.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
  public String execute(String name){
    return "hello" + name;
  }

}
