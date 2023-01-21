import java.util.Scanner;

public class Way_Too_Long_Words_CF {
    public static void solution(String str){
        if(str.length()<10) System.out.println(str);
        else {
            int n = (str.length()-2);
            char w1 = str.charAt(0);
            char w2 = str.charAt(str.length()-1);
            String soln = "";
            soln = soln + w1 + n + w2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0 ){
            String word = sc.next();
            solution(word);
        }
    }
}
