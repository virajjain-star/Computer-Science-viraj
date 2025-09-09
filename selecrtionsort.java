import java.util.Scanner;

public class selecrtionsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int min, minIndex;
        for (int i = 0; i < 4; i++) {
            System.out.println("enter numbers for array");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            minIndex = i;
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[j]<min){
                    min = numbers[j];
                    minIndex = j;
                }
            }
            numbers[minIndex] = numbers[i];
            numbers[i] = min;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
        }
    }






}
