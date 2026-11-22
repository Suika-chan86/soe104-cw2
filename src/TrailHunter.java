import edu.soe104.oregon.api.*;

/**
 * Hunts every turn until the member logic is filled in.
 */
public class TrailHunter extends Hunter {

    public TrailHunter(String name) {
        super(name);
    }

    @Override
    public Action act(Situation situation) {
        return Action.of(Action.Type.HUNT);
    }
}
