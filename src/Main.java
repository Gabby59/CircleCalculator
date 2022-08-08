public class Main {
    public static void main(String[] args) {
        //initialize circle radius
        double circleRadius = 12.0;
        //declare the 3 doubles
        double circleDiameter,circleCircumference,circleArea;

        //insert pi as double to calculate the circumference and area
        double pi = 3.14;
        //initialize the 3 doubles
        circleDiameter = 2* circleRadius;
        circleCircumference = 2 * circleRadius * pi;
        circleArea = pi * circleRadius * circleRadius ;

        //print out the values
        System.out.println("The circle's diameter is " +circleDiameter+", its circumference " + circleCircumference + ", and its area "+ circleArea +".");

    }
}
