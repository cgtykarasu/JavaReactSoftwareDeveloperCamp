package day03inheritanceHw;

import java.util.Scanner;

public class UserManager {

    Scanner scn = new Scanner(System.in);

    public void add(User user) {

        System.out.println(user.getfName() + " " + user.getlName() + "\nkaydınız başarıyla yapılmıştır.\nKayıt No : " + user.getId());
    }

    public void add(User[] users) {

        for (User user : users) {
            add(user);
        }
        System.out.println(users.length + " adet kullanıcı başarıyla eklendi.");
    }

    public void update(User user) {

        System.out.println(user.getfName() + " " + user.getlName() + " kaydınız başarıyla güncellendi.");
    }

    public void delete(User user) {

        System.out.println(user.getfName() + " " + user.getlName() + " kaydınız başarıyla silindi.");
    }

    public void listUsers(User[] users) {

        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getfName() + " " + user.getlName());
        }
    }

    public void changeEmail (User user) {

        System.out.println("Yeni email adresinizi giriniz : ");
        String newEmail = scn.nextLine();
        user.setEmail(newEmail);
        System.out.println("Email adresiniz " + user.getEmail() + " ile başarıyla değiştirilmiştir.");
    }

    public void changePassword (User user) {

        System.out.println("Yeni şifrenizi giriniz : ");
        String newPassword = scn.nextLine();
        user.setPassword(newPassword);
        System.out.println("Şifreniz başarıyla değiştirilmiştir.");
    }

    public void changeUsername (User user) {

        System.out.println("Yeni kullanıcı adınızı giriniz : ");
        String newUsername = scn.nextLine();
        user.setUsername(newUsername);
        System.out.println("Kullanıcı adınız " + user.getUsername() + " ile başarıyla değiştirilmiştir.");
    }
}
