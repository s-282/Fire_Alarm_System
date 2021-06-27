/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author maitr
 */
public class Mail {
//    try {
//    Email email = new Email("maitryjadiya123@gmail.com", "123@Kshay123");
//    email.setForm("maitryjadiya123@gmail.com", "Fire-Alarm-grp-8");
//    email.setSubject("Fire Alarm Alert");
//    email.setContent("<h1> WARNING!!! <br> CHECK THE BUILDING..</h1>", "text/html");
//    email.addRecipent("iit2019100@iiita.ac.in");
//    email.send();
//    } catch (Exception e) {
//    e.printStackTrace();
//    }
    public static void sendEmail(String recepient) throws Exception {
        System.out.println("Preparing to send mail");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccount = "firealarmsystem894@gmail.com";
        String password = "firealarm";
        
        Session session = Session.getInstance(properties, new Authenticator () {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount, password);
            }
        });
        
        Message message = prepareMessage(session, myAccount, recepient);
        
        Transport.send(message);
        System.out.println("Message Sent...");
    }
    
    private static Message prepareMessage(Session session, String myAccount, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Fire Alarm Alert");
            message.setContent("<h1> WARNING!!! <br> CHECK THE BUILDING..</h1>", "text/html");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
