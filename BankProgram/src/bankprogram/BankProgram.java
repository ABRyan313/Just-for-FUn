package bankprogram;

public class BankProgram {

	public static void main(String[] args) {
		
		BankNote100 note1=new BankNote100();
		note1.getValue();
		note1.print();
		
		BankNote200 note2=new BankNote200();
		note2.getValue();
		note2.print();
		
		System.out.println(note1.getValue()+note2.getValue()+" "+"taka");

	}

}
