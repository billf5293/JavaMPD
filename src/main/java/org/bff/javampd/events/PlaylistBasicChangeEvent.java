/*
 * PlaylistChangeEvent.java
 *
 * Created on October 10, 2005, 8:25 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package org.bff.javampd.events;

import java.util.EventObject;

/**
 * Represents a change in the status of a MPD music playlist.
 *
 * @author Bill
 */
public class PlaylistBasicChangeEvent extends EventObject {
	private static final long serialVersionUID = 1L;
	private Event event;
    private String msg;

    public enum Event {
        SONG_ADDED,
        SONG_DELETED,
        SONG_CHANGED,
        PLAYLIST_CHANGED,
        PLAYLIST_ENDED
    }

    /**
     * Creates a new instance of PlayListBasicChangeEvent
     *
     * @param source the object on which the Event initially occurred
     * @param event  the specific {@link org.bff.javampd.events.PlaylistBasicChangeEvent.Event} that occurred
     */
    public PlaylistBasicChangeEvent(Object source, Event event) {
        super(source);
        this.event = event;
    }

    /**
     * Creates a new instance of PlayListBasicChangeEvent
     *
     * @param source the object on which the Event initially occurred
     * @param event  the specific event that occurred
     * @param msg    an optional message
     */
    public PlaylistBasicChangeEvent(Object source, Event event, String msg) {
        super(source);
        this.event = event;
        this.msg = msg;
    }

    /**
     * Returns the {@link org.bff.javampd.events.PlaylistBasicChangeEvent.Event} that occurred.
     *
     * @return the specific {@link org.bff.javampd.events.PlaylistBasicChangeEvent.Event}
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Returns the message attached to this event.  If there is no message null
     * is returned.
     *
     * @return the optional message
     */
    public String getMsg() {
        return msg;
    }
}
