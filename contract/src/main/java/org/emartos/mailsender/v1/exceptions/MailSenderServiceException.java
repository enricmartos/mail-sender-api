package org.emartos.mailsender.v1.exceptions;

public abstract class MailSenderServiceException extends Exception {

    public MailSenderServiceException(String message) {
        super(message);
    }

    public MailSenderServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
