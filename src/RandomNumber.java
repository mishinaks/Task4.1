import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            myArray[i] = random.nextInt(21) - 10;
        }
        int minPositive = 10;
        int maxNegative = -10;
        for (int i = 0; i < 20; i++) {
            if (myArray[i] >= 0){
                minPositive = Math.min(myArray[i], minPositive);
            }
            else {
                maxNegative = Math.max(myArray[i], maxNegative);
            }
        }
        for (int i = 0; i < 20; i++) {
            if (myArray[i] == minPositive){
                myArray[i] = maxNegative;
            }
            else if (myArray[i] == maxNegative){
                myArray[i] = minPositive;
            }
        }
    }
}
