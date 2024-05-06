import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AverageCalculator {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Vedant\\OneDrive\\Desktop\\Internship\\data science code\\practical13\\temparature_data.csv";
        String line = "";
        String cvsSplitBy = ",";

        double sumTemperature = 0;
        double sumDewPoint = 0;
        double sumWindSpeed = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                double temperature = Double.parseDouble(data[2]);
                double dewPoint = Double.parseDouble(data[3]);
                double windSpeed = Double.parseDouble(data[4]);

                sumTemperature += temperature;
                sumDewPoint += dewPoint;
                sumWindSpeed += windSpeed;
                count++;
            }

            double averageTemperature = sumTemperature / count;
            double averageDewPoint = sumDewPoint / count;
            double averageWindSpeed = sumWindSpeed / count;

            System.out.println("Average Temperature: " + averageTemperature);
            System.out.println("Average Dew Point: " + averageDewPoint);
            System.out.println("Average Wind Speed: " + averageWindSpeed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
