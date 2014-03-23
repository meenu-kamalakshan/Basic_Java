public class Percolator {
   private int N; 
   private boolean[][] visited;
   private boolean[][] occupied;

   public Percolator(int N, double p) {
      this.N = N;
      visited  = new boolean[N][N];
      occupied = new boolean[N][N];

      // initialize which sites are occupied at random
      for (int i = 0; i < N; i++)
         for (int j = 0; j < N; j++)
            if (Math.random() < p) occupied[i][j] = true;
   }


   private void dfs(int i, int j) {
      if (i == -1 || i == N || j == -1 || j == N) return;
      if (visited[i][j]) return;
      if (!occupied[i][j]) return;
      visited[i][j] = true;
      dfs(i+1, j);
      dfs(i-1, j);
      dfs(i, j+1);
      dfs(i, j-1);
   }

   public boolean hasCluster() {
      // run DFS from each bottom cell 
      for (int i = 0; i < N; i++) {
         if (occupied[i][0] && !visited[i][0])
            dfs(i, 0);
      }

      // check if any top cell was reached
      for (int i = 0; i < N; i++)
         if (occupied[i][N-1] && visited[i][N-1]) return true;
      return false;

   }  



   public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);         // N-by-N lattice
      double p = Double.parseDouble(args[1]);    // probability site is occupied
      int clusters = 0;                          // number of times a cluster occurs
      int TRIALS = 1000;                         // number of times to perform experiment

      for (int i = 0; i < TRIALS; i++) {
         Percolator percolator = new Percolator(N, p);
         if (percolator.hasCluster()) clusters++;
      }
      System.out.println("fraction of times a spanning cluster occurs = " + 1.0 * clusters / TRIALS);
   }

}