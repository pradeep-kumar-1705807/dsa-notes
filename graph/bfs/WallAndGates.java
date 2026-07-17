import java.util.*;

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class WallAndGates {



    void bfsMultiSource(int[][] rooms) {

        List<Pair> q = new ArrayList<>();

        for(int i=0;i<rooms.length;i++) {
            for(int j=0;j<rooms[0].length;j++) {
                if(rooms[i][j] == 0) {
                    q.add(new Pair(i,j));
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int n = rooms.length;
        int m = rooms[0].length;

        while(!q.isEmpty()){

            int queueSize = q.size();
            for(int i=0;i<queueSize;i++) {
                Pair tempNode = q.remove(0);
                for(int[] dir : dirs) {
                    int newX = tempNode.x + dir[0];
                    int newY = tempNode.y + dir[1];
                    if(newX >= 0 && newX < n && newY >= 0 && newY < m && rooms[newX][newY] == Integer.MAX_VALUE) {
                        rooms[newX][newY] = rooms[tempNode.x][tempNode.y] + 1;
                        q.add(new Pair(newX, newY));
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        int[][] rooms = {
                {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };

        WallAndGates obj = new WallAndGates();
        obj.bfsMultiSource(rooms);

        // Print the updated rooms matrix
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }

        obj.test();
    }

    /**  
     *   TODO: create more test cases 50 tests 
     * 
    */

   void printRooms(int[][] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }
    }

    void test() {
        int[][] rooms1 = {
                {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };

        int[][] rooms2 = {
                {0, -1},
                {Integer.MAX_VALUE, Integer.MAX_VALUE}
        };

        int[][] rooms3 = {
                {Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0}
        };

        int[][] rooms4 = {
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {0, -1, Integer.MAX_VALUE}
        };

        int[][] rooms5 = {
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };

        // Add more test cases as needed

        System.out.println("Test Case 1:");
        bfsMultiSource(rooms1);
        printRooms(rooms1);     
        
        System.out.println("Test Case 2:");
        bfsMultiSource(rooms2);
        printRooms(rooms2);

        System.out.println("Test Case 3:");
        bfsMultiSource(rooms3);
        printRooms(rooms3);

        System.out.println("Test Case 4:");
        bfsMultiSource(rooms4);
        printRooms(rooms4);

        System.out.println("Test Case 5:");
        bfsMultiSource(rooms5);
        printRooms(rooms5);

        
    }

    
}