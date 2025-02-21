public class mcoloring {
    final int V = 4;
    int color[];
 
  
    boolean isSafe(int v, int graph[][], int color[], int c)
    {
        for (int i = 0; i < V; i++)
            if (graph[v][i] == 1 && c == color[i])
                return false;
        return true;
    }
 
      boolean graphColoringUtil(int graph[][], int m,
                              int color[], int v)
    {
        /* base case: If all vertices are
           assigned a color then return true */
        if (v == V)
            return true;
 
        /* Consider this vertex v and try
           different colors */
        for (int c = 1; c <= m; c++) {
            /* Check if assignment of color c to v
               is fine*/
            if (isSafe(v, graph, color, c)) {
                color[v] = c;
 
                /* recur to assign colors to rest
                   of the vertices */
                if (graphColoringUtil(graph, m, color,
                                      v + 1))
                    return true;
 
                               color[v] = 0;
            }
        }
 
               return false;
    }
 
   
 
    /* A utility function to print solution */
    void printSolution(int color[])
    {
        System.out.println("Solution Exists: Following"
                           + " are the assigned colors");
        for (int i = 0; i < V; i++)
            System.out.print(" " + color[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        mColoringProblem Coloring = new mColoringProblem();
               int graph[][] = {
            { 0, 1, 1, 1 },
            { 1, 0, 1, 0 },
            { 1, 1, 0, 1 },
            { 1, 0, 1, 0 },
        };
        int m = 3; // Number of colors
 
        // Function call
        Coloring.graphColoring(graph, m);
    }
}
