import java.util.*;

public class Main {
  
  Set<Integer> nums;
  void checkDuplicate() {
    nums = new HashSet<>();
    Scanner s = new Scanner(System.in);
    for(;;) {
      String l = s.nextLine();
      if(l.compareTo("q") == 0) {
        break;
      }
      Integer num = Integer.parseInt(l);
      if(nums.contains(num)) {
        System.out.println(num+" is duplicated");
      } else {
        nums.add(num);
      }
    }
  }
  
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Main m = new Main();
      m.checkDuplicate();
  }
}