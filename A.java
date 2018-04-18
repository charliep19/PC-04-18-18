import java.util.Random;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random=new Random ();
int []numlist= new int[50];
for (int i=0; i<numlist.length; i++) {
	int numGenerated=random.nextInt(62-25+1)+25;
numlist[i]=numGenerated ;
System.out.println(numlist[i]);

}
	}

}
