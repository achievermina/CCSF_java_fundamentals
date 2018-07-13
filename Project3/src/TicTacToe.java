import java.util.Scanner;

public class TicTacToe { // □

	public static Scanner input = new Scanner(System.in);
	public static char player = 'X';
	public static char[][] gameBoard = new char[3][3];
	public static int Num_of_turn = 0;

	public static void reset() {
		for (int y = 0; y < gameBoard.length; y++) {
			for (int x = 0; x < gameBoard.length; x++) {
				gameBoard[y][x] = '□';
			}
		}
	}

	public static void display() {
		for (char[] row : gameBoard) {
			System.out.print('|');
			for (char column : row) {
				System.out.print(column + "|");
			}
			System.out.println();
		}
	}

	public static void turn() {
		System.out.printf("It is %c's turn\n", player);
		userInput();
		display();
		Num_of_turn++;
		if (player == 'X')
			player = 'O';
		else
			player = 'X';

	}

	public static void userInput() {
		System.out.println("Enter the value of (x,y)");
		System.out.println("what is your x coordinate?");
		int x = input.nextInt() - 1;
		System.out.println("what is your y coordinate?");
		int y = input.nextInt() - 1;

		if (gameBoard[x][y] == '□')
			gameBoard[x][y] = player;
		else {
			System.out.println("Already taken! Please choose another place");
			display();
			userInput();
		}
	}

	public static boolean gameOver() {
		boolean result = false;
		char winner='□';

		// diagonal
		if ((gameBoard[0][0] == gameBoard[1][1]
				&& gameBoard[1][1] == gameBoard[2][2] || gameBoard[2][0] == gameBoard[1][1]
				&& gameBoard[1][1] == gameBoard[0][2]) && gameBoard[1][1] != '□') {
			result = true;
			winner = gameBoard[1][1];
		}

		// row
		for (int row = 0; row < gameBoard.length; row++)
			if (gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1] == gameBoard[row][2]
					&& gameBoard[row][1] != '□') {
				result = true;
				winner = gameBoard[row][1];
			}
		// column
		for (int column = 0; column < gameBoard.length; column++)
			if (gameBoard[0][column] == gameBoard[1][column] && gameBoard[1][column] == gameBoard[2][column]
					&& gameBoard[1][column] != '□') {
				result = true;
				winner = gameBoard[1][column];
			}

		if (winner!='□')
			System.out.println("Winner is "+winner);

		if (Num_of_turn >= 9)
			result = true;

		return result;
	}

	public static void game() {
		Num_of_turn = 0;
		reset();
		while (!gameOver()) {
			turn();
		}
		System.out.println("game is over");
	}

	public static void main(String[] args) {
		boolean anotherGame = false;

		do {
			System.out.println("Let's start the game!");
			game();
			System.out.println("Would you like to play another game of Tic Tac Toe? yes or no");
			String answer = input.next();

			if(answer.equals("yes"))
				anotherGame = true;
			else
				anotherGame = false;
			
		} while (anotherGame);
	}
}
