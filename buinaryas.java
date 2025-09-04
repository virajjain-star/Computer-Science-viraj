import java.util.Scanner;

public class buinaryas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[] = {1,2,3,4,5,6,9,11,51};
        System.out.println("Enter number to find:");
        int key = input.nextInt();
        int lower = 0;
        int mid = 0;
        boolean found = false;
        int upper = numbers.length - 1;

        while (lower <= upper && !found){
            mid = (lower + upper) / 2;
            if(numbers[mid] == key){
                found = true;
            } else if(numbers[mid] < key){
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        if (found){
            System.out.println("Value was found: " + mid);
        } else {
            System.out.println("Value was not found");
        }
    }
}
