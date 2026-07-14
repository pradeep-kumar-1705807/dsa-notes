class PacificAltanticFlow {
    public  boolean reachPacificOcean(int[][] heights, boolean[][] visited, int i, int j, int prevHeight) {

        if(i<0||j<0 || i>=heights.length || j>=heights[0].length || visited[i][j]) {
            return false;
        }

        if(heights[i][j] > prevHeight) {
            return false;
        }

        if(i==0 || j== 0) {
            return true;
        }
        
    

        visited[i][j] = true;
        return reachPacificOcean(heights,visited, i+1, j, heights[i][j]) ||
                reachPacificOcean(heights,visited, i-1, j, heights[i][j]) ||
                reachPacificOcean(heights,visited, i, j+1, heights[i][j]) ||
                reachPacificOcean(heights,visited, i, j-1, heights[i][j]);



    }


    public   boolean reachAtlanticOcean(int[][] heights, boolean[][] visited, int i, int j, int prevHeight) 
    {
       
        if(i<0||j<0 || i>=heights.length || j>=heights[0].length || visited[i][j]) {
            return false;
        }

        if(heights[i][j] > prevHeight) {
            return false;
        }

        if(i==heights.length-1 || j==heights[0].length-1) {
            return true;
        }
        
        

        visited[i][j] = true;
        return reachAtlanticOcean(heights,visited, i+1, j, heights[i][j]) ||
                reachAtlanticOcean(heights,visited, i-1, j, heights[i][j]) ||
                reachAtlanticOcean(heights,visited, i, j+1, heights[i][j]) ||
                reachAtlanticOcean(heights,visited, i, j-1, heights[i][j]);

    }


     public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<heights.length; i++) {
            for(int j=0; j<heights[0].length; j++) {
                if(reachPacificOcean(heights, new boolean[heights.length][heights[0].length], i, j, heights[i][j])
                 && reachAtlanticOcean(heights, new boolean[heights.length][heights[0].length], i, j, heights[i][j])) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
        
    }
}