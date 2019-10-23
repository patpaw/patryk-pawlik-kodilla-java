package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Jan", 'M', LocalDate.of(1993, 10, 15), 3));
        forumUsers.add(new ForumUser(2, "Patryk", 'M', LocalDate.of(2010, 10, 5), 30));
        forumUsers.add(new ForumUser(3, "Maria", 'F', LocalDate.of(2005, 5, 15), 14));
        forumUsers.add(new ForumUser(4, "Agnieszka", 'F', LocalDate.of(1999, 10, 15), 55));
    }

    public List<ForumUser> getUserList() {
        return forumUsers;
    }
}
