public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int numberInt1 = (int)(number1*1000);
        int numberInt2 = (int)(number2*1000);
        if(numberInt1-numberInt2==0){
            return true;
        }
        else
            return false;
    }
 public static void main(String args[]){
     DecimalComparator.areEqualByThreeDecimalPlaces(3.1754, 3.1756);
 }
}