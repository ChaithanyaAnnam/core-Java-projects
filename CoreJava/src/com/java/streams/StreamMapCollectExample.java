package com.java.streams;

import com.ext.dto.UserDTO;
import com.ext.pojo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"ramesh","secrete","ramesh@gmail.com"));
        users.add(new User(2,"ganesh","secrete","ganesh@gmail.com"));
        users.add(new User(3,"mahesh","secrete","mahesh@gmail.com"));

        List<UserDTO> userDTOS =  users.stream()
                .map(new Function<User, UserDTO>() {

                    @Override
                    public UserDTO apply(User user) {
                        return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
                    }
                }).collect(Collectors.toList());
        userDTOS.forEach(System.out::println);
        System.out.println("-------------------");
        //another way
        List<UserDTO> userDTOS1 =  users.stream()
                .map((user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());
        userDTOS1.forEach(System.out::println);
        System.out.println("--************--");
        //another way
        users.stream()
                .map((user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .forEach(System.out::println);
    }
}
