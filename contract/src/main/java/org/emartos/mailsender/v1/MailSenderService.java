package org.emartos.mailsender.v1;

import org.emartos.mailsender.v1.exceptions.BadRequestException;
import org.emartos.mailsender.v1.exceptions.MailNotSendException;
import org.emartos.mailsender.v1.model.EmailContent;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(MailSenderServiceApi.MAIL_SENDER_API_PATH + MailSenderServiceApi.VERSION)
public interface MailSenderService {

    @PostMapping("/email")
    void sendEmail(@RequestHeader("apiKey") String apiKey, EmailContent emailContent) throws BadRequestException, MailNotSendException;

}
