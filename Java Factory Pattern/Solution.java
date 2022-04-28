import java.util.*;
import java.security.*;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(input);
        System.out.println(food.getType());

        scanner.close();
    }
}

interface Food {
    public String getType();
}

class Pizza implements Food {
        public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
	public Food getFood(String order) {
        if (order.equals("cake")){
            Cake cake = new Cake();
            System.out.println("The factory returned class Cake");
            return cake;
        }

        else if (order.equals("pizza")){
            Pizza pizza = new Pizza();
            System.out.println("The factory returned class Pizza");
            return pizza;
        }

        return new Pizza();
    }//End of getFood method
}
