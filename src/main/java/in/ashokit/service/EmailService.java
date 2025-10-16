package in.ashokit.service;

import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {//used to send Email

    @Autowired
    private JavaMailSender mailSender;

    public boolean sendEmail(String subject, String body,String to){//logic for sending the Email
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        try{
            helper.setSubject(subject);
            helper.setText(body, true);
            helper.setTo(to);
            mailSender.send(mimeMessage);//sending email
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
