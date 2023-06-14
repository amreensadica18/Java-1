public class CountInteger {
  public static void main(String[] args) {
    int count = 0, num = 0007652;
    while (num != 0) {
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }
}
