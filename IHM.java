package Training;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class IHM extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 500, 500);

			GridPane gridpane = new GridPane();
			gridpane.setPadding(new Insets(5));
			gridpane.setHgap(5);
			gridpane.setVgap(5);
			ColumnConstraints column1 = new ColumnConstraints(300);
			column1.setPercentWidth(60);
			ColumnConstraints column2 = new ColumnConstraints(150, 350, 300);

			gridpane.setPadding(new Insets(15, 12, 15, 12));
			gridpane.setStyle("-fx-background-color: grey;");
			
			ToggleGroup group = new ToggleGroup();
			RadioButton rb1 = new RadioButton();
			rb1.setText("Regulier");
			rb1.setUserData("Regulier");
			rb1.setToggleGroup(group);
			
			RadioButton rb2 = new RadioButton("Competition");
			rb2.setUserData("Competition");
			rb2.setToggleGroup(group);
			
			ObservableList<String> options = 
				    FXCollections.observableArrayList(
				        "Moins de 6h par semaine",
				        "Entre 6 et 10h par semaine",
				        "Plus de 10h par semaine"
				    );
			
				final ComboBox nbHeure = new ComboBox(options);
				
				ToggleGroup group2 = new ToggleGroup();
				RadioButton rb3 = new RadioButton();
				rb3.setText("Sec");
				rb3.setUserData("Sec");
				rb3.setToggleGroup(group2);
				
				RadioButton rb4 = new RadioButton("Incertaine");
				rb4.setUserData("Incertaine");
				rb4.setToggleGroup(group2);
				
			Label Title = new Label("Calculateur de Programme d'Entrainement pour Cycliste");
			Title.setStyle("-fx-background-color: green;");
		    Label Niveau = new Label(" Niveau du Cycliste :");
		    Label textnbHeure = new Label(" Nombre d'heure d'entrainement par semaine : ");
		    Label Meteo = new Label(" Météo prévu pour la période : ");
		    Button buttonStart = new Button("Calculez");
			buttonStart.setPrefSize(100, 20);
			
			Label jour1 = new Label(" Jour n°1 : ");
		    Label textjour1 = new Label ();
		    Label jour2 = new Label(" Jour n°2 : ");
		    Label textjour2 = new Label ();
		    Label jour3 = new Label(" Jour n°3 : ");
		    Label textjour3 = new Label ();
		    Label jour4 = new Label(" Jour n°4 : ");
		    Label textjour4 = new Label ();
		    Label jour5 = new Label(" Jour n°5 : ");
		    Label textjour5 = new Label ();
		    Label jour6 = new Label(" Jour n°6 : ");
		    Label textjour6 = new Label ();
		    Label jour7 = new Label(" Jour n°7 : ");
		    Label textjour7 = new Label ();

			gridpane.getColumnConstraints().addAll(column1, column2);

		    gridpane.add(Title, 0, 0);
		    gridpane.add(Niveau, 0, 1);
		    gridpane.add(rb1, 1, 1);
			gridpane.add(rb2, 1, 2);
			gridpane.add(textnbHeure, 0, 3);
		    gridpane.add(nbHeure, 1, 3);
		    gridpane.add(Meteo, 0, 4);
		    gridpane.add(rb3, 1, 4);
			gridpane.add(rb4, 1, 5);
		    gridpane.add(buttonStart, 0, 6);
		    GridPane.setHalignment(buttonStart, HPos.CENTER);
		    
		    gridpane.add(jour1, 0, 7);
		    gridpane.add(textjour1, 1, 7);
		    gridpane.add(jour2, 0, 8);
		    gridpane.add(textjour2, 1, 8);
		    gridpane.add(jour3, 0, 9);
		    gridpane.add(textjour3, 1, 9);
		    gridpane.add(jour4, 0, 10);
		    gridpane.add(textjour4, 1, 10);
		    gridpane.add(jour5, 0, 11);
		    gridpane.add(textjour5, 1, 11);
		    gridpane.add(jour6, 0, 12);
		    gridpane.add(textjour6, 1, 12);
		    gridpane.add(jour7, 0, 13);
		    gridpane.add(textjour7, 1, 13);
		    
		    buttonStart.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					TrainingConstructor TC = new TrainingConstructor();
					
					textjour1.setText(TC.Day1(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString()));
//					System.out.println(group.getSelectedToggle().getUserData().toString());
					
					textjour2.setText(TC.Day2(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString(), nbHeure.getValue().toString()));
//					System.out.println(nbHeure.getValue().toString());
					
					textjour3.setText(TC.Day3(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString(), nbHeure.getValue().toString()));
					textjour4.setText(TC.Day4(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString(), nbHeure.getValue().toString()));
					textjour5.setText(TC.Day5(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString(), nbHeure.getValue().toString()));
					textjour6.setText(TC.Day6(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString(), nbHeure.getValue().toString()));
					textjour7.setText(TC.Day7(group.getSelectedToggle().getUserData().toString(),group2.getSelectedToggle().getUserData().toString(), nbHeure.getValue().toString()));

				}
				
		    });
		    
		    root.setCenter(gridpane);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Programme d'entrainement !");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
