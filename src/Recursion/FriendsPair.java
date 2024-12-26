package Recursion;

public class FriendsPair {
    public static void main(String[] args) {
        System.out.println(pairs(3));
    }
    public static int pairs(int n){
        if(n<=1) return 1;
                // a is going and n-1 people are going 1*f(n-1)
                // a is pairup with n-1 people 1*(n-1) and the remaining people are also going
        return pairs(n-1) + (n-1) * pairs(n-2);
    }
}
