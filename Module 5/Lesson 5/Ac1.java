import java.util.*;

class Ac1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        solve(a, 0, new ArrayList<>());
    }

    public static void solve(int[] a, int i, ArrayList<Integer> p) {
        if (i == a.length) {
            if (p.size() > 0) System.out.println(p);
            return;
        }

        solve(a, i + 1, p);
        p.add(a[i]);
        solve(a, i + 1, p);
        p.remove(p.size() - 1);
    }
}