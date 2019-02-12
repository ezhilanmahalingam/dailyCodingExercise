   
int m[][] = { { 0, 0, 1 },
				      { 0, 0, 1 },
				      { 1, 0, 0 } };
   /**
	 * Function is to count the number of path from top left corner to bottom
	 * right corner with obstacles, here the obstacle is 1.
   
     Time Complexity: O(m*n) m is no of rows and n is number of cols 
     Space Complexity: O(m*n)
	 * 
	 * @param m
	 * @param cache
	 * @param r
	 * @param c
	 * @return
	 */
	private static int move(int m[][], int cache[][], int r, int c) {

		if (r == m.length - 1 && c == m[0].length - 1) {
			return 1;
		}

		if (r >= m.length || c >= m[0].length || m[r][c] == 1) {
			return 0;
		}

		if (cache[r][c] != -1) {
			return cache[r][c];
		}

		cache[r][c] = move(m, cache, r + 1, c) + move(m, cache, r, c + 1);

		return cache[r][c];
	}

	/**
	 * Dynamic programming - Populate the matrix with number of paths and return
	 * the path at destination This function is useful when only the row and
	 * column is given with no obstacles.
	 * https://leetcode.com/problems/unique-paths/
	 */
	private static int moveRobo(int r, int c) {

		// Build matrix
		int m[][] = new int[r][c];

		// first row will be always 1 as there is no possible path exists
		for (int i = 0; i < m.length; i++) {
			m[i][0] = 1;
		}

		// Likewise fist column will be always 1
		for (int j = 0; j < m[0].length; j++) {
			m[0][j] = 1;
		}

		// Rest of the indexes
		for (int i = 1; i < m.length; i++) {
			for (int j = 1; j < m[0].length; j++) {
				m[i][j] = m[i - 1][j] + m[i][j - 1];
			}
		}
		return m[r - 1][c - 1];
	}
