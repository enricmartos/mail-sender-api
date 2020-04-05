package org.emartos.mailsender.v1;

import org.emartos.mailsender.v1.exceptions.BadRequestException;
import org.emartos.mailsender.v1.exceptions.MailNotSendException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(MailSenderServiceApi.MAIL_SENDER_API_PATH + MailSenderServiceApi.VERSION)
public interface MailSenderService {

    @PostMapping("/email")
    void sendEmail(@RequestHeader("apiKey") String apiKey, @RequestParam("from") String from,
                   @RequestParam("to")List<String> to, @RequestParam("body") String body)
            throws BadRequestException, MailNotSendException;

}
