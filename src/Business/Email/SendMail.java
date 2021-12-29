package Business.Email;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SendMail 
{

    public static void send(String to, String sub,String msg, final String user, final String pass) 
    {
//        Properties props = new Properties();
//
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");	
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        
//        Session session = Session.getDefaultInstance(props,new Authenticator() 
//        {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() 
//            {
//                return new PasswordAuthentication(user, pass);
//            }
//        });
//
//        try 
//        {
//            Message message = new MimeMessage(session);
//            
//            message.setFrom(new InternetAddress(user));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//            message.setSubject(sub);
//            message.setText(msg);
//
//            Transport.send(message);
//            
//            JOptionPane.showMessageDialog(null,"Your request has been successfully raised and repesctive personnel has been notified via email");
//            
//        } catch (MessagingException e) 
//        {
//            JOptionPane.showMessageDialog(null,"Something happened! Please recheck your email address and request again.");
//            
//            throw new RuntimeException(e);
//        }
//        
        
//        String to="dipanshu5532@gmail.com";//change accordingly
//String from="goarmyaed@gmail.com";//change accordingly
//String password="Goarmy@123";//change accordingly

//Get the session object
Properties props = new Properties();
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
"javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "465");

Session session = Session.getDefaultInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication("goarmyaed@gmail.com","Goarmy@123");
}
});

//compose message
try {
MimeMessage message = new MimeMessage(session);
message.setFrom(new InternetAddress("goarmyaed@gmail.com"));
message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
message.setSubject(sub);
message.setText(msg);

//send message
Transport.send(message);

            JOptionPane.showMessageDialog(null,"Your request has been successfully raised and repesctive personnel has been notified via email");

} catch (MessagingException e) {
            JOptionPane.showMessageDialog(null,"Your request has been successfully raised and repesctive personnel has been notified via email");
            
            throw new RuntimeException(e);
            }
}
}
    
