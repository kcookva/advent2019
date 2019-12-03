import java.util.*;
import java.io.*;
import java.lang.Math;

public class AdventDay1 {

    public static int fuelCalc(int mass) {
        return Math.floorDiv(mass, 3) - 2;
    }

    public static int recursiveFuelCalc(int mass) {
        int fuel = fuelCalc(mass);
        if(fuel <= 0) {
            return 0;
        }
        else {
            return fuel + recursiveFuelCalc(fuel);
        }
    }

    public static void readFile(List list) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the file to read : ");
        String file = in.nextLine();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                Integer i = new Integer(line);
                list.add(i);
            }
        }
        catch(IOException e) {
            System.out.println("err" + e);
        }
    }

    public static void main(String[] args) throws IOException {
        //String file = "input.txt";
        int totalFuel = 0;
        int fuel = 0;
        ArrayList<Integer> list = new ArrayList<>();
        readFile(list);
        /*
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        */
        for(int mass = 0; mass < list.size(); mass++) {
            totalFuel = totalFuel + recursiveFuelCalc(list.get(mass));
        }
        System.out.println(totalFuel);
    }
}
