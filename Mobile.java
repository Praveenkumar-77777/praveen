package DAY1;

public class Mobile {
	
	//methods - actions can be performed in mobile
	//takePhoto, makeCall
	//ClassName objectName=new ClassName();
	public void takePhoto() {
		System.out.println("take photo");
	}
	
	public void makeCall(String number) {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.takePhoto();
		obj.makeCall("1234567890");
		

	}

}
