package co.edu.unbosque.util;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.EstudianteDTO;

public class Sorting {

	public static ArrayList<EstudianteDTO> bubbleSort(ArrayList<EstudianteDTO> data, boolean ascending) {
		for (int j = 0; j < data.size(); j++) {
			for (int i = 0; i < data.size() - 1; i++) {

				if (ascending) {
					// ARR J ARR J +1
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
//	public static ArrayList<EstudianteDTO> insertionSortPromedio(ArrayList<EstudianteDTO> data, boolean ascending) {
//
//		for (int i = 1; i < data.size(); i++) {
//			EstudianteDTO temp = data.get(i);
//			int j = i - 1;
//			if (ascending) {
//				while (j >= 0 && data.get(j).getProm() > temp.getProm()) {
//					data.set(j + 1, data.get(j));
//					j = j - 1;
//				}
//				data.set(j + 1, temp);
//			} else {
//				while (j >= 0 && data.get(j).getProm() < temp.getProm()) {
//					data.set(j + 1, data.get(j));
//					j = j - 1;
//				}
//				data.set(j + 1, temp);
//			}
//		}
//		return data;
//	}
	
//	public static ArrayList<EstudianteDTO> shellSortN1(ArrayList<EstudianteDTO> data, boolean ascending) {
//		for (int intervalo = data.size() / 2; intervalo > 0; intervalo /= 2) {
//			for (int i = intervalo; i < data.size(); i++) {
//				if (ascending) {
//					EstudianteDTO temp = data.get(i);
//					int j;
//					for (j = i; j >= intervalo
//							&& data.get(j - intervalo).getNota1() > temp.getNota1(); j -= intervalo) {
//						data.set(j, data.get(j - intervalo));
//					}
//					data.set(j, temp);
//				} else {
//					EstudianteDTO temp = data.get(i);
//					int j;
//					for (j = i; j >= intervalo
//							&& data.get(j - intervalo).getNota1() < temp.getNota1(); j -= intervalo) {
//						data.set(j, data.get(j - intervalo));
//					}
//					data.set(j, temp);
//				}
//			}
//		}
//
//		return data;
//	}
	
	public static ArrayList<EstudianteDTO> insertionSort(ArrayList<EstudianteDTO> data, boolean ascending) {

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
