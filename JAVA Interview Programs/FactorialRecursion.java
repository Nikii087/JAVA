class Fact {
	public int fact(int num){
		if(num == 1)
			return 1;
		else{
			return num * this.fact(num - 1);
		}
	}

}

//main class
class FactorialRecursion {

	public static void main(String args[]) {
		Fact obj = new Fact();
    	System.out.println("Fact = " +obj.fact(5));  
    }
    
}