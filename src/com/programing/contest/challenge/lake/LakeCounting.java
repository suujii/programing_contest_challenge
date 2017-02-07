/**
* 크기가 N*M 인 정원이 있다. 그 곳에 비가내려 물 웅덩이가 생겼다. 물웅덩이는 주위(8군데_가 근접하여 있으면
* 서로 연결되어있다고 간주한다. 즉, 하나의 물웅덩이이다. 전부 몇개의 물 웅덩이가 있을까? 
* 9군데는 다음의 물 웅 덩이 W에 대하여 *부분을 나타냄
*  ***
*  *W*
*  ***
* N, M <=100
*
* 입력
* N = 10
* M = 12
* 입력값 TC 참조
* 
* 출력
* 3
*/
package com.programing.contest.challenge.lake;

/**
 * @author SuJi, Lee
 *
 */
public class LakeCounting {
	private int row;
	private int col;
	private char[][] lakes;

	public LakeCounting(int row, int col, char[][] lakes) {
		this.row = row;
		this.col = col;
		this.lakes = lakes;
	}

	public void printLakeCounting() {
		inspectionLake();

		int count = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(lakes[i][j]);
				if (lakes[i][j] == 'w') {
					count++;
				}
			}
			System.out.println();
		}
		System.out.println(count);
	}

	public void inspectionLake() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (lakes[i][j] == 'W') {
					lakes[i][j] = 'w';

					inspectionLake(i - 1, j - 1);
					inspectionLake(i - 1, j);
					inspectionLake(i - 1, j + 1);
					inspectionLake(i, j - 1);
					inspectionLake(i, j + 1);
					inspectionLake(i + 1, j - 1);
					inspectionLake(i + 1, j);
					inspectionLake(i + 1, j + 1);
				}

			}
		}
	}

	public void inspectionLake(int rowIndex, int colIndex) {
		if (rowIndex >= 0 && rowIndex < row && colIndex >= 0 && colIndex < col) {
			if (lakes[rowIndex][colIndex] == 'W') {
				lakes[rowIndex][colIndex] = '.';
				inspectionLake(rowIndex - 1, colIndex - 1);
				inspectionLake(rowIndex - 1, colIndex);
				inspectionLake(rowIndex - 1, colIndex + 1);
				inspectionLake(rowIndex, colIndex - 1);
				inspectionLake(rowIndex, colIndex + 1);
				inspectionLake(rowIndex + 1, colIndex - 1);
				inspectionLake(rowIndex + 1, colIndex);
				inspectionLake(rowIndex + 1, colIndex + 1);
			}
		}
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public char[][] getLakes() {
		return lakes;
	}

	public void setLakes(char[][] lakes) {
		this.lakes = lakes;
	}
}
