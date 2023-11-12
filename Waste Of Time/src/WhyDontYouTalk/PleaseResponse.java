package WhyDontYouTalk;
import java.util.*;

public class PleaseResponse {

	public static void main(String[] args) {
		
		Scanner NF=new Scanner(System.in);
		int NafisaChose;
		
		System.out.println("Please Enter your Choice");
		System.out.println("1.sweet response");
		System.out.println("2.Chudel response");
		System.out.println("3.No response\n");
		System.out.println("You have selected:");
		
		NafisaChose=NF.nextInt();
		
		while(NafisaChose>3) {
			System.out.println("Fuck u Bitch, Chose again between 1-3");
			NafisaChose=NF.nextInt();
		}
		
		Responses Please=new Responses();
		if(NafisaChose==1)
			Please.Response1();
		else if(NafisaChose==2)
			Please.Response4();
		else if(NafisaChose==3)
			Please.Response3();
		
		
		
		

	}

}
