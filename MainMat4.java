package generic;

public class MainMat4 {
	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int x[][]=mt.readMat();
		System.out.println("entered matri:");
		mt.dispMat(x);
		System.out.println("biggest element:"+mt.getBiggest(x));
		/*int y[][]=mt.readMat();
		mt.dispMat(y);*/
	}

}
