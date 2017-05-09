package com.haripriya.practice;
import java.util.Arrays;
import java.util.Scanner;

public class Calculate {
			private static Scanner nums;

			public static int Mean(int array[]) {

				int sum = 0;

				int avg = 0;

				int length = array.length;

				for (int j = 0; j < length; j++) {

					sum += array[j];

					avg = sum / length;

				}

				return avg;

			}
			public static int Median(int array[]) {

				int length = array.length;

				int[] sort = new int[length];

				System.arraycopy(array, 0, sort, 0, sort.length);

				Arrays.sort(sort);

				if (length % 2 == 0) {

					return (sort[(sort.length / 2) - 1] + sort[sort.length / 2]) / 2;

				} else {

					return sort[sort.length / 2];

				}

			}
			public static int Mode(int array[]) {

				int max = 0, maxCount = 0;

				int length = array.length;

				for (int i = 0; i < length; ++i) {

					int count = 0;

					for (int j = 0; j < length; ++j) {

						if (array[j] == array[i])
							++count;

					}

					if (count > maxCount)

					{

						maxCount = count;

						max = array[i];

					}

				}

				return max;

			}

			public static void main(String[] args)

			{

				nums = new Scanner(System.in);
				int[] num = new int[5];

				for (int i = 0; i < num.length; i++) {

					System.out.println("Enter a number: ");

					num[i] = nums.nextInt();

				}

				int mean = Calculate.Mean(num);

				System.out.println("Mean= " + mean);

				int median = Calculate.Median(num);

				System.out.println("Median= " + median);

				int mode = Calculate.Mode(num);

				System.out.println("Mode= " + mode);
}
}
