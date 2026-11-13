
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            prefix[i + 1] = prefix[i] + x;
        }

        String line;
        while ((line = in.readLine()) != null) {
            if (line.trim().isEmpty()) continue;

            st = new StringTokenizer(line);
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            out.println(prefix[right + 1] - prefix[left]);
        }

        out.flush();
    }
}
