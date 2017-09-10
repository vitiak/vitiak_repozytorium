package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
/*    List<String> listToDo = new ArrayList<>();
    List<String> listInProgress = new ArrayList<>();
    List<String> listDone = new ArrayList<>();

/*    public void addToList() {
        listToDo.add("Lista toDo");
        listInProgress.add("Lista inProgress");
        listDone.add("Lista Done");
    }
*/
    @Bean(name = "getToDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> listToDo = new ArrayList<>();
        listToDo.add("Lista toDo");
        return new TaskList(listToDo);
    }

    @Bean(name = "getInProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> listInProgress = new ArrayList<>();
        listInProgress.add("Lista in Progress");
        return new TaskList(listInProgress);
    }

    @Bean(name = "getDone")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> listDone = new ArrayList<>();
        listDone.add("Lista Done");
        return new TaskList(listDone);
    }

    @Bean(name = "getAll")
    @Scope("prototype")
    public Board getAll() { return new Board(getToDoList(), getInProgressList(), getDoneList());}

}
