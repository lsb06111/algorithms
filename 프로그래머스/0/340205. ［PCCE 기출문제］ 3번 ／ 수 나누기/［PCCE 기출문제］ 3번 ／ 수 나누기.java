import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=(number+"").length(); i>0; i-=2){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}