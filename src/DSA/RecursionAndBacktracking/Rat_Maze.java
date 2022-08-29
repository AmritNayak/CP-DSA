package DSA.RecursionAndBacktracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rat_Maze {

    static int ways = 0;

    static boolean safe(int i, int j, int n) {
        return i>=0 && i<n && j>=0 && j<n;    // rat is within boundary of the maze
    }

    static void ratMaze(int[][] maze, int[][] visited, int i, int j, int n) {
        if (maze[n-1][n-1] == 1) return;    // if destination is a blocked cell
        if (i==n-1 && j==n-1) {     // rat reached destination
            ways++;
            return;
        }
        if (!safe(i, j, n)) return;     // if rat goes out of the maze

        // BACKTRACKING

        // mark current cell as visited
        visited[i][j] = 1;

        // up
        if (safe(i-1, j, n) && maze[i-1][j] == 0 && visited[i-1][j] == 0)
            ratMaze(maze, visited, i-1, j, n);
        // down
        if (safe(i+1, j, n) && maze[i+1][j] == 0 && visited[i+1][j] == 0)
            ratMaze(maze, visited, i+1, j, n);
        // left
        if (safe(i, j-1, n) && maze[i][j-1] == 0 && visited[i][j-1] == 0)
            ratMaze(maze, visited, i, j-1, n);
        // right
        if (safe(i, j+1, n) && maze[i][j+1] == 0 && visited[i][j+1] == 0)
            ratMaze(maze, visited, i, j+1, n);

        // revert to the previous state by reversing the current cell as unvisited
        visited[i][j] = 0;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        int[][] visited = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        ratMaze(maze, visited, 0, 0, n);
        System.out.println(ways);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
