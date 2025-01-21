package ru.leonid.spring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private int id;
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 3, max = 50, message = "Имя должно быть от 3 до 50 символов длиной")
    private String fullName;

    @Min(value = 1800, message = "Год рождения должен быть больше, чем 1800")
    private int yearOfBirth;
}
