import edu.soe104.oregon.api.*;

/**
 * Defends on threatened turns, moves otherwise. Will be tuned in the next milestone.
 */
public class TrailMechanic extends Mechanic {

    public TrailMechanic(String name) {
        super(name);
    }

    @Override
    public Action act(Situation situation) {
        if (situation.isThreatened()) {
            return Action.of(Action.Type.DEFEND);
        }
        return Action.of(Action.Type.MOVE);
    }
}
