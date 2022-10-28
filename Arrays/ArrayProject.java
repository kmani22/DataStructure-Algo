import java.util.Scanner;

public class ArrayProject {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        System.out.println("How many days temperature : ");
        int totalDays = console.nextInt();

        int tempArray[] = new int[totalDays];

        for (int i = 0; i < tempArray.length; i++) {
            
            System.out.println("Enter the temperature for day " + i+1 + " : ");
            int currentTemp = console.nextInt();
            tempArray[i] = currentTemp;
        }

        float averageTemperature = calculateAverage(tempArray);
        int totalDaysOfAverageTemp = daysAboveAverageTemp(tempArray, averageTemperature);

        System.out.println("Calculated Average Temperature : " + averageTemperature);
        System.out.println("Total days of Average Temperature " + totalDaysOfAverageTemp);
    }

    public static float calculateAverage(int tempArray[]) {
        
        int total = 0;
        for(int i = 0; i < tempArray.length; i++){
            total = total + tempArray[i];
        }

        return (total/tempArray.length);
    }

    public static int daysAboveAverageTemp(int tempArray[], float tempAverage) {

        int totalCount = 0;
        for(int i = 0; i < tempArray.length; i++){
            if (tempArray[i] > tempAverage){
                totalCount++;
            }
        }
        
        return totalCount;
    }
}
