package com.example.springcloudloadbalancersayhello;

import configurations.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Vishwa - 13th June 2021
 */
@SpringBootApplication
@RibbonClient(name = "ping-a-server", configuration = Configuration.class)
public class SpringCloudLoadbalancerSayHelloApplication {

  @LoadBalanced
  @Bean
  RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudLoadbalancerSayHelloApplication.class, args);
  }
}
