class SurroundedRegion {

// Idea is to start DFS from the boundary 'O's and mark them as 'T'. Then, we can flip all remaining 'O's to 'X's and convert 'T's back to 'O's.
   

    void dfs(char[][] board, int i,int j) {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O') {
            
            return ;
        }
        

        board[i][j]='T';
      
        dfs(board,i+1,j);
        dfs(board,i-1,j); 
        dfs(board,i,j+1);
        dfs(board,i,j-1);

        

    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<m ;i++) {
            if(board[0][i] == 'O' )
            {
                dfs(board,0 , i);
            }

            if(board[n-1][i] == 'O' )
            {
                dfs(board,n-1 , i);
            }
        }

        for(int i=0;i<n;i++){

            if(board[i][0] == 'O' )
            {
                dfs(board,i, 0);
            }


            if(board[i][m-1] == 'O' )
            {
                dfs(board,i, m-1);
            }
             
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {

                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if(board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
               
            }
        }


    }
     


    
    public static void main(String[] args) {
        SurroundedRegion solution = new SurroundedRegion();
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        // char[][] board = {
        //     {'O', 'X', 'X', 'O', 'X'},
        //     {'X', 'X', 'X', 'X', 'O'},
        //     {'X', 'X', 'X', 'O', 'X'},
        //     {'O', 'X', 'O', 'O', 'O'},
        //     {'X', 'X', 'O', 'X', 'O'}
        // };
for (char[] row : board) {
            System.out.println(java.util.Arrays.toString(row));
        }
        System.out.println("After solving:");
        solution.solve(board);

        for (char[] row : board) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}