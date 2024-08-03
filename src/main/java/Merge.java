public class Merge {
    public int[] merge(int[] teamA, int[] teamB) {
        int[] teamC = new int[teamA.length];
        int ia = 0;
        int ib = 0;
        int ic = 0;
        while (ia + ib < teamA.length) {
            if (ia == teamA.length) {
                teamC[ic++] = teamB[ib++];
            }
            if (ib == teamB.length) {
                teamC[ic++] = teamA[ia++];
            }
            if (teamA[ia] >= teamB[ib]) {
                teamC[ic++] = teamA[ia++];
            } else {
                teamC[ic++] = teamB[ib++];
            }
        }
        return teamC;
    }
}
