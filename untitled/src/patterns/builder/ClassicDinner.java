package patterns.builder;

public class ClassicDinner implements DinnerBuilder{
    private String appetizers;
    private String mainDish;
    private String sideDish;
    private String drinks;
    private String dessert;

    public ClassicDinner() {
        super();
    }

    @Override
    public DinnerBuilder buildAppetizers() {
        this.appetizers = "Рисовая каша";
        return this;
    }

    @Override
    public DinnerBuilder buildMainDish() {
        this.mainDish = "Куриный бульон";
        return this;
    }

    @Override
    public DinnerBuilder buildSideDish() {
        return this;
    }

    @Override
    public DinnerBuilder buildDrinks() {
        return this;
    }

    @Override
    public DinnerBuilder buildDessert() {
        this.dessert = "Виноград";
        return this;
    }

    @Override
    public Dinner build() {
        return new Dinner(appetizers, mainDish, sideDish, drinks, dessert);
    }
}
