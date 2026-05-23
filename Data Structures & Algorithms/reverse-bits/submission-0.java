class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int bit = n & 1;          // step 1 — extract last bit of n
            ans = (ans << 1) | bit;   // step 2 — push that bit into ans
            n = n >> 1;              // step 3 — remove that bit from n
        }

        return ans;
    }
}