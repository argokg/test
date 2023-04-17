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
public class Ships {
    @Id
    @Column(length = 50, nullable = false)
    String name;
    @OneToOne
    @JoinColumn(name = "class", nullable = false)
    Classes classes;
    int launched;

}
