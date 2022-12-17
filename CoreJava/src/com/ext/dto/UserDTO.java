package com.ext.dto;

public class UserDTO {
    private int id;
    private String UserName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        UserName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
