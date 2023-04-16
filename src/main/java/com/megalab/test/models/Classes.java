package com.megalab.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classes {
    @Id
    @Column(name = "class", length = 50, nullable = false)
    String className;
    @Column(length = 2, nullable = false)
    String type;
    @Column(nullable = false)
    String country;
    int numGuns;
    double bore;
    int displacement;
}
