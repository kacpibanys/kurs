package com.example.task_13_optional;

import java.util.Optional;

public class Task8 {
    static void main(String[] args) {
        Optional<User> ala = Optional.of(new User("Ala", "ala@gmail.com"));
        Optional<User> bob = Optional.of(new User("Bob", null));
        Optional<User> fred = Optional.empty();

        System.out.println("ala: " + getUserEmail(ala));
        System.out.println("bob: " + getUserEmail(bob));
        System.out.println("fred: " + getUserEmail(fred));
    }
    static String getUserEmail(Optional<User> user){
        return user.flatMap(User::getEmail).orElse("Brak maila");
    }
    public static class User {
        private String name;
        private String email; // może być null

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() { return name; }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
