package Recursion;

//No ones coming together

// either startwith 0 then n-1 ways or start with 1 so next digit must be 0 so n-2 ways add both
public class NoConsecOneInBinaryString {
    public static void main(String[] args) {
        System.out.println(countBinary(3));
    }
    public static int countBinary(int n){
        if(n==0) return 1;
        if(n==1) return 2;
        return countBinary(n-1)+countBinary(n-2);
    }
}
