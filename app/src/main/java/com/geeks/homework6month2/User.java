package com.geeks.homework6month2;

public class User {
    private String name;
    private String avatarUrl;
    private Integer age ;

    public User(String name, Integer age, String avatarUrl) {
        this.name = name;
        this.age = age;
        this.avatarUrl = avatarUrl;
    }

    public Integer getAge() {
        return age;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "{" + name + '\'' +
        ", age"+ age +'}';
    }

}
