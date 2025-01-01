package Backtracking;

public class FindingSubSets {
    public static void main(String[] args) {
        String str="abc";
        subSets("",str,0,0);
    }
    public static void subSets(String str,String inp,int i,int j){
        if(i== inp.length()){
            if(str.isEmpty()) System.out.println("Null");
            System.out.println(str);
            return;
        }
        subSets(str+inp.charAt(i),inp,i+1,j+1);
        subSets(str,inp,i+1,j);
    }
}
