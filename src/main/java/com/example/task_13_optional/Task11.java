package com.example.task_13_optional;

import java.util.List;
import java.util.Optional;

public class Task11 {
    static class User {
        private int id;
        private String name;
        private int age;
        // konstruktor, gettery, toString — napisz sam

        public User(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static class UserRepository {
        private final List<User> users = List.of(
                new User(1, "Anna", 25),
                new User(2, "Bartek", 17),
                new User(3, "Celina", 30),
                new User(4, "Dawid", 15)
        );

        Optional<User> findById(int id) {
            // TODO: wyszukaj użytkownika po id
            // zwróć Optional.of(user) lub Optional.empty()
            return users.stream().filter(u -> u.getId() == id).findFirst();
        }
    }
    static String getAdultNameById(UserRepository repo, int id){
        return repo.findById(id)
                .filter(user -> user.getAge() >= 18)
                .map(User::getName)
                .map(String::toUpperCase)
                .orElseThrow(() -> new RuntimeException("non-adult user"));
    }
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        int[] testIds = {1, 3, 2, 99};

        for (int currentId : testIds) {
            try {
                String result = getAdultNameById(repository, currentId);
                System.out.println("id = " + currentId + " -> " + result);
            } catch (RuntimeException e) {
                System.out.println("id = " + currentId + " -> exception caught: " + e.getMessage());
            }
        }
    }
}
