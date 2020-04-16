public class GroceryList{
    public static void main (String[] args){
        String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"  };
        Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4, 5 };

        for (int i = 0; i < myGroceryList.length; i += 1){
            System.out.println(myGroceryList[i] + " that will cost you: $" + groceryItemPrices[i]);
        }
    }
}