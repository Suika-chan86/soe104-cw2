import edu.soe104.oregon.api.*;

/**
 * Sets the pace and the rations for the turn, and writes the party's state
 * into the shared Plans object so the resolver can read it.
 */
public class TeamStrategy implements PartyStrategy {

    private final Plans plans;

    public TeamStrategy(Plans plans) {
        this.plans = plans;
    }

    @Override
    public Directive decide(PartyState state) {
        Inventory inventory = state.getResources();
        int food = inventory.amountOf(ResourceType.FOOD);
        int oxen = inventory.amountOf(ResourceType.OXEN);
        int alive = state.aliveMembers();

        plans.setTurn(state.getTurn());
        plans.setFood(food);
        plans.setAmmo(inventory.amountOf(ResourceType.AMMO));
        plans.setOxen(oxen);
        plans.setParts(inventory.amountOf(ResourceType.SPARE_PARTS));
        plans.setMoney(inventory.amountOf(ResourceType.MONEY));
        plans.setAlive(alive);

        int foodPerTurn = 3 * alive + 2 * oxen;
        int runway = foodPerTurn == 0 ? 99 : food / foodPerTurn;
        plans.setFoodRunway(runway);
        plans.setFoodScarce(runway < 3);

        Directive.Ration ration;
        if (runway < 3) {
            ration = Directive.Ration.BARE;
        } else {
            ration = Directive.Ration.MEAGER;
        }

        return new Directive(Directive.Pace.NORMAL, ration);
    }
}
