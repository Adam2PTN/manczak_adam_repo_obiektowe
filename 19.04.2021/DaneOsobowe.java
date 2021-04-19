class DaneOsobowe{
	private String name = "";
	private String lastname = "";
	private int age = 0;
	private int height = 0;
	private int weight = 0;
	
	public DaneOsobowe(String name, String lastname, int age, int height, int weight){
	this.name = name;
	this.lastname = lastname;
	this.age = age;
	this.height = height;
	this.weight = weight;
	}
	
	public double bmi(){
		double bmi = 0;
		bmi = Math.round(double)weight/(height*height)*10000;
		return bmi;
	}
	
	@Override
	public String toString(){
		return "\nname = "+name+"\nlastname = "+lastname+"\nage = "+age+"\nheight = "+height+"\nweight = "+weight;
	}

}