package armor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("Kris","sword",100);
        Player2 player2 = new Player2("Jack","sword",100,true);
        System.out.println(player1.getName());
        System.out.println(player1.getHealth());
        System.out.println(player1.getWeapon());
        System.out.println(player2.getName());
        System.out.println(player2.getHealth());
        System.out.println(player2.getWeapon());
        Scanner sc = new Scanner(System.in);
        int c=1;
        System.out.println("Instructions:\n PRESS 1 for shooting "+player1.getName()+" with gun-one\n PRESS 2 for shooting "+player2.getName()+" with gun-one\n PRESS 3 for shooting "+player1.getName()+" with gun-two\n PRESS 4 for shooting "+player2.getName()+" with gun-two\n PRESS 5 to heal\n PRESS 6 to know the current health\n PRESS 0 to exit\n");
        while (c !=0){
        	System.out.println("Enter your choice");
        	c= sc.nextInt();
        	if(player1.getHealth()==0 && player2.getHealth()==0) {
        		c=0;
    			System.out.println("GAME OVER! "+player1.getName()+ " and "+ player1.getName()+ "are dead. TIE!");
    			break;
        	}
        	if(player1.getHealth()==0) {
    			c=0;
    			System.out.println("GAME OVER! "+player1.getName()+" is dead. " +player2.getName()+" won!");
    			break;
    		}
        	if(player2.getHealth()==0) {
    			c=0;
    			System.out.println("GAME OVER! "+player2.getName()+" is dead."+player2.getName()+" won!");
    			break;
    		}
        	switch(c) {
        	case 1:
        		player1.damageByGun1();
        		
        		break;
        	case 2:
        		player2.damageByGun1();
        		break;
        	case 3 :
        		player1.damageByGun2();
        		break;
        	case 4 :
        		player2.damageByGun2();
        		break;
        	case 5 :
        		player1.heal();
        		player2.heal();
        		break;
        	case 6 :
        		System.out.println(player1.getName()+" : "+player1.getHealth());
        		System.out.println(player2.getName()+" : "+player2.getHealth());
        		break;
        	case 0:
        		System.out.println("Game over");
        		c=0;
        	default:
        		continue;
        }
    }
    }
}
