public class AreaCalculator {
     public class AreaCalculator {

    public static double area (double radius){
        if(radius < 0){
            System.out.println("That's a negative, over");
            return -1.0;
        }

        System.out.println("Radius is " + radius);
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            System.out.println("That's a negative, over");
            return -1.0;
        }

        System.out.println("Parameter is " + x * y);
        return x * y;
    }

}