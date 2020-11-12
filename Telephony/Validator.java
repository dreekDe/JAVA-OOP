package telephony;

import java.util.regex.Pattern;

public class Validator {

    public static String checkNumbers(String s) {
        if (Pattern.compile("[^0-9]+").matcher(s).find()|| s.trim().isEmpty()) {
            return "Invalid number!";
        }
        return "Calling... " + s;
    }


    public static String checkUrls(String s) {
        if (Pattern.compile("[0-9]+").matcher(s).find() || s.trim().isEmpty()) {
            return "Invalid URL!";
        }
        return "Browsing: " + s + "!";

    }
}

