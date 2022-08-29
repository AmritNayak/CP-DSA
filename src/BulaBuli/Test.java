package BulaBuli;

import java.util.*;

public class Test {
    public static int countChar(String data, char coder) {
        int answer = 0;
        int n = data.length();
        for (int i=0; i<n; i++) {
            if (data.charAt(i) == coder)
                answer++;
        }
        return answer;
    }

    public static int[] alternateSort(int[] arr) {
        int[] answer = new int[arr.length/2 + (arr.length % 2 == 0 ? 0 : 1)];
        Arrays.sort(arr);
        int idx = 0;
        for (int i=0; i<arr.length; i+=2) {
            answer[idx++] = arr[i];
        }

        return answer;
    }

    public static int unaffectedChar(String dataStream) {
        int answer = 0;
        int n = dataStream.length();
        String rev = "";
        for (int i=n-1; i>=0; i--)
            rev += dataStream.charAt(i);
        for (int i=0; i<n; i++) {
            if (dataStream.charAt(i) == rev.charAt(i))
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(unaffectedChar("alphxxdida"));
        int[] arr = {1,0,0,0,0,1,0,0};
//        System.out.println(Arrays.toString(interchange(arr)));
//        System.out.println(Arrays.toString(dictWords("cat batman latt matter cat matter cat")));
        System.out.println(Arrays.toString(stateOfCells(arr, 1)));
    }

    public static int busRemaining(int[][] busStation) {
        int answer = 0;
        Arrays.sort(busStation, (o1, o2) -> o1[0] - o2[0]);
        Stack<int[]> stack = new Stack<>();
        for (int[] i : busStation)
            stack.push(i);

        while (!stack.empty()) {
            int[] temp = stack.pop();
            answer++;
            if (stack.size() > 0) {
                if (temp[temp.length-1] >= stack.peek()[0]) {
                    stack.pop();
                }
            }
        }
        return answer;
    }

//    public int findMaxElement(int len1, int[] arr1, int len2, int[] arr2) {
//        int[] res1 = sortArray(len1, arr1);
//        int[] res2 = sortArray(len2, arr2);
//        return Math.max(res1[len1-1], res2[len2-1]);
//    }
//
//    int difference_in_times(Time time1, Time time2) {
//        int answer = 0;
//        while (time1.compareTo(time2)!=0) {
//            if (time1.compareTo(time2) == 1) {
//                answer++;
//                time2.addSecond();
//            } else (time1.compareTo(time2) == -1) {
//                answer++;
//                time1.addSecond();
//            }
//        }
//        return answer;
//    }

    public static int[] interchange(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            answer[arr[i]] = i;
        }
        return answer;
    }

    public static String[] dictWords(String textInput) {
        String[] answer = new String[100];
        int idx = 0;
        String[] words = textInput.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int n=0;
        for (String k: map.keySet()) {
            if (map.get(k) > 1) {
                n++;
            }
        }
        answer = new String[n];
        for (String k: map.keySet()) {
            if (map.get(k) > 1) {
                answer[idx++] = k;
            }
        }
        Arrays.sort(answer);
        return answer;
    }

    public static int[] stateOfCells(int[] cell, int days)
    {
        int[] answer = new int[cell.length];
        for (int i = 0; i < cell.length ; i++ ) {
            answer[i] = cell[i];
        }
        for (int k = 0; k < days ; k++ ) {
            for (int j = 1; j < answer.length - 1 ; j++ ) {
                if ((answer[j-1] == 1 && answer[j+1] == 1) ||
                    (answer[j-1] == 0 && answer[j+1] == 0)) {
                    cell[j] = 0;
                } else{
                    cell[j] = 1;
                }
            }
            if (answer[1] == 0) {
                cell[0] = 0;
            } else{
                cell[0] = 1;
            }
            if (answer[6] == 0) {
                cell[7] = 0;
            } else{
                cell[7] = 1;
            }
            for (int i = 0; i < cell.length ; i++ ) {
                answer[i] = cell[i];
            }
        }
        return answer;
    }

}
