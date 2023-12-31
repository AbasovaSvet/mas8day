import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateMass(createMass())));
    }

    public static int createMass(){
        System.out.println("Введите целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number>0)
        return number;
        else System.out.println("Введено не положительное число");
        return number;
    }
    public static int[] calculateMass(int number) {
        int[] mass = new int[number];
        for (int i : IntStream.range(0, mass.length).toArray()) { // сложный для понимания метод кода из инета
            mass[i] = (int) Math.pow(i + 1, 2);
        }
       /* for (int i = 0; i < mass.length; i++) { // простой метод кода
            mass[i] = (i+1) * (i+1);}*/
        return mass;
    }
}