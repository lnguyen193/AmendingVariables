/*
Assignment:
Robert is working on his 5-year goal :
To increase his current $62,000 annual income by 10% each year.
Create an application that will calculate his annual income on the fifth year.
Follow the example from above.
 */

public class AmendingVariables {
    public static void main(String[] args) {
        double current = 62000.00;
        double percent = 0.1;
        String year = "";
        for (int i = 1; i <= 5; i++) {
            if(i == 1){
              year = "first";
            } else if (i == 2){
              year = "second";
            } else if (i == 3){
              year = "third";
            } else if (i == 4){
              year = "fourth";
            } else if (i == 5){
              year = "fifth";
            }
            System.out.println("Current value is: $" + current);
            current = current + (current * percent);
            System.out.println("After calculation, " + year + " year income is: $" + current +"\n");
        }

        System.out.println("After calculation, annual income on fifth year is: $" + current);
    }

}