package ru.itis.inf403.lab15;
//Вывести номер строки в файле, первые 5 строк содержащих
//1. Я, мне, моё
//2. море (моря, морем, морю, ...)
//3. муза
//4. любовь
//5. ветры ... веют
//6. друзья
//7. поэт
//8. взор ... (вс)тревожит
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainBigText {
    public static void main(String[] args) throws FileNotFoundException {
        Pattern[] patterns = {


            Pattern.compile("(^|\\s)(я|мне|моё)(\\s|$)", Pattern.CASE_INSENSITIVE),
            Pattern.compile("(^|\\s)мор(е|я|ем|ями|ю|ей)(\\s|$)", Pattern.CASE_INSENSITIVE),
            Pattern.compile("(^|\\s)муза(\\s|$)", Pattern.CASE_INSENSITIVE),
            Pattern.compile("(^|\\s)любовь(\\s|$)", Pattern.CASE_INSENSITIVE),
            Pattern.compile("(^|\\s)друзья(\\s|$)", Pattern.CASE_INSENSITIVE),
            Pattern.compile("(^|\\s)поэт(\\s|$)", Pattern.CASE_INSENSITIVE),

            Pattern.compile("ветры.*?веют", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
            Pattern.compile("взор.*?(вс)?тревожит", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),


        };



        //int[] counts = new int[patterns.length];

       // int count = 0;
//        while (scanner.hasNextLine()) {
//            count++;
//            String line = scanner.nextLine().toLowerCase(Locale.ROOT);
//            for (int i = 0; i < patterns.length; i++){
//                Matcher matcher = patterns[i].matcher(line);
//                if (matcher.find() && counts[i] < 5){
//                    counts[i]++;
//                    System.out.print(count + " ");
////                    ColoredPrint.print(line, matcher.start(), matcher.end());
//                    System.out.println(matcher.group());
//                }
//            }
//        }


        int countsLine = 0;
        for (int i = 0; i < patterns.length; i++){
            Scanner scanner = new Scanner(new File("D:/itis/javaProject/inf403/regexp/src/main/java/ru/itis/inf403/lab15/pushkin.txt"));
            int counts = 0;
            while (scanner.hasNextLine() && counts < 5){
                countsLine++;
                String line = scanner.nextLine().toLowerCase(Locale.ROOT);
                Matcher matcher = patterns[i].matcher(line);
                if (matcher.find()){
                    counts++;
                    System.out.print(countsLine + " ");
                    ColoredPrint.print(line, matcher.start(), matcher.end());
                   // System.out.println(line);
                }
            }
            System.out.println();
        }
    }
}

//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Locale;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class MainBigText {
//    public static void main(String[] args) throws IOException {
//        Pattern[] patterns = {
//            Pattern.compile("(?<!\\w)(я|мне|моё)(?!\\w)", Pattern.CASE_INSENSITIVE),
//            Pattern.compile("(?<!\\w)мор(е|я|ем|ями|ю|ей)(?!\\w)", Pattern.CASE_INSENSITIVE),
//            Pattern.compile("(?<!\\w)муза(?!\\w)", Pattern.CASE_INSENSITIVE),
//            Pattern.compile("(?<!\\w)любовь(?!\\w)", Pattern.CASE_INSENSITIVE),
//            Pattern.compile("(?<!\\w)друзья(?!\\w)", Pattern.CASE_INSENSITIVE),
//            Pattern.compile("(?<!\\w)поэт(?!\\w)", Pattern.CASE_INSENSITIVE),
//            Pattern.compile("ветры.*?веют", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
//            Pattern.compile("взор.*?(вс)?тревожит", Pattern.CASE_INSENSITIVE | Pattern.DOTALL)
//        };
//
//        String text = Files.readString(Paths.get("D:/itis/javaProject/inf403/regexp/src/main/java/ru/itis/inf403/lab15/pushkin.txt")).toLowerCase(Locale.ROOT);
//
//        for (Pattern pattern : patterns) {
//            Matcher matcher = pattern.matcher(text);
//            int count = 0;
//            while (matcher.find() && count < 5) {
//                count++;
//                System.out.println("Строка: " + (text.substring(0, matcher.start()).split("\n").length));
//                System.out.println("Найдено: " + matcher.group());
//            }
//            System.out.println();
//        }
//    }
//}
