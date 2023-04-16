package com.megalab.test.models.dto;

import com.megalab.test.models.Classes;
import lombok.Data;

@Data
public class ShipsDTO {
    String name;
    Classes classes;
    int launched;
}
