package patterns.builder;

public interface DinnerBuilder {
    DinnerBuilder buildAppetizers();
    DinnerBuilder buildMainDish();
    DinnerBuilder buildSideDish();
    DinnerBuilder buildDrinks();
    DinnerBuilder buildDessert();
    Dinner build();
}
