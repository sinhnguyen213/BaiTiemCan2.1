package com.luvina.matrixfun;

import java.util.Arrays;

public class MatrixFun {
	// thuoc tinh
	private int[][] matrix;

	// phuong thuc
	// phuong thuc khoi tao
	public MatrixFun() {
		matrix = new int[8][8];
	}

	// phương thức int() nhập dữ liệu cho mảng
	public void init() {
		int[][] matrix = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 7, 8, 2, 3, 6, 4, 3, 2 }, { 8, 9, 3, 2, 4, 3, 4, 9 },
				{ 0, 4, 7, 3, 4, 2, 3, 4 }, { 9, 8, 7, 4, 3, 2, 3, 8 }, { 8, 7, 3, 4, 3, 3, 2, 3 },
				{ 9, 7, 4, 5, 4, 1, 8, 3 }, { 9, 8, 4, 3, 7, 5, 9, 8 } };
		this.matrix = matrix;
	}

	// phương thức tìm min trong mảng 1 chiều
	public int findMin(int[][] a) {
		int min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		return min;
	}

	// phương thức tìm max trong mảng 1 chiều
	public int findMax(int[][] a) {
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	// phương thức đổi chỗ
	public void maxDiagonalLine() {

		for (int i = 0; i < matrix.length; i++) {
			int n = matrix[i].length;
			int[] a = matrix[i];
			int tmp;
			Arrays.sort(a);
			if (i < n - 1) {
				tmp = matrix[i][i];
				matrix[i][i] = matrix[i][n - 2];
				matrix[i][n - 2] = tmp;
				tmp = matrix[i][n - 1];
				matrix[i][n - 1] = matrix[i][n - i - 1];
				matrix[i][n - i - 1] = tmp;
			} else {
				tmp = matrix[i][n - 2];
				matrix[i][n - 2] = matrix[i][n - i - 1];
				matrix[i][n - i - 1] = tmp;
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

	// phương thức tìm phần tử lớn thứ 3 trong ma trận
	public void thirdMax() {
		int max = findMax(matrix);
		int secondMax = findMin(matrix);
		int thirdMax = findMin(matrix);
		String posSecondMax = "";
		String posThirdMax = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (secondMax < matrix[i][j] && matrix[i][j] < max) {
					thirdMax = secondMax;
					posThirdMax = posSecondMax;
					secondMax = matrix[i][j];
					posSecondMax = "(" + i + ", " + j + ")";
				} else if (secondMax == matrix[i][j]) {
					posSecondMax += ", " + "(" + i + ", " + j + ")";
				} else if(thirdMax == matrix[i][j]) {
					posThirdMax += ", " + "(" + i + ", " + j + ")";
				}
			}
		}
		System.out.println("Third Max = " + thirdMax);
		System.out.println("Vị trí của thirdMax: " + posThirdMax);
	}
}
