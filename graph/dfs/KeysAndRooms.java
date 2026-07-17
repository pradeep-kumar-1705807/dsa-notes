import java.util.*;

public class KeysAndRooms {


    void dfs(List<List<Integer>> rooms, boolean[] visited, int currentNode) {

        if(visited[currentNode]) {
            return ;
        }


        visited[currentNode] = true;
        for(int i=0;i<rooms.get(currentNode).size();i++) {

            dfs(rooms, visited, rooms.get(currentNode).get(i));
        }

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] visited = new boolean[n];
        int startNode = 0;


        dfs(rooms,visited,startNode);



        for(int i=0;i<n;i++) {

            if(!visited[i])
            {
                return false;
            }
        }

        return true;
    
    }

    public static void main(String[] args) {

        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(new ArrayList<>());

        KeysAndRooms obj = new KeysAndRooms();
        boolean result = obj.canVisitAllRooms(rooms);
        System.out.println(result); // Output: true

        //rooms = [[1,3],[3,0,1],[2],[0]]

        rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(2));        
        rooms.add(Arrays.asList(0));
        boolean result2 = obj.canVisitAllRooms(rooms);
        System.out.println(result2); // Output: false
    }


}


