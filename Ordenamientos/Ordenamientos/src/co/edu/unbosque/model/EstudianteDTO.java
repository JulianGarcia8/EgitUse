package co.edu.unbosque.model;

import java.time.LocalDate;

public class EstudianteDTO {

	private String fullName;
	private float grade1, grade2, grade3, average;
	private LocalDate date;

	public EstudianteDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public EstudianteDTO(String fullName, float grade1, float grade2, float grade3, float average, LocalDate date) {
		super();
		this.fullName = fullName;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.average = average;
		this.date = date;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getGrade1() {
		return grade1;
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}

	public float getGrade3() {
		return grade3;
	}

	public void setGrade3(float grade3) {
		this.grade3 = grade3;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	
	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "EstudianteDTO [fullName=" + fullName + ", grade1=" + grade1 + ", grade2=" + grade2 + ", grade3="
				+ grade3 + ", average=" + average + ", date=" + date + "]";
	}



	

}
