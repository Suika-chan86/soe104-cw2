import edu.soe104.oregon.api.*;

/**
 * Scouts every turn: six free miles, no health cost.
 */
public class TrailScout extends Scout {

    public TrailScout(String name) {
        super(name);
    }

    @Override
    public Action act(Situation situation) {
        return Action.of(Action.Type.SCOUT);
    }
}
