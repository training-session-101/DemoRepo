package helloworld;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class User {
    @JsonSerialize
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
