package ru.itis.inf403.lab15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {

        String work_str = "Hello Java! Hello JavaScript! JavaSE 8.";

        Pattern pattern = Pattern.compile("(J|j).+?a");

        Matcher matcher = pattern.matcher(work_str);

        // Наличие фразы по шаблону
        while (matcher.find()) {
            ColoredPrint.print(work_str, matcher.start(), matcher.end());
        }
    }
}