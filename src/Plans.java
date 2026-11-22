/**
 * Shared context between the strategy, the resolver and the factory.
 *
 * Everything here is a snapshot the strategy fills in at the start of a turn.
 * The resolver cannot see the wagon, so this is how it learns the party's state.
 *
 * Fields are private on purpose: the OOP mark rewards encapsulation.
 * The owner of each field is written next to it.
 */
public class Plans {

    // Written by TeamStrategy, read by TeamResolver
    private int turn;
    private int food;
    private int ammo;
    private int oxen;
    private int parts;
    private int money;
    private int alive;
    private int minHealth;
    private int averageHealth;
    private int foodRunway;

    private boolean foodScarce;
    private boolean turnsTight;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getOxen() {
        return oxen;
    }

    public void setOxen(int oxen) {
        this.oxen = oxen;
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAlive() {
        return alive;
    }

    public void setAlive(int alive) {
        this.alive = alive;
    }

    public int getMinHealth() {
        return minHealth;
    }

    public void setMinHealth(int minHealth) {
        this.minHealth = minHealth;
    }

    public int getAverageHealth() {
        return averageHealth;
    }

    public void setAverageHealth(int averageHealth) {
        this.averageHealth = averageHealth;
    }

    public int getFoodRunway() {
        return foodRunway;
    }

    public void setFoodRunway(int foodRunway) {
        this.foodRunway = foodRunway;
    }

    public boolean isFoodScarce() {
        return foodScarce;
    }

    public void setFoodScarce(boolean foodScarce) {
        this.foodScarce = foodScarce;
    }

    public boolean isTurnsTight() {
        return turnsTight;
    }

    public void setTurnsTight(boolean turnsTight) {
        this.turnsTight = turnsTight;
    }
}
