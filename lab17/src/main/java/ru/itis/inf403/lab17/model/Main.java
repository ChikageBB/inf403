package ru.itis.inf403.lab17.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        User[] users = new User[]{
                new User("ivanpupkin@1992_12.12","12208888", Role.ADMIN),
                new User("ivanpupkin@121_134.12", "10001111ada", Role.ADMIN),
                new User("SeregaPreshkin12314add", "12142141aa", Role.USER)
        };

        while (true){
            try{
                Scanner input = new Scanner(System.in);
                String login = input.nextLine();
                if (login.equals("exit")){System.exit(0);}
                String password = input.nextLine();
                if (password.equals("exit")){System.exit(0);}
                Role r = userCheck(login, password, users);
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
                //System.out.println("Password должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+");
                System.out.println(e.getMessage());
            }catch (WrongLoginException e){
                System.out.println(e.getMessage());
                //System.out.println("Login должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
            }
        }
    }


    public static Role userCheck(String login, String password, User[] users) throws WrongLoginException, WrongPasswordException{


        Pattern patternLogin = Pattern.compile("^(?=.{20,}$)[a-zA-Z0-9@._-]+$");
        Pattern patternPassword = Pattern.compile("^(?=.{8,}$)[a-zA-Z0-9{}\\[\\]();.,;&?!_+\\-]+$");

        Matcher matcherPassword = patternPassword.matcher(password);
        Matcher matcherLogin = patternLogin.matcher(login);

        if (!matcherLogin.find()){
            throw new WrongLoginException("Password должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+");
        }

        if (!matcherPassword.find()){
            throw  new WrongPasswordException("Login должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
        }

        for (int i = 0; i < users.length; i++){
            if (users[i].getPassword().equals(password) && users[i].getLogin().equals(login)){
                return users[i].getRole();
            }
        }
        return null;
    }
}
