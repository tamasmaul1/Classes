import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int result = 0;
        Random rand = new Random();
        boolean next_game = false;
        do{
            next_game = false;
            System.out.print("How many rounds do you want to play?: ");
            int game_length = myScanner.nextInt();
            boolean vaible_length = isLengthVaible(game_length);
            if(vaible_length){
                for(int i = 0; i < game_length; i++){
                    result += playMatch(myScanner, rand);
                }
                if(result == 0){
                    System.out.println("The game was a tie");
                }
                else if(result > 0){
                    System.out.println("You won this game");
                }
                else{
                    System.out.println("You lost this game");
                }
                System.out.print("Wanna play again? If yes, press 1.");
                int play_again = myScanner.nextInt();
                if(play_again == 1){next_game = true;}
            }
            else{break;}
        }
        while(next_game);
        //System.out.println(results);
    }

    public static int playMatch(Scanner myScanner, Random rand){
        int winner = 0;
        System.out.print("Please enter your pick. 1-Rock 2-Paper 3-Scissors: ");
        int player_pick = myScanner.nextInt();
        int computer_pick = rand.nextInt(1, 4);
        System.out.println("The computer's pick is: " + computer_pick);
        winner = getWinner(player_pick, computer_pick);
        String winner_name = "";
        switch(winner){
            case 0: winner_name = "Tie";
            case 1: winner_name = "You won";
            case -1: winner_name = "The computer won";
        }
        System.out.println("Result of this round: " + winner_name);
        return winner;
    }

    private static int getWinner(int player_pick, int computer_pick) {
        switch(player_pick){
            case 1: switch(computer_pick){
                case 1: return 0;
                case 2: return -1;
                case 3: return 1;
            }
            case 2: switch(computer_pick){
                case 1: return 1;
                case 2: return 0;
                case 3: return -1;
            }
            case 3: switch(computer_pick){
                case 1: return -1;
                case 2: return 1;
                case 3: return 0;
            }
        }
        return 0;
    }

    public static boolean isLengthVaible(int game_length){
        if(game_length >= 1 && game_length <= 10){return true;}else{return false;}
    }
}
