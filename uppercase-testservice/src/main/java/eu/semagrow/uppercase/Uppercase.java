package eu.semagrow.uppercase;

import org.springframework.stereotype.Component;

@Component
public class Uppercase {

    public String toUppercase(String lowercase) {
        return lowercase.toUpperCase();
    }

}