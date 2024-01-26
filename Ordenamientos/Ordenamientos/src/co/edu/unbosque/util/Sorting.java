package co.edu.unbosque.util;

import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteDTO;

public class Sorting {

	public static ArrayList<EstudianteDTO> bubbleSort(ArrayList<EstudianteDTO> data, boolean ascending) {
		for (int j = 0; j < data.size(); j++) {
			for (int i = 0; i < data.size() - 1; i++) {

				if (ascending) {
					if (data.get(i).getAverage() > data.get(i + 1).getAverage()) {
						EstudianteDTO temp = data.get(i);
						data.set(i, data.get(i + 1));

						data.set(i + 1, temp);
					}

				} else {

					if (data.get(i).getAverage() < data.get(i + 1).getAverage()) {
						EstudianteDTO temp = data.get(i);
						data.set(i, data.get(i + 1));

						data.set(i + 1, temp);

					}
				}

			}

		}
		return data;
	}

	public static ArrayList<EstudianteDTO> bubbleSortName(ArrayList<EstudianteDTO> data, boolean ascending) {
		for (int j = 0; j < data.size(); j++) {
			for (int i = 0; i < data.size() - 1; i++) {

				if (ascending) {
					if (data.get(i).getFullName().compareTo(data.get(i + 1).getFullName()) < 0) {
						EstudianteDTO temp = data.get(i);
						data.set(i, data.get(i + 1));

						data.set(i + 1, temp);
					}

				} else {

					if (data.get(i).getFullName().compareTo(data.get(i + 1).getFullName()) > 0) {
						EstudianteDTO temp = data.get(i);
						data.set(i, data.get(i + 1));

						data.set(i + 1, temp);

					}
				}

			}

		}
		return data;
	}

	public static ArrayList<EstudianteDTO> bubbleSortDate(ArrayList<EstudianteDTO> data, boolean ascending) {

		for (int j = 0; j < data.size(); j++) {
			for (int i = 0; i < data.size() - 1; i++) {

				if (ascending) {
					if (data.get(i).getDate().compareTo(data.get(i + 1).getDate()) < 0) {
						EstudianteDTO temp = data.get(i);
						data.set(i, data.get(i + 1));

						data.set(i + 1, temp);
					}

				} else {

					if (data.get(i).getDate().compareTo(data.get(i + 1).getDate()) > 0) {
						EstudianteDTO temp = data.get(i);
						data.set(i, data.get(i + 1));

						data.set(i + 1, temp);

					}
				}

			}

		}
		return data;
	}

}
