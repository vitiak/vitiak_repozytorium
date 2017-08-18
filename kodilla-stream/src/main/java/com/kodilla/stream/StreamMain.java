package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultStringOfForumUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() = 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1998)
                .filter(forumUser -> forumUser.getCountOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getPersonId, forumUser->forumUser));

        System.out.println("# elements: " + theResultStringOfForumUser.size());
        theResultStringOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
   }
}