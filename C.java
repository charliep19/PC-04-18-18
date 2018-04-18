import java.util.Scanner;
import java.util.Random;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random=new Random();
		Scanner scan=new Scanner(System.in);
int score=0;
boolean isGameRunning=true;
while(isGameRunning==true) {
		System.out.println("Do you want to roll? 1=yes 2=no");
int answer =scan.nextInt();
if (answer==1) {
	int numGenerated=random.nextInt(6-1+1)+1;
	if(numGenerated!=1) {
		score =score+numGenerated;
	System.out.println("New score is"+score);
	}else {
		System.out.println("You lose");
isGameRunning=false;
	}
}else {
	System.out.println(score);
isGameRunning=false;
	}
}

}
}