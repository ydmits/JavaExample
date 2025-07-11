package patterns.chain;

public abstract class Cooking {
    private Times priority;
    private Cooking nextCooking;

    public Cooking(Times priority) {
        this.priority = priority;
    }

    public void setNextCooking(Cooking nextCooking) {
        this.nextCooking = nextCooking;
    }

    public void cookingManager(String message, Times priority) {
        if (this.priority.ordinal() == priority.ordinal()) {
            write(message);
        }

        if (nextCooking != null) {
            nextCooking.cookingManager(message, priority);
        }
    }

    public abstract void write(String message);
}
