package org.bff.javampd.processor;

import org.bff.javampd.song.MPDSong;

public class PositionTagProcessor
  extends TagResponseProcessor
  implements SongTagResponseProcessor {

  public PositionTagProcessor() {
    super("Pos:");
  }

  @Override
  public void processTag(MPDSong song, String line) {
    if (startsWith(line)) {
      song.setPosition(
        Integer.parseInt(line.substring(getPrefix().length()).trim())
      );
    }
  }
}
