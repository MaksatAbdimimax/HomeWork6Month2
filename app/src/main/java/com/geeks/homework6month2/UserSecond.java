package com.geeks.homework6month2;

public class UserSecond {
    private String name;
    private String avatarUrl;
    private Integer age ;

    public UserSecond(String name, Integer age, String avatarUrl) {
        this.name = name;
        this.age = age;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String toString(){
        return "{" + name + '\'' +
                ", age"+ age +'}';
    }

}
