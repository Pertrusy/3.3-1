import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    char[] arr = {'a', 'b', 'C', 'd', 'e', 'f', 'G', 'h', 'p'};
    System.out.println(Arrays.toString(arr));
    int count = countUpperChanges(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("Liczba dokonanych zmian: " + count);
  }

  public static int countUpperChanges(char[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 'a' && arr[i] <= 'z') {
            arr[i] -= 32;
            if (i > 0 && arr[i-1] >= 'A' && arr[i-1] <= 'Z') {
                count++;
            }
        }
    }
    return count;
  }
}