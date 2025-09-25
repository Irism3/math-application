package pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1.
        //1.creating a salary
        double bobSalary = 60.000;
        double garySalary = 90.000;

         // 2 the highest salary
        double highestSalary =Math.max(bobSalary, garySalary);
        System.out.println("the highest salary is $" + highestSalary);

        //question 2.
        double carPrice = 70.000;
        double truckPrice= 40.000;
        System.out.println("the smallest price is $ "+ Math.min(carPrice, truckPrice));

        //question 3


    }
}
