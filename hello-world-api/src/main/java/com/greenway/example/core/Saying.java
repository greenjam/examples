package com.greenway.example.core;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@AllArgsConstructor
public class Saying {

    @Getter
    @JsonProperty
    long id;

    @Getter
    @Length(max = 3)
    @JsonProperty
    String content;
}
