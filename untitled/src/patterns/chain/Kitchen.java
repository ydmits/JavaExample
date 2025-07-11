package patterns.chain;

public class Kitchen {
    public static void main(String[] args) {
        Cooking breakfast = new Breakfast(Times.MORNING);
        Cooking lunch = new Lunch(Times.DAY);
        Cooking dinner = new Dinner(Times.EVENING);

        breakfast.setNextCooking(lunch);
        lunch.setNextCooking(dinner);

        breakfast.cookingManager("Омлет", Times.MORNING);
        breakfast.cookingManager("Кофе", Times.DAY);
        breakfast.cookingManager("Пицца", Times.EVENING);
    }
}
