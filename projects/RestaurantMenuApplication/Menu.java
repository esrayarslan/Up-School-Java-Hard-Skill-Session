package RestaurantMenuApplication;

import java.util.Arrays;

public class Menu {
	
	private Meal[] meals = new Meal[10];
	private int mealCount = 0;
	
	public void addMeal(Meal meal) {
		
		meals[mealCount] = meal;
		mealCount++;
		
 	}
	
	public void removeMeal(Meal meal) {
		
		int index = -1;
		for(int i = 0; i < mealCount; i++) {
			index = i;
			break;
		}
	
 
	if(index != -1) {
		for(int i = index; i < mealCount; i++) {
			meals[i] = meals[i + 1];
		}
		meals[mealCount -1] = null;
		mealCount--;
	} else
		System.out.print("Food could not be found");
}
	public void printAllMeals() {
		System.out.println("-- MENU --");
		
		for(int i = 0; i < mealCount; i++) {
			Meal meal = meals[i];
			
			System.out.println("Food Name : " + meal.getName());
            System.out.println("Amount : " + meal.getPrice());
            System.out.println("Materials : " + Arrays.toString(meal.getIngredients()));
            System.out.println("Calories : " + meal.getCalories());
            System.out.println("Vegan : " + (meal.isVegan() ? "YES" : "NO"));
            System.out.println("Does it contain gluten : " + (meal.isGlutenFree() ? "YES" : "NO"));
            System.out.println("----------------------------");
        }
        System.out.println("Total Price :" + totalPrice());
        System.out.println("Total Calories:" + totalCalories());
    }
	
	private double totalPrice() {
        double toplam = 0;
        for (int i = 0 ; i<mealCount ; i++){
            toplam += meals[i].getPrice();
        }
        return toplam;
    }
    private double totalCalories() {
        double toplam = 0;
        for (int i = 0 ; i<mealCount ; i++){
            toplam += meals[i].getCalories();
        }
        return toplam;
    }
}
		
	
