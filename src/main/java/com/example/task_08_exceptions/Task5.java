package com.example.task_08_exceptions;
import java.util.regex.Pattern;
public class Task5 {


// TODO: zdefiniuj własne wyjątki domenowe (nazwy wymyśl sam/a)
// np. bazowy wyjątek walidacji + osobne podtypy dla różnych przyczyn błędu

    public final class EmailValidator {
        private EmailValidator() {

        }

        // TODO: zdefiniuj wzorzec, np.:
        // private static final Pattern EMAIL = Pattern.compile("...");

        public static void validate(String email) {
            // TODO: walidacja wg opisu; rzucaj własne wyjątki domenowe z jasnym komunikatem
        }
    }
}
