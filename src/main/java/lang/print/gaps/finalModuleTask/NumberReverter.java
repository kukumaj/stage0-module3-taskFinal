package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversed = 0;
//        while(number != 0) {
//            int digit = number % 10;
//            reversed = reversed * 10 + digit;
//            number /= 10;
//        }
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}
