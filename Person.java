
public class Person {
	private String name;
	private int height;
	private float weight;
	
	public Person(String name, int height, float weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getBmi() {
		float bmi = (weight /height /height) * 10000;
		return bmi;
	}
	public String getFitnessStatus() {
		float fitnessStatus=getBmi();
		String status = "";
		if (fitnessStatus < 18.5) {
			status = "Underweight";	
		}
		else if (fitnessStatus > 18.5 && fitnessStatus < 25) {
			status = "Fit";
		}
		else if (fitnessStatus >25 && fitnessStatus <30) {
			status = "Overweight";
		}
		else {
			status = "Obese";
		}
		return status;
	}
}
