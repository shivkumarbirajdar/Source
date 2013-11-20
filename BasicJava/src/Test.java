public class Test {
	public static int counter = 0;
	public static void main(String[] args) {
		Test o = new Test();
		
		try {
			o.isValidAge(9);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("I am in finally block");
		}
	}
	
	private void isValidAge(int i)throws Exception {
		if(i < 18){
			throw new Exception("Age is under 18..");
		}
	}
}