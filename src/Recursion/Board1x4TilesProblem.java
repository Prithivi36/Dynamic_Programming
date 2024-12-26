package Recursion;
//Given a 4xn boards and tiles of size 1x4 , count the number of ways
//to tile the given board using 4x1 tiles
//tiles can either be placed vertically or horizontally
public class Board1x4TilesProblem {
    public static void main(String[] args) {
        System.out.println(calcTiles(4));
    }
    public static int calcTiles(int n){
        if(n<=3) return 1;

        return calcTiles(n-1)+calcTiles(n-4);
    }
}
