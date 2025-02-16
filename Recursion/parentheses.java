import java.util.ArrayList;
import java.util.List;

class parentheses {
    
    static void genParenthesisUtil(int n, int open, int close, 
                                          String s, List<String> ans) {

        if (open == n && close == n) {
            ans.add(s);
            return;
        }


        if (open < n) {
            genParenthesisUtil(n, open + 1, close, s + "{", ans);
        }


        if (close < open) {
            genParenthesisUtil(n, open, close + 1, s + "}", ans);
        }
    }
    
    static List<String> AllParenthesis(int n) {
        
        // List for storing the answer
        List<String> ans = new ArrayList<>();
        if (n > 0) {
            genParenthesisUtil(n, 0, 0, "", ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> ans = AllParenthesis(n);

        for (String str : ans) {
            System.out.println(str);
        }
    }
}
