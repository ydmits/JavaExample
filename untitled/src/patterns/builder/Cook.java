package patterns.builder;

public class Cook {
    private DinnerBuilder builder;

    public Cook(DinnerBuilder builder) {
        super();
        this.builder = builder;
    }

    public Dinner doesDinner() {
        return builder
                .buildAppetizers()
                .buildMainDish()
                .buildSideDish()
                .buildDrinks()
                .buildDessert()
                .build();
    }
}
