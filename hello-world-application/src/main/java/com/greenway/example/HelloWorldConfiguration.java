package com.greenway.example;

import io.dropwizard.Configuration;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class HelloWorldConfiguration extends Configuration {

    @NotEmpty private String template;
    @NotEmpty private String defaultName = "Stranger";
}
