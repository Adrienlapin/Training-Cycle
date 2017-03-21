package Training;

public class TrainingConstructor extends Training1 {

	public String Day1(String Niveau, String Meteo) {

		if (Niveau == "Regulier" && Meteo == "Sec") {
			return exo4();
		} else if (Niveau == "Competition" && Meteo == "Sec") {
			return exo5();
		} else if (Niveau == "Regulier" && Meteo == "Incertaine") {

			return exo1();
		} else if (Niveau == "Competition" && Meteo == "Incertaine") {
			return exo2();
		}
		return exo9();
	}

	public String Day2(String Niveau, String Meteo, String nbHeure) {

		if (nbHeure == "Moins de 6h par semaine") {
			return exo9();

		} else if (Niveau == "Regulier" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo7();

		} else if (Niveau == "Regulier" && Meteo == "Incertaine" && nbHeure == "Plus de 10h par semaine") {
			return exo2();

		} else if (Niveau == "Regulier" && Meteo == "Sec" && nbHeure == "Plus de 10h par semaine") {
			return exo2();

		} else if (Niveau == "Competition" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo8();

		} else if (Niveau == "Competition" && Meteo == "Sec" && nbHeure == "Plus de 10h par semaine") {
			return exo6();

		} else if (Niveau == "Competition" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo8();

		} else if (Niveau == "Competition" && Meteo == "Sec" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo2();
		}

		return exo9();

	}

	public String Day3(String Niveau, String Meteo, String nbHeure) {

		if (nbHeure == "Moins de 6h par semaine") {
			return exo5();

		} else if (nbHeure == "Entre 6 et 10h par semaine") {
			return exo6();

		} else if (nbHeure == "Plus de 10h par semaine") {
			return exo6();

		}
		return exo6();
	}

	public String Day4(String Niveau, String Meteo, String nbHeure) {

		if (nbHeure == "Moins de 6h par semaine") {
			return exo9();

		} else if (Niveau == "Regulier" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo2();

		} else if (Niveau == "Regulier" && Meteo == "Incertaine" && nbHeure == "Plus de 10h par semaine") {
			return exo3();

		} else if (Niveau == "Regulier" && Meteo == "Sec" && nbHeure == "Plus de 10h par semaine") {
			return exo5();

		} else if (Niveau == "Competition") {
			return exo9();

		}

		return exo1();

	}

	public String Day5(String Niveau, String Meteo, String nbHeure) {

		if (nbHeure == "Moins de 6h par semaine") {
			return exo2();

		} else if (Niveau == "Regulier" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo7();

		} else if (Niveau == "Regulier" && Meteo == "Incertaine" && nbHeure == "Plus de 10h par semaine") {
			return exo2();

		} else if (Niveau == "Regulier" && Meteo == "Sec" && nbHeure == "Plus de 10h par semaine") {
			return exo4();

		} else if (Niveau == "Competition" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo5();

		} else if (Niveau == "Competition" && Meteo == "Sec" && nbHeure == "Plus de 10h par semaine") {
			return exo5();

		} else if (Niveau == "Competition" && Meteo == "Incertaine" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo5();

		} else if (Niveau == "Competition" && Meteo == "Sec" && nbHeure == "Entre 6 et 10h par semaine") {
			return exo2();
		}

		return exo4();

	}

	public String Day6(String Niveau, String Meteo, String nbHeure) {

		return exo6();

	}

	public String Day7(String Niveau, String Meteo, String nbHeure) {

		if (nbHeure == "Plus de 10h par semaine") {
			return exo6();
		}
		{
			return exo9();
		}

	}
}
