package com.AlphaSense.utilities;

import java.util.Random;

public class EmailGenerator {

    public static String getEmail() {

        Random rand = new Random();
        String reg1 = "[a-zA-Z0-9_\\-\\.]";
        String reg2 = "[a-zA-Z]";
        String email = "";

        //1 - 5
        int length = rand.nextInt(6) + 1;

        while (email.length() < length) {

            //0 - 127
            char c = (char) rand.nextInt(128);

            if (Character.toString(c).matches(reg1)) {

                email += c;
            }
        }

        email += "@";

        length = rand.nextInt(6) + 1;
        length += email.length();

        while (email.length() < length) {

            char c = (char) rand.nextInt(128);

            if (Character.toString(c).matches(reg1)) {

                email += c;
            }
        }

        email += ".";

        //2 - 5
        length = rand.nextInt(4) + 2;
        length += email.length();


        while (email.length() < length) {

            //41 - 122
            char c = (char) (rand.nextInt(82) + 41);

            if (Character.toString(c).matches(reg2)) {

                email += c;
            }
        }

        return email;

    }

    public static void main(String[] args) {
        String reg = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";

        String email = getEmail();
        System.out.println(email);
        System.out.println("valid email: " + email.matches(reg));

    }
}
