import java.util.*;
import java.io.*;
import java.lang.Math;

public class AdventDay1 {

    public static int fuelCalc(int mass) {
        return Math.floorDiv(mass, 3) - 2;
    }

    public static int recursiveFuelCalc(int mass) {
        int totalFuel = 0;
        int fuel = fuelCalc(mass);
        while(fuel > 0) {
            totalFuel += fuel;
            fuel = fuelCalc(mass);
        }
        return totalFuel;
    }

    public static void main(String[] args) throws IOException {
        int totalFuel = 0;
        try {
            String file = "input.txt";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String strLine;
            while((strLine = reader.readLine()) != null) {
                int mass = Integer.parseInt(strLine);
                totalFuel += recursiveFuelCalc(mass);

            }
            System.out.println(totalFuel);
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
