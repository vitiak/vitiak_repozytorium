package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    List<String> listToDo = new ArrayList<>();
    List<String> listInProgress = new ArrayList<>();
    List<String> listDone = new ArrayList<>();

    public void addToList() {
        listToDo.add("Lista toDo");
        listInProgress.add("Lista inProgress");
        listDone.add("Lista Done");
    }

    @Bean(name = "getToDo")
    @Scope("prototype")
    public TaskList getToDoList() { return new TaskList(listToDo);}

    @Bean(name = "getInProgress")
    @Scope("prototype")
    public TaskList getInProgressList() { return new TaskList(listInProgress); }

    @Bean(name = "getDone")
    @Scope("prototype")
    public TaskList getDoneList() { return new TaskList(listDone);}

    @Bean
    @Scope("prototype")
    public Board getAll() { return new Board(getToDoList(), getInProgressList(), getDoneList());}

}
