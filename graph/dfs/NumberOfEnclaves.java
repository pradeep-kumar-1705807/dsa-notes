class NumberOfEnclaves {

// Idea is to start DFS from the boundary '1's and mark them as '2'.
//  Then, we can count all remaining '1's which are enclaves.

   
       void dfs(int[][] board, int i,int j) {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=1) {
            
            return ;
        }
        

        board[i][j] = 2;
      
        dfs(board,i+1,j);
        dfs(board,i-1,j); 
        dfs(board,i,j+1);
        dfs(board,i,j-1);

        

    }

    
    public int numEnclaves(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i< m ;i++) {
            if(board[0][i] == 1 )
            {
                dfs(board,0 , i);
            }

            if(board[n-1][i] == 1 )
            {
                dfs(board,n-1 , i);
            }
        }

        for(int i=0;i<n;i++){

            if(board[i][0] == 1 )
            {
                dfs(board,i, 0);
            }
            if(board[i][m-1] == 1 )
            {
                dfs(board,i,m-1);
            }
             
        }
        int land = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(board[i][j] == 1) {
                    land++;
                }
            }
        }

        return land;


    }
    
    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        };
        NumberOfEnclaves solution = new NumberOfEnclaves();
        System.out.println(solution.numEnclaves(board));

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    

}