package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean(name = "getToDoList")
    @Scope("prototype")
    public Board getToDoList() { return new Board(); }

    @Bean(name = "getInProgress")
    @Scope("prototype")
    public Board getInProgressList() { return new Board(); }

    @Bean(name = "getDoneList")
    @Scope("prototype")
    public Board getDoneList() { return new Board();}
}
