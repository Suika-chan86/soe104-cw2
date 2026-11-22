import edu.soe104.oregon.api.*;

/**
 * Heals every turn until the member logic is filled in.
 */
public class TrailDoctor extends Doctor {

    public TrailDoctor(String name) {
        super(name);
    }

    @Override
    public Action act(Situation situation) {
        return Action.of(Action.Type.HEAL);
    }
}
