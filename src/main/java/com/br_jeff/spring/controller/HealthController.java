package com.br_jeff.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br_jeff.spring.service.HealthService;



@RestController
@RequestMapping("/health")
public class HealthController {
 
  private HealthService healthService;

  public HealthController(HealthService healthService) {
    this.healthService = healthService;
  }

  @GetMapping
  public String helloWorld() {
    return this.healthService.execute("teste");
  }
}
