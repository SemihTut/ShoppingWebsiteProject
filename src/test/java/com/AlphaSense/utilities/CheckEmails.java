package com.AlphaSense.utilities;

import java.time.Duration;
import java.time.Instant;

public class CheckEmails {

    public static void checkingEmail(String email){

        if(EmailReader.get(email) != null){
            ConfigurationReader.get(email);
        }else{
            EmailReader.setProperties(email,"");
        }

    }
}
