package Recursion;

public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println(pow1(5,2));
        System.out.println(pow2Fast(5,3));
    }
    public static int pow1(int n,int pow){
        if(pow==0) return 1;

        return n*pow1(n,pow-1);
    }
    public static int pow2Fast(int n , int pow){
        if(pow==0)return 1;
        int sub = pow2Fast(n,pow/2);
        int ans = sub*sub;
        if((pow&1)==1) return n*ans;
        return ans;
    }
}
