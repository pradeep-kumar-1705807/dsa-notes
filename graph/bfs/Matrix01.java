import java.util.*;


class Pair {
    int u;
    int v;
    int weight;

    public Pair(int u, int v) {
        this.u = u;
        this.v = v;
        this.weight = 1; // default weight for unweighted graph
    }

    public Pair(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}

public class Matrix01 {


    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q = new LinkedList();
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] vistited = new boolean[n][m];
        int[][] result = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++) {
                if(mat[i][j] == 0) {
                    result[i][j] = 0;
                    q.add(new Pair(i,j));
                }
                else {
                        result[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while(!q.isEmpty()) {

            Pair p = q.poll();
            int x = p.u;
            int y = p.v;

            int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int[] dir : dirs) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if(newX>=0 && newX<n && newY>=0 && newY<m) {
                    if(result[newX][newY] > result[x][y] + 1) {
                        result[newX][newY] = result[x][y] + 1;
                        q.add(new Pair(newX, newY));
                    }
                }
            }

        }

        return result;

        
    }

    public static void main(String[] args) {
        Matrix01 sol = new Matrix01();
        int[][] mat = {
            {0,0,0},
            {0,1,0},
            {1,1,1}
        };

        int[][] result = sol.updateMatrix(mat);
        for(int i=0;i<result.length;i++) {
            for(int j=0;j<result[0].length;j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
