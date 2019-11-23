public class Calculator {

	public int result;
	
	public int calc(int f){
	return result + f; 
	}
	
	public void add(int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	
}