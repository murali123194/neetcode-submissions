class Solution {
    public boolean stoneGame(int[] piles) {
        return rec(0, 0, 0, piles.length - 1, piles, 1);
    }

    private boolean rec(int start, int A, int B, int end, int[] piles, int chance) {
        if (start > end) {
            return A > B;
        }

        if (chance == 1) { // Alice
            return rec(start + 1, A + piles[start], B, end, piles, 0)
                || rec(start, A + piles[end], B, end - 1, piles, 0);
        } else { // Bob
            return rec(start + 1, A, B + piles[start], end, piles, 1)
                || rec(start, A, B + piles[end], end - 1, piles, 1);
        }
    }
}