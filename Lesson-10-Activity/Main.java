class Main {

	public static void main(String[] args) {
		(new Main()).init();
	}

	void init(){
		double newGpa = gpa(95);
		System.out.println("New GPA: " + newGpa);
		boolean graduating = isGraduating(12, 45);
		System.out.println("Is Graduating: " + graduating);
		String bmi = bmi(150, 65);
		System.out.println("BMI Category: " + bmi);
		int blueOrViolet = blueOrViolet(650, 720);
		if (blueOrViolet == -1) {
			System.out.println("Blue or Violet Frequency: neither");
		} else {
			System.out.println("Blue or Violet Frequency: " + blueOrViolet);
		}
	}

	double gpa(double gpa){
		// If GPA value is over 90, increase by 10% (multiply by 1.1)
		if (gpa > 90) {
			return (gpa * 1.1);
		}
		return gpa;
	}

	boolean isGraduating(int gradeLevel, int credits){
		if (gradeLevel == 12 && credits >= 44){
			return (true);
	}
		else {
			return (false);
		}
	}
	String bmi(double weight, double height){
		double bmi = (weight / (height * height)) * 703;
		if (bmi < 18.5){
			return "Underweight";
		}
		else if (bmi >= 18.5 && bmi <= 24.9){
			return "Normal weight";
		}
		else if (bmi >= 25 && bmi <= 29.9){
			return "Overweight";
		}
		else {
			return "Obesity";
		}
	}
	double shippingCost(double weight){
		if (weight <= 10){
			return 0.0;
		}
		else if (weight < 10 && weight <= 15){
			return 5.0;
		}
		else if (weight > 25 ){
			return (10.0*0.02);
	}
	int blueOrViolet(int blueFrequence, int violetFrequence){
		if (blueFrequence >= 600 && blueFrequence <= 670){
			return blueFrequence;
		}
		else if (violetFrequence >= 700 && violetFrequence <= 750){
			return violetFrequence;
		}
			else{
			return false;
		}
	}
}