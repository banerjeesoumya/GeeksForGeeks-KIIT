import java.util.Scanner;

public class TicTacToe_game 
{
    static char board [][] = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'}
    };
    public static void formUpTheBoard()
    {
        for (int i = 0; i < 3; i ++)
        {
            for (int j = 0; j < 3; j ++)
            {
                System.out.print(board[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static int playerMove (char symb, int pos)
    {
        int row = (pos - 1) / 3;
        int col = (pos - 1) % 3;
        
        if  ((pos < 1) || (pos > 9))
        {
            return 0;
        }
        if ((board[row][col] == 'X') || (board[row][col] == 'O'))
        {
            return 2;
        }

        board[row][col] = symb;

        return 1;
    }

    public static boolean WinCheck (char sym)
    {
        for (int i = 0; i < 3; i ++)
        {
            //Row win check
            if ((board[i][0] == sym) && (board[i][1] == sym) && (board[i][2] == sym))
                return true;

            
            //Column win check
            if ((board[0][i] == sym) && (board[1][i] == sym) && (board[2][i] == sym))
                return true;
        }
        
        //Diagonal Win Check
        if (((board[0][0] == sym) && (board[1][1] == sym) && (board[2][2] == sym)) || ((board[0][2] == sym) && (board[1][1] == sym) && (board[2][0] == sym)))
            return true;

        return false;
    }
    
    public static void main(String[] args) 
    {
        char Player = 'X';
        int moves = 0;
        Scanner sc = new Scanner (System.in);
        
        //Checking for boundary condition
        while (moves < 9)
        {
            formUpTheBoard();
            int position;

            System.out.println("Enter your position (1 - 9) where you want to insert, Player " + Player);
            position = sc.nextInt();

            if (playerMove(Player, position) == 1)
            {
                moves ++;

                if (WinCheck(Player))
                {
                    formUpTheBoard();
                    System.out.println("Player " + Player + " has won the game.");
                    break;
                }

                else if (moves == 9)
                {
                    System.out.println ("Game has resulted in a draw");
                }

                Player = (Player == 'X') ? 'O' : 'X';
            }
            else if (playerMove(Player, position) == 0)
            {
                System.out.println("Invalid Move ! Please try between the range (1 - 9)..");
            }
            else
            {
                System.out.println("Invalid Move !! Cell already occupied. Please try again..");
            }
        }
        sc.close();
    }

}
