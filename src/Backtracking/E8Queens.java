package Backtracking;

import java.util.Scanner;

public class E8Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        track(arr,0);
    }
    public static boolean canPlace(int[][] arr,int r, int c){
        for(int i = 0 ; i<=r;i++){
            if(arr[i][c]==1) return false;
        }
        int rr=r,cc=c;
        while(r>=0 && c>=0){
            if(arr[r][c]==1) return false;
            r--;c--;
        }
        while(rr>=0 && cc<arr.length){
            if(arr[rr][cc]==1) return false;
            rr--;cc++;
        }
        return true;
    }
    public static void print(int[][] arr){
        for(int[] a: arr){
            for(int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i = 0 ; i< arr.length ; i++)
            System.out.print("-x");
        System.out.print("-\n");
    }
    public static void track(int[][] arr,int r){
        if(arr.length==r){
            print(arr);
        }

        for(int i = 0 ; i<arr.length ;i++){
            if(canPlace(arr,r,i)) {
                arr[r][i] = 1;
                track(arr, r + 1);
                arr[r][i] = 0;
            }
        }
    }
}
