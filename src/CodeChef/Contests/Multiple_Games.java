package CodeChef.Contests;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Multiple_Games {

    static class Pair<T,P> {
        T x;
        P y;

        public T getX() {
            return x;
        }

        public P getY() {
            return y;
        }

        Pair(T x, P y) {
            this.x = x;
            this.y = y;
        }

    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Reader sc= new Reader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt(), q = sc.nextInt(), m = sc.nextInt();
            long[] a = new long[n];
            for (int i=0; i<n; i++)
                a[i] = sc.nextLong();
            long[] b = new long[1000001];
            HashMap<Pair<Long, Long>, Long> map = new HashMap<>();
            while (q-- != 0) {
                int l = sc.nextInt()-1, r = sc.nextInt()-1;
                Pair<Long, Long> pair = new Pair<>(a[l], a[r]);
                if(a[l]<=m && a[r]>m) {
                    b[(int) a[l]]++;
                    b[m+1]--;
                }
                else if(a[r]<=m) {
                    b[(int) a[l]]++;
                    b[m+1]--;
                    long count = map.getOrDefault(pair, 0L);
                    map.put(pair, count+1);
                }
            }
            for (Pair<Long, Long> x: map.keySet()) {
                long k = x.getX();
                long p = x.getY();
                long l = map.get(x);
                b[(int) (p+k)] -= l;
                b[(int) (p+2*k)] += l;
                long c = p + 2*k;
                while(c+p <= m) {
                    c += p;
                    b[(int) c] -= l;
                    b[(int) (c+k)] += l;
                    c += k;
                }
            }
            long max = 0;
            for(int i=1; i<=m; i++) {
                b[i] += b[i-1];
                max = Math.max(max,b[i]);
            }
            System.out.println(max);
        }
    }
}
