//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, 1, 0, -1};
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int r = grid.length;
  int c = grid[0].length;
  int days = 0, countOfOnes = 0;
  Queue < int[] > q = new LinkedList < > ();
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      if (grid[i][j] == 2) {
        q.add(new int[] {i, j});
      }
      if (grid[i][j] == 1) {
        countOfOnes += 1;
      }
    }
  }
  if (countOfOnes == 0) {
    return 0;
  }
  while (!q.isEmpty()) {
    int size = q.size();
    while (size--> 0) {
      int[] temp = q.remove();
      int i = temp[0], j = temp[1];
      for (int l = 0; l < 4; l++) {
        int nr = i + dx[l], nc = j + dy[l];
        if (nr < 0 || nc < 0 || nr == r || nc == c) {
          continue;
        }
        if (grid[nr][nc] == 1) {
          countOfOnes -= 1;
          q.add(new int[] {
            nr,
nc
          });
          grid[nr][nc] = 2;
        }
      }
    }
    if (q.size() > 0) {
      days += 1;
    }
  }
  return countOfOnes == 0 ? days : -1;
    }
}
