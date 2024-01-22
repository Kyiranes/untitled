// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        String city = "Columbus";
        Integer zipCode = 43123;
        int avgHighTemp[] = {74,36,20,95,91};
        int sum = 0;
        int length = avgHighTemp.length;
        for (int i = 0; i < length; i++) {
            sum += avgHighTemp[i];
        }
        double average = sum / length;
        System.out.println("City: " + city + " Zip Code: " + zipCode + " Average Temp: " + average);
    }
}