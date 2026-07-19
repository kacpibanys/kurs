package com.example.task_08_exceptions;

public class Task1 {
    public final class PasswordValidator {
        private PasswordValidator() {}

        public static void validate(String pwd) {
            // TODO: walidacja wg opisu; rzucaj IllegalArgumentException z jasnym komunikatem
            if (pwd == null || pwd.length() < 8) {
                throw new IllegalArgumentException("length < 8");
            }
            if(pwd.chars().noneMatch(Character::isDigit)){
                throw new IllegalArgumentException("no digit");
            }
        }
    }

    static void main(String[] args) {
        String password1 = "Dupaaaaaa1";
        PasswordValidator.validate(password1);

    }
}
