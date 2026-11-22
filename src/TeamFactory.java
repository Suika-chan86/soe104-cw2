import edu.soe104.oregon.api.*;
import java.util.List;

/**
 * The single entry point of our party.
 *
 * It only wires things together: it owns the shared Plans object and hands it
 * to the strategy and the resolver. No decision logic lives here.
 */
public class TeamFactory implements PartyFactory {

    private final Plans plans = new Plans();

    @Override
    public List<Member> createMembers() {
        return List.of(
                new TrailHunter("Wren"),
                new TrailDoctor("Anna"),
                new TrailMechanic("Cole"),
                new TrailScout("Mira"));
    }

    @Override
    public List<Purchase> buySupplies() {
        return List.of(
                new Purchase(ResourceType.OXEN, 4),
                new Purchase(ResourceType.FOOD, 500),
                new Purchase(ResourceType.AMMO, 100),
                new Purchase(ResourceType.SPARE_PARTS, 2));
    }

    @Override
    public PartyStrategy strategy() {
        return new TeamStrategy(plans);
    }

    @Override
    public Resolver resolver() {
        return new TeamResolver(plans);
    }
}
