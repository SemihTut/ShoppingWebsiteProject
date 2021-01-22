package com.AlphaSense.utilities;


public class PasswordGenerator {

    public static String getRandomPassword(int count) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < count; i++) {
            switch (getRandomInteger(0, 4)) {
                case 0:
                    password.append((char) getRandomInteger(65, 90));
                    break;
                case 1:
                    password.append((char) getRandomInteger(97, 122));
                    break;
                default:
                    password.append(getRandomInteger(0, 9));
                    break;
            }
        }
        return password.toString();
    }

    public static int getRandomInteger(int minimum, int maximum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }
}
