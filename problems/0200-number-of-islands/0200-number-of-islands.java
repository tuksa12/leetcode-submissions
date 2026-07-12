class Solution {
    char[][] g;
    public int numIslands(char[][] grid) {
        int result = 0;
        g = grid;
        for (int indexV = 0; indexV < grid.length; indexV++ ) {
            for (int indexH = 0; indexH < grid[indexV].length; indexH++ ) {
                result = result + sink(indexV,indexH);
            }
        }
        return result;
    }

    public int sink(int i, int j) {
        if (i < 0 || i == g.length || j < 0 || j == g[i].length || g[i][j] == '0'){
            return 0;
        }
        g[i][j] = '0';
        sink(i+1, j);
        sink(i-1, j);
        sink(i, j+1);
        sink(i, j-1);
        return 1;
        


    }
}