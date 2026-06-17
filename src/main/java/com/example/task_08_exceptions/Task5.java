package com.example.task_08_exceptions;
import java.util.regex.Pattern;
public class Task5 {

    abstract static class EmailValidationException extends RuntimeException {
        public EmailValidationException(String message) {
            super(message);
        }
    }

     static class EmptyEmailException extends EmailValidationException {
        public EmptyEmailException(String message) {
            super(message);
        }
    }

     static class InvalidEmailFormatException extends EmailValidationException {
        public InvalidEmailFormatException(String message) {
            super(message);
        }
    }
// TODO: zdefiniuj własne wyjątki domenowe (nazwy wymyśl sam/a)
// np. bazowy wyjątek walidacji + osobne podtypy dla różnych przyczyn błędu

    public static final class EmailValidator {
        private EmailValidator() {}

        // TODO: zdefiniuj wzorzec, np.:
        // private static final Pattern EMAIL = Pattern.compile("...");
        private static final Pattern EMAIL = Pattern.compile("^[\\w.+\\-]+@[\\w\\-]+\\.[a-zA-Z]{2,}$");

        public static void validate(String email) {
            if (email == null || email.isBlank()) {
                throw new EmptyEmailException("email is null or blank");
            }

            if (!EMAIL.matcher(email).matches()) {
                throw new InvalidEmailFormatException("invalid format: <" + email + ">");
            }
            // TODO: walidacja wg opisu; rzucaj własne wyjątki domenowe z jasnym komunikatem
        }
    }

    static void main(String[] args) {
        String newEmail = "";
        EmailValidator.validate(newEmail);
    }
}
