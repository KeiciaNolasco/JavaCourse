package entities;

public class Student {

	public String name;
	public double note01;
	public double note02;
	public double note03;

	public double finalGrade() {
		return note01 + note02 + note03;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}