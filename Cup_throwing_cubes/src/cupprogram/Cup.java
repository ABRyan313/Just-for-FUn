package cupprogram;


public class Cup {
	
	private cube[] arr;
	
	public Cup(int n) {
		arr=new cube[n];
		for(int i=0;i<arr.length;i++)
			arr[i]= new cube();
	}
	
	public void toss() {
		for(int i=0;i<arr.length;i++)
			arr[i].roll();
	}
	
	public boolean check() {
		for(int i=0;i<arr.length;i++)
			if(arr[i].getEyes()!=arr[0].getEyes()) return false;
		return true;
				
	}
	
	public String toString() {
		String text=arr[0].toString();
		for (int i = 1; i < arr.length; ++i) text += " " + arr[i];
		return text;
	}
	
	

}
