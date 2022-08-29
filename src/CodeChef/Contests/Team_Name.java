package CodeChef.Contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Team_Name {

    static int heads(ArrayList<Character> a, ArrayList<Character> b){
        int l = a.size();
        for (char c: b) {
            if (!a.contains(c))
                l++;
        }
//        System.out.println(l);
        return l;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split("\\s");
            int length = s.length;
            LinkedHashMap<String, ArrayList<Character>> tail_heads = new LinkedHashMap<>();
            for (int i=0; i<length; i++) {
                String tempTail = s[i].substring(1);
                if (!tail_heads.containsKey(tempTail)) {
                    tail_heads.put(tempTail, new ArrayList<>());
                    tail_heads.get(tempTail).add(s[i].charAt(0));
                }
                else {
                    tail_heads.get(tempTail).add(s[i].charAt(0));
                }
            }
            ArrayList<String> tails = new ArrayList<>(tail_heads.keySet());
            int size = tail_heads.size();
            for (int i=0; i<size-1; i++) {
                for (int j=i+1; j<size; j++) {
                    int combs = heads(tail_heads.get(tails.get(i)), tail_heads.get(tails.get(j)));
                    count += (combs - tail_heads.get(tails.get(i)).size()) * (combs - tail_heads.get(tails.get(j)).size());
                }
            }
//            System.out.println(tail_heads.toString());
//            System.out.println(tails.toString());
            System.out.println(2*count);
        }
    }
}
