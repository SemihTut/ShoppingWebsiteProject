package com.AlphaSense.utilities;

import java.time.Duration;
import java.time.Instant;

public class CheckEmails {

    public static void checkingEmail(String email){

        if(EmailReader.get(email) != null){
            ConfigurationReader.get(email);
            System.out.println("I used library");
        }else{
            EmailReader.setProperties(email,"");
        }

    }
}
