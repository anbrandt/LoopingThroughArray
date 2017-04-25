package com.andrzej;

public class Main {
	static int[] array1 = new int[100];
	static double sum = 0;

	public static void main(String[] args) {
		// tablica od 0 do 99
		// stwórz metodę, która weźmie tę tablicę i zwróci średnią arytmetyczną z tablicy

//        int[] array1 = new int[100];
//        double sum = 0;

//        for (int i = 0; i < array1.length ; i++) {
//            array1[i] = i;
//            sum = array1[i] + sum;
//            double z = sum/array1.length;
//            if(i == 99) {
//                System.out.println(z);
//            }

//        System.out.println(sum);
		System.out.println("Średnia wszystkich wartości w tablicy wynosi " + returnAverage());
	}

	public static double returnAverage() {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
			sum = array1[i] + sum;
		}
		System.out.println("Suma wszystkich elementów w tablicy wynosi " + sum);
		double averageNumber = sum / array1.length;
		return averageNumber;

	}
}
