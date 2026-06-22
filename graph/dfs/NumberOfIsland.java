//Compile: javac -d ../../build NumberOfIsland.java
//Run: java -cp ../../build NumberOfIsland
import java.util.*;

class NumberOfIsland {

    public void dfs(char[][] grid, boolean[][]visited, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;


        if(x<0 || y<0 || x>=n|| y>=m || grid[x][y] == '0' || visited[x][y] == true ) {
            return; 
        }

        visited[x][y] = true;

        dfs(grid,visited,x,y+1);
        dfs(grid,visited,x,y-1);
        dfs(grid,visited,x+1,y);
        dfs(grid,visited,x-1,y);
        
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

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        NumberOfIsland sol = new NumberOfIsland();
        int result = sol.numIslands(grid);
        System.out.println(result);
    }

}

// in