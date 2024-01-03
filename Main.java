import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int x = 0;
        int y = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(x < g.length && y < s.length){
            if(s[y] >= g[x]){
                x++;
            }
            y++;
        }
        System.gc();
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        Solution solution = new Solution();
        int result = solution.findContentChildren(g, s);

        System.out.println("Number of content children: " + result);
    }
}
