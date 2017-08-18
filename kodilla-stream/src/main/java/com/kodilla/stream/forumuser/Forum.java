package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Person1", 'M',
                LocalDate.of(2001, 11, 25), 7));
        theUserList.add(new ForumUser(2, "Person2", 'M',
                LocalDate.of(1994, 11, 15), 77));
        theUserList.add(new ForumUser(3, "Person3", 'F',
                LocalDate.of(1998, 11, 25), 13));
        theUserList.add(new ForumUser(4, "Person4", 'F',
                LocalDate.of(1982, 11, 25), 20));
        theUserList.add(new ForumUser(5, "Person5", 'M',
                LocalDate.of(2002, 11, 25), 1));
        theUserList.add(new ForumUser(6, "Person6", 'F',
                LocalDate.of(1993, 11, 25), 0));
        theUserList.add(new ForumUser(7, "Person7", 'M',
                LocalDate.of(1977, 11, 25), 81));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
