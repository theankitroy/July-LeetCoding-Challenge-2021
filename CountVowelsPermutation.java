class Solution {
    public int countVowelPermutation(int n) {
      
        long a = 1, e = 1, i = 1, o = 1, u = 1, a_new, e_new, i_new, o_new, u_new;
        for(int j = 2; j <= n; j++) {
            a_new =  e%1000000007;
            e_new = (a + i) % 1000000007;
            i_new = (a + e + o + u) % 1000000007;
            o_new = (i + u) % 1000000007;
            u_new =  a%1000000007;
            a = a_new; e = e_new; i = i_new; o = o_new; u = u_new;
        }
        return (int)((a + e + i + o + u) % 1000000007);
    }
}
