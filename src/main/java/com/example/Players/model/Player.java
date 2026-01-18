package com.example.Players.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLAYER")
public class Player {

    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PlayerId;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

}
