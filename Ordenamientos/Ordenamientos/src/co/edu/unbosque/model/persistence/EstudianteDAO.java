package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.util.Sorting;

public class EstudianteDAO implements CRUDOperation {

	private ArrayList<EstudianteDTO> listOfStudents;

	public EstudianteDAO() {
		listOfStudents = new ArrayList<>();
	}

	@Override
	public void create(String... attribs) {

		EstudianteDTO newStudent = new EstudianteDTO();
		newStudent.setFullName(attribs[0]);
		newStudent.setGrade1(Float.parseFloat(attribs[1]));
		newStudent.setGrade2(Float.parseFloat(attribs[2]));
		newStudent.setGrade3(Float.parseFloat(attribs[3]));
		newStudent.setAverage(Float.parseFloat(attribs[4]));
		newStudent.setDate(LocalDate.parse(attribs[5]));
		listOfStudents.add(newStudent);

	}

	@Override
	public void create(Object obj) {
		listOfStudents.add((EstudianteDTO) obj);

	}

	@Override
	public String readAll() {

		StringBuilder sb = new StringBuilder();
		listOfStudents.forEach(student -> {
			sb.append((student.toString() + "\n"));

		});
		return sb.toString();

	}

	public String readAllOrderedByPromedioAscending() {

		ArrayList<EstudianteDTO> copiaEstudiantes = Sorting.bubbleSort(listOfStudents, true);

		StringBuilder sb = new StringBuilder();
		copiaEstudiantes.forEach(student -> {
			sb.append((student.toString() + "\n"));

		});
		return sb.toString();

	}

	public String readAllOrderedByNameAZ() {

		ArrayList<EstudianteDTO> copiaEstudiantes = Sorting.bubbleSortName(listOfStudents, false);

		StringBuilder sb = new StringBuilder();
		copiaEstudiantes.forEach(student -> {

			sb.append((student.toString() + "\n"));

		});
		return sb.toString();

	}

	public String readAllOrderedByNameZA() {

		ArrayList<EstudianteDTO> copiaEstudiantes = Sorting.bubbleSortName(listOfStudents, true);

		StringBuilder sb = new StringBuilder();
		copiaEstudiantes.forEach(student -> {
			sb.append((student.toString() + "\n"));

		});
		return sb.toString();

	}

	public String readAllOrderedByPromedioDescending() {

		ArrayList<EstudianteDTO> copiaEstudiantes = Sorting.bubbleSort(listOfStudents, false);

		StringBuilder sb = new StringBuilder();
		copiaEstudiantes.forEach(student -> {
			sb.append((student.toString() + "\n"));

		});
		return sb.toString();

	}
	public String readAllOrderedByDateAscending() {
		
		ArrayList<EstudianteDTO> copiaEstudiantes = Sorting.bubbleSortDate(listOfStudents, false);
		
		StringBuilder sb = new StringBuilder();
		copiaEstudiantes.forEach(student -> {
			sb.append((student.toString() + "\n"));
			
		});
		return sb.toString();
		
	}
	public String readAllOrderedByDateDescending() {
		
		ArrayList<EstudianteDTO> copiaEstudiantes = Sorting.bubbleSortDate(listOfStudents, true);
		
		StringBuilder sb = new StringBuilder();
		copiaEstudiantes.forEach(student -> {
			sb.append((student.toString() + "\n"));
			
		});
		return sb.toString();
		
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= listOfStudents.size()) {
			return false;
		} else {
			if (!newData[0].isBlank() || !newData[0].isEmpty() || newData[0] != null || !newData[0].equals("")) {
				try {
					listOfStudents.get(index).setFullName(newData[0]);
				} catch (NumberFormatException e) {

				}

			}
			if (!newData[1].isBlank() || !newData[1].isEmpty() || newData[1] != null) {
				listOfStudents.get(index).setGrade1(Float.parseFloat(newData[1]));
			}
			if (!newData[2].isBlank() || !newData[2].isEmpty() || newData[2] != null) {
				listOfStudents.get(index).setGrade2(Float.parseFloat(newData[2]));
			}
			if (!newData[3].isBlank() || !newData[3].isEmpty() || newData[3] != null) {
				listOfStudents.get(index).setGrade3(Float.parseFloat(newData[3]));
			}

		}
		if (!newData[4].isBlank() || !newData[4].isEmpty() || newData[4] != null || !newData[4].equals("")) {
			try {

				listOfStudents.get(index).setAverage(Float.parseFloat(newData[4]));
			} catch (NumberFormatException e) {

			}

		}

		return true;
	}

	@Override
	public boolean delete(int index) {

		if (index < 0 || index >= listOfStudents.size()) {
			return false;
		} else {
			listOfStudents.remove(index);

			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		EstudianteDTO toDelete = (EstudianteDTO) obj;
		if (listOfStudents.contains(toDelete)) {
			listOfStudents.remove(toDelete);

			return true;
		} else {
			return false;
		}

	}

	public float calcularPromedio(float grade1, float grade2, float grade3) {

		float average = (float) ((grade1 * 0.3 + grade2 * 0.3 + grade3 * 0.4));

		return average;

	}

	public ArrayList<EstudianteDTO> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(ArrayList<EstudianteDTO> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

}
