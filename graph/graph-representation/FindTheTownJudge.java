public class FindTheTownJudge {

// Core Idea: The town judge is the person who is trusted by everyone else (in-degree = n-1) and
//  trusts no one (out-degree = 0).
//  We can use two arrays to keep track of the in-degrees and out-degrees of each person. 
// Then, we can iterate through the arrays to find the person who satisfies both conditions.
    
    public int findJudge(int n, int[][] trust) {
        int outDegree[] = new int[n+1];
        int inDegree[] = new int[n+1];

        for(int[] t : trust) {
            outDegree[t[0]]++;
            inDegree[t[1]]++;
        }

        for(int i=1; i<=n; i++) {
            if(outDegree[i] == 0 && inDegree[i] == n-1) {
                return i;
            }
        }
        return -1;


    }
}
