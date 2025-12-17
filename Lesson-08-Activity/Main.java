  class Main{ 

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
    print("hello");
    double celsius = FtoC(50);
    print("C" + celsius);
	double volume = sphereVolume(3);
	print("Volume: " + volume);
	double coneVol = coneVolume(3, 5);
	print("Cone Volume: " + coneVol);
		double d = distance(0, 0, 3, 4);
		print("Distance: " + d);
		String appResult = collegeApp(3.5, 1400);
		print("College App Result: " + appResult);
		String fuelStatus = ecoFuel(55);
		print("Eco Fuel: " + fuelStatus);
		int fine1 = speedFine(65);
		print("Speed Fine (65): $" + fine1);
		int fine2 = speedFine(75);
		print("Speed Fine (75): $" + fine2);
		double discounted = discount(120, 80, 70);
		print("Discounted Total: $" + discounted);
	}

	// Returns total discounted by 10% if sum > 250 and at least one item >= 100, otherwise returns total
	double discount(double item1, double item2, double item3) {
		double total = item1 + item2 + item3;
		boolean atLeastOneHundred = (item1 >= 100) || (item2 >= 100) || (item3 >= 100);
		if (total > 250 && atLeastOneHundred) {
			return total * 0.9;
		} else {
			return total;
		}
	}

	void print(String v){
		System.out.println(v);
	}

	double FtoC(double f){
		double celsius = (f - 32) * 5.0 / 9.0;
		return celsius;
	}

	double sphereVolume(double radius) {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}

	double coneVolume(double radius, double height) {
		return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
	}

	double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	// Returns "ACCEPTED" if gpa >= 3.2 or SAT >= 1450, otherwise "REJECTED"
	String collegeApp(double gpa, int satScore) {
		if (gpa >= 3.2 || satScore >= 1450) {
			return "ACCEPTED";
		} else {
			return "REJECTED";
		}
	}
	// Returns "Fuel Economy" if speed is between 40 and 65 MPH inclusive, otherwise "Not Optimal"
	String ecoFuel(int speed) {
		if (speed >= 40 && speed <= 65) {
			return "Fuel Economy";
		} else {
			return "Not Optimal";
		}
	}
	// Returns fine of 75 for speeds between 60 and 70 inclusive, otherwise 75 plus $2 for every mile over 70
	int speedFine(int speed) {
		if (speed >= 60 && speed <= 70) {
			return 75;
		} else if (speed > 70) {
			return 75 + 2 * (speed - 70);
		} else {
			return 0; // No fine for speeds below 60
		}
	}

	
}
