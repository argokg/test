package com.megalab.test.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Outcomes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 50, nullable = false)
    String ship;
    @ManyToOne
    @JoinColumn(name = "battle", nullable = false)
    Battles battle;
    @Column(length = 10, nullable = false)
    String result;
}
