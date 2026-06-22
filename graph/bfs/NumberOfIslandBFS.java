//Compile: javac -d ../../graph/bfs/build NumberOfIsland.java
//Run: java -cp ../../graph/bfs/build NumberOfIsland



class NumberOfIslandBFS {


    void bfs((char[][] grid, boolean[][] visited, int x,int y) {

        int n = grid.length;
        int m = grid[0].length;
        

    }
     public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int countIsland = 0;

        boolean[][] visited  = new boolean[n][m];

        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) {

                if(visited[i][j] == false && grid[i][j] == '1') {
                    dfs(grid,visited,i,j);
                    countIsland++;
                }
            }
        }
        return countIsland;
     }

}