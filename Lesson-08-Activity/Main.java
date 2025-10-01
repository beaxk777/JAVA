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
    
}
