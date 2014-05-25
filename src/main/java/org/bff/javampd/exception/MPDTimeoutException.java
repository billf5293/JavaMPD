/*
 * MPDException.java
 *
 * Created on September 27, 2005, 1:56 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package org.bff.javampd.exception;

/**
 * Represents an error with the MPD connection.
 *
 * @author Bill
 * @version 1.0
 */
public class MPDTimeoutException extends MPDConnectionException {

	private static final long serialVersionUID = 1L;

	/**
     * Constructor.
     */
    public MPDTimeoutException() {
        super();
    }

    /**
     * Class constructor specifying the message.
     *
     * @param message the exception message
     */
    public MPDTimeoutException(String message) {
        super(message);
    }

    /**
     * Class constructor specifying the cause.
     *
     * @param cause the cause of this exception
     */
    public MPDTimeoutException(Throwable cause) {
        super(cause);
    }

    /**
     * Class constructor specifying the message and cause.
     *
     * @param message the exception message
     * @param cause   the cause of this exception
     */
    public MPDTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }
}
