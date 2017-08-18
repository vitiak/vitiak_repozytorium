package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int personId;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int countOfPosts;

    public ForumUser(final int personId,final String nameUser,final char sex, final LocalDate dateOfBirth,final  int countOfPosts) {
        this.personId = personId;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.countOfPosts = countOfPosts;
    }

    public int getPersonId() {
        return personId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCountOfPosts() {
        return countOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "personId=" + personId +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", countOfPosts=" + countOfPosts +
                '}';
    }
}
