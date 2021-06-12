package com.example.springcloudloadbalancersayhello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Vishwa - 13th June 2021
 */
@RestController
public class ClientController {

  @Autowired
  RestTemplate restTemplate;

  @GetMapping("/server-location")
  public String serverLocation() {
    return this.restTemplate.getForObject("http://ping-server/ss/v1/students/", String.class);
  }
}
