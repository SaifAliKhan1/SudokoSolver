package com.saif.example.sudokosolver;

public class Solver {
	int[][] k;
	int n;

	public Solver(int[][] in, int size) {
		k = in;
		n = size;
		fill(0, 0);

	}

	public String get() {
		if (fill(0, 0)) {
			String s = "";
			for (int i = 0; i < n * n; i++) {
				for (int j = 0; j < n * n; j++) {
					s = s + k[i][j] + "\t";
				}
				s = s + "\n";
			}
			return s;
		}

		return "Cannot be solved";
	}

	public boolean check() {
		if (fill(0, 0)==true) {
			return true;
		} else if(fill(0,0)==false) {
			return false;
		}
		return false;
	}

	public int[][] getSolution() {
		return k;
	}

	public boolean fill(int row, int col) {
		int f = 1;
		if (k[row][col] == 0) {
			while (f <= n * n) {
				if (row(f, row) && coloumn(f, col) && box(f, row, col)) {
					k[row][col] = f;
					if (col < n * n - 1) {
						if (fill(row, col + 1)) {
							return true;
						} else {
							k[row][col] = 0;
						}

					} else if (col == n * n - 1 && row < n * n - 1) {
						if (fill(row + 1, 0)) {
							return true;
						} else {
							k[row][col] = 0;
						}
					} else {
						return true;
					}
				}
				f += 1;
			}
			return false;
		} else if (col < n * n - 1) {
			return (fill(row, col + 1));

		} else if (col == n * n - 1 && row < n * n - 1) {
			return (fill(row + 1, 0));

		} else {
			return true;
		}

	}

	public boolean row(int num, int row) {
		for (int i = 0; i < n * n; i++) {
			if (k[row][i] == num)
				return false;
		}
		return true;
	}

	public boolean coloumn(int num, int col) {
		for (int i = 0; i < n * n; i++) {
			if (k[i][col] == num)
				return false;
		}
		return true;
	}

	public boolean box(int num, int row, int col) {
		for (int i = n * (row / n); i < n * (row / n) + n; i++) {
			for (int j = n * (col / n); j < n * (col / n) + n; j++) {
				if (k[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}

}
