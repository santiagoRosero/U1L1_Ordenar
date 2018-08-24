package interfaz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PrincipalFrame extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}
	
	@Override
	public void start(Stage primaryStage)throws Exception{
		Pane mainPane = (Pane) FXMLLoader.load(PrincipalFrame.class.getResource("interfaz_lab1.fxml"));
		primaryStage.setScene(new Scene(mainPane, 400, 600));
		primaryStage.setTitle("laboratorio1");
		primaryStage.show();
	}

}
