
public class ForEachLoop{
    public static void main (String[] args){

        String[] myNames = {"Daniel", "Dhosio", "Mwangi", "Githiomi"};
        Integer[] myNumbers = {1,2,3,4,5};

        for ( String eachName : myNames ){
            System.out.println(eachName + " is so awesome!");
        }

        for (Integer eachNumber : myNumbers){
            System.out.println(eachNumber * 5);
        }
    }
}