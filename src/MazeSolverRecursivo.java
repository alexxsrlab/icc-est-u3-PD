import java.util.*;

public class MazeSolverRecursivo implements MazeSolver {

    private boolean findPath(boolean[][] grid, boolean[][] visited, Cell current, Cell end, List<Cell> path) {
        int row = current.getRow();
        int col = current.getCol();

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || !grid[row][col] || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (row == end.getRow() && col == end.getCol()) {
            path.add(current);
            return true;
        }

        if (findPath(grid, visited, new Cell(row + 1, col), end, path) ||
            findPath(grid, visited, new Cell(row, col + 1), end, path) ||
            findPath(grid, visited, new Cell(row - 1, col), end, path) ||
            findPath(grid, visited, new Cell(row, col - 1), end, path)) {
            path.add(current);
            return true;
        }

        return false; 
    }

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
    List<Cell> path = new ArrayList<>();
    boolean[][] visited = new boolean[grid.length][grid[0].length];

    if (findPath(grid, visited, start, end, path)) {
        // No se invierte, se deja en orden destino → origen
        return path;
    }

    return Collections.emptyList(); 
}
}
