import java.util.Scanner;

public class SmallestLargestSum {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int size = sc.nextInt();
int[] numbers = new int[size];
System.out.println("Enter the elements:");
for (int i = 0; i < size; i++) {
numbers[i] = sc.nextInt();
}
int smallest = numbers[0];
int largest = numbers[0];
int sum = 0;
for (int number : numbers) {
if (number < smallest) {
smallest = number;
}
if (number > largest) {
largest = number;
}
sum += number;
}
System.out.println("Smallest: " + smallest);
System.out.println("Largest: " + largest);
System.out.println("Sum: " + sum);
System.out.println("Smallest and largest separated by the sum: " + smallest + " " + largest + " " + sum);
    }
}