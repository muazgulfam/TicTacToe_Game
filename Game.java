import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        char tictac[][] = {{'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'}};
        
        int i,j;

/*Printing the table
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                System.out.print(tictac[i][j] + "   ");
            }
            System.out.println("");
        }*/

//Game Logic
        char Player_1 = 'X', Player_2 = 'O';
        System.out.println("Player_1 is awarded with a sign 'X' \nPlayer_2 is awarded with a sign 'O'" );
        
    //Displaying the Table
            for(i = 0; i < tictac.length; i++){
                System.out.print("\t\t");
                for(j = 0; j < tictac.length; j++){
                    System.out.print("\t" + tictac[i][j] + "   ");
                }
                System.out.println("");
            }

    //First move
        Scanner input = new Scanner(System.in);
        System.out.print("Player_1! Please select only the number mentioned in the table to place your sign there\n");
        char selection1 = input.next().charAt(0);

        //Finding the element
        //boolean isnumpresent = false;
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection1){
                    //isnumpresent = true;
                    tictac[i][j] = Player_1;
                    break;
                }
            }
        }
        //System.out.println("is the num present " + isnumpresent);

        //Desplaying the table after the first move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

    //Second move
        System.out.print("Player_2! Please select only the number mentioned in the table to place your sign there\n");
        char selection2 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection2){
                    tictac[i][j] = Player_2;
                    break;
                }
            }
        }

        //Desplaying the table after the Second move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

    //Third Move
        System.out.print("Player_1! Please select only the number mentioned in the table to place your sign there\n");
        char selection3 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection3){
                    tictac[i][j] = Player_1;
                    break;
                }
            }
        }

        //Desplaying the table after the Third move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

    //Forth Move
        System.out.print("Player_2! Please select only the number mentioned in the table to place your sign there\n");
        char selection4 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection4){
                    tictac[i][j] = Player_2;
                    break;
                }
            }
        }

        //Desplaying the table after the Forth move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

    //Fifth Move
        System.out.print("Player_1! Please select only the number mentioned in the table to place your sign there\n");
        char selection5 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection5){
                    tictac[i][j] = Player_1;
                    break;
                }
            }
        }

        //Desplaying the table after the Fifth move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

    //Sixth Move
        System.out.print("Player_2! Please select only the number mentioned in the table to place your sign there\n");
        char selection6 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection6){
                    tictac[i][j] = Player_2;
                    break;
                }
            }
        }

        //Desplaying the table after the Sixth move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

//Conditoin checking



    //Seventh Move
        System.out.print("Player_1! Please select only the number mentioned in the table to place your sign there\n");
        char selection7 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection7){
                    tictac[i][j] = Player_1;
                    break;
                }
            }
        }

        //Desplaying the table after the Seventh move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

//Conditoin checking



    //Eighth Move
        System.out.print("Player_2! Please select only the number mentioned in the table to place your sign there\n");
        char selection8 = input.next().charAt(0);

    //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection8){
                    tictac[i][j] = Player_2;
                break;
                }
            }
        }

    //Desplaying the table after the Eighth move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

//Conditoin checking



        //Ninthth Move
        System.out.print("Player_1! Please select only the number mentioned in the table to place your sign there\n");
        char selection9 = input.next().charAt(0);

        //Finding the element
        for(i = 0; i < tictac.length; i++){
            for(j = 0; j < tictac.length; j++){
                if(tictac[i][j] == selection9){
                    tictac[i][j] = Player_1;
                break;
                }
            }
        }

        //Desplaying the table after the Ninth move
        for(i = 0; i < tictac.length; i++){
            System.out.print("\t\t");
            for(j = 0; j < tictac.length; j++){
                System.out.print("\t" + tictac[i][j] + "   ");
            }
            System.out.println("");
        }

    }
}
