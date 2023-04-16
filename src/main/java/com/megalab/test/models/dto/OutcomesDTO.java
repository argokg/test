package com.megalab.test.models.dto;

import com.megalab.test.models.Battles;
import lombok.Data;

@Data
public class OutcomesDTO {
    Long id;
    String ship;
    Battles battle;
    String result;
}
