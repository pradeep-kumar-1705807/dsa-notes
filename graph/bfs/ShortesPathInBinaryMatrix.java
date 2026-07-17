import java.util.*;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class ShortesPathInBinaryMatrix {


    public static int doBfs(int[][] grid) {

        Queue<Pair> q = new LinkedList<>();
        if(grid[0][0] == 0) {
            q.add(new Pair(0, 0));
        } else {
            return -1;
        }

        int n = grid.length;
        int m = grid[0].length;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] distMatrix = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        //take out element from Quest
        // push all the neighbour if eligible i.e gris[i][j]  == 0
        // then update disance in Matrix from current node

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                distMatrix[i][j] = 15* 100*100;
            }
        }

        distMatrix[0][0] = 1;
        visited[0][0 ] = true;
        
        while(!q.isEmpty()) {

            int queueSize = q.size();
            Pair tempNode = q.poll();

                for(int[] dir: dirs) {
                    int newX = tempNode.x + dir[0];
                    int newY = tempNode.y + dir[1];

                    if(newX >= 0 && newY >= 0 && newX < n && newY < m && grid[newX][newY] == 0 && !visited[newX][newY]) {
                        q.offer(new Pair(newX, newY));
                        visited[newX][newY] = true;
                        distMatrix[newX][newY] = Math.min(distMatrix[newX][newY], distMatrix[tempNode.x][tempNode.y] + 1);
                    }

                }


            }

            if(distMatrix[n-1][m-1] != 15*100*100) {
                return distMatrix[n-1][m-1];
            }
            return -1;
             


        } 
        

    
    
    public static void main(String[] args) {
        int[][] grid = {{0, 1}, 
                        {1, 0}};
        int[][] grid1 = {{0, 0, 0}, 
                         {0, 0, 0}, 
                         {0, 0, 0}};
        System.out.println(doBfs(grid));
        System.out.println(doBfs(grid1));
    }

}