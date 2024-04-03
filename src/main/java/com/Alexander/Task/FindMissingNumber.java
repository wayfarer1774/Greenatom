package com.Alexander.Task;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        //Ввод количества чисел в оригинальной последовательности и последовательности с "потерянным" числом.
        System.out.println("Введите количество чисел в массиве.");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Введите через пробел значения массива.");
        scanner = new Scanner(System.in);
        int[] sequence = new int[N-1];
        for (int i=0;i<sequence.length;i++){
            sequence[i]=scanner.nextInt();
        }

        //Применение операции побитового исключающего ИЛИ (XOR) для выявления "потерянного" числа.
        int totalXOR = 0;
        for (int i = 1; i <= N; i++) {
            totalXOR ^= i;
        }

        int sequenceXOR = 0;
        for (int num : sequence) {
            sequenceXOR ^= num;
        }

        int missingNumber = totalXOR ^ sequenceXOR;

        System.out.println("Утерянное число в последовательности: " + missingNumber);
    }
}