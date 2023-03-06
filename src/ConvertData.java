import java.util.*;

public class ConvertData {
    //TODO create method to convert cm to mm
    public void centimeterToMillimeter(int input) {
        input *= 10;
        System.out.println(input);
    }

    //TODO create method the convert miles to yards
    public void milesToYards(int input) {
        input *= 1760;
        System.out.println(input);
    }

    public static void main(String[] args) {

        //TODO import utility Scanner and randomizers
        Scanner scan = new Scanner(System.in);
        Random value = new Random();

        //TODO create an exception for different errors
        System.out.println("enter a value: ");
        int x = scan.nextInt();
        int y = value.nextInt(10) + 15;

        //TODO create objects
        ConvertData firstSet = new ConvertData();
        ConvertData secondSet = new ConvertData();

        //TODO call methods and with user input and randomizer
        firstSet.centimeterToMillimeter(x);
        firstSet.milesToYards(y);

        //TODO add exception
        try{
            int[] array = {7, 2, 90};
            System.out.println(array[9]);
        } catch(Exception e) {
            System.out.println("something is wrong");
        }
    }
}
