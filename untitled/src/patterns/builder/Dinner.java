package patterns.builder;

public class Dinner {
    private String appetizers;
    private String mainDish;
    private String sideDish;
    private String drinks;
    private String dessert;

    public Dinner(String appetizers, String mainDish, String sideDish, String drinks, String dessert) {
        this.appetizers = appetizers;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drinks = drinks;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder("На обед у нас:\n");
        builder.append(appetizers == null ? "Из закусок ничего\n" : "Первое блюдо - " + appetizers + "\n");
        builder.append(mainDish == null ? "Без основного блюда\n" : "Второе блюдо - " + mainDish + "\n");
        builder.append(sideDish == null ? "Без гарнира\n" : "Гарнир - " + sideDish + "\n");
        builder.append(drinks == null ? "Без напитка\n" : "Напиток - " + drinks + "\n");
        builder.append(dessert == null ? "Без десерта\n" : "На десерт - " + dessert + "\n");
        return builder.toString();
    }
}
