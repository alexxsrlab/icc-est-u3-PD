public class Maze {
    private boolean[][] grid;

    public boolean[][] getGrid (){
        return grid;
    }

    public Maze(boolean[][] grid) {
        this.grid = grid;
    }

    public void printMaze() {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? "- " : "$ ");
            }
            System.out.println();
        }
    }
}
