package co.edu.unbosque.controller;

import java.time.LocalDate;

import co.edu.unbosque.model.persistence.EstudianteDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	private EstudianteDAO eDao;

	public Controller() {

		con = new Console();
		eDao = new EstudianteDAO();
	}

	public void run() {

		mainloop: while (true) {
			con.printWithNewLine("Welcome");
			con.printWithNewLine("1) Create Student");
			con.printWithNewLine("2) Read Students");
			con.printWithNewLine("3) Update Student");
			con.printWithNewLine("4) Delete Student");

			int opc = con.readInt();
			con.burnLine();

			switch (opc) {
			case 1:

				con.printWithNewLine("Enter full name");
				String fullName = con.readWholeLine();

				con.printWithNewLine("Enter Date of Birth (YYYY-MM-DD)");
				String date = con.readWholeLine();
				LocalDate dateOfBirth = LocalDate.parse(date);

				con.printWithNewLine("Enter grade 1");
				float grade1 = con.readFloat();
				con.burnLine();
				con.printWithNewLine("Enter grade 2");
				float grade2 = con.readFloat();
				con.burnLine();
				con.printWithNewLine("Enter grade 3");
				float grade3 = con.readFloat();
				con.burnLine();

				float average = eDao.calcularPromedio(grade1, grade2, grade3);

				eDao.create(fullName, Float.toString(grade1), Float.toString(grade2), Float.toString(grade3),
						Float.toString(average), dateOfBirth.toString());

				con.printWithNewLine("Your Average is: " + average);

				break;
			case 2:
				con.printWithNewLine("Choose form");
				con.printWithNewLine("1) Ascending");
				con.printWithNewLine("2) Descending");
				con.printWithNewLine("3) Name A-Z");
				con.printWithNewLine("4) Name Z-A");
				con.printWithNewLine("5) Date of Birth Ascending");
				con.printWithNewLine("6) Date of Birth Descending");
				int formIndex = con.readInt();

				if (formIndex == 1) {
					con.printWithNewLine(eDao.readAllOrderedByPromedioAscending());
				} else if (formIndex == 2) {
					con.printWithNewLine(eDao.readAllOrderedByPromedioDescending());
				} else if (formIndex == 3) {
					con.printWithNewLine(eDao.readAllOrderedByNameAZ());
				} else if (formIndex == 4) {
					con.printWithNewLine(eDao.readAllOrderedByNameZA());
				} else if (formIndex == 5) {
					con.printWithNewLine(eDao.readAllOrderedByDateAscending());

				} else if (formIndex == 6) {
					con.printWithNewLine(eDao.readAllOrderedByDateDescending());
				}

				break;
			case 3:

				break;
			case 4:
				con.printWithNewLine("Enter index to delete");
				int index = con.readInt();
				eDao.delete(index);

				break;

			case 5:

				con.printWithNewLine(eDao.readAllOrderedByPromedioAscending());

				break;

			default:
				break;
			}

		}

	}
}
