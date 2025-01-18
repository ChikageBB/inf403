package ru.itis.inf403.lab17.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        User[] users = new User[]{
                new User("IvanPupkin", "IvanPupkin1000", Role.ADMIN),
                new User("SeregaPreshkin", "12142141", Role.USER)
        };

        while (true){
            try{
                Scanner input = new Scanner(System.in);
                String login = input.nextLine();
                String password = input.nextLine();
                Role r = userCheck(login, password, users);
                if (login.equals("exit") || password.equals("exit")){
                    System.exit(0);
                }
                if (r== null) {
                    throw new RuntimeException("Неправильный пароль");
                }
                if (r == Role.ADMIN) {
                    System.out.println("ADMIN: \n" +
                            "1. File \n" +
                            "2. Create new user \n" +
                            "3. exit");
                    break;
                } else if (r == Role.USER) {
                    System.out.println("ADMIN: \n" +
                            "1. File \n" +
                            "2. Get play list \n" +
                            "3. exit");
                    break;
                }
            }catch (WrongPasswordException e){
                System.out.println("Неправильный пароль");
            }catch (WrongLoginException e){
                System.out.println("Неправильный логин");
            }
        }
    }


    public static Role userCheck(String login, String password, User[] users) throws WrongLoginException, WrongPasswordException{


        Pattern patternLogin = Pattern.compile("^(?=.{20,}$)[a-zA-Z0-9@._-]+$");
        Pattern patternPassword = Pattern.compile("^(?=.{8,}$)[a-zA-Z0-9{}\\[\\]();.,;&?!_+\\-]+$");

        Matcher matcherPassword = patternPassword.matcher(password);
        Matcher matcherLogin = patternLogin.matcher(login);

        if (!matcherLogin.find()){
            throw new WrongLoginException();
        }

        if (!matcherPassword.find()){
            throw  new WrongPasswordException();
        }

        for (int i = 0; i < users.length; i++){
            if (users[i].getPassword().equals(password) && users[i].getLogin().equals(login)){
                return users[i].getRole();
            }
        }
        return null;
    }
}
