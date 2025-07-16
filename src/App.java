import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
    }
/* 
    public static void runEjerciciosPD() {

        EjerciciosPd ejerciciosPd = new EjerciciosPd();
        System.out.println("Ariel Badillo");
        System.out.println("Fibonacci Recursivo");
        long start = System.nanoTime();
        long resultado = ejerciciosPd.getFibonaci(50);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado = " + resultado + " en tiempo = " + duration + " nanosegundos");

        System.out.println("Fibonacci Recursivo Caching");
        long start1 = System.nanoTime();
        long resultado1 = ejerciciosPd.getFibonaciPD(50);
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;
        System.out.println("Resultado = " + resultado1 + " en tiempo = " + duration1 + " nanosegundos");
        
    }
        */

    public static void runMaze() {
        boolean[][] predefineMaze = {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true}
        };

        System.out.println("Ariel Badillo");
        Maze maze = new Maze(predefineMaze);
        System.out.println("Laberinto Cargado");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursivo()
        );
        
        MazeSolver solver = solvers.get(0);
        List<Cell> path;
        path = solver.getPath(maze.getGrid(), start, end);
        System.out.println(path);

    }
}
