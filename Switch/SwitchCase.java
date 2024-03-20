class SwitchCase{
	public static void main(String[] args){
		int am=6;
		switch(am){
			case 1:
			case 2:
				System.out.println("The no is lower than 3");
				break;
			case 3:
			case 4:
				System.out.println("The no is 4 or lower than 4 ");
				break;
			case 5:
				System.out.println("The no is greater than 4");
				break;
			default:
				System.out.println("The no is greater than 5");
		}
	}
}