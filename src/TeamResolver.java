import edu.soe104.oregon.api.*;

/**
 * Answers every trail event. The baseline plays it safe; each event kind gets
 * its own branch in the next milestone.
 */
public class TeamResolver implements Resolver {

    private final Plans plans;

    public TeamResolver(Plans plans) {
        this.plans = plans;
    }

    @Override
    public Resolution resolve(Event event) {
        return Resolution.of(Resolution.Choice.SAFE);
    }
}
