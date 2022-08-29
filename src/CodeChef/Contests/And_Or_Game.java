package CodeChef.Contests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class And_Or_Game {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-- !=0){
            int n=scan.nextInt();
            int m=scan.nextInt();
            HashSet<Integer> h1= new HashSet<>();
            Stack<Integer> s1= new Stack<>();
            h1.add(0);
            s1.push(0);
            int[] a =new int[n];
            int[] b =new int[m];
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=scan.nextInt();
            }
            while(!s1.isEmpty()){
                int x= s1.pop();
                for(int i=0;i<n;i++){
                    int y=a[i];
                    if(!h1.contains(x|y)){
                        h1.add(x|y);
                        s1.push(x|y);
                    }
                }
                for(int i=0;i<m;i++){
                    int y=b[i];
                    if(!h1.contains(x&y)){
                        h1.add(x&y);
                        s1.push(x&y);
                    }
                }
            }
            System.out.println(h1.size());
        }
    }
}
