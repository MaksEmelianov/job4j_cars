package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "auto_user")
public class User implements Comparable<User> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String password;

    @Override
    public int compareTo(User o) {
        return Integer.compare(id, o.id);
    }
}
