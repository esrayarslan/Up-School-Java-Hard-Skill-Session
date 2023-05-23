package HardSkillSession13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random rand = new Random();
    int[] nums = new int[5];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = rand.nextInt(10) + 1;
    }
    System.out.println("Dizideki sayılar: " + Arrays.toString(nums));
    Scanner scanner = new Scanner(System.in);

    while (!isSorted(nums)) {
      System.out.println("Hangi iki index'in yerini değiştirmek istersiniz:");
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      swap(nums, i, j);
      System.out.println(Arrays.toString(nums));
    }

    System.out.println("Tebrikler diziyi sıraladınız.");
    System.out.println("Sıralı dizi: " + Arrays.toString(nums));
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static boolean isSorted(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSortedV2(int[] nums) {

    var newArray = Arrays.copyOf(nums, nums.length);
    Arrays.sort(newArray);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != newArray[i]) {
        return false;
      }
    }
    return true;
  }
}