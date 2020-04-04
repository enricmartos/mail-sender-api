package org.emartos.mailsender.v1.exceptions;

public class MailNotSendException extends MailSenderServiceException {

    public MailNotSendException(String message) {
        super(message);
    }

    public MailNotSendException(String message, Throwable t) {
        super(message, t);
    }
}
