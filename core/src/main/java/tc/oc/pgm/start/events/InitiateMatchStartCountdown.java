package tc.oc.pgm.start.events;

import org.bukkit.event.HandlerList;
import org.joda.time.Duration;
import tc.oc.pgm.api.match.Match;
import tc.oc.pgm.api.match.event.MatchEvent;

public class InitiateMatchStartCountdown extends MatchEvent {

  private final Duration duration;

  public InitiateMatchStartCountdown(Match match, Duration duration) {
    super(match);
    this.duration = duration;
  }

  public Duration duration() {
    return duration;
  }

  private static final HandlerList handlers = new HandlerList();

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }
}