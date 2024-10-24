//print the 1 to 5 in recursion 
public class rec {

    public static void printNumber(int n) {
        if (n == 6) { //this is the base case
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }

    public static void main(String arg[]) {
        int n = 1;
        printNumber(n);
    }
}
