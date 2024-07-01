import java.util.Scanner;

public class Smallest_Number {
    public static int smallestNumber(int num){
        String small = "";
        for(int i = 9; i >= 2; i--){
            while(num % i == 0){
                num = num / i;
                small = i + small;
            }
        }
        if(num != 1){
            return -1;
        }
        else{
            return Integer.parseInt(small);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(smallestNumber(num));
    }
}
