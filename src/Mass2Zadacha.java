import java.util.Arrays;
import java.util.Scanner;

public class Mass2Zadacha {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateMass(createMass())));
    }

    public static int createMass(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number>0)
            return number;
        else System.out.println("Введено не положительное число");
        return number;
    }
    public static double[] calculateMass(int number) {
        double[] mass = new double[number];



        return mass;
    }
}
